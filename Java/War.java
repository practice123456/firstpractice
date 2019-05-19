import java.util.*;
class War
{
	// transfers all members from a1 to a2
	public static void transfer(ArrayList<Integer> a1, ArrayList<Integer> a2)
	{
		while(a1.size() > 0)
		{
			// take card from top of a1, put in bottom of a2
			a2.add(a1.remove(0));
			//System.out.println(a2.size());
		}
	}
	
	public static void main(String[] args) 
	{
		// initializing
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> deck = new ArrayList<Integer>();
		ArrayList<Integer> p1;
		ArrayList<Integer> p2;
		int x = 0;
		int check = 0;
		// add cards to main deck		
		for (int i = 1; i < 11; i++)
		{
			for (int count = 0; count < 4; count++)
			{
				deck.add(i);
			}
		}
		// game loop
		System.out.println("Welcome to War.  Press 1 to play, press 2 to quit, or press 3 to simulate triple war");
		x = sc.nextInt();
		while (x != 1 && x != 2 && x != 3)
		{
			System.out.println("Invalid option.  Press 1 to play, press 2 to quit, or press 3 to simulate triple war");
			x = sc.nextInt();
		}
		if (x == 2)
		{
			System.out.println("Quitting...");
			return;
		}
		// shuffle main deck and deal player decks
		if (x == 3)
		{
			//Collections.shuffle(deck);
		}
		else
			Collections.shuffle(deck);
		p1 = new ArrayList<>();
		p2 = new ArrayList<>();

		// filling main deck
		for (int i = 0; i < deck.size(); i++)
		{
			if (i % 2 == 0)
			{
				p1.add(deck.get(i));
			}
			else
			{
				p2.add(deck.get(i));
			}
		}
	/*System.out.print("Deck: ");
	for (int i = 0; i < deck.size(); i++)
	{
		System.out.print(deck.get(i));
	}*/


	// dealing cards to player decks
		// loop for turns
		while (p1.size() > 0 && p2.size() > 0)
		{
			// beginning of turn
			System.out.print("Player 1 hand: ");
			for (int i = 0; i < p1.size(); i++)
			{
				System.out.print(p1.get(i) + " ");
			}
			System.out.println();
			System.out.print("Player 2 hand: ");
			for (int i = 0; i < p2.size(); i++)
			{
				System.out.print(p2.get(i) + " ");
			}
			System.out.println();
			System.out.println("Player 1 size: " + p1.size());
			System.out.println("Player 2 size: " + p2.size());
			int card1 = p1.remove(0);
			int card2 = p2.remove(0);
			
			System.out.println("Player 1: " + card1);
			System.out.println("Player 2: " + card2);
			if (card1 > card2)
			{
				// might want to randomize order or something else
				p1.add(card2);
				p1.add(card1);
				System.out.println("Player 1 wins round, has "+ p1.size() +" cards");
				System.out.println("Player 2 has " + p2.size() + " cards");
			}
			else if (card2 > card1)
			{
				p2.add(card2);
				p2.add(card1);
				System.out.println("Player 2 wins round, has "+ p2.size() +" cards");
				System.out.println("Player 1 has " + p1.size() + " cards");
			}
			else // war
			{
				System.out.println("War!");
				int warCount = 1;
				ArrayList<Integer> tempPile1 = new ArrayList<Integer>();
				ArrayList<Integer> tempPile2 = new ArrayList<Integer>();

				tempPile1.add(card1);
				tempPile2.add(card2);

				while(warCount < 3)
				{
					// check that both decks have at least 2 more cards
					// and decide what to do if not
					// player that doesn't have enough cards loses
					
					if (p1.size() < 2)
						{
							System.out.println("Player 1 does not have enough cards to initiate war.  Therefore, player 1 loses the game");
							System.out.println("Player 2 wins!");
							return;
						}
					else if (p2.size() < 2)
						{
							System.out.println("Player 2 does not have enough cards to initiate war.  Therefore, player 2 loses the game");
							System.out.println("Player 1 wins!");
							return;
						}
						
					
					// face down cards added to top of temppiles
					tempPile1.add(0, p1.remove(0));
					tempPile2.add(0, p2.remove(0));
					
					// face up cards
					card1 = p1.remove(0);
					card2 = p2.remove(0);
					tempPile1.add(0, card1);
					tempPile2.add(0, card2);
					System.out.println("Player 1: " + card1);
					System.out.println("Player 2: " + card2);

					if(card1 > card2)
					{
						System.out.println("Player 1 wins war");
						transfer(tempPile1, p1);
						transfer(tempPile2, p1);
						break;
					}
					else if(card2 > card1)
					{
						System.out.println("Player 2 wins war");
						transfer(tempPile2, p2);
						transfer(tempPile1, p2);
						break;
					}
					else // if cards are the same, war again
					{
						System.out.println("War again!");
						warCount++;
					}
					
					// give cards back if you get war 3 times in a row
					if(warCount == 3)
					{
						System.out.println("Third war, returning cards");
						transfer(tempPile1, p1);
						transfer(tempPile2, p2);
					}
				} // war loop
				
			}
			// turn has ended
			System.out.println("Press enter to continue or 'Q' to quit");
			Scanner sctemp = new Scanner(System.in);
			String input = sctemp.nextLine(); // new scanner such that it does not take input from the "sc" scanner object
			//String input = "";
			if (input.equalsIgnoreCase("q")) 
			{
				System.out.println("quitting...");
				break;
			}
			

		} // turns
		
		// after exiting from game loop, say who the winner is
		if(p1.size() > p2.size())
		{
			System.out.println("Player 1 wins!");
		}
		else if (p2.size() > p1.size())
		{
			System.out.println("Player 2 wins!");
		}
		else 
		{
			System.out.println("It is a tie!");
		}
	}// main
}// class