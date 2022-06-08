
public class EvenArray {
	public void productArray() {
		int[] arr= {1,2,3,4};
		int[] arr1 =new int[4] ;
		int product=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]!=arr[j]) {
					product=product*arr[j];
					
				}
			}
			arr1[i]=product;
			product=1;
		}
		for(int i:arr1) {
			System.out.println(i);
		}
		
	}
	public void evenArray() {
		int[] arr= {1, 2, 4, 5, 10, 6, 3};
		System.out.print("{ ");
		for(int i:arr) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("}");
		
	}
	
	public void arrayIndex() {
		int[] array= {2,7,11,15};
		int sum=0;
		int target=9;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				sum=array[i]+array[j];
				if(sum==target) {
					System.out.println(" "+i+" "+j );
					break;
				}
				
			}
		}
	}
	public static void main(String[] args) {
		EvenArray even=new EvenArray();
		System.out.println();
		even.productArray();
		System.out.println();
		even.evenArray();
		System.out.println();
		even.arrayIndex();
	}

}
