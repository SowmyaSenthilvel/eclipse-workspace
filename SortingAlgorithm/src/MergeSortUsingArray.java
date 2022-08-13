
import java.util.*;
public class MergeSortUsingArray{

	public static int[] array ;

	public static void merge(int start, int mid, int end){

		int[] arr1 = new int[mid-start+1];
		int[] arr2 = new int[end-mid];
		int pos=0,i=0,j=0,left=0,right=0,k=start;
		for(i=start;i<=mid;i++){
			
			arr1[pos++] = array[i];
			
		}
		left = pos;
		pos = 0;
		for(i=mid+1;i<=end;i++){

			arr2[pos++] = array[i];
		}
		right = pos;
		i=0;
		while(i < left && j < right){

			if(arr1[i] < arr2[j]){
				array[k++] = arr1[i++];
			}
			else{

				array[k++] = arr2[j++];
			}
		}
		while(i < left){

			array[k++] = arr1[i++];

		}

		while(j < right){

			array[k++] = arr2[j++];
		}

		System.out.println("Merge sort called for start "+start+" and end "+end);
		for(i=start;i<=end;i++){
			System.out.print(array[i]+ "  ");
		}
		System.out.print("\n");

	}

	public static void sort(int start,int end){

		if(start < end){

			int mid = (start+end)/2;
			System.out.println("Merge to be called from start for start "+start+" and mid "+mid+" and end "+end);
			sort(start,mid);
			sort(mid+1,end);
			merge(start,mid,end);
		}

	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		array = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){

			array[i] = sc.nextInt();
		}
		System.out.println("Before Merge Sort");
		for(int i=0;i<n;i++){

			System.out.print(array[i]+" ");
		}
		System.out.print("\n");
		sort(0,n-1);
		System.out.println("After merge sort");
		for(int i=0;i<n;i++){
			System.out.print(array[i]+" ");
        }
        System.out.print("\n");

	}

}
