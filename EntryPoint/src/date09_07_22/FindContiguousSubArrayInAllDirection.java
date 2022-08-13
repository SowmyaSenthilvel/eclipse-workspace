package date09_07_22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindContiguousSubArrayInAllDirection {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the matrix size: ");
	        int matrixSize = scanner.nextInt();

	        int[][] userMatrix = new int[matrixSize][matrixSize];

	        for (int i = 0; i < matrixSize; i++) {
	            for (int j = 0; j < matrixSize; j++) {
	                System.out.print("Enter userMatrix[" + i + "][" + j + "]: ");
	                userMatrix[i][j] = scanner.nextInt();
	            }
	        }

	        for (int i = 0; i < matrixSize; i++) {
	            for (int j = 0; j < matrixSize; j++) {
	                System.out.print(userMatrix[i][j] + " ");
	            }

	            System.out.println();
	        }

	        System.out.print("Enter the array size: ");
	        int arraySize = scanner.nextInt();

	        int[] userArray = new int[arraySize];

	        for (int i = 0; i < arraySize; i++) {
	            System.out.print("Enter userArray[" + i + "]: ");
	            userArray[i] = scanner.nextInt();
	        }

	        for (int i = 0; i < arraySize; i++) {
	            System.out.print(userArray[i] + " ");
	        }

	        System.out.println();

	        List<Object> userArrayList = new ArrayList<>();

	        // Left to Right Circular :-

	        int currentIndexPointerInUserArray = 0;
	        int rotationCount = 0;

	        for (int i = 0; i < matrixSize; i++) {
	            boolean elementFound = false;

	            for (int j = 0; j < matrixSize; j++) {
	                if (currentIndexPointerInUserArray == arraySize) {
	                    elementFound = true;
	                    break;
	                } else {
	                    if (userMatrix[i][j] == userArray[currentIndexPointerInUserArray]) {
	                        userArrayList.add("I: " + i + " J: " + j);
	                        currentIndexPointerInUserArray++;
	                    } else {
	                        userArrayList.clear();
	                        currentIndexPointerInUserArray = 0;
	                    }
	                }
	            }

	            if (elementFound) {
	                break;
	            } else if (currentIndexPointerInUserArray > 0 && i == matrixSize - 1 && rotationCount == 0) {
	                i = -1;
	                rotationCount++;
	            }
	        }

	        if (currentIndexPointerInUserArray == arraySize) {
	            System.out.println("Elements are found in left to right...");
	        } else {
	            System.out.println("Elements are not found in left to right...");
	        }

	        // Top to Bottom Circular :-

	        currentIndexPointerInUserArray = 0;
	        rotationCount = 0;

	        for (int i = 0; i < matrixSize; i++) {
	            boolean elementFound = false;

	            for (int j = 0; j < matrixSize; j++) {
	                if (currentIndexPointerInUserArray == arraySize) {
	                    elementFound = true;
	                    break;
	                } else {
	                    if (userMatrix[j][i] == userArray[currentIndexPointerInUserArray]) {
	                        userArrayList.add("I: " + i + " J: " + j);
	                        currentIndexPointerInUserArray++;
	                    } else {
	                        userArrayList.clear();
	                        currentIndexPointerInUserArray = 0;
	                    }
	                }
	            }

	            if (elementFound) {
	                break;
	            } else if (currentIndexPointerInUserArray > 0 && i == matrixSize - 1 && rotationCount == 0) {
	                i = -1;
	                rotationCount++;
	            }
	        }

	        if (currentIndexPointerInUserArray == arraySize) {
	            System.out.println("Elements are found in top to bottom...");
	        } else {
	            System.out.println("Elements are not found in top to bottom...");
	        }

	        if (userArrayList.size() > 0) {
	            System.out.println(userArrayList);
	        }

	}

}
