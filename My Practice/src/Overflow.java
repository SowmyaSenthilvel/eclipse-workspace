
public class Overflow {
	public void overflows() {
		int a=Integer.MAX_VALUE;
		int d=Integer.MIN_VALUE;
		int b=2000000000;
		int c=a+b;
		System.out.println(d);
		System.out.println(a);
		System.out.println(c);
		
		
	}

	public static void main(String[] args) {
//		int a=131;
//		byte b=(byte) a;
//		System.out.println(b);
		Overflow o=new Overflow();
		o.overflows();

	}

}
