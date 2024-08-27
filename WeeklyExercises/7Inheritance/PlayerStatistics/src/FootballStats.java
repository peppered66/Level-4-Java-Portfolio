
public class FootballStats extends PlayerStats{
protected int totalGoals;
protected int shotsTaken;
protected int matchesPlayed;
protected int assists;
protected int goalsPerGame;

	protected FootballStats(String playerName, String teamName, int score, int shotsTaken, int matchesPlayed, int assists) {
		super(playerName, teamName, score);
		totalGoals = score;
		this.shotsTaken = shotsTaken;
		this.matchesPlayed = matchesPlayed;
		this.assists = assists;
		goalsPerGame = totalGoals / matchesPlayed;
	}
	public void SetTotalGoals(int totalGoals) {
		this.totalGoals = totalGoals;
		goalsPerGame = totalGoals / matchesPlayed;

	}
	
	public int GetTotalGoals() {
		return totalGoals;
	}
	public void SetShotsTaken(int shotsTaken) {
		this.shotsTaken = shotsTaken;
	}
	
	public int GetShotsTaken() {
		return shotsTaken;
	}
	
	public void SetMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	
	public int GetMatchesPlayed() {
		return matchesPlayed;
	}
	
	public void SetAssists(int assists) {
		this.assists = assists;
	}
	
	public int GetAssists() {
		return assists;
	}
	public void SetGoalsPerGame() {
		goalsPerGame = totalGoals / matchesPlayed;
	}
	
	public int GetGoalsPerGame() {
		return goalsPerGame;
	}
	public String toString() {
		return "The football players name is " + playerName + " the team he plays for is " + teamName + ". He has played " + matchesPlayed + " matches, with " + shotsTaken + " shots taken and " + assists + " assists with " + totalGoals + " goals.\nThis leads to a goals per game average of " + GetGoalsPerGame() + ".\n";
	}
}