package railwayReservation;

public class Passenger {
	static int id=1;
	String name;
	int age;
	String berthPreference;
	int PassengerId;
	String alloted;
	int number;
	public Passenger(String name, int age, String berthPreference) {
		super();
		this.name = name;
		this.age = age;
		this.berthPreference = berthPreference;
		this.PassengerId=id++;
		alloted="";
		number=-1;
		
	}
	
}
