
public class PlayerStats {
	protected String playerName, teamName;
	protected int score;
	
	protected PlayerStats (String playerName, String teamName, int score) {
		this.playerName = playerName;
		this.teamName = teamName;
		this.score = score;
	}
	
	public void SetPlayer(String playerName) {
		this.playerName = playerName;
	}
	
	public String GetPlayer() {
		return playerName;
	}
	
	public void SetTeam(String teamName) {
		this.teamName = teamName;
	}
	
	public String GetTeam() {
		return teamName;
	}
	
	public void SetScore(int score) {
		this.score = score;
	}
	public int GetScore() {
		return score;
	}
}
