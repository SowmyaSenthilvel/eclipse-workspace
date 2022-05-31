package AnonymousClass;

class Cycle{
	void display() {
		System.out.println("This is Cycle");
	}
}

class TriCycle extends Cycle{
	void display() {
		System.out.println("This is TriCycle");
		
	}
}
public class ExampleDemo {

	public static void main(String[] args) {
		Cycle c=new TriCycle();
		c.display();

	}

}
