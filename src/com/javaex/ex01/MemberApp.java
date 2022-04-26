package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member no1 = new Member("jws", "정우성", 5000);
		Member no2 = new Member("yjs", "유재석", 3000);
		Member no3 = new Member("lhr", "이효리", 4000);
		
		no1.showinfo();
		no2.showinfo();
		no3.showinfo();
	}

}
