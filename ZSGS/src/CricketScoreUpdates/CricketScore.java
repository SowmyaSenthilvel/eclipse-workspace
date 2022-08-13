package CricketScoreUpdates;
import java.util.ArrayList;
import java.util.List;

public class CricketScore {

	//List<PlayerListDao> playerScore = new ArrayList<>();
	PlayerListDao pl = new PlayerListDao();
	static int finalScore = 0;

	public void playerUpdate(String name, String team, int score) {
		pl.setName(name);
		pl.setTeam(team);
		pl.setScore(score);
	}

	public void updateScore(int run) {
		pl.setScore(run + finalScore);
	}

	public void viewPlayerDetails() {
		System.out.println("Player Name " + pl.getName());
		System.out.println("Player Team " + pl.getTeam());
		System.out.println("Player Scored " + pl.getScore());
	}

	public void updateStrikeRate(int score,int ball)
	{
		System.out.println("Player Strike Rate "+ score/ball * 100);
	}
}
