import java.util.*;
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("Enter the size of Arraylist");
		int size=input.nextInt();
		System.out.println("Array Elements are ");
		for(int i=0;i<size;i++) {
			list.add(input.nextInt());
		}
		int val=0;
		int j=0;
		for(int i=1;i<list.size();i++) {
			val=list.get(i);
			j=i-1;
			while(j>=0 && list.get(j)> val) {
				list.set(j+1, list.get(j));
				j=j-1;
			}
			list.set(j+1, val);
		}
		System.out.println(list);
	}

}
