
public class StringFormatMethod {

	public static void main(String[] args) {
		int a=100,b=1000;
		String txt="the sum of %d and %d is %d";
		System.out.println(String.format(txt, a,b,a+b));

	}

}
