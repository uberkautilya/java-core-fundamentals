package uber.kautilya.challenges.quicksort.forkjoin.recursivetask;

import java.util.Arrays;
import java.util.concurrent.RecursiveTask;

public class QuickSortRecursiveTask extends RecursiveTask<Integer[]> {
    Integer[] array;
    Integer minIndex;
    Integer maxIndex;

    public QuickSortRecursiveTask(Integer[] array, Integer minIndex, Integer maxIndex) {
        this.array = array;
        this.minIndex = minIndex;
        this.maxIndex = maxIndex;
    }

    /**
     * This function takes first element as pivot,
     * places the pivot element at its correct position in sorted array
     * Also moves all values smaller than the pivot onto the left side, and rest to the right side
     * Returns the position at which the correct value has been placed
     */
    static Integer getPivotIndexAndPartition(Integer[] arr, Integer minIndex, Integer maxIndex) {
//        System.out.printf("\narr: %s, minIndex: %d, maxIndex: %d", Arrays.toString(Arrays.copyOfRange(arr, minIndex, maxIndex + 1)), minIndex, maxIndex);
        Integer pivotValue = arr[minIndex];
        Integer leftIndex = minIndex + 1;
        Integer rightIndex = maxIndex;
        while (leftIndex <= rightIndex) {
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
    public static Integer swap(Integer[] array, Integer i, Integer j) {
        Integer temp = array[i];
        array[i] = array[j];
        array[j] = temp;
//        System.out.printf("\nSwapped %d with %d. %s%s", array[j], array[i], "New array after swap: ", Arrays.toString(array));
        return j;
    }

    @Override
    protected Integer[] compute() {
        if (minIndex < maxIndex) {
            // Partitioning index
            Integer pivotIndex = getPivotIndexAndPartition(array, minIndex, maxIndex);
            System.out.printf("\n%d is correctly assigned in array: %s", array[pivotIndex],
                    Arrays.toString(Arrays.copyOfRange(array, minIndex, maxIndex)));
            QuickSortRecursiveTask task1 = new QuickSortRecursiveTask(array, minIndex, pivotIndex - 1);
            QuickSortRecursiveTask task2 = new QuickSortRecursiveTask(array, pivotIndex + 1, maxIndex);
            invokeAll(task1, task2);
        }
        return array;
    }
}
