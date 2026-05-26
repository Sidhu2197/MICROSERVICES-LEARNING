package com.example.REDIS.model;

import java.io.Serializable;

public class Country implements Serializable{
	
	private Integer no;
	private String name;
	private String country;
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Country [no=" + no + ", name=" + name + ", country=" + country + "]";
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(Integer no, String name, String country) {
		super();
		this.no = no;
		this.name = name;
		this.country = country;
	}

	
	
}
