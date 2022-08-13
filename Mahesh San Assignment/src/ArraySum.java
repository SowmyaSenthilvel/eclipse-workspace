import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array Size");
		int size=input.nextInt();
		int array[]=new int[10];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++) {
			array[i]=input.nextInt();
		}
		System.out.println("Enter the value for k");
		int k=input.nextInt();
		for(int i=0;i<=size;i++) {
			for(int j=1;j<size;j++) {
				if(i<j) {
				if((array[i]+array[j])%k==0) {
					System.out.println(array[i]+" "+array[j]);
					break;
				}
				}
				
			}
			
		}
		

	}

}
