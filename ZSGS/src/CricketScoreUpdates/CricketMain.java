package CricketScoreUpdates;
import java.util.Scanner;

public class CricketMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		CricketScore cs=new CricketScore();
		boolean playerStatus = true;
		int runs,totalRuns=0,i=0;
		int over = 1;
		
		cs.playerUpdate("Rohit", "India", 0);
		while (playerStatus && over <= 3) {
			for ( i = 0; i < 6; i++) {
				System.out.println("Enter -1 to get Wicket");
				System.out.println("Enter a Score in " + over + " over " + i + " ball");
				System.out.println("If You Enter more than 6 runs It conside as 6 runs ");
				runs = sc.nextInt();
				if(runs > 6)
				{
					runs = 6;
				}
				totalRuns=totalRuns+runs;
				if(runs == -1)
				{
					playerStatus=false;
					break;
				}
			}
			if(playerStatus == false)
			{
				cs.updateScore(totalRuns);
				cs.viewPlayerDetails();
				cs.updateStrikeRate(totalRuns, i);
				break;
			}
		}

	}



}


