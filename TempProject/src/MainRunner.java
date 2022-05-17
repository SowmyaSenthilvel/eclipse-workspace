import java.util.Arrays;
import java.util.Scanner;
public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of elements in array1 ");
		int num1=input.nextInt();
		System.out.println("Enter the number of elements in array2 ");
		int num2=input.nextInt();
		int[] arr1=new int[num1];
		int[] arr2=new int[num2];
		int[] arr3=new int[num1+num2];
		for(int i=0;i<num1;i++) {
			arr1[i]=input.nextInt();
		}
		for(int i=0;i<num2;i++) {
			arr2[i]=input.nextInt();
		}
			
		  while(true){
			System.out.println("1. Merge those arrays | 2.Find Max of two array | 3. Find min of two Array | 4. Sort the first array | 5. Sort the second array | 6. Exit");
			System.out.println("Enter the operation");
			int operations;	
			operations=input.nextInt();
				switch(operations){
				case 1:
					ArrayOperations.mergeTwoArrays(arr1, arr2, arr3, num1, num2);
					System.out.println("\nArrays after merging");
					for(int j=0;j<num1+num2;j++) {
						System.out.println(arr3[j]);
					}
					break;
				case 2:
					ArrayOperations.Max(arr1, arr2);
					break;
				case 3:
					ArrayOperations.Min(arr1, arr2);
					break;
				case 4:
					Arrays.sort(arr1);
					for(int k=0;k<arr1.length;k++) {
						System.out.println(arr1[k]);
					}
					break;
				case 5:
					Arrays.sort(arr2);
					for(int s=0;s<arr2.length;s++) {
						System.out.println(arr2[s]);
					}
					break;
				case 6:
					System.out.println("Exit");	
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Input");
				}
			}
		

	}
	Student s = new Student();

}
