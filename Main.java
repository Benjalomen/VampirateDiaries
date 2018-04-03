import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Start new game!!
		CaptainsLog myGame = new CaptainsLog();
		
		//Title and prologue
		System.out.println("The Unapologetic Retelling of Classic Stories:  Nosferatu\n");
		System.out.println("~~~~~~~~~~~~~~~~Prologue~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Please name your vampiric pirate king:  ");
		myGame.name = input.next();
		System.out.println("\nAfter taking to the seas, Count " + myGame.name + " kept a detailed Captain's log.\n");
		System.out.println("Only bits and pieces have turned up over the years.");
		myGame.gameMenu();
	}
}
