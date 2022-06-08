import java.util.*;
public class IntegerToRoman{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer number");
		int A = sc.nextInt();
		String[] alpha = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
		int[] nums = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
		Map<String,Integer> romans = new HashMap<>();
		for(int i=0;i<alpha.length;i++){

			romans.put(alpha[i],nums[i]);
		}
		StringBuilder sb = new StringBuilder();
		while(A > 0){

			if(A >= 1000){
				sb.append("M");
				A-=1000;
			}
			else if(A >= 900){
				sb.append("CM");
				A-=900;
			}
			else if(A >= 500){
				sb.append("D");
				A-=500;
			}
			else if(A >= 400){
				sb.append("CD");
				A-=400;
			}
			else if(A >= 100){
				sb.append("C");
				A-=100;
			}
			else if(A >= 90){
				sb.append("XC");
				A -= 90;
			}
			else if(A >= 50){
				sb.append("L");
				A -= 50;
			}
			else if(A >= 40){
				sb.append("XL");
				A -= 40;
			}
			else if(A >= 10){
				sb.append("X");
				A -= 10;
			}
			else if(A >= 9){
				sb.append("IX");
				A-=9;
			}
			else if(A >= 5){
				sb.append("V");
				A -= 5;
			}
			else if(A >= 4){
				sb.append("IV");
				A -= 4;
			}
			else if(A >= 1){
				sb.append("I");
				A -= 1;
			}
			else{
				break;
			}

		}
		System.out.println("Output "+sb.toString());
		sc.close();
	}
}
