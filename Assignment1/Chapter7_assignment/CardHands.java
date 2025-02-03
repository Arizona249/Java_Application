import java.security.SecureRandom;

 class Card
  {
	  private final String face;// faceof card("Ace", "Deuce",...)
	  private final String suit;// suitof card("Hearts","Diamonds", ...)
	 
	  // two-argument constructor initializescard's face and suit
	  public Card(String cardFace,String cardSuit)
	  {
	  this.face =cardFace;// initialize face of card
	  this.suit =cardSuit;// initialize suit of card
	  }
	  
	  public String getFace(){
		  return face;
	  }
	  
	  public String getSuit(){
		  return suit;
	  }
	  
	  // returnString representationofCard
		 public String toString()
		 {
		 return face + " of "+ suit;
		 }
} // end class Card


 // Fig.7.11| Cardclassrepresentsaplayingcard.
  // Fig. 7.12: DeckOfCards.java
  // DeckOfCards classrepresentsa deck of playing cards.
 
 class DeckOfCards
 {
	private Card[] deck;//array of card Objects;
	private int currentCard;// index of next Card to be dealt (0-51)
	private static final int NUMBER_OF_CARDS=52; // constant # of Cards
	// randomnumber generator
	private static final SecureRandom randomNumbers =new SecureRandom();
  
  	// constructor fills deck of Cards
	public DeckOfCards()
	{
		String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };




		deck = new Card[NUMBER_OF_CARDS]; // create array of Card objects

			currentCard = 0; // first Card dealt will be deck[0]

		// populate deck with Card objects
		for (int count = 0; count < deck.length; count++) 
		{
			deck[count] = new Card(faces[count % 13], suits[count / 13]);
			// shuffle deck of Cards with one-pass algorithm
			
		}
	}	
	public void shuffle()	
	{
			// next call to method dealCard should start at deck[0] again
			currentCard = 0;

			// for each Card, pick another random Card (0-51) and swap them
			for (int first = 0; first < deck.length; first++)
			{
				// select a random number between 0 and 51
				int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
				// swap current Card with randomly selected Card
					Card temp = deck[first]; 
					deck[first] = deck[second]; 
					deck[second] = temp;
			}
	}

				// deal one Card
	public Card dealCard()
	{
		// determine whether Cards remain to be dealt
		if (currentCard < deck.length)
			return deck[currentCard++]; // return current Card in array
		else
			return null; // return null to indicate that all Cards were dealt
	}
	
	
	
	public void isPair() 
	{
		Card[] vari2 = new Card[5];
		Card temp;

		// Populate the array
		for (int a = 0; a < 5; a++) 
		{
			vari2[a] = dealCard();
		}

		// Check for pairs
		boolean pairFound = false;
		for (int a = 0; a < 4; a++) 
		{
			temp = vari2[a];
			if (a < vari2.length - 1 && temp.equals(vari2[a + 1])) 
			{
				pairFound = true;
				break;
			}
		}

		if (pairFound) 
		{
			System.out.println("We have a pair");
		} else 
		{
			System.out.println("We have no pair");
	    }
	}

	
	
	
}		 // end class DeckOfCards

	
	
 
 // Fig.7.12| DeckOfCardsclassrepresentsadeckofplayingcards.(Part1of2.)
 ////MAIN CODE BELOW;
 
 public class CardHands
{
	// execute application
	public static void main(String[] args)	
	{
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle(); // place Cards in random order
		
		

		// print all 52 Cards in the order in which they are dealt
		for (int i = 1; i <= 50; i++)
		{
			// deal and display a Card
			System.out.printf("%-19s", myDeckOfCards.dealCard()); 
			myDeckOfCards.isPair();
			if (i % 5 == 0) // output a newline after every fourth card
			System.out.println();	
		}
		

	}
}
	