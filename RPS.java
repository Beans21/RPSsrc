import java.util.*;
public class RPS {
	
	public static void main (String[] args) {
		userMood();
		Scanner console = new Scanner(System.in);
		String computerChoice = "";
		Random r = new Random();
		int computerInt = r.nextInt(3) + 1;
		
// Assigning computerInt numbers to equal a certain String to then compare this string to userChoice
		if (computerInt == 0) {
			computerChoice = "Rock";
		} else if (computerInt == 1) {
			computerChoice = "Paper";
		} else if (computerInt == 2) {
			computerChoice = "Scissors";
		}
		
// Asking user what they want to choose as an option
		String sentinel = "laser ray";
		System.out.print("Do you choose Rock, Paper, or Scissors ( " + sentinel + " to quit)? ");
		String userChoice = console.nextLine();
		
		
/* While Loop that states if userChoice does not equal the sentinel then these are the results of the game
 * http://stackoverflow.com/questions/17976883/rock-paper-scissors-in-javascript */
		int count = 0;
		while (!sentinel.equals(userChoice)) {
			if (userChoice ==  )
				
			}
		System.out.print("Do you choose Rock, Paper, or Scissors ( " + sentinel + " to quit)? ");
		userChoice = console.nextLine();
// Print out choices here
		count++;
		}
		
		
		
	}
	
//Method welcomes player to the game
	public static void userMood() {
		Scanner welcome = new Scanner(System.in);
		System.out.print("Welcome to the Rock, Paper, Scissors game! How are you today in one word, User? ");
		String userMood = welcome.nextLine();
		System.out.print("I am happy that you, the User, are " + userMood + ". Now let's play!");
	}

}
