import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String mainString=input.nextLine();
		char[] charArray=reversewords(mainString.toCharArray());
		System.out.println(charArray);
		

	}

	static char[] reversewords(char[] charArray) {
		int i=0;
		for(int j=0;j<charArray.length;j++) {
			if(charArray[j]==' ') {
				reverse(charArray,i,j);
				i=j+1;
			}
		}
		reverse(charArray,i,charArray.length-1);
		reverse(charArray, 0, charArray.length-1);
		
		return charArray;
	}
	
	static void reverse(char[] charArray, int i, int j) {
		char temp;
		while(i<=j) {
			temp=charArray[i];
			charArray[i]=charArray[j];
			charArray[j]=temp;
			i++;
			j--;
			
		}
		
	 
	 
	}

}
