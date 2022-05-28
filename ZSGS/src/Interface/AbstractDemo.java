package Interface;
abstract class Member{
	private String name;
	abstract void Welcome();
	
}
class Student extends Member{

	@Override
	void Welcome() {
		System.out.println("Hello Student");
	}
	
}
class Teacher extends Member{

	@Override
	void Welcome() {
		System.out.println("Welcome Teacher");
	}
	
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		Teacher t1=new Teacher();
		s1.Welcome();
		t1.Welcome();

	}

}
