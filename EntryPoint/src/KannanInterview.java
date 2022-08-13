import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class KannanInterview {
	ArrayList<One> arrayList=new ArrayList<One>();
	
	private void examMethod() {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> integers[]=new  ArrayList[2];
		integers[0]= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		integers[1]= new ArrayList<Integer>(Arrays.asList(6,7,8,9,10));
		
		
		
		int arr[]= {1,2,3,4,5};
		Two two=new Two(integers);
		One one = new One("Array",two);
		arrayList.add(one);
		
		for(One lone:arrayList) {
			for(Map.Entry<String,Two> mapEntry:lone.hashMap.entrySet())
			{
				for(ArrayList<Integer> ltwo:mapEntry.getValue().integers)
				{
					for(Integer ltwo1:ltwo)
					{
						System.out.print(ltwo1+" ");
					}
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new KannanInterview().examMethod();
	}
}
 class One {
	
	HashMap<String, Two> hashMap=new HashMap<String, Two>();
	String s1;

	public One(String string, Two two) {
		this.hashMap.put(string, two);
		
	}

}
 class Two {
	
	ArrayList<Integer> integers[];

	public Two(ArrayList<Integer>[] integers2) {
		// TODO Auto-generated constructor stub
		this.integers=integers2;
		
	}


}