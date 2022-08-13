import java.util.Scanner;

public class StringEncoding {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner input=new Scanner(System.in);
		String string=input.next();
		new StringEncoding().encode(string);

	}

	private void encode(String string) {
		int length=string.length();
		for(int i=0;i<length;i++) {
			int characterCount=1;
			while(i < length-1 && string.charAt(i) == string.charAt(i+1) ) {
				characterCount++;
				i++;
				
			}
			System.out.print(string.charAt(i)+""+characterCount);
			
		}
		
	}

}
