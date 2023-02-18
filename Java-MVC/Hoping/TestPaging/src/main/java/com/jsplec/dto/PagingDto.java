package com.jsplec.dto;

public class PagingDto {
	
	String hSeq;
	String hId;
	
	public PagingDto() {
		// TODO Auto-generated constructor stub
	}

	public PagingDto(String hSeq, String hId) {
		super();
		this.hSeq = hSeq;
		this.hId = hId;
	}

	public String gethSeq() {
		return hSeq;
	}

	public void sethSeq(String hSeq) {
		this.hSeq = hSeq;
	}

	public String gethId() {
		return hId;
	}

	public void sethId(String hId) {
		this.hId = hId;
	}
	
	

}
