package GuessTheOutput;

class A{
	protected int a,b;
}
//protected keyword can be accessed by same packages inherited class and different packages inherited class.
public class GuessTheOuput1 {

	public static void main(String[] args) {
		A n=new A();
		System.out.println(n.a+" "+n.b);

	}

}
