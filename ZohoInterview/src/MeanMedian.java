import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MeanMedian {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = input.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}
		getPairs(array, getMean(array),getMedian(array));
		

	}

	public static int getMean(int[] array) {

		int sum = 0, len = array.length;
		for (int i = 0; i < len; i++) {
			sum += array[i];
		}
		return sum / len;
	}

	public static int getMedian(int[] array) {

		int len = array.length;
		Arrays.sort(array);
		if (len % 2 != 0) {
			return array[len / 2];
		}
		int mid = len / 2;
		return (array[mid] + array[mid + 1]) / 2;

	}

	public static void getPairs(int[] array, int mean, int median) {

		Arrays.sort(array);
		List<List<Integer>> result = new ArrayList<>();
		int len = array.length;
		int min = Math.min(mean, median);
		int max = Math.max(mean, median);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < len - 1; i++) {

			for (int j = i + 1; j < len; j++) {
				int sum = array[i] + array[j];
				if (sum >= min && sum <= max) {
					// List<Integer> list = new ArrayList<Integer>();
					
					list.add(array[j]);
					list.add(array[i]);
					result.add(list);
				}

			}

		}
		System.out.println(list);
		
	}

}

//Input--> 3 5 1 8 2 13 1 21
