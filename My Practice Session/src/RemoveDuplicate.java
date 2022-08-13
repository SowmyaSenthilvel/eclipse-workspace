import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String 1");
		String s1=input.next();
		System.out.println("Enter a String 2");
		String s2=input.next();
		char arr[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					arr[i]=0;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.print(arr[i]);
			}
		}
		
	}

}
