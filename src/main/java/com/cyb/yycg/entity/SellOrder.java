package com.cyb.yycg.entity;

import java.util.Date;

/**
 *	����ҩƷ����ʵ����
 */
public class SellOrder {
	
	private int id;  //�������id
	private String cName;  //ҩƷ��
	private double price;  //ҩƷ����
	private int buyNums;   //��������
	private double totalMoney;  //�ܶ�
	private Date createDate;   //������������
	private int status;   //����״̬��1��ʾδ֧����2��ʾ��֧��
	
	private User user;   //�������ҩ��
	private int userId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBuyNums() {
		return buyNums;
	}
	public void setBuyNums(int buyNums) {
		this.buyNums = buyNums;
	}
	public double getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
