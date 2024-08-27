import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		
		String input;
	    Scanner scan = new Scanner(System.in);
	    StringBuilder reversedString = new StringBuilder();
	    
	    System.out.println("Please enter your sentence. \n");
	    input = scan.nextLine();
	    reversedString.append(input);
	    reversedString = reversedString.reverse();
	    System.out.println(reversedString);
	    
	 


	}

}
