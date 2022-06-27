package GuessTheOutput;

class M{
	
	void a(){
		System.out.println(Demo.n);
	}
	M(int A) {
		System.out.println("This is a constructor of M class");
	}
}
public class Demo {
	static int n=100;
	

	public static void main(String[] args) {
		
		
		System.out.println(methodinvoke());

	}
	//we cannot create local variable as static...
	static int methodinvoke() {
		
		return n;
		
	}
	

}
