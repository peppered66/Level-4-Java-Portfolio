import java.util.Scanner;
public class Fraction {

	public static void main(String[] args) {
		int denominator, numerator;
		double decimal;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the numerator of the fraction.");
			numerator = scan.nextInt();
			System.out.println("Please enter the denominator of the fraction.");
			denominator = scan.nextInt();
			if(denominator == 0) {
				System.out.println("You can't divide by zero.");
			}
			
			else {
			decimal = (double)numerator / denominator;
			System.out.println("This fraction converted to decimal is " + decimal);
			}
		
	}

}
