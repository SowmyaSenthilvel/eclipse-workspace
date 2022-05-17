import java.util.Scanner;
public class RotationArray
{
	public static void main(String[] args) {
		int n;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of times array to be rotated");
		n=input.nextInt();
		System.out.println("Enter the elements");
		int[] a=new int[5];
		for(int i=0;i<a.length;i++){
		    a[i]=input.nextInt();
		}
		System.out.println("Array elements before roatation");
		for(int i=0;i<a.length;i++){
		    System.out.println(a[i]);
		}
		for(int i=0;i<n;i++){
		    int j,k;
		    k=a[0];
		    for( j=0;j<a.length-1;j++){
		        a[j]=a[j+1];
		    }
		    a[j]=k;
		}
		System.out.println("After rotation");
		for(int i=0;i<a.length;i++){
		    System.out.println(a[i]);
		}
	}
}
