import java.util.Scanner;

public class BooleanMatrix {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the row");
		int r=input.nextInt();
		System.out.println("Enter the column");
		int c=input.nextInt();
		int[][] main=new int[r][c];
		
		int[] row=new int[r];
		int[] col=new int[c];
		 for(int i=0;i<r;i++) {
			 row[i]=0;
		 }
		 for(int i=0;i<c;i++) {
			 col[i]=0;
		 }
		 System.out.println("Enter the array Elements");
		 for(int i=0;i<r;i++) {
			 for(int j=0;j<c;j++) {
				 main[i][j]=input.nextInt();
				 
			 }
		 }
		
		 
		 for(int i=0;i<r;i++) {
			 for(int j=0;j<c;j++) {
				 if(main[i][j]==1) {
					 row[i]=1;
					 col[j]=1;
				 }
				 
			 }
		 }
		 
		 
		 
		

	}

}
