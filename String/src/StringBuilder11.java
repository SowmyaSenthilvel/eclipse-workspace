import java.text.MessageFormat;

public class StringBuilder11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="The Monkey";
		String s2="Very Beautiful";
		//System.out.println(new StringBuilder(s1).append(s2));
		//Using message format method 
		System.out.println(MessageFormat.format("{0} is {1}.",s1,s2));
		System.out.println(String.format("%s is %s",s1,s2));
	}

}
