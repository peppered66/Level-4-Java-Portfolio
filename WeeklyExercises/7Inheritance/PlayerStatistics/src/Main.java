
public class Main {

	public static void main(String[] args) {
		CricketStats Johnny = new CricketStats("johnny", "England", 500, 100, 30);
		System.out.println(Johnny.toString());
		Johnny.SetTeam("Wales");
		Johnny.SetRuns(600);
		System.out.println(Johnny.GetPlayer());
		System.out.println(Johnny.toString());
		Johnny.SetNotOuts(20);
		Johnny.SetInnings(300);
		System.out.println(Johnny.toString());

		
		FootballStats William = new FootballStats("William", "Leeds", 100, 140, 40, 30);
		System.out.println(William.toString());
		William.SetTeam("Liverpool");
		William.SetAssists(50);
		William.SetTotalGoals(150);
		System.out.println(William.toString());
	}

}
