import java.util.Scanner;
public class MilesToKilometer {

	public static void main(String[] args) {
		double kilometer = 1.60935;
		float miles;
		double converted_distance;
		
		Scanner scan = new Scanner(System.in);
	       System.out.println("Please enter your distance in miles and it will be converted to kilometers.");
	       
	       System.out.print("Please enter the distance in miles: ");
	       miles = scan.nextFloat();
	       converted_distance = (miles * kilometer);
	       System.out.println("The distance in kilometers is " + converted_distance + " km.");
	}

}
