import java.util.Scanner;
import java.util.Random;

public class PinEncryption {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Random generator = new Random();
	Pin myPin = new Pin();
	
	System.out.println("Please enter 4 digit pin. ");
	myPin.original_pin = scan.nextInt();
	
	//convert to hex
	String hex1 = Integer.toHexString(myPin.original_pin);
	
	//generate random numbers
	myPin.r_value1 = generator.nextInt(1000,65536);
	myPin.r_value2 = generator.nextInt(1000,65536);
	
	//convert random numbers
	String hex2 = Integer.toHexString(myPin.r_value1);
	String hex3 = Integer.toHexString(myPin.r_value2);
	myPin.final_pin = hex2 + hex1 + hex3;

	System.out.println("Your encrypted password is: " + myPin.final_pin + ".");
	}

}
