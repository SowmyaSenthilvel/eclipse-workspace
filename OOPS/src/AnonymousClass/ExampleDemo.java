package AnonymousClass;

class Cycle2{
	void display() {
		System.out.println("This is Cycle");
	}
}

class TriCycle extends Cycle2{
	void display() {
		System.out.println("This is TriCycle");
		
	}
}
public class ExampleDemo {

	public static void main(String[] args) {
		Cycle2 c=new TriCycle();
		c.display();

	}

}
