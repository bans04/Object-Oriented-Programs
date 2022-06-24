package com.stockaccountmanagement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class StocksRepository {
	Set<Stocks> stocksList = new HashSet();
	
	public void buyStock(Stocks stocks) {
		stocksList.add(stocks);
		System.out.println("Stock Add successfully..|");
	}
	
	public Stocks getStock(String stockName) {
		Stocks stock = null;
		for(Stocks stocks1: stocksList) {
			if(stocks1.stockName.equals(stockName)) {
				stock = stocks1;
			}
		}
		return stock;
	}
	
	public void remove(Stocks stock) {
		stocksList.remove(stock);
	}
	
	public void showsStocks() {
		System.out.println("Stocks in Your Account are:-> ");
		for(Stocks stocks: stocksList) {
			System.out.println(stocks);
		}
		System.out.println("Stock Shows Successfully..|");
	}
	
	public void getPrice() {
		for(Stocks stocks: stocksList) {
			int stochPrice = stocks.noOfShare * stocks.sharePrice;
			System.out.println(stocks.stockName + " Stock Value is " + stochPrice);
		}
	}
	
	public void getTotalStockPrice() {
		int totalSharePrice = 0;
		for(Stocks stocks: stocksList) {
			int sharePrice = stocks.noOfShare * stocks.sharePrice;
			totalSharePrice+= sharePrice;
		}
		System.out.println("Total Stocks Price is " + totalSharePrice);
	}
	
	public void debit(int withdrawAmmount) {
		
	}
}
