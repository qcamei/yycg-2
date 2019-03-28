package com.cyb.yycg.entity;

/**
 * �û�ʵ����
 */
public class User {
	
	private int id;
	private String userName;    //�û���
	private String passWord;    //����
	private String email;       //��������
	private String trueName;    //��ʵ����
	private String sex;         //�Ա�
	private String IDCard;      //���֤����
	private String phone;       //��ϵ�绰
	private String address;      //��ϵ��ַ
	
	private int idenId;         //���������Ȩ�ޱ�
	private Identity identity;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIDCard() {
		return IDCard;
	}
	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getIdenId() {
		return idenId;
	}
	public void setIdenId(int idenId) {
		this.idenId = idenId;
	}
	public Identity getIdentity() {
		return identity;
	}
	public void setIdentity(Identity identity) {
		this.identity = identity;
	}
}
