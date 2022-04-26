package com.javaex.ex10;

public class Book {

	// field
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;

	// constructor
	public Book() {
	}

	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	// method - g/s
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	// method - general
	public void rent() {
		stateCode = 0;
		System.out.println(title + "이(가) 대여 됐습니다.");
	}

	public void print() {
		if (stateCode == 1) {
			System.out.println(bookNo + " 책 제목:" + title + ", 작가:" + author + ", 대여 유무:재고있음");
		} else {
			System.out.println(bookNo + " 책 제목:" + title + ", 작가:" + author + ", 대여 유무:대여중");
		}
	}

}
