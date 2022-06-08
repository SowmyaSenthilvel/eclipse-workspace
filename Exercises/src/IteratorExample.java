import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class IteratorExample {
	private static void delete(Vector vet, String string) {
		Iterator iter=vet.iterator();
		while(iter.hasNext()) {
			String str=(String) iter.next();
			if(str.equals(string)) {
				iter.remove();
			}
		}
		//Displaying the profession after deleting 
		System.out.println("The Profession are ");
		iter=vet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	public static void main(String[] args) {
		ArrayList aslist=new ArrayList<>(Arrays.asList(new String[] {"Singer","Dancer","Professor","Teacher"}));
		Vector vet=new Vector(aslist);
		delete(vet,"Teacher");
	}

	
	

}
