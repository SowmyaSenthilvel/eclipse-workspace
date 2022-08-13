import java.util.Scanner;

public class AreaCyclinder {

	public static void main(String[] args) {
		double area,height;
		double radius;
		Scanner input=new Scanner(System.in);
		System.out.println("Height of Cylinder");
		height =input.nextDouble();
		System.out.println("Radius of Cylinder");
		radius =input.nextDouble();
		area = 2*3.14*radius*(height+radius);
		System.out.println("The area of cylinder "+ area);

	}

}
