package TenkasiInterviewQues;

import java.util.Arrays;
import java.util.Scanner;

public class ExampleTransformTheString {

	public static void main(String[] args) {

	              Scanner sc = new Scanner(System.in);
	              System.out.println("Enter a number");
	              int testcase = sc.nextInt();
	  
	              for(int i=0; i<testcase; i++) {
	            	  
	                  String s = sc.next();
	                  char[] c = s.toCharArray();
	                  String s1 = sc.next();
	                  char[] c1 = s1.toCharArray();
	                                
	                  int [] a = new int[s.length()];
	                  Arrays.fill(a, 0);
	                  int k1[] = new int[s.length()];
	                  Arrays.fill(k1, Integer.MAX_VALUE);
	                                
	                  int count = 0;

	                  for(int j=0; j<s1.length(); j++) {
	                      for(int k=0; k<s.length(); k++){
	                          int fav = c1[j];
	                          int str = c[k];
	                          int one_way=0, two_way=0;
	                          if(fav > str) {
	                              one_way = Math.abs(fav - str);
	                              int aa = str - 96;
	                              int zz = 122 - fav;
	                              two_way = aa + zz;
	                          }
	                          else {
	                              one_way = Math.abs(str - fav);
	                              int zz = 122 - str;
	                              int aa = fav - 96;
	                              two_way = zz + aa;
	                          }

	                          if(k1[k] > Math.min(one_way, two_way)) {
	                          a[k] = Math.min(one_way, two_way);
	                          k1[k] = a[k];
	                          }

	                      }
	                  }

	                  for(int m=0; m<s.length(); m++) {
	                      count += a[m];
	                  }
	                                             
	                  System.out.println(count);
	              }

	          }
}

