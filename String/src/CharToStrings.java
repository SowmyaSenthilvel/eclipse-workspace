
public class CharToStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First method Char To String
		char ch='S';
		String s="" + ch;
		System.out.println("Char to String Conversion: " + s);
		//Another method Char to String
		char ch1='O';
		String str=Character.toString(ch1);
		System.out.println("Char to String Conversion: "+str);
		//Another Method Char to String
		char c='W';
		String s1=String.valueOf(new char[] {c});
		System.out.println("Char to String Conversion: "+s1);
		//Another method for char to string
		char c1='M';
		String str1=String.valueOf(c1);
		System.out.println("Char to String Conversion: "+str1);

	}

}
