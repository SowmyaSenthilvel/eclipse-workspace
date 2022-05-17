import java.util.Arrays;

class ArrayOperations{
	static void mergeTwoArrays(int[] arr1,int[] arr2,int[] arr3,int num1,int num2) {
	        int i=0,j=0,k=0;
	        while(i<num1 && j<num2){
	            if(arr1[i]<arr2[j]){
	                arr3[k++]=arr1[i++];
	            }
	            else{
	                arr3[k++]=arr2[j++];
	            }
	        }
	        while(i<num1){
	        	arr3[k++]=arr1[i++];
	        	}
	        while(j<num2){
	        	arr3[k++]=arr2[j++];
	        	}
	        Arrays.sort(arr3); 
	        }	
	static void Max(int[] arr1,int[] arr2) {
		int max1,max2;
		int num1,num2;
		max1=arr1[0];
		for(int i=0;i<arr1.length;i++){
	        if(arr1[i]>max1){
	            max1=arr1[i];
	        }

	    }
	    max2=arr2[0];
	    for(int j=0;j<arr2.length;j++){
	        if(arr2[j]>max2){
	            max2=arr2[j];
	        }

	    }
	    if(max1>max2){
	        System.out.print("max element is:"+max1);
	    }
	    else{
	        System.out.print("Max element is: "+max2);
	    }

	}
	static void Min(int[] arr1,int[] arr2) {
		int min1,min2;
		min1=arr1[0];
		for(int i=0;i<arr1.length;i++){
	        if(arr1[i]<min1){
	            min1=arr1[i];
	        }

	    }
	    min2=arr2[0];
	    for(int j=0;j<arr2.length;j++){
	        if(arr2[j]<min2){
	            min2=arr2[j];
	        }

	    }
	    if(min1<min2){
	        System.out.print("min element is:"+min1);
	    }
	    else{
	        System.out.print("Min element is: "+min2);
	    }

	}
	
}