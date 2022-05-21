package Hashmap;
import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

class UserDefined{
	int id;
	String name;
	String phone;
	public UserDefined(int id, String name, String phone) {
		// TODO Auto-generated constructor stub
		id=this.id;
		name=this.name;
		phone=this.phone;
	}
	
	
}

public class HashmapUserdefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
		String name;
		String phone;
		Scanner input=new Scanner(System.in);
		HashMap<Integer,UserDefined> map=new LinkedHashMap<Integer,UserDefined>();
		System.out.println("Enter your Id");
		id=input.nextInt();
		System.out.println("Enter your Name");
		input.nextLine();
		name=input.nextLine();
		System.out.println("Enter your phone number");
		phone=input.next();
		UserDefined user=new UserDefined(id,name,phone);
		map.put(1, user);
		for(Entry<Integer,UserDefined> entry:map.entrySet()) {
			System.out.println(entry.getKey());
			//System.out.println(entry.getValue());
			UserDefined object=entry.getValue();
			System.out.println("Id :"+object.id);
			System.out.println("Name :"+object.name);
			System.out.println("Phone Number :"+object.phone);			
		
		}
		
		
		

	}

}
