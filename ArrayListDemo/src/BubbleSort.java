import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		int l,temp=0;
		int n=input.nextInt();
		for(int i=0;i<n;i++) {
			list.add(input.nextInt());
			//list.add(i);
		}
		for(int i=0;i<list.size();i++) {
			for(int j=1;j<list.size()-i-1;j++) {
				if(list.get(j)>list.get(j+1)) {
					Collections.swap(list, j, j+1);
				}
			}
		}
		for(Integer s:list) {
			System.out.println(s);
		}
		

	}

}
