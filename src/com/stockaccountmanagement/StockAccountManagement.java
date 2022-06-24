package com.stockaccountmanagement;
import java.net.MulticastSocket;
import java.util.Scanner;

public class StockAccountManagement {
	StocksRepository stocksRepository = new StocksRepository();
	Scanner scanner = new Scanner(System.in);
	int ammount = 0;
	
	public void buyStock() {
		Stocks stock = new Stocks();
		System.out.println("Enter Stocks Details:-> ");
		System.out.print("Enter a Share Name:-> ");
		stock.stockName = scanner.next();
		
		System.out.print("Enter a No of Share:-> ");
		stock.noOfShare = scanner.nextInt();
		
		System.out.print("Enter Share Price:-> ");
		stock.sharePrice = scanner.nextInt();
		
		stocksRepository.buyStock(stock);
		System.out.println();
	}
	
	public void sell() {
		System.out.print("Enter Stock name that U want Sell:-> ");
		String stockName = scanner.next();
		Stocks stock = stocksRepository.getStock(stockName);
		ammount+= stock.noOfShare * stock.sharePrice;
		stocksRepository.remove(stock);
		ammount+= stock.noOfShare * stock.sharePrice;
	}
	
	public void showStock() {
		stocksRepository.showsStocks();
		System.out.println();
	}
	
	public void valueOf() {
		System.out.println("Stocks Value are:-> ");
		stocksRepository.getPrice();
		System.out.println();
	}
	
	public void totalPrice() {
		stocksRepository.getTotalStockPrice();
		System.out.println();
	}
	
	public void ammountInWallet() {
		System.out.print("Ammount in Wallet is:-> " + ammount);
		System.out.println();
	}
	
	public void debit() {
		System.out.print("Enter ammount U want to Withdraw:-> ");
		int withdrawAmmount = scanner.nextInt();
		if(withdrawAmmount > ammount) {
			System.out.println("Debit amount exceeded account balance.");
		}else {
			ammount = ammount - withdrawAmmount;
		}System.out.println();
	}
}
