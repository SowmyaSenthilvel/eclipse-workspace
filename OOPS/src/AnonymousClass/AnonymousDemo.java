package AnonymousClass;

class Cycle{
	void display() {
		System.out.println("This is Cycle");
	}
}


public class AnonymousDemo {

	public static void main(String[] args) {
		Cycle c=new Cycle()  //Anonymous Class
					{
		        	  	void display() {
		        	  			System.out.println("This is TriCycle");
		        	  			}
					};
		c.display();
		Cycle c1=new Cycle();
		c1.display();
	}

}
