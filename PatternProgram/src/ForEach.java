//Giving input to Arraylist
import java.util.*;
public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> alist=new ArrayList<Object>();
		/*ArrayList<Integer> LIST = new ArrayList<Integer>();
		while (sc.hasNextInt()) 
		{
		    int i = sc.nextInt();
		    LIST.add(i);
		}*/
		alist.add("Sowmya");
		alist.add("9087643352");
		alist.add("North car street Tuticorin");
		for(Object str:alist) {
			System.out.println(str);
		}
		

	}

}
