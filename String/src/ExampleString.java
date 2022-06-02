import java.text.MessageFormat;

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
	 void stringBuilders() {
		String sing="Welcome";
		StringBuilder str1=new StringBuilder(sing);
		System.out.println(str1);
		
	}
	 
	 void addingString() {
		 StringBuilder op=new StringBuilder();
		 op.append("Hai");
		 op.append(" Pojo");
		 op.append(" You are Nice");
		 System.out.println(op);
	 }
	 void insertString() {
		 StringBuilder op1=new StringBuilder();
		 op1.insert(0, "monkey");
		 op1.insert(6, " donkey");
		 System.out.println(op1);
		

	 }
	 void capacity() {
		 StringBuilder builder=new StringBuilder();
		 builder.append("Welcome");
		 builder.append('a');
		 builder.append("JAVA is nice Language");
		 System.out.println(builder.capacity());
	 }
	static  void newreader() {
		 String s1="The Monkey";
			String s2="Very Beautiful";
			//System.out.println(new StringBuilder(s1).append(s2));
			//Using message format method 
			System.out.println(MessageFormat.format("{0} is {1}.",s1,s2));
			System.out.println(String.format("%s is %s",s1,s2));
		}
	static void timeCheck() {
	    
	            long startTime = System.currentTimeMillis();  
	            StringBuffer sb = new StringBuffer("Java");  
	            for (int i=0; i<10000; i++){  
	                sb.append("Tpoint");  
	            }  
	            System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
	            startTime = System.currentTimeMillis();  
	            StringBuilder sb2 = new StringBuilder("Java");  
	            for (int i=0; i<10000; i++){  
	                sb2.append("Tpoint");  
	            }  
	            System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
	        
	    

	}
	

	public static void main(String[] args) {
		intern();
		ExampleString g=new ExampleString();
		g.countString();
		System.out.println();
		value();
		g.stringBuilders();
		newreader();
		g.addingString();
		g.insertString();
		g.capacity();
		timeCheck();
		
	}

}
