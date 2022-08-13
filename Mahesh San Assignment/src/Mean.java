import java.util.Scanner;

public class Mean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=input.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++) {
			array[i]=input.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(array[j]<array[i]) {
					array[i]=array[i]+array[j];
					array[j]=array[i]-array[j];
					array[i]=array[i]-array[j];
				}
			}
		}
		int sum=0;
		for(int i=0;i<size;i++) {
			sum=sum+array[i];
			
		}
		System.out.println(sum);
		int mean=0;
		mean=sum/array.length;
		System.out.println(mean);
		int median=0;
		int mid=array.length/2;
		for(int i=0;i<size;i++) {
			if(array.length%2==0) {
				median=(array[mid]+array[mid+1])/2;
			}
			else {
				median=array[mid];
			}
		}
		System.out.println(median);
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size-1;j++) {
				if(array[i]+array[j]< mean && array[i]+array[j]< median ) {
					System.out.println(array[i]+" "+array[j]);
					break;
				}
				else {
					System.out.println("()");
				}
				
			}
			

		}
	}

}
