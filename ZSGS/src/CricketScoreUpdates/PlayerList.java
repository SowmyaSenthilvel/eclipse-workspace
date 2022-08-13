package CricketScoreUpdates;

import java.util.ArrayList;
import java.util.HashMap;

public class PlayerList {	
	public static ArrayList<PlayerList> allPlayersList=new ArrayList<>();
	
	private int id;
	private String name;
	private int score;
	private int wicket;
	
	public int getWicket() {
		return wicket;
	}
	public void setWicket(int wicket) {
		this.wicket = wicket;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}