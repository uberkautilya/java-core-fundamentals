package uber.kautilya.challenges.quicksort;

import java.util.Arrays;

public class QuickSortCustom {
    public static void main(String[] args) {

        int[] array = new int[]{2, 3, 5, 9, 1, 7, 8, 4};
        quickSort(array, 0, array.length - 1);
        System.out.printf("\nFinal Sorted array: " + Arrays.toString(array));

        System.out.println();
        int[] anotherArray = new int[]{34, 23, 1, 11, 56, 23, 44, 56};
        quickSort(anotherArray, 0, array.length - 1);
        System.out.printf("\nFinal Sorted array: " + Arrays.toString(anotherArray));
    }

    /**
     * This function takes last element as pivot, places the pivot element at its
     * correct position in sorted array, and places all smaller values(than pivot)
     * to left of pivot and all greater elements to its right
     */
    static int getPivotIndexAndPartition(int[] arr, int minIndex, int maxIndex) {
        int pivotValue = arr[maxIndex];
        int leftIndex = minIndex;
        int rightIndex = maxIndex - 1;
        while (leftIndex < rightIndex) {
            while (leftIndex <= rightIndex && arr[leftIndex] <= pivotValue) {
                leftIndex++;
            }
            while (minIndex <= rightIndex && arr[rightIndex] >= pivotValue) {
                rightIndex--;
            }
            if (leftIndex < rightIndex) {
                swap(arr, leftIndex, rightIndex);
            } else
                break;
        }
        return swap(arr, leftIndex, maxIndex);
    }

    public static int swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        System.out.printf("\nSwapped %d with %d. New Array: %s", array[j], array[i], Arrays.toString(array));
        return i;
    }

    /**
     * array --> Array to be sorted, l --> Starting index, h --> Ending index
     */
    static void quickSort(int[] array, int lowerIndex, int highIndex) {
        if (lowerIndex < highIndex) {
            // Partitioning index
            int pivotIndex = getPivotIndexAndPartition(array, lowerIndex, highIndex);
            quickSort(array, lowerIndex, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, highIndex);
        }
    }
}