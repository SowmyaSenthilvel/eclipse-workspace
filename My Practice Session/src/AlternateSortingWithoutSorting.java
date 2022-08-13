import java.util.Scanner;

public class AlternateSortingWithoutSorting {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arraySize=input.nextInt();
		int arr[]=new int[arraySize];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<arraySize;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<arraySize;i++) {
			int temp=0;
			if(i%2==0) {
				int max=0;
				int currentIndex=0;
				for(int j=i+1;j<arraySize-1;j++) {
					if(arr[j]>max) {
						max=arr[j];
						currentIndex=j;
						arr[i]=max;
						arr[j]=temp;
					}
				}
			}
			else {
				int min=
						0;
				int changeIndex=0;
				for(int j=i+1;j<arraySize;j++) {
					if(arr[j]<min) {
						min=arr[j];
						changeIndex=j;
						arr[i]=min;
						arr[j]=temp;
					}
				}
				
			}
		}
		for(int i=0;i<arraySize;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
