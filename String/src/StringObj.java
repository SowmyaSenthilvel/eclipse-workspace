
public class StringObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringObj s=new StringObj();
		String[] names= {"Ramya","Preethi","Sahana"};
		s.joinWords(names);

	}
	public void joinWords(String[] names) {
		String str="";
		StringBuffer sd=new StringBuffer("");
		StringBuffer sd1=new StringBuffer("Rita");
		sd1.append(" is beautiful");
		System.out.println(sd1);
		//sd1.insert(3, 'h');
		//System.out.println(sd1);
		sd1.replace(1, 3, "il");
		System.out.println(sd1);
		System.out.println(sd1.reverse());
		for(String name:names) {
			str=str+" "+name;
			sd.append(name);
			
			
		}
		System.out.println(sd);
		System.out.println(str);
		
	}

}
