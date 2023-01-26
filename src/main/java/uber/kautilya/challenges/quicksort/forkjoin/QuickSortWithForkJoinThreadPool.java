package uber.kautilya.challenges.quicksort.forkjoin;

import uber.kautilya.challenges.quicksort.forkjoin.recursivetask.QuickSortRecursiveTask;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class QuickSortWithForkJoinThreadPool {
    public static void main(String[] args) {

        Integer[] array = IntStream.range(1, 1000).boxed().sorted((a, b) -> -1).toArray(Integer[]::new);
        System.out.println("Array: " + array);
        QuickSortRecursiveTask quickSortRecursiveTask = new QuickSortRecursiveTask(array, 0, array.length - 1);
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        Instant now = Instant.now();
        Integer[] result = forkJoinPool.invoke(quickSortRecursiveTask);
        System.out.printf("\nTime taken: %s", Duration.between(now, Instant.now()));
        System.out.print("\nFinal sorted array: " + Arrays.toString(result));

        System.out.println();
        Integer[] anotherArray = new Integer[]{34, 23, 1, 11, 56, 23, 44, 56};
        QuickSortRecursiveTask anotherQuickSortRecursiveTask = new QuickSortRecursiveTask(anotherArray, 0, anotherArray.length - 1);
        ForkJoinPool anotherForkJoinPool = ForkJoinPool.commonPool();
        Integer[] anotherResult = anotherForkJoinPool.invoke(anotherQuickSortRecursiveTask);
        System.out.print("\nFinal sorted anotherArray: " + Arrays.toString(anotherResult));
    }
}