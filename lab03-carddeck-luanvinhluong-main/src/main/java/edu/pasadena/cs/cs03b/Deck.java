package edu.pasadena.cs.cs03b;

import java.util.Scanner;

public class Deck {

	public static int CARDINDECK = 52;
	private static final int numOfCards = 13;
	private static final String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
			"King" };
	private static final String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

	public static String getCardNumber(int number) {
		// TODO: you will use % to determine the card number of a shape
		int rankIndex = (number - 1) % numOfCards;
		String result;
		switch (rankIndex) {
			case 0:
				result = "Ace";
				break;
			case 1:
				result = "2";
				break;
			case 2:
				result = "3";
				break;
			case 3:
				result = "4";
				break;
			case 4:
				result = "5";
				break;
			case 5:
				result = "6";
				break;
			case 6:
				result = "7";
				break;
			case 7:
				result = "8";
				break;
			case 8:
				result = "9";
				break;
			case 9:
				result = "10";
				break;
			case 10:
				result = "Jack";
				break;
			case 11:
				result = "Queen";
				break;
			case 12:
				result = "King";
				break;
			default:
				result = "Unknown Rank";
		}
		// TODO : switch case to determine the card number
		return result;
	}

	public static String getCardSuit(int number) {
		// TODO: you will use / to determine the card suit
		int suitIndex = (number - 1) / numOfCards;
		String result;
		switch (suitIndex) {
			case 0:
				result = "Clubs";
				break;
			case 1:
				result = "Diamonds";
				break;
			case 2:
				result = "Hearts";
				break;
			case 3:
				result = "Spades";
				break;
			default:
				result = "Unknown Suits";
		}
		// TODO : switch case to determine the card suit
		return result;
	}

	// TODO: Method to determine the ranks and suits of the deck
	public String getCardRankSuit(int pCardIndex) {
		int index = pCardIndex;
		String result = "";
		if (index < 0 || index > Deck.CARDINDECK) {
			result = "Invalid index";
		} else {
			result = Deck.getCardNumber(index) + " of " + Deck.getCardSuit(index);
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO: Add your code here for interactive console mode
		System.out.println("Welcoime to Deck Class Main Method!");
		Scanner scanner = new Scanner(System.in);
		char ans;
		do {
			System.out.println("Enter Card Number(1-52): ");
			int cardNumbers = scanner.nextInt();
			Deck deck = new Deck();
			String result = deck.getCardRankSuit(cardNumbers);
			System.out.println("You selected " + result);
			System.out.println("Press y for another card: ");
			ans = scanner.next().charAt(0);
		} while (ans == 'Y' || ans == 'y');

		scanner.close();

	}
}
