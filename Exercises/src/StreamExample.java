import java.util.ArrayList;

public class StreamExample {

	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("new");
		alist.add("no");
		alist.add("new");
		alist.add("which");
		alist.add("what");
		
		System.out.println(alist);
		//without repeated strings 
		alist.stream().distinct().forEach(System.out::println);
		

	}

}
