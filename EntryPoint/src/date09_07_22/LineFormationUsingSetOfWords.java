package date09_07_22;

import java.util.Arrays;
import java.util.Scanner;

public class LineFormationUsingSetOfWords  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total no.of.characters in a line excluding space & fav.char: ");
        int totalNoOfWordsExcludingSpaceAndFavChar = scanner.nextInt();

        System.out.print("Enter the array size: ");
        int arraySize = scanner.nextInt();

        scanner.nextLine();

        String[] userArray = new String[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter userArray[" + i + "]: ");
            userArray[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(userArray));

        System.out.print("Enter your favourite character: ");
        char favouriteCharacter = scanner.next().charAt(0);

        int[] wordUsedForLineFormationIndicies = new int[arraySize];
        int currentIndexOfWordUsedForLineFormationIndicies = 0;

        for (int i = 0; i < arraySize - 1; i++) {
            int currentMaximumWordCount = 0;
            String currentMaximumWord = "";
            int maximumWordIndex = 0;

            if (i == 0) {
                currentIndexOfWordUsedForLineFormationIndicies = getCurrentIndexOfWordUsedForLineFormationIndicies(totalNoOfWordsExcludingSpaceAndFavChar, arraySize, userArray, favouriteCharacter, wordUsedForLineFormationIndicies, currentIndexOfWordUsedForLineFormationIndicies, i, currentMaximumWordCount, currentMaximumWord, maximumWordIndex);
            } else {
                boolean existingIndexCheck = true;

                for (int j = 0; j < arraySize; j++) {
                    if (i == wordUsedForLineFormationIndicies[j]) {
                        existingIndexCheck = false;
                        break;
                    }
                }

                if (existingIndexCheck) {
                    currentIndexOfWordUsedForLineFormationIndicies = getCurrentIndexOfWordUsedForLineFormationIndicies(totalNoOfWordsExcludingSpaceAndFavChar, arraySize, userArray, favouriteCharacter, wordUsedForLineFormationIndicies, currentIndexOfWordUsedForLineFormationIndicies, i, currentMaximumWordCount, currentMaximumWord, maximumWordIndex);
                }
            }
        }
    }

    private static int getCurrentIndexOfWordUsedForLineFormationIndicies(int totalNoOfWordsExcludingSpaceAndFavChar, int arraySize, String[] userArray, char favouriteCharacter, int[] wordUsedForLineFormationIndicies, int currentIndexOfWordUsedForLineFormationIndicies, int i, int currentMaximumWordCount, String currentMaximumWord, int maximumWordIndex) {
        for (int j = i + 1; j < arraySize; j++) {
            boolean existingWordCheck = true;

            for (int k = 0; k < arraySize; k++) {
                if (j == wordUsedForLineFormationIndicies[k]) {
                    existingWordCheck = false;
                    break;
                }
            }

            if (existingWordCheck) {
                int countExplicitOfFavCharAndSpace = 0;

                for (int l = 0; l < userArray[j].length(); l++) {
                    if (userArray[j].toLowerCase().charAt(l) != favouriteCharacter) {
                        countExplicitOfFavCharAndSpace++;
                    }
                }

                if ((userArray[i].length() + countExplicitOfFavCharAndSpace) <= totalNoOfWordsExcludingSpaceAndFavChar) {
                    if (countExplicitOfFavCharAndSpace > currentMaximumWordCount) {
                        currentMaximumWordCount = countExplicitOfFavCharAndSpace;
                        currentMaximumWord = userArray[j];
                        maximumWordIndex = j;
                    }
                }
            }
        }

        wordUsedForLineFormationIndicies[currentIndexOfWordUsedForLineFormationIndicies++] = maximumWordIndex;

        if (currentMaximumWord.length() < userArray[i].length()) {
            System.out.println(userArray[i] + " " + currentMaximumWord);
        } else {
            System.out.println(currentMaximumWord + " " + userArray[i]);
        }

        return currentIndexOfWordUsedForLineFormationIndicies;
    }
}