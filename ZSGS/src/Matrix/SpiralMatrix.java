package Matrix;

import java.util.Scanner;
import java.io.*;
import java.util.*;
public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r,c;
		System.out.println("Enter the number of rows");
		r=sc.nextInt();
		System.out.println("Enter the number of columns");
		c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int t=0;
		int b=r-1;
		int l=0;
		int rt=c-1;
		int dir=0;
		
		while(t<=b && l<=rt) {
			if(dir==0) {
				for(int i=l;i<=rt;i++) {
					System.out.print(a[t][i]+" ");
				}
				t++;
			}
			else if(dir==1) {
				for(int i=t;i<=b;i++) {
					System.out.print(a[i][rt]+" ");
				}
				rt--;
			}
			else if(dir==2) {
				for(int i=rt;i>=l;i--) {
					System.out.print(a[b][i]+" ");
				}
				b--;
			}
			else if(dir==3) {
				for(int i=b;i>=t;i--) {
					System.out.print(a[i][l]+" ");
				}
				l++;
			}
			dir=(dir+1)%r;
		}

	}

}