import java.util.*;
public class RomanToInteger{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roman Number");
		String roman = sc.nextLine();
		int length = roman.length();
		char prev = '\0';
		int sum = 0;
		
		for(int i = length-1; i >= 0; i--) {

			char c = roman.charAt(i);
			switch(c){

				case 'I':
					if(prev == 'V' || prev == 'X') 
						sum -= 1;
					else
						sum += 1;
					break;
				case 'V':
					sum += 5;
					break;
				case 'X':
					if(prev == 'L' || prev == 'C')
						sum -= 10;
					else
						sum += 10;
					break;
				case 'L':
					sum += 50;
					break;
				case 'C':
					if(prev == 'D' || prev == 'M')
						sum -= 100;
					else
						sum += 100;
					break;
				case 'D':
					sum += 500;
					break;
				case 'M':
					sum += 1000;
					break;
			}
			prev = c;

		}

		System.out.println("Equivalent Number is "+sum);
		sc.close();
	}
}