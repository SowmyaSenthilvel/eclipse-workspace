import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class BasicArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of arraylist");
		int size=input.nextInt();
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		System.out.println("Enter the Elements");
		for(int i=0;i<size;i++) {
			arraylist.add(input.nextInt());
		}
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(10);
		alist.add(12);
		alist.add(100);
		arraylist.addAll(alist);
		System.out.println(arraylist);
		System.out.println("Sorted Arraylist");
		Collections.sort(arraylist);
		  
		System.out.println(arraylist);
		 
		System.out.println("Arraylist in descending Order");
		Collections.sort(arraylist,Collections.reverseOrder());
		System.out.println(arraylist);
		
		
	}

}
