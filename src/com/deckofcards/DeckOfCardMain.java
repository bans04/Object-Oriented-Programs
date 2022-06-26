package com.deckofcards;
import java.util.HashSet;
import java.util.Set;
/*
 * /*
 * main file
 * Write a Program DeckOfCards.java, to initialize deck of cards having suit
 * ("Clubs", "Diamonds", "Hearts", "Spades") & 
 * Rank ("2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace").
 * Shuffle the cards using Randommethod 
 * 
 * @ Dnyandeo bansode
 * 
 * **/

public class DeckOfCardMain {

	public static void main(String[] args) {
		String[][] cardCombo = new String[4][13];
		String[][] players = new String[4][9];
		Set<String> card = new HashSet();
		//variables
		int start = 0, end = 12, i =0, j =0, number = 1, option, k = 0, l = 0, m = 0, n = 0;
		
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		
		//deck cards
		for(i = 0; i < 4; i++) {
			for(j = start; j <= end; j++) {
				cardCombo[i][j] = suits[i] + ranks[j];
			}
		}
		
		while(number <= 36) {
			//use random function
			int randomSuits = (int) (Math.floor(Math.random()*10)%4);
			int randomRanks = (int) (Math.floor(Math.random()*10)%13);
			
			if(card.add(cardCombo[randomSuits][randomRanks]));{
				option = number % 4;
				switch(option) {
				case 0:
					players[option][k++] = cardCombo[randomSuits][randomRanks];
					break;
				case 1:
					players[option][l++] = cardCombo[randomSuits][randomRanks];
					break;
				case 2:
					players[option][m++] = cardCombo[randomSuits][randomRanks];
					break;
				case 3:
					players[option][n++] = cardCombo[randomSuits][randomRanks];
					break;
				}
				number++;
			}
		}
		//print cards of players
				for(i = 0; i < 4; i++) {
					System.out.println();
					System.out.print("Player" + (i + 1) + " :-> ");
					for(j = 0; j < 9; j++) {
						System.out.print(players[i][j] + " , ");
					}
					System.out.println();
				}
	}
}
