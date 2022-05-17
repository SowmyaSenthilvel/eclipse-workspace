import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args){
        int n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" "+"-"+" "+i+" "+"="+" "+ n-i);
        }
    }
}
