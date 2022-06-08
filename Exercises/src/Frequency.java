import java.util.HashMap;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String st=input.nextLine();
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		String[] word=st.split(" ");
		for(String s:word) {
			Integer integer = map.get(s);
			if(integer==null) {
				map.put(s,1);
			}
			else {
				map.put(s, integer+1);
			
			}
		}
		System.out.println(map);

	}

}
