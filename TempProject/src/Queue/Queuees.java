
package Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Queuees {
	
void  interviewprocess() {
	Scanner sc=new Scanner(System.in);
	
	
    System.out.println("Welcome to zoho");
    System.out.println("Interview Process");
    System.out.println("Only 3 persons are allowed " );
    System.out.println("Enter Total Number of people going to attend interview today");
    int number=sc.nextInt();
    Queue<String> que=new LinkedList<>();
   
   for(int i=1;i<=number;i++)
   {
       System.out.println("Enter Candidate name to attend whose candidate id is "+ i);
       String name=sc.next();
       if(que.size()<3) {
           que.add(name);
       }
       else {
           System.out.println(name + "    please wait outside the interview hall.");
           if (que.size()==3) {
               System.out.println("***********");
               System.out.println(que.poll() + " is completed  Interview");
               System.out.println(name + "  Please enter inside the waiting Hall");
               que.add(name);
               System.out.println("**********");
           }
       }
    }
}

public static void main(String[] args) {
	Queuees q=new Queuees();
    q.interviewprocess();
}
}
