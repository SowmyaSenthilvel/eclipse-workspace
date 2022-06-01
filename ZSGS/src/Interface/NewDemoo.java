package Interface;

abstract class Shape{
	abstract void area();
}
class Square extends Shape{
	void area() {
		System.out.println("This is Square");
	}
}
class Triangle extends Shape{
	void area(){
		System.out.println("This is Triangle");
	}
}

public class NewDemoo {

	public static void main(String[] args) {
		Shape[] s=new Shape[2];
		s[0]=new Square();
		s[1]=new Triangle();
		for(Shape s2:s) {
			s2.area();
		}
		
		
	}

}
