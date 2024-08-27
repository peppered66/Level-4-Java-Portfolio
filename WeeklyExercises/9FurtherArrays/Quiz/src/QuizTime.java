
public class QuizTime {

	public static void main(String[] args) {
		
		Quiz one = new Quiz();
		one.addQuestion("Is Leeds in yorkshire?", "yes");
		one.addQuestion("Is java object oriented?", "yes");
		one.addQuestion("Is java a typed language?", "yes");
		one.addQuestion("Is python a typed language?", "no");
		one.addQuestion("Is python object oriented?", "no");

		one.takeQuiz();

	}
	
		

}
