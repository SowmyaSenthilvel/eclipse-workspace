import java.util.*;
public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); 		 
		ArrayList<EmployeePojo> alist=new ArrayList<EmployeePojo>();
		String str="";
		int emp_Id=101;
		do {
			EmployeePojo emp=new EmployeePojo();
			str=input.nextLine();
			String array[]=str.split(" ");
			if(array.length>1) {
				emp.setEmp_Id(emp_Id++);
				emp.setEmp_Name(array[0]);
				emp.setEmp_Age(Integer.parseInt(array[1]));
				emp.setAddress(array[2]);
				alist.add(emp);				
			}
		}while(!(str.equals("END")));
		for(EmployeePojo obj:alist) {
			System.out.println("Name " +obj.getEmp_Name());
			System.out.println("Emp Id " +obj.getEmp_Id());
			System.out.println("Emp Age " +obj.getEmp_Age());
			System.out.println("Emp Address " +obj.getAddress());
			
		}
		String Fname=input.next();
		for(EmployeePojo obj:alist) 
		  {
		     if(obj.getEmp_Name().equals(Fname)) { 
		    	 System.out.println(obj.toString());
		    	 } }
		  
		  int FId=input.nextInt(); 
		  for(EmployeePojo obj:alist) 
		  {
		     if(obj.getEmp_Id()==(FId)) { 
		    	 System.out.println(obj.toString());
		    	 } }
		 

	}

}
