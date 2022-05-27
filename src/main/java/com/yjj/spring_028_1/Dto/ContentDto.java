package com.yjj.spring_028_1.Dto;

public class ContentDto {

	private int mnum;
	
	private String mwriter;
	
	private String mcontent;

	public ContentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContentDto(int mnum, String mwriter, String mcontent) {
		super();
		this.mnum = mnum;
		this.mwriter = mwriter;
		this.mcontent = mcontent;
	}

	public int getMnum() {
		return mnum;
	}

	public void setMnum(int mnum) {
		this.mnum = mnum;
	}

	public String getMwriter() {
		return mwriter;
	}

	public void setMwriter(String mwriter) {
		this.mwriter = mwriter;
	}

	public String getMcontent() {
		return mcontent;
	}

	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}
	
	
	
}
