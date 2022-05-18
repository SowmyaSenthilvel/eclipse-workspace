import java.util.ArrayList;
class ArrayListUserClass {
	class List{
		int id;
		String name;
		List(int id,String name){
			this.name=name;
			this.id=id;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		ArrayList<Arraylist> alist=new ArrayList<Arraylist>();
		List al=new List(102,"Raj");
		List al1=new List(101,"Rio");
		alist.add(al1);
		alist.add(al);
		for(List i:alist) {
			System.out.println(i.name);
			System.out.println(i.id);
		}
		
		
		

	}

}
