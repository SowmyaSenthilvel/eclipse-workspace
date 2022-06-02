import java.util.Scanner;
public class Encryption {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=new String();
		System.out.println("Enter a string");
		s=input.nextLine();
		System.out.println(s.replaceAll("\\s+",""));
		int lengths=s.length();
		System.out.println(lengths);
		double sqrt=Math.sqrt(lengths);
		System.out.println(sqrt);
		double fl=Math.floor(sqrt);
		System.out.println(fl);
		double ce=Math.ceil(sqrt);
		System.out.println(ce);
	
		
//		String[] str=s.split(" ");
//		for(String io:str) {
//			System.out.println(io); 
//		}
//		System.out.println("split length "+str.length);
		
		
		

	}

}
