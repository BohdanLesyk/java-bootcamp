package round_2.lesson8.task1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Handler {
    private static final int ARRAY_LENGTH = 100;

    public static void main(String[] args) {
        int[] integers = new int[ARRAY_LENGTH];
        Random random = new Random();

        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt(1000 + 1000) - 1000; // max = 1000; min = -1000;
        }

        System.out.println("Initial array of numbers:   " + Arrays.toString(integers));

        List<List<Integer>> positiveNegativeNumbers = NumberController.separateArrayByPredicate.apply(integers, NumberController.isPositive);
        System.out.println("Positive/Negative numbers:   " + positiveNegativeNumbers);

        List<List<Integer>> evenOddNumbers = NumberController.separateArrayByPredicate.apply(integers, NumberController. isEven);
        System.out.println("Even/Odd numbers:   " + evenOddNumbers);

        int[] integers2 = new int[ARRAY_LENGTH];

        for (int i = 0; i < integers.length; i++) {
            integers2[i] = random.nextInt(1000 + 1000) - 1000; // max = 1000; min = -1000;
        }

        System.out.println("Initial second array of numbers:   " + Arrays.toString(integers2));

        List<Integer> numbersBetweenArithmeticalMeansOfTwoArrays = NumberController.itemsInArrayBetweenArithmeticMean
                .apply(Arrays.asList(integers, integers2));

        System.out.println(numbersBetweenArithmeticalMeansOfTwoArrays);
    }
}
