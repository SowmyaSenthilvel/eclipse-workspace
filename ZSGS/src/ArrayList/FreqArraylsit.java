package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class FreqArraylsit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> alist=new ArrayList<Integer>();
		alist.add(11);
		alist.add(11);
		alist.add(11);
		alist.add(1);
		alist.add(1);
		//using inbuilt Functions
//		int freq=Collections.frequency(alist, 11);
//		System.out.println(freq)
		for(int i=0;i<alist.size();i++) {
			int freq=Collections.frequency(alist, alist.get(i));
			System.out.println(freq);
			
	
		}
		
		
	}

}
