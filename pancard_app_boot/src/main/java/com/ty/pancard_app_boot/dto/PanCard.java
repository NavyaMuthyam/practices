package com.ty.pancard_app_boot.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PanCard {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String fullname;
	private String pannumber;
	private String loc;
	
	public PanCard() {
		super();
	}
	
	
	public PanCard(int id, String fullname, String pannumber , String loc) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.pannumber = pannumber;
		this.loc=loc;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPannumber() {
		return pannumber;
	}
	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}


	public String getLoc() {
		return loc;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}


	@Override
	public String toString() {
		return "PanCard [id=" + id + ", fullname=" + fullname + ", pannumber=" + pannumber + ",loc=" + loc + "]";
	}
	

}
