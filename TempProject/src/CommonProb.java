import java.util.Scanner;
public class CommonProb {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a student mark");
		int mark=input.nextInt();
		Object String = (mark >= 90 ? "First class" : mark >=80?"Second class" : mark>=70?"third class":mark>35?"Pass":mark<35?"Fail":"Mark is invalid");  
		System.out.println(String);
	}

}
