package Interface;
abstract class Member{
	private String name;
	
	abstract void Welcome();
	abstract void Hai();
	void hello() {
		System.out.println("HEllo");
	}
	
}
class Student extends Member{

	@Override
	void Welcome() {
		System.out.println("Hello Student");
	}

	@Override
	void Hai() {
		// TODO Auto-generated method stub
		
	}
	
}
class Teacher extends Member{

	@Override
	void Welcome() {
		System.out.println("Welcome Teacher");
	}

	@Override
	void Hai() {
		// TODO Auto-generated method stub
		
	}

}	
class HeadMaster extends Member{
	@Override
	void Welcome() {
		System.out.println("Welcome Headmaster");
	}

	@Override
	void Hai() {
		// TODO Auto-generated method stub
		
	}
}
	
public class AbstractDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		Teacher t1=new Teacher();
		Member m1=new Student();
		Member m2=new Teacher();
		Member m3=new HeadMaster();
		m3.Welcome();
		m2.Welcome();
		m1.Welcome();
		s1.Welcome();
		t1.Welcome();
		Member[] mx=new Member[4];
		mx[0]=new Student();
		mx[1]=new Teacher();
		mx[2]=new HeadMaster();
		mx[3]=new Student();
		for(Member mt:mx) {
			mt.Welcome();
		}
		}
		

}
