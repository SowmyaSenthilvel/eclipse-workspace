import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArraySortDivisors {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=input.nextInt();
		int[] arr=new int[n];
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=arr[i];j>=1;j--) {
				if(arr[i]%j==0) {
					count++;
				}
			}
			map.put(arr[i], count);
		}
		for(Map.Entry<Integer,Integer> obj:map.entrySet()) {
			System.out.println(obj.getKey()+" "+obj.getValue());
		}

	}

}
