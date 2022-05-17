
import java.util.Scanner;
public class Merge{
    public static void merge(int[] a1,int[] a2,int n1,int n2,int[] a3){
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(a1[i]<a2[j]){
                a3[k++]=a1[i++];
            }
            else{
                a3[k++]=a2[j++];
            }
        }
        while(i<n1){
        	a3[k++]=a1[i++];
        	}
        while(j<n2){
        	a3[k++]=a2[j++];
        	}
            
        }
    public static void main(String[] args) {
        int n1,n2;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the total number of elements in array-1 ");
        n1=input.nextInt();
        System.out.println("Enter the total number of elements in array-2 ");
        n2=input.nextInt();
        int[] a1= new int[n1];
        int[] a2=new int [n2];
        int[] a3=new int[n1+n2];
        System.out.println("Enter the elements");
        for(int i=0;i<n1;i++){
            a1[i]=input.nextInt();
        }
        for(int j=0;j<n2;j++){
            a2[j]=input.nextInt();
        }
        merge(a1,a2,n1,n2,a3);
        System.out.println("Array after merging");
        for(int i=0;i<n1+n2;i++){
            System.out.println(a3[i]);
            } 
    }
}