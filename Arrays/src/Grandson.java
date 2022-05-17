import java.util.*;
public class Grandson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size1,size2;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		size1=input.nextInt();
		System.out.println("Enter the number of coloumns");
		size2=input.nextInt();
		String str[][]=new String[size1][size2];
		String str1="ronaldo";
		String str2="";
		int count=0;
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				str[i][j]=input.next();
			}
		}
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				if(str1.equals(str[i][j])&& str2=="") {
					str2=str[i][j-1];
					i=0;
					break;
				}
				if((str2.equals(str[i][j]))){
					count++;
				}
			}
		}
		System.out.println(count);
		

	}

}
