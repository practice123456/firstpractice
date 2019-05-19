import java.util.Scanner;
import java.lang.Math;
public class RockPaperScissors
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int playerWins = 0;
		int computerWins = 0;
		System.out.println("Enter in \"play\" to play; enter in \"quit\" to quit: ");
		String  input = sc.nextLine();
		while (input.equalsIgnoreCase("quit" ) == false)
		{
		    while ((input.equalsIgnoreCase("play") == false) && (input.equalsIgnoreCase("quit") == false))
			{
				System.out.println("Invalid choice");
				System.out.println("Enter in \"play\" to play; enter in \"quit\" to quit: ");
				input = sc.nextLine();
			}
			System.out.println("Enter in \"rock\" for rock, \"paper\" for paper, or \"scissors\" for scissors: ");
			String choice = sc.nextLine();
			int computer = (int)(Math.random() * 3) + 1;
			
			while ((choice.equalsIgnoreCase("rock") == false) && (choice.equalsIgnoreCase("paper") == false) && (choice.equalsIgnoreCase("scissors") == false))
			{
				System.out.println("invalid choice");
				System.out.println("Enter in \"rock\" for rock, \"paper\" for paper, or \"scissors\" for scissors: ");
				choice = sc.nextLine();
			}
			
			if (choice.equalsIgnoreCase("rock") == true)
			{
				System.out.println("You chose rock");
			}
			else if (choice.equalsIgnoreCase("paper") == true)
			{
				System.out.println("You chose paper");
			}
			else if (choice.equalsIgnoreCase("scissor") == true)
			{
				System.out.println("You chose scissor");
			}
			if (computer == 1)
			{
				System.out.println("The computer chose rock");
			}
			else if (computer == 2)
			{
				System.out.println("The computer chose paper");
			}
			else if (computer == 3)
			{
				System.out.println("The computer chose scissor");
			}
			if ((choice.equalsIgnoreCase("rock") == true  && computer == 1) || (choice.equalsIgnoreCase("paper") == true  && computer == 2)
			    || (choice.equalsIgnoreCase("scissors") == true  && computer == 3))
			{
				System.out.println("It is a tie");
			}
			else
				if ((choice.equalsIgnoreCase("rock") == true && computer == 3) || (choice.equalsIgnoreCase("paper") == true && computer == 1) || (choice.equalsIgnoreCase("scissors") == true && computer == 2))
				{
					System.out.println("You win");
					playerWins++;
				}
			else
			{
				System.out.println("you lose");
				computerWins++;
			}	
			System.out.println("Enter \"play\" to play again; \"quit\" to quit");
			input = sc.nextLine();
			while ((input.equalsIgnoreCase("play") == false) && (input.equalsIgnoreCase("quit") == false))
			{
				System.out.println("Invalid choice");
				System.out.println("Enter \"play\" to play again; \"quit\" to quit");
				input = sc.nextLine();
			}
			if (input.equalsIgnoreCase("quit") == true)
			{
				System.out.println("Player wins: " + playerWins);
				System.out.println("Computer wins: " + computerWins);
			}
		}
	}// main
}// class