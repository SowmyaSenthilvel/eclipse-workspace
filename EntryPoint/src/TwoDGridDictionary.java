import java.util.Scanner;

public class TwoDGridDictionary {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of Matrix ");
		int n=input.nextInt();
		char arr[][]=new char[n][n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=input.next().charAt(0);
			}
		}
		String[] str=new String[6];
		str[0]="zoho";
		str[1]="is";
		str[2]="love";
		str[3]="an";
		str[4]="fuse";
		str[5]="zoo";
		
		for(int i=0;i<str.length;i++) {
			String dicWord="";
			boolean check=true;
			int pos=0;
		   for(int j=0;j<n;j++) {
		     	for(int k=0;k<n;k++) {
		     		if(str[i].equals(dicWord)) {
		     			check=false;
		     			break;
		     		}
		     		else {
		     			if(arr[j][k]==str[i].charAt(pos)) {
		     				dicWord+=str[i].charAt(pos++);
		     			}
		     			else {
		     				dicWord="";
		     				pos=0;
		     			}
		     		}
			}
		    if(!check) {
		    	break;
		    }
		}
		System.out.println(dicWord);
		if(check=true) {
			int temp=0;
			pos=0;
			while(temp!=n) {
				for(int j=0;j<n;j++) {
					if(str[i].equals(dicWord)) {
						check=false;
						break;
					}
					else {
						if(arr[j][temp]==str[i].charAt(pos)) {
							dicWord+=str[i].charAt(pos++);
						}
						else {
		     				dicWord="";
		     				pos=0;
						}
					}
				}
				temp++;
			}
			System.out.println(dicWord);
		  }
	  }
		
	
	}

}
