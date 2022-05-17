
public class StringToEnum {
	//Using name method
	enum Fruits{
		Orange,Apple,Grapes,Muskmelon;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Using name method
		 System.out.println(Fruits.Orange.name());
		 System.out.println(Fruits.Apple.name());
		 System.out.println(Fruits.Grapes.name()); 
		 //Using toString Method
		 System.out.println(Fruits.Muskmelon.toString());
		 
		 for(Fruits f:Fruits.values()) {
			 System.out.println(f);
			 
		 }

	}

}
