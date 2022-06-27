
class A{
	void play() {
		System.out.println("Playing");
	}
}
class B extends A{
	void play(){
		
		super.play();
		System.out.println("I m playing");
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		B b=new B();
		b.play();
		

	}

}
