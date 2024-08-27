import java.util.Scanner;

public class Quiz {
	public Question[] questionList;
	int count;
//creates array of questions with 25 as a limit
public Quiz() {
	questionList = new Question[25];
	count = 0;
}
//add method specified which checks length of array and if it's not full
//adds a new question object to the array
public void addQuestion(String question, String answer) {
	if (count < questionList.length) {
	questionList[count] = new Question(question, answer);
	count++;
	}
}

//method which prints questions in array and collects user answers 
public void takeQuiz() {
    int score = 0;
    Scanner scan = new Scanner(System.in);
//loops through array starting from 0 displaying each question followed by taking user input with scanner
//compared this input to answer and if correct adds 1 to score variable which is used in print statement
    try {
        for(int i = 0; i < questionList.length; i++) {
            System.out.println(questionList[i].question + "\t type yes or no to answer.");
            String userAnswer = scan.nextLine();
            if(userAnswer.equalsIgnoreCase(questionList[i].answer)) {
                score ++;
            }

        }
    } catch (NullPointerException e) {
            System.out.println("You scored: " + score + " answers correctly.");
        } 

}


}