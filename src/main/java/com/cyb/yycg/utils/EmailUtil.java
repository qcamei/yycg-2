package com.cyb.yycg.utils;

import com.cyb.yycg.entity.User;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailUtil {

	/**
	 * 获取session实例对象
	 * @return
	 */
	public static Session getSession(){
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.host", "smtp.163.com");
		
		Session session = Session.getDefaultInstance(props, 
			
			new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					// TODO Auto-generated method stub
					return new PasswordAuthentication("yydhcxxax@163.com","827216417dxxax");
				}
		});
		session.setDebug(true);
		return session;
	}

	/**
	 * 发送邮件
	 * @param user
	 * @throws Exception
	 */
	public static void sendEmail(User user) throws Exception {
		Message message = new MimeMessage(getSession());
		message.setFrom(new InternetAddress("yydhcxxax@163.com"));
		message.setSubject("�һ�����");
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(user.getEmail()));
		message.setText("�𾴵�"+user.getUserName()+": ���ã����ڱ�վ��½������Ϊ��"+user.getPassWord()+" �뱣�ܺ�������룬��Ҫ����й¶����(��)��,��˷��ص�http://localhost:8080/MedicineManSys/");
		Transport.send(message);
	}
}
