import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
	private static void delete(Vector vector, String string) {
		Enumeration en=vector.elements();
		while(en.hasMoreElements()) {
			String str=(String) en.nextElement();	
			if(str.equals(string))
				en.hasMoreElements();
		}
		
	}

	public static void main(String[] args) {
		ArrayList alist=new ArrayList<>(Arrays.asList(new String[] {"Bingo","Lays","Cheetos","Chips"}));
		Vector vector=new Vector(alist);
		delete(vector,"Lays");
	}

	

}
