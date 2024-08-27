import java.util.Random;

public class Card {
	private int suit;
	private int value;
	private String convertedValue;
	private String cardSuit;

	 //constructor to create card with two randomly created values for suit and value
	 public Card () {
	 Random number = new Random();
	 suit = number.nextInt(4);
	 //added +1 so we dont end up with number 0
	 value = number.nextInt(14)+1;

	 //using suit variable I am deciding which suit the card will be for each number
	 switch (suit) {
	 case 0: 
		 cardSuit = "Spades";
		 break;
	 case 1:
		 cardSuit = "Hearts";
		 break;
	 case 2:
		 cardSuit = "Diamonds";
		 break;
	 case 3:
		 cardSuit = "Clubs";	 
	 }
	 //assigning value data to converted value as I want a string not an integer
	 switch (value) {
	 case 1:
		 convertedValue = "1";
	 	 break;
	 case 2:
		 convertedValue = "2";
		 break;	 	 
	 case 3:
		 convertedValue = "3";
		 break;
	 case 4:
		 convertedValue = "4";
		 break;
	 case 5:
		 convertedValue = "5";
		 break;
     case 6:
    	 convertedValue = "6";
		 break;
	 case 7:
		 convertedValue = "7";
		 break;
	 case 8:
		convertedValue = "8";
	 	break;
	 case 9:
		 convertedValue = "9";
		 break;
	 case 10:
		 convertedValue = "10";
	 	 break;
     case 11:
		 convertedValue = "Ace";
		 break;
	 case 12:
		 convertedValue = "Jack";
		 break;
	 case 13:
		 convertedValue = "King";
		 break;
	 case 14:
		 convertedValue = "Queen";	 
		 break;
	}
	}
	
	 public String getSuit() {
		    return cardSuit;
		  }

	 public String getValue() {
		    return convertedValue;
		  } 
	 
	 //get statement to return card using the methods which isn't needed as the data is initialised in the constructor
	 // could have just used the variables 
	 public String toString() {
		    return "The suit of the card is " + getSuit() + ", and the value is " + getValue() + ".\n";
		  }
	
	
}