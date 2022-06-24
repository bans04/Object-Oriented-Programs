package com.stockaccountmanagement;

public class Stocks {
	String stockName;
	int noOfShare;
	int sharePrice;
	
	
	
	/*public Stocks(String stockName, int noOfShare, int sharePrice) {
		this.stockName = stockName;
		this.noOfShare = noOfShare;
		this.sharePrice = sharePrice;
	}
*/
	@Override
	public String toString() {
		return "Stocks [stockName=" + stockName + ", noOfShare=" + noOfShare + ", sharePrice=" + sharePrice + "]";
	}

	
}
