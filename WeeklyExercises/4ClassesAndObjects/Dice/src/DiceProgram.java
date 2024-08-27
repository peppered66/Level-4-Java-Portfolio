import java.util.Random;
import java.util.Scanner;

public class DiceProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
        Random generator = new Random();
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        
	    System.out.println("How many sides are on the first dice? ");
	    dice1.diceSides = scan.nextInt();
	    System.out.println("How many sides are on the second dice? ");
	    dice2.diceSides = scan.nextInt();

        dice1.roll1 = generator.nextInt(1,dice1.diceSides);
        dice1.roll2 = generator.nextInt(1,dice1.diceSides);
        dice1.roll3 = generator.nextInt(1,dice1.diceSides);
        dice2.roll1 = generator.nextInt(1,dice2.diceSides);
        dice2.roll2 = generator.nextInt(1,dice2.diceSides);
        dice2.roll3 = generator.nextInt(1,dice2.diceSides);
        
        int dice1average = ((dice1.roll1 + dice1.roll2 +dice1.roll3) /3);
	    int dice2average = ((dice2.roll1 + dice2.roll2 +dice2.roll3) /3);
	    int dice1total = (dice1.roll1 + dice1.roll2 +dice1.roll3);
	    int dice2total = (dice2.roll1 + dice2.roll2 +dice2.roll3);

        System.out.println("Dice 1's first roll is: " + dice1.roll1);
        System.out.println("Dice 2's first roll is: " + dice2.roll1);

        System.out.println("Dice 1's second roll is: " + dice1.roll2);
        System.out.println("Dice 2's second roll is: " + dice2.roll2);

        System.out.println("Dice 1's third roll is: " + dice1.roll3);
        System.out.println("Dice 2's third roll is: " + dice2.roll3);

        System.out.println("Dice 1 rolled a total of "+ dice1total + " and rolled " + dice1average + " on average.");
        System.out.println("Dice 2 rolled a total of "+ dice2total + " and rolled " + dice2average + " on average.");

	    
	}

}

