package ProgramsOnStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StackData {
	List<Integer> stacks=new ArrayList<Integer>();
	

	public void pushdata() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of elements want to add in Stack");
		int n=input.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element want to add");
			stacks.add(input.nextInt());
		}
		System.out.println("Your elements is successfully pushed into the stack");
		System.out.println(stacks);
		
		
		
	}

}
