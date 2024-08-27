
public class PunctuationMarks {

	public static void main(String[] args) {
		int commaCount = 0;
		int stopCount = 0;
		int dashCount = 0;
		String Sentence = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";

		//first statement initialising index at 0 with variable i,  next statement defines condition of loop which is a method counting all chars, third statement states how to increase index
		for (int i=0; i < Sentence.length(); i++)
		{
			
	            if(Sentence.substring(i,i+1).equalsIgnoreCase(","))
	            	commaCount++;
	            
	            else if(Sentence.substring(i,i+1).equalsIgnoreCase("."))
	                stopCount++;
	            
	            else if (Sentence.substring(i,i+1).equalsIgnoreCase("-"))

	                dashCount++;
	    }

	        System.out.println("Comma Count: " + commaCount);
	        System.out.println("Fullstop Count: " + stopCount );
	        System.out.println("Dash Count: " + dashCount );

	}

}

// Solution created with help from https://runestone.academy/ns/books/published/csawesome/Unit4-Iteration/topic-4-3-strings-loops.html
