package com.cyb.yycg.entity;

import java.util.Date;

/**
 * ҩƷʵ����
 */
public class Medicine {
	
	private int id; 			  //ҩƷ����
	private String cName;         //��������
	private String eName;		  //Ӣ������
	private double price;		  //�۸�
	private int nums;			  //�������
	private String manufacturer;  //������
	private String describle;     //ҩЧ����
	private Date productDate;     //��������
	private String safeDate;      //������
	private String standard;      //���
	private String oldPrice;      //����
	
	private MedicineType type;    //ҩƷ������
	private int typeId;
	
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
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getDescrible() {
		return describle;
	}
	public void setDescrible(String describle) {
		this.describle = describle;
	}
	public Date getProductDate() {
		return productDate;
	}
	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}
	public String getSafeDate() {
		return safeDate;
	}
	public void setSafeDate(String safeDate) {
		this.safeDate = safeDate;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public MedicineType getType() {
		return type;
	}
	public void setType(MedicineType type) {
		this.type = type;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getOldPrice() {
		return oldPrice;
	}
	public void setOldPrice(String oldPrice) {
		this.oldPrice = oldPrice;
	}
}
