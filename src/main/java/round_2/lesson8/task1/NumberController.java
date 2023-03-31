package round_2.lesson8.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class NumberController {
    public static Predicate<Integer> isPositive = number -> number >= 0;

    public static Predicate<Integer> isEven = number -> (number % 2) == 0;

    public static BiFunction<int[], Predicate<Integer>, List<List<Integer>>>
            separateArrayByPredicate = (integers, predicate) -> {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        for (int i : integers) {
            if (predicate.test(i)) {
                positives.add(i);
            } else {
                negatives.add(i);
            }
        }

        resultList.add(positives);
        resultList.add(negatives);

        return resultList;
    };

    public static Function<int[], Double> arithmeticMean = integers -> {
        int average = 0;

        for (int i : integers) {
            average += i;
        }

        return (double) average / integers.length;
    };

    public static BiFunction<int[], List<Double>, List<Integer>> filter = (integers, arithmeticalMeans) -> {
        List<Integer> resultList = new ArrayList<>();

        if (arithmeticalMeans.get(0) > arithmeticalMeans.get(1)) {
            double temp = arithmeticalMeans.get(1);
            arithmeticalMeans.set(0, arithmeticalMeans.get(1));
            arithmeticalMeans.set(1, temp);
        }

        for (int i : integers) {
            if (i > arithmeticalMeans.get(0) && i < arithmeticalMeans.get(1)) {
                resultList.add(i);
            }
        }

        return resultList;
    };

    public static Function<List<int[]>, List<Integer>> itemsInArrayBetweenArithmeticMean = integers -> {
        List<Integer> resultList = new ArrayList<>();
        List<Double> arithmeticalMeans = new ArrayList<>();

        double arithmeticMean1 = arithmeticMean.apply(integers.get(0)), arithmeticMean2 = arithmeticMean.apply(integers.get(1));

        if (arithmeticMean1 < arithmeticMean2) {
            arithmeticalMeans.add(arithmeticMean1);
            arithmeticalMeans.add(arithmeticMean2);
        } else {
            arithmeticalMeans.add(arithmeticMean2);
            arithmeticalMeans.add(arithmeticMean1);
        }

        System.out.println("arithmeticalMean1:   " + arithmeticalMeans.get(0) + ", arithmeticalMean2:   " + arithmeticalMeans.get(1));

        resultList.addAll(filter.apply(integers.get(0), arithmeticalMeans));
        resultList.addAll(filter.apply(integers.get(1), arithmeticalMeans));

        return resultList;
    };
}
