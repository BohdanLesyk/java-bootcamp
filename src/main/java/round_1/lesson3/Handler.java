package round_1.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Handler {
    private static final Random random = new Random();

    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = random.nextInt() % 100;
        }

        System.out.println("Initial array of integers: " + Arrays.toString(numbers));

        int countEvenNumbers = 0, sumEvenNumbers = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sumEvenNumbers += number;
                countEvenNumbers++;
            }
        }

        System.out.println("Count even numbers:  " + countEvenNumbers);
        System.out.println("Sum even numbers:  " + sumEvenNumbers);

        int maxOfNegativeNumber = (int) Double.NEGATIVE_INFINITY, minOfPositiveNumber = (int) Double.POSITIVE_INFINITY;

        for (int number : numbers) {
            if (number > maxOfNegativeNumber & number < 0) {
                maxOfNegativeNumber = number;
            }

            if (number < minOfPositiveNumber & number > -1) {
                minOfPositiveNumber = number;
            }
        }

        System.out.println("Max of negative number: " + maxOfNegativeNumber);
        System.out.println("Min of positive number: " + minOfPositiveNumber);

        int[] numbers2 = new int[numbers.length];

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] < 0) {
                numbers2[index] = numbers[index] - 1;
            }

            if (numbers[index] > -1) {
                numbers2[index] = numbers[index] + 1;
            }
        }

        System.out.println("Second array with changed numbers: " + Arrays.toString(numbers2));

        int maxNumberIndex = 0, minNumberIndex = 0;

        for (int index = 0,
             maxNumber = (int) Double.NEGATIVE_INFINITY,
             minNumber = (int) Double.POSITIVE_INFINITY; index < numbers.length; index++) {
            if (numbers[index] > maxNumber) {
                maxNumber = numbers[index];
                maxNumberIndex = index;
            }

            if (numbers[index] < minNumber) {
                minNumber = numbers[index];
                minNumberIndex = index;
            }
        }

        int[] numbers3 = new int[numbers.length];

        for (int index = 0; index < numbers.length; index++) {
            if (index == maxNumberIndex) {
                numbers3[index] = numbers[minNumberIndex];
            } else if (index == minNumberIndex) {
                numbers3[index] = numbers[maxNumberIndex];
            } else {
                numbers3[index] = numbers[index];
            }
        }

        System.out.println("Third array with changed numbers: " + Arrays.toString(numbers3));

        int[] numbers4 = new int[numbers.length - 2];

        for (int index = 0, bypass = 0; index < numbers.length; index++) {
            if (index == maxNumberIndex | index == minNumberIndex) {
                bypass++;
                continue;
            }

            numbers4[index - bypass] = numbers[index];
        }

        System.out.println("Fours array without max and min values: " + Arrays.toString(numbers4));

        double average = 0;

        for (int number : numbers) {
            average += number;
        }

        average /= numbers.length;

        System.out.println("Arithmetic average of array: " + average);

        int quantityNumbersGraterThanAverage = numbers.length - (int) average;

        if (quantityNumbersGraterThanAverage > 0) {
            if (average > 0) {
                System.out.println("Quantity numbers grater than average is " + (numbers.length - (int) average));
            } else {
                System.out.println("Quantity numbers grater than average is " + (numbers.length + (int) average));
            }
        } else {
            System.out.println("Quantity numbers grater than average is absent");
        }
    }
}
