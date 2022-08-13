
import java.util.Scanner;

public class DeenaQue1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the matrix size: ");
        int matrixSize = scanner.nextInt();

        char[][] userCharacterArray = new char[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print("Enter userCharacterArray[" + i + "][" + j + "]: ");
                userCharacterArray[i][j] = scanner.next().charAt(0);
            }
        }

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(userCharacterArray[i][j] + " ");
            }

            System.out.println();
        }

        System.out.print("Enter the total dictionary words: ");
        int totalDictionaryWords = scanner.nextInt();

        scanner.nextLine();

        String[] dictionaryWords = new String[totalDictionaryWords];

        for (int i = 0; i < totalDictionaryWords; i++) {
            System.out.print("Enter dictionaryWords[" + i + "]: ");
            dictionaryWords[i] = scanner.nextLine().toLowerCase();
        }

        for (int i = 0; i < totalDictionaryWords; i++) {
            String currentIdentifiedDictionaryWord = "";
            int dictionaryWordStartingIndex = 0;
            boolean dictionaryFindFlag = true;

            for (int j = 0; j < matrixSize; j++) {
                for (int k = 0; k < matrixSize; k++) {
                    if (dictionaryWords[i].equals(currentIdentifiedDictionaryWord)) {
                        dictionaryFindFlag = false;
                        break;
                    } else {
                        if (dictionaryWords[i].charAt(dictionaryWordStartingIndex) == userCharacterArray[j][k]) {
                            currentIdentifiedDictionaryWord += dictionaryWords[i].charAt(dictionaryWordStartingIndex++);
                        } else {
                            currentIdentifiedDictionaryWord = "";
                            dictionaryWordStartingIndex = 0;
                        }
                    }
                }

                if (!dictionaryFindFlag) {
                    break;
                }
            }

            if (currentIdentifiedDictionaryWord.length() > 0) {
                System.out.println(currentIdentifiedDictionaryWord);
            } else {
                currentIdentifiedDictionaryWord = "";
                dictionaryFindFlag = true;
                dictionaryWordStartingIndex = 0;
                int rowIterateIndexValue = 0;

                while (rowIterateIndexValue != matrixSize) {
                    for (int j = 0; j < matrixSize; j++) {
                        if (dictionaryWords[i].equals(currentIdentifiedDictionaryWord)) {
                            dictionaryFindFlag = false;
                            break;
                        } else {
                            if (dictionaryWords[i].charAt(dictionaryWordStartingIndex) == userCharacterArray[j][rowIterateIndexValue]) {
                                currentIdentifiedDictionaryWord += dictionaryWords[i].charAt(dictionaryWordStartingIndex++);
                            } else {
                                currentIdentifiedDictionaryWord = "";
                                dictionaryWordStartingIndex = 0;
                            }
                        }
                    }

                    if (!dictionaryFindFlag) {
                        break;
                    } else {
                        rowIterateIndexValue++;
                    }
                }

                if (currentIdentifiedDictionaryWord.length() > 0) {
                    System.out.println(currentIdentifiedDictionaryWord);
                }
            }
        }
    }
}