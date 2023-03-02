package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ChildDetails")
public class Child {
	@Id
	private int babyid;
	private String babyFirstname;
	private String babySecondname;
	private String fathername;
	private String mothername;
	private String address;
	
	
	public int getBabyid() {
		return babyid;
	}
	public void setBabyid(int babyid) {
		this.babyid = babyid;
	}
	public String getBabyFirstname() {
		return babyFirstname;
	}
	public void setBabyFirstname(String babyFirstname) {
		this.babyFirstname = babyFirstname;
	}
	public String getBabySecondname() {
		return babySecondname;
	}
	public void setBabySecondname(String babySecondname) {
		this.babySecondname = babySecondname;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Child() {
		
	}
	
	public Child(int babyid, String babyFirstname, String babySecondname, String fathername, String mothername,
			String address) {
		super();
		this.babyid = babyid;
		this.babyFirstname = babyFirstname;
		this.babySecondname = babySecondname;
		this.fathername = fathername;
		this.mothername = mothername;
		this.address = address;
	}
	public String toString() {
		return "babyid="+babyid+"babyFirstname="+babyFirstname+"babySecondname="+babySecondname+"fathername="+fathername+"mothername="+mothername+"address="+address;
	}
	

}
