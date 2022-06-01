
public class ExampleString {
	static void intern() {
		String s="Shweta".intern();
		String s2="Shweta".intern();
		System.out.println(s==s2);
		
	}
	void countString() {
		String s="Shweta The Legend";
		String[] s1=s.split(" ");
		System.out.println(s1.length);
		for(String str:s1) {
			System.out.println(str);
		}
	}
	static void value() {
		int a=10;
		char c='b';
		float f=3.5f;
		String s1=String.valueOf(a);
		String s2=String.valueOf(c);
		String s3=String.valueOf(f);
		System.out.println(s1+" "+s2+" "+s3);

	}
	

	public static void main(String[] args) {
		intern();
		ExampleString g=new ExampleString();
		g.countString();
		System.out.println();
		value();
		
		
	}

}
