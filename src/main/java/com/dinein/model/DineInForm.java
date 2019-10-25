package com.dinein.model;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class DineInForm {

	@NotEmpty
	private String resturant;
	@NotNull
	private String dineType;

	@DateTimeFormat(pattern = "dd/mm/yyyy")
	@Past
	@NotNull
	private Date date;
	@NotNull
	private String time;
	@NotNull @Min(2) @Max(6)
	private String noOfGuest;
	@NotNull
	@Size(min=3,max=10)
	private String name;
	private String mobNo;
	
	public String getResturant() {
		return resturant;
	}
	public void setResturant(String resturant) {
		this.resturant = resturant;
	}
	public String getDineType() {
		return dineType;
	}
	public void setDineType(String dineType) {
		this.dineType = dineType;
	}
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getNoOfGuest() {
		return noOfGuest;
	}
	public void setNoOfGuest(String noOfGuest) {
		this.noOfGuest = noOfGuest;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "DineInForm [resturant=" + resturant + ", dineType=" + dineType + ", date=" + date + ", time=" + time
				+ ", noOfGuest=" + noOfGuest + ", name=" + name + ", mobNo=" + mobNo + "]";
	}
	
	
	
}
