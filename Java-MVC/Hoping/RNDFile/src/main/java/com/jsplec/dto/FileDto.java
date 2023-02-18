package com.jsplec.dto;

public class FileDto {
	
	String regName;
	String regImage1;
	
	public FileDto() {
		// TODO Auto-generated constructor stub
	}

	public FileDto(String regName, String regImage1) {
		super();
		this.regName = regName;
		this.regImage1 = regImage1;
	}

	public String getRegName() {
		return regName;
	}

	public void setRegName(String regName) {
		this.regName = regName;
	}

	public String getRegImage1() {
		return regImage1;
	}

	public void setRegImage1(String regImage1) {
		this.regImage1 = regImage1;
	}
	
	

}
