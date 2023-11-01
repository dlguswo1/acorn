package com.example;

public class RequestBean {
	// DTO : 데이터를 저장하기 좋게 객체로 묶어놨다
	// DO, VO 찾기
	private String header;
	private String footer;
	
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getFooter() {
		return footer;
	}
	public void setFooter(String footer) {
		this.footer = footer;
	}
}
