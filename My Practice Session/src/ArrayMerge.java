import java.util.Scanner;

public class ArrayMerge {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array 1 size");
		int size1=input.nextInt();
		System.out.println("Enter the array 2 size");
		int size2=input.nextInt();
		int array1[]=new int[size1];
		int array2[]=new int[size2];
		System.out.println("Enter the array 1 elements");
		for(int i=0;i<size1;i++) {
			array1[i]=input.nextInt();
		}
		System.out.println("Enter the array 2 elements");

		for(int i=0;i<size2;i++) {
			array2[i]=input.nextInt();
		}
		int pos=0;
		int resultarray[]=new int[size1+size2];
		for(int i=0;i<array1.length;i++) {
			resultarray[pos]=array1[i];
			pos++;

		}
		for(int i=0;i<array2.length;i++) {
			resultarray[pos]=array2[i];
			pos++;
		}
		for(int i=0;i<resultarray.length;i++) {
			for(int j=i+1;j<resultarray.length;j++) {
				if(resultarray[j]<resultarray[i]) {
					resultarray[i]=resultarray[i]+resultarray[j];
					resultarray[j]=resultarray[i]-resultarray[j];
					resultarray[i]=resultarray[i]-resultarray[j];
				}
			}
		}
		for(int i=0;i<resultarray.length;i++) {
			System.out.println(resultarray[i]+" ");
		}
	}

}
