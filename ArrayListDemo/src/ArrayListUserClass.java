import java.util.ArrayList;
class List{
	int id;
	String name;
	List(String name,int id){
		this.name=name;
		this.id=id;
		
	}
}


class ArrayListUserClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		ArrayList<List> alist=new ArrayList<List>();
		List al=new List("Raj",102);
		List al1=new List("Rio",101);
		alist.add(al);
		alist.add(al1);
		for(List i:alist) {
			System.out.println(i.name);
			System.out.println(i.id);
		}
		
		
		

	}

}
