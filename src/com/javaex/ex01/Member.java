package com.javaex.ex01;

public class Member {

	// field
	private String id;
	private String name;
	private int point;

	// constructor
	public Member() {
	}

	public Member(String id, String name, int point) {
		this.id = id;
		this.name = name;
		this.point = point;
	}

	// method-g/s

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	// method-general

	public void showinfo() {
		System.out.println("회원정보: "+name+"("+id+"), "+point+"점");
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", point=" + point + "]";
	}
	
}
