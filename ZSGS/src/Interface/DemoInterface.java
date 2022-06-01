package Interface;

interface I{
	void jump();
	
}
interface J{
	void jump();
}

class A implements I,J{

	@Override
	public void jump() {
		System.out.println("I am Jumping");
		
	}
	
}
public class DemoInterface extends A {

	public static void main(String[] args) {
		A ab=new A();
		ab.jump();
	}

}
