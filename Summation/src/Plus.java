import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Plus{
    public static void main(String[] args){
        int n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        int[] a=new int[n];
        double pos=0,neg=0,zero=0;
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        } 
        for(int i=0;i<n;i++){
            if(a[i]>0){
                pos++;
            }
            else if(a[i]<0){
                neg++;
            }
            else if(a[i]==0){
                zero++;
            }
        }
        DecimalFormat df= new DecimalFormat("#.000");
        System.out.println(df.format(pos/n));
        System.out.println(df.format(neg/n));
        System.out.println(df.format(zero/n));        
    }
}