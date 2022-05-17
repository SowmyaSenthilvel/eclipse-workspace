
import java.util.Scanner;
public class SortOneArr {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the total number of elements ");
        n=input.nextInt();
        int[] a= new int[n];
        int temp=0;
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.println("Array before sorting");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i] + " ");
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            } 
        }
        System.out.println("Array After Sorting");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}