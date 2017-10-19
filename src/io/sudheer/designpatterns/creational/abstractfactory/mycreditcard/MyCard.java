package io.sudheer.designpatterns.creational.abstractfactory.mycreditcard;

public class MyCard {

	private String cardNumber;
	private int cvvCode;
	private String accountHolderName;
	
	public void validateCard() {
		// Code to validate the card		
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public int getCvvCode() {
		return cvvCode;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public void setCvvCode(int cvvCode) {
		this.cvvCode = cvvCode;
	}
	
}
