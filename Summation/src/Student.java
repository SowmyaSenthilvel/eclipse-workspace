import java.util.Scanner;
class Mains{
      String name;
      int id;
      int mark1,mark2,mark3;
      int avg(int mark1,int mark2,int mark3) {
		return(mark1+mark2+mark3/3);
      }
}

public class Student{
	public static void main(String args[]){
		int n;  
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the number of Students: ");
		n=sc.nextInt();
		Mains Stud[]=new Mains[n];
		for(int i=0;i<n;i++){
                Stud[i].name=sc.nextLine();
                Stud[i].id=sc.nextInt();
                Stud[i].mark1 =sc.nextInt();
                Stud[i].mark2 =sc.nextInt();
                Stud[i].mark3 = sc.nextInt();
		Stud[i].avg(i, i, i);
		System.out.println( Stud[i].name + Stud[i].id + Stud[i].avg(i, i, i) );
		}
	}
}                       