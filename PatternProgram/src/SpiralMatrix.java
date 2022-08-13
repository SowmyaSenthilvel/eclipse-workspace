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
		char a[][]=new char[r][c];
		int t=0;
		int b=r-1;
		int l=0;
		int rt=c-1;
		int dir=0;
		
		int count=0;
		char ch='X';
		
		while(t<=b && l<=rt) {
			if(dir==0) {
				for(int i=l;i<=rt;i++) {
					a[t][i]=ch;
					System.out.print(ch+" ");
				}
				t++;
			}
			else if(dir==1) {
				for(int i=t;i<=b;i++) {
					a[i][rt]=ch;
					System.out.print(ch+" ");
				}
				rt--;
			}
			else if(dir==2) {
				for(int i=rt;i>=l;i--) {
					a[b][i]=ch;
					System.out.print(ch+" ");
				}
				b--;
			}
			else if(dir==3) {
				for(int i=b;i>=t;i--) {
					a[i][l]=ch;
					System.out.print(ch+" ");
				}
				l++;
			}
			dir=(dir+1)%r;
		}

	}

}