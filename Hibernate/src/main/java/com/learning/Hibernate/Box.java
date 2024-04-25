package com.learning.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="box_data")
public class Box {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
     private int boxId;
	 @Column(name="box_name")
     private String boxName;
     private int boxPrice;
     @Transient
     private String boxDesc;
	public Box() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBoxId() {
		return boxId;
	}
	public void setBoxId(int boxId) {
		this.boxId = boxId;
	}
	public String getBoxName() {
		return boxName;
	}
	public void setBoxName(String boxName) {
		this.boxName = boxName;
	}
	public int getBoxPrice() {
		return boxPrice;
	}
	public void setBoxPrice(int boxPrice) {
		this.boxPrice = boxPrice;
	}
	public String getBoxDesc() {
		return boxDesc;
	}
	public void setBoxDesc(String boxDesc) {
		this.boxDesc = boxDesc;
	}
     
     
}
