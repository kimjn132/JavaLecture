package com.springlec.base.model;

public class BDto {
	int seqno;
	String title;
	String image;
	
	public BDto() {
		// TODO Auto-generated constructor stub
	}

	public BDto(int seqno, String title, String image) {
		super();
		this.seqno = seqno;
		this.title = title;
		this.image = image;
	}

	public int getSeqno() {
		return seqno;
	}

	public void setSeqno(int seqno) {
		this.seqno = seqno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
}
