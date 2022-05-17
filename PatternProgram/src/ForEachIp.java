import java.util.*;
public class ForEachIp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		ArrayList<Object> alist=new ArrayList<Object>();
		String name=input.next();
		alist.add(name);
		int age=input.nextInt();
		alist.add(age);
		long PhNum=input.nextLong();
		alist.add(PhNum);
		for(Object obj:alist) {
			System.out.print(obj+" ");
		}
		

	}

}
