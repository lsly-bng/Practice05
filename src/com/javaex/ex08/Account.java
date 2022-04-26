package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account() {
    }
    
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}

	//필요한 메소드 작성
    //메소드 - 겟셋
	public String getAccountNo() {
    	return accountNo;
    }
	public void setAccountNo(String accountNo) {
    	this.accountNo = accountNo;
    }
    public int getBalance() {
    	return balance;
    }
    public void setBalance(int balance) {
    	this.balance = balance;
    }

    //메소드 - 일반
    public void deposit(int a) {
    	balance+=a;
    }
    public void withdraw(int a) {
    	balance-=a;
    }
    public void showBalance() {
    	System.out.println(balance);
    }
}
		
    	
    

		
