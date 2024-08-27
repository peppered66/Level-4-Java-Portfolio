import java.util.Random;
public class Main {

	public static void main(String[] args) {
		//declaring int array with 100 size limit for values
		// and a scores array to count values by group
		int [] values = new int[100];
		int [] scores = new int[10];
		//using random to generate numbers with a loop
		//that will fill each space in the array
		//with an integer between values 1-100
		Random value = new Random();
		for (int index=0; index < values.length; index ++)
		{
			values[index] = value.nextInt(100)+1;
		}
		//for loop that will run through all the values stored
		//following if statements to assign each instance of a value
		//between specified range to add 1 to the corresponding
		//array value of scores
		for (int number : values) {
			if (number >0 && number<=10) {
				scores[0] +=1;
			}
			if (number >10 && number<=20) {
				scores[1] +=1;
			}
			if (number >20 && number<=30) {
				scores[2] +=1;
			}
			if (number >30 && number<=40) {
				scores[3] +=1;
			}
			if (number >40 && number<=50) {
				scores[4] +=1;
			}
			if (number >50 && number<=60) {
				scores[5] +=1;
			}
			if (number >60 && number<=70) {
				scores[6] +=1;
			}
			if (number >70 && number<=80) {
				scores[7] +=1;
			}
			if (number >80 && number<=90) {
				scores[8] +=1;
			}
			if (number >90 && number<=100) {
				scores[9] +=1;
			}
		}
		System.out.println("1-10: " + "*".repeat(scores[0]));
		System.out.println("11-20: " + "*".repeat(scores[1]));
		System.out.println("21-30: " + "*".repeat(scores[2]));
		System.out.println("31-40: " + "*".repeat(scores[3]));
		System.out.println("41-50: " + "*".repeat(scores[4]));
		System.out.println("51-60: " + "*".repeat(scores[5]));
		System.out.println("61-70: " + "*".repeat(scores[6]));
		System.out.println("71-80: " + "*".repeat(scores[7]));
		System.out.println("81-90: " + "*".repeat(scores[8]));
		System.out.println("91-100: " + "*".repeat(scores[9]));


	}

}
