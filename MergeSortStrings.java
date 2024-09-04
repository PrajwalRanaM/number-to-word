import java.util.Scanner;

public class MergeSortStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many strings do you want to sort?");
        int num = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        String[] strings = new String[num];
        System.out.println("Enter strings to sort: ");
        for (int i = 0; i < num; i++) {
            strings[i] = scanner.nextLine();
        }

        System.out.println("\nBefore: ");
        printArray(strings);

        mergeSort(strings);
        System.out.println("\nAfter: ");
        printArray(strings);
    }

    private static void mergeSort(String[] inputArray) {
        int inputLength = inputArray.length;
        if (inputLength < 2) {
            return;
        }
        int midIndex = inputLength / 2;

        // Creating two separate arrays
        String[] leftHalf = new String[midIndex];
        String[] rightHalf = new String[inputLength - midIndex];

        // Storing the data in left half
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }

        // Storing the data in right half
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(String[] inputArray, String[] leftHalf, String[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0, j = 0, k = 0;

        // Comparing the strings from right and left array
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i].compareTo(rightHalf[j]) <= 0) {  // Use compareTo() for string comparison
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftHalf if any
        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightHalf if any
        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    private static void printArray(String[] strings) {
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
