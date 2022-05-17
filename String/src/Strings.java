
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Java");//heap memory
		String s2="Java";//SCP
		if(s1==s2) {
			System.out.println("s1=s2");
		}
		else {
			System.out.println("s1 not =s2");
		}
		if(s1.equals(s2)) {
			System.out.println("s1=s2");
		}
		else {
			System.out.println("s1 not =s2");
		}

	}

}
