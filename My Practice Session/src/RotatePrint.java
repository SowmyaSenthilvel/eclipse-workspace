import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotatePrint {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for N ");
		int n = input.nextInt();
		System.out.println("Enter a value for X ");
		int x = input.nextInt();
		getOrderOfElimination(n, x);

	}

	public static List<Integer> getOrderOfElimination(int n, int x) {

		int[] array = new int[n];
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			array[i] = i + 1;
		while (n >= x) {

			result.add(array[x - 1]);
			array = rotateArray(array, x);
			n = array.length;
		}
		return result;

	}

	public static int[] rotateArray(int[] array, int x) {

		int[] res = new int[array.length - 1];
		int pos = 0;
		for (int i = x; i < array.length; i++)
			res[pos++] = array[i];
		for (int i = 0; i < x - 1; i++)
			res[pos++] = array[i];
		return res;

	}

}
