package com.cyb.yycg.entity;

import java.io.Serializable;

/**
 * ҩƷ���ʵ����
 */
public class MedicineType implements Serializable{
	
	private int id;            //������
	private String cTypeName;  //���������
	private String eTypeName;  //Ӣ�������
	private String typeDesc;   //�������
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getcTypeName() {
		return cTypeName;
	}
	public void setcTypeName(String cTypeName) {
		this.cTypeName = cTypeName;
	}
	public String geteTypeName() {
		return eTypeName;
	}
	public void seteTypeName(String eTypeName) {
		this.eTypeName = eTypeName;
	}
	public String getTypeDesc() {
		return typeDesc;
	}
	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}
	
}
