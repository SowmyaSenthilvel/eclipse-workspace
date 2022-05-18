package Inheritance;
//Here the child class extends the parent class
public class Child extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub   
		Child c=new Child();
		c.play();
		c.read();
		c.work();
		c.watchTv();

	}
	public void play() {
		System.out.println("playing");
	}
	public void read() {
		System.out.println("reading");
	}

}
