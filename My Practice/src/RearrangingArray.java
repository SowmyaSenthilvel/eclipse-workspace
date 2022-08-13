import java.util.Scanner;

public class RearrangingArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size=input.nextInt();
		int[] array=new int[size];
		System.out.println("Enter array Elements");
		for(int i=0;i<size;i++) {
			array[i]=input.nextInt();
		}
		System.out.println("Enter the index of arrays");
		int index[]=new int[size];
		for(int i=0;i<size;i++) {
			index[i]=input.nextInt();
		}
		new RearrangingArray().rearrange(index,array,size);

	}

	private void rearrange(int[] index, int[] array, int size) {
		for(int i=0;i<size;i++) {
			System.out.println(array[index[i]]);
		}
		
	}

}
