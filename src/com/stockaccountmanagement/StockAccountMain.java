package com.stockaccountmanagement;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
/*
 * Write a program to read in Stock Names, Number of Share, Share Price. 
 * Print a Stock Report with the total value of each Stock and the total value of Stock.
 * 
 * Account to provide a method called debit that withdraws money from an Account.
 * Ensure that the debit amount does not exceed the Account’s balance. 
 * If it does, the balance should be left unchanged and the method should print a message indicating ― 
 * Debit amount exceeded account balance.
 * 
 * @Dnyandeo Bansode
 * 
 * */

public class StockAccountMain {

	public static void main(String[] args) {
		StocksRepository stocksRepository = new StocksRepository();
		Scanner scanner = new Scanner(System.in);
		StockAccountManagement stockAccountManagement = new StockAccountManagement();
		
		
		/*Stocks stocks1 = new Stocks();
		stocks1.noOfShare = 23;
		stocks1.sharePrice = 425;
		Stocks stocks = new Stocks("Tata Motors", 23, 656);
		stocksRepository.getPrice(stocks);*/
		
		while(true) {
			System.out.println("1.Buy Stock \n2.Shows Stocks \n3.Sell Stock \n4.Value Of Each Stock \n5.Value Of Total Stock"
								+ " \n6.Balance in Wallet \n7.Withdraw balance ");
			System.out.print("Enter Your Choice:-> ");
			int choice = scanner.nextInt();
			System.out.println();
			switch(choice) {
			case 1:
				stockAccountManagement.buyStock();
				break;
				
			case 2:
				stockAccountManagement.showStock();
				break;
				
			case 3:
				stockAccountManagement.sell();
				break;
				
			case 4:
				stockAccountManagement.valueOf();
				break;
				
			case 5:
				stockAccountManagement.totalPrice();
				break;
				
			case 6:
				stockAccountManagement.ammountInWallet();
				break;
				
			case 7:
				stockAccountManagement.debit();
				break;
			}
		}
	}
}
