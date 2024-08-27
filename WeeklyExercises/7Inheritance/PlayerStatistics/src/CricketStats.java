
public class CricketStats extends PlayerStats{
	//statistics related to batting from cricket
protected int runs;
protected int innings;
protected int battingAverage;
protected int notOuts;
	protected CricketStats(String playerName, String teamName, int score, int innings, int notOuts) {
		super(playerName, teamName, score);
		runs = score;
		this.innings = innings;
		this.notOuts = notOuts;
		battingAverage = runs / (innings - notOuts);
	}
	
	public void SetRuns(int runs) {
		this.runs = runs;
		battingAverage = runs / (innings - notOuts);

	}
	public int GetRuns() {
		return runs;
	}
	
	public void SetInnings(int innings) {
		this.innings = innings;
		battingAverage = runs / (innings - notOuts);

	}
	
	public int GetInnings() {
		return innings;
	}
	
	public void SetNotOuts(int notOuts) {
		this.notOuts = notOuts;
		battingAverage = runs / (innings - notOuts);

	}
	
	public int GetNotOuts() {
		return notOuts;
	}
	public void SetBattingAverage() {
		battingAverage = runs / (innings - notOuts);
	}
	public int GetBattingAverage() {
		return battingAverage;
	}
	public String toString() {
		return "The cricket players name is " + playerName + " the team he plays for is " + teamName + ". He has played " + innings + " innings, with " + notOuts + " not outs and scored " + runs + " runs.\nThis leads to a batting average of " + battingAverage + ".\n";
	}
}
