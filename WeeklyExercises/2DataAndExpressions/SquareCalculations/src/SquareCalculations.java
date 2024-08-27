import java.util.Scanner;
public class SquareCalculations {

	public static void main(String[] args) {
		int square_length;
		int perimeter;
		int area;
		Scanner scan = new Scanner(System.in);
	    System.out.println("Please enter the length of the squares side in cm.");
	    square_length = scan.nextInt();
	    perimeter = (square_length * 4);
	    area = (square_length * square_length);
	       
	    System.out.println("The perimeter of the square is " + perimeter + "cm and the area is " + area + "cm squared.");
	}
	
	

}
