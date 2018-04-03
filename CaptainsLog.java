import java.util.Scanner;

public class CaptainsLog {
	Scanner input = new Scanner(System.in);		
	
	int hp = 3;
	int magika = 3;
	String form = "human";
	String name;
	
	// Print out user's current stats
	public void printStats() {
		System.out.println("HP:  " + hp);
		System.out.println("Magika:  " + magika);
		System.out.println("Form:  " + form);
		
		if (hp == 0) 
			deathPrompt();
	}
	
	// If player dies, then restart game
	public void deathPrompt() {
		System.out.println("\nYou have died...\n");
		System.out.println("Would you like to continue?");
		System.out.println("\t1) Yes");
		System.out.println("\t2) No\n");
		int continueGame = input.nextInt();
		if (continueGame == 1)
			gameMenu();
	}
	
	// Menu to navigate to different stories
	public void gameMenu() {
		Scanner input = new Scanner(System.in);		
		System.out.println("Which section would you like to examine?");
		System.out.println("\t1) Logan's story");
		System.out.println("\t2) Benja's story");
		System.out.println("\t3) Spencer's story");
		
		int sectionChoice = input.nextInt();
		
		if (sectionChoice == 1) {
			logan();
		}
		if (sectionChoice == 2) {
			benja();
		}
		if (sectionChoice == 3) {
			spencer();
		}
	}
	
public void logan(){
		
		System.out.println("\nThe date on this entry has been almost entirely eroded by time and weather. \nYou can only make out the year. It was 1878. The log reads:\n\n");
		System.out.println("Fighting strong head winds and despite the loss of our noble cockswain \nwe at last moored in Buttsmouth late this morning. Regrettably most of \nour cargo was found to be spoiled. We were forced to collect our remunerations \nusing unfavorable methods.\n\n");
		System.out.println("\t1) Read about cockswain");
		System.out.println("\t2) Read about cargo");
		System.out.println("\t3) Read about unfavorable methods");
		System.out.println("\t4) Stop reading");
		
		int aResponse = input.nextInt();
		
		if (aResponse == 1){
			System.out.println("\nIn a lamentable turn of events our cockswain found his member entangled in the rigging.\nA horrendously well timed gust caught the sails, drawing the ropes taught and severing our shipmates genetalia. \nThe irony was not lost on us. We've erected our most phallic plank at the bow in memoriam.");
		}
	}
	
	public void benja(){
		hp = 6;
		int day = 26;
		int eatYourCrew = 1;
		while (eatYourCrew == 1) {
			if (day < 32) {
				System.out.println("\n\nJanuary " + day + ", 1420\n");
				System.out.println("I am weak with thirst.");
				System.out.println("I am only sustained by a near constant intake of fish blood.  Oh, how I hate the taste...");
				System.out.println("Should I drain the blood from my final crew member?!");
				System.out.println("\t1)Spare the lad.  He plays a decent fiddle");
				System.out.println("\t2)Satiate your needs and drain the plump bastard");
				eatYourCrew = input.nextInt();
				day++;
				hp--;
				printStats();
			}
		}
		
		System.out.println("\nThe relief was momentary.  I've killed my navigator!");
		System.out.println("Lost and alone, I commit myself to the depths...");
		hp = 0;
		form = "Sobbing bat";
		printStats();
	}
	
	// Spencer story method
	public void spencer() {

		System.out.println("I awoke last weekend to find my ship in shambles. I love my crew."

				+ "They really know how to murder, but I wish sometimes they would focus more on cleaning than killing."

				+ "I really need to find a few crew members who can mop the floor with my adversaries and mop my floor. ");

		System.out.println("You take out an advert in the paper for an opening for your crew. What does it say?");

		System.out.println("\t1) Looking for someone to roam the high seas with."

				+ " 60 Stabs per minute minimum, no aversion to the smell of feces and entrails."

				+ "Must value a clean, sterile, and well organised work space.");

		System.out.println("\t2) Need a cleaning lady who likes to murder and steal!! Serious enquiries only!!");

		System.out.println("\t3) Wanna clean my poop deck?");

		

		int pathchoice = input.nextInt();

		

		if (pathchoice == 1) {

			System.out.println("A few people answer the advert.");

			System.out.println("You decide to interview three individuals. Which conveniantly like the rest of the game means you get to choose from a list of three...");

			System.out.println("\t1) Mark, noticabley cleaner than most pirates."

					+ " However, when told to test his stab rate on your first mate, Sergio, he was only able to stab him 20 times before Sergio fell to the floor.");

			System.out.println("\t2) Gary, really nice with an excellent singing voice."

					+ " Letter of recommendation is obviously forged, you killed Captain Squirts 60 years ago and annihillated everyone who was ever nice to him."

					+ " Was able to stab right at 60 spm. Seems to swab with good pressure and cadence.");

			System.out.println("\t3) Henry, called you "+name+", which makes you...confused. 110 spm ( a little better than your own)."

					+ " When he left there wasnt any poop left on your poop deck...That's never happened. "

					+ "He was also able to remove all the soot from your mahogany bureau using a mixture of urine and grogg.");

			

			printStats();

		}

		int path1choice = input.nextInt();

		

		if (path1choice == 1) {

			System.out.println("Mark starts great he help clean the HMS Nosferatoot and took great pride in his work."

					+ "When it came to pirating he wasnt all that great.  He was stabbed in the balls by a unique and bled to death");

		}

		if (path1choice == 2) {

			System.out.println("\t2) Gary,worked out.  He was one of the best crew members the Nosferatoot ever had.  He was the only first mate not to be stabbed as part of an interview."

					+ " He sang at your wedding, causing you to cry one singe tear. He was the godfather of your children before they ate him");

		}

		

		if (path1choice == 3) {

			System.out.println("\t2) Mark was douche from day one.  He wouldn't stop calling you "+name+", even after you pulled him aside and told him it was not cool. "

					+ "You walked in on him planning a mutiny and ripped his balls off...he bled to death.");

		}
	}
}
