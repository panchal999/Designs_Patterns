package com;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditCard targetInterface=new BankCustomer();  
		targetInterface.giveBankDetails();  
		System.out.print(targetInterface.getCreditCard());

	}

}
