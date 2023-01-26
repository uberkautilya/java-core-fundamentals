package uber.kautilya.challenges.quicksort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] array = new int[]{2, 3, 5, 9, 1, 7, 8, 4};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }


    /**
     * This function takes last element as pivot, places the pivot element at its
     * correct position in sorted array, and places all smaller (smaller than pivot)
     * to left of pivot and all greater elements to right of pivot
     */
    static int getPivotIndexPartition(int[] arr, int lowerIndex, int highIndex) {
        int pivoltElement = arr[highIndex];
        int prev = (lowerIndex - 1);

        for (int i = lowerIndex; i <= highIndex - 1; i++) {    // 2, 3, 5, 9, 1, 7, 8, 4
            //Accumulates the elements lower than the pivot on the left side
            if (arr[i] <= pivoltElement) {
                prev++;
                int tmp = arr[prev];
                arr[prev] = arr[i];
                arr[i] = tmp;
            }
        }
        //All elements lower than pivot - n in number, are already set on left of pivot
        int tmp = arr[prev + 1];
        arr[prev + 1] = arr[highIndex];
        arr[highIndex] = tmp;
        return (prev + 1);
    }

    /**
     * A[] --> Array to be sorted, lowerIndex --> Starting index, highIndex --> Ending index
     * A typical recursive implementation of Quicksort for array
     */
    static void quickSort(int[] A, int lowerIndex, int highIndex) {
        if (lowerIndex < highIndex) {
            // Partitioning index
            int pivotIndex = getPivotIndexPartition(A, lowerIndex, highIndex);
            quickSort(A, lowerIndex, pivotIndex - 1);
            quickSort(A, pivotIndex + 1, highIndex);
        }
    }
}