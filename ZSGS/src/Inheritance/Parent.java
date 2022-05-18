package Inheritance;

public class Parent {
	int salary=40000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Parent();
		p.work();
		p.watchTv();
		System.out.println(p.salary);

	}
	public void work() {
		System.out.println("working");
	}
	public void watchTv() {
		System.out.println("Watching tv");
	}

}
