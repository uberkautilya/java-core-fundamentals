package uber.kautilya.challenges.quicksort;

import java.util.Arrays;

public class QuickSortCustomPivotZero {
    public static void main(String[] args) {

        int[] array = new int[]{2, 3, 5, 9, 1, 7, 8, 4};
        quickSort(array, 0, (array.length - 1));
        System.out.print("\nFinal sorted array: " + Arrays.toString(array));

        System.out.println();
        int[] anotherArray = new int[]{34, 23, 1, 11, 56, 23, 44, 56};
        quickSort(anotherArray, 0, (anotherArray.length - 1));
        System.out.print("\nFinal sorted array: " + Arrays.toString(anotherArray));
    }

    static void quickSort(int[] array, int lowerIndex, int highIndex) {
        if (lowerIndex < highIndex) {
            // Partitioning index
            int pivotIndex = getPivotIndexAndPartition(array, lowerIndex, highIndex);
            System.out.printf("\n%d is correctly assigned in array: %s", array[pivotIndex],
                    Arrays.toString(Arrays.copyOfRange(array, lowerIndex, highIndex)));
            quickSort(array, lowerIndex, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, highIndex);
        }
    }

    /**
     * This function takes first element as pivot,
     * places the pivot element at its correct position in sorted array
     * Also moves all values smaller than the pivot onto the left side, and rest to the right side
     * Returns the position at which the correct value has been placed
     */
    static int getPivotIndexAndPartition(int[] arr, int minIndex, int maxIndex) {
        int pivotValue = arr[minIndex];
        int leftIndex = minIndex + 1;
        int rightIndex = maxIndex;
        while (leftIndex < rightIndex) {
            while (leftIndex <= rightIndex && arr[leftIndex] <= pivotValue) {
                leftIndex++;
            }
            while (leftIndex <= rightIndex && arr[rightIndex] >= pivotValue) {
                rightIndex--;
            }
            if (leftIndex < rightIndex) {
                swap(arr, leftIndex, rightIndex);
            } else {
                break;
            }
        }
        return swap(arr, minIndex, rightIndex);
    }

    /**
     * array --> Array to be sorted, l --> Starting index, h --> Ending index
     */
    public static int swap(int[] array, int i, int j) {
//        System.out.printf("\nSwapping %d with %d", array[i], array[j]);
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        System.out.printf("\nSwapped %d with %d. %s%s", array[j], array[i], "New array after swap: ", Arrays.toString(array));
        return j;
    }
}