package com.cyb.yycg.utils;

/**
 * 导航工具类
 * @author Administrator
 *
 */
public class NavUtil {

	/**
	 * 生成导航代码
	 * @param subName
	 * @return
	 */
	public static String genNavCode(String subName){
		StringBuffer navCode=new StringBuffer();
		navCode.append("�����ڵ�λ�ã�");
		navCode.append("<a href='index.jsp'>��ҳ</a>&nbsp;");
		navCode.append("&gt; ");
		navCode.append(subName);
		return navCode.toString();
	}
}
