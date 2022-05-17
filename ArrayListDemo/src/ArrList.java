import java.util.*;

public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			al.add(i);
			
			
		}
		System.out.println(al.clone());
		al.add(100);
		al.set(0, 200);
		al.remove(5);
		
		
		System.out.println(al);
		System.out.println(al.get(3));
		System.out.println(al.contains(6));
		
	}

}
