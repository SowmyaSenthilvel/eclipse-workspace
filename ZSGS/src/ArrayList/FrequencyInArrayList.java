package ArrayList;

import java.util.ArrayList;

public class FrequencyInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(11);
		alist.add(21);
		alist.add(11);
		alist.add(12);
		int count=1;
		for(int i=0;i<alist.size();i++) {
			count=1;
			for(int j=i+1;j<alist.size();j++) {
				if(alist.get(i)==alist.get(j)) {
					count=count+1;
				}
			}
			System.out.println(count+" "+alist.get(i));
			
		}
 
	}

}
