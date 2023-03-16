package round_1.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Handler {
    private static final Random random = new Random();

    public static void main(String[] args) {
        String originalString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        System.out.println(originalString);

        String upperCaseAllFirstLetters = task1(originalString);
        System.out.println(upperCaseAllFirstLetters);

        String replacedOnSubstrings = task2(originalString);
        System.out.println(replacedOnSubstrings);

        String replacedOnSubstring = task3(originalString);
        System.out.println(replacedOnSubstring);

        String replacedByIndex = task4(originalString);
        System.out.println(replacedByIndex);

        task5(originalString);

        task6(originalString);

        task7(originalString);

        //+++++++++++++++++++++++++ Arrays +++++++++++++++++++++++++++
        int[] numbers = new int[50];

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = random.nextInt() % 5;
        }

        System.out.println("Initial array of integers: " + Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers));

        task8(numbers);

        //Task 9

        int[] numbers2 = new int[10];

        for (int index = 0; index < numbers2.length; index++) {
            numbers2[index] = random.nextInt() % 100;
        }

        System.out.println("Second array of integers: " + Arrays.toString(numbers2));

        task9(numbers, numbers2);

        // Task 10
        task10(numbers);
        task10Variant2(numbers);
    }

    private static String task1(String s) {
        int index = 0;
        char[] charArray = s.toCharArray();
        charArray[index] = Character.toUpperCase(charArray[index++]);

        while (index < charArray.length - 1) {
            if (charArray[index - 1] == 32) {
                charArray[index] = Character.toUpperCase(charArray[index]);
            }
            index++;
        }

        return new String(charArray);
    }

    private static String task2(String s) {
        int lengthOfChangingString = 3;
        String replacedString = "<Hello, World!> ";
        StringBuilder builder = new StringBuilder();

        for (String str : s.split(" ")) {
            if (str.length() == lengthOfChangingString) {
                builder.append(replacedString);
            } else {
                builder.append(str).append(" ");
            }
        }

        return builder.toString();
    }

    private static String task3(String s) {
        String searchSubstring = "case";
        String insertionWord = "<Hello, World!> ";
        StringBuilder builder = new StringBuilder();

        for (String str : s.split(" ")) {
            if (str.endsWith(searchSubstring)) {
                builder.append(str).append(" ").append(insertionWord);
            } else {
                builder.append(str).append(" ");
            }
        }

        return builder.toString();
    }

    private static String task4(String s) {
        char[] newString;
        int countSymbolsInWord = 4;
        String insertionString = "<Hello, World!> ";
        StringBuilder builder = new StringBuilder();
        int insertionStringLength = insertionString.length();
        char[] insertionStringAsArray = insertionString.toCharArray();

        for (String str : s.split(" ")) {
            if (str.length() > countSymbolsInWord) {
                int strLength = str.length();
                char[] strAsArray = str.toCharArray();
                newString = new char[strLength + insertionStringLength - 1];

                System.arraycopy(strAsArray, 0, newString, 0, countSymbolsInWord);
                System.arraycopy(insertionStringAsArray, 0, newString, countSymbolsInWord, insertionStringLength);
                System.arraycopy(strAsArray, countSymbolsInWord, newString, countSymbolsInWord + insertionStringLength - 1, strLength - countSymbolsInWord);

                builder.append(newString).append(' ');
            } else {
                builder.append(str).append(" ");
            }
        }

        return builder.toString();
    }

    private static void task5(String s) {
        ArrayList<String> strings = new ArrayList<>();

        for (String str : s.split(" ")) {
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                strings.add(str);
            }
        }

        System.out.println(strings);
    }

    private static void task6(String s) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (String str : s.split(" ")) {
            if (str.length() > max) { max = str.length(); }
            if (str.length() < min) { min = str.length(); }
        }

        ArrayList<String> stringsWithMinLength = new ArrayList<>();
        ArrayList<String> stringsWithMaxLength = new ArrayList<>();

        for (String str : s.split(" ")) {
            if (str.length() == max) { stringsWithMaxLength.add(str); }
            if (str.length() == min) { stringsWithMinLength.add(str); }
        }

        System.out.println(stringsWithMaxLength);
        System.out.println(stringsWithMinLength);
    }

    private static void task7(String s) {
        int beginIndex, endIndex;
        String firstWord, lastWord;
        StringBuilder builder = new StringBuilder();

        for (String str : s.split("[.] ")) {
            System.out.println(str);

            beginIndex = 0;
            endIndex = str.indexOf(' ');

            firstWord = str.substring(beginIndex, endIndex);
            lastWord = str.substring(str.lastIndexOf(' ') + 1);

            System.out.println(firstWord + ' ' + lastWord + ';');

            builder.append(lastWord)
                    .append(str, endIndex, str.lastIndexOf(' '))
                    .append(firstWord)
                    .append(". ");
        }

        System.out.println(builder);
    }

    private static void task8(int[] numbers) {
        ArrayList<Integer> positiveIntegers = new ArrayList<>();
        ArrayList<Integer> negativeIntegers = new ArrayList<>();

        for (int i : numbers) {
            if (i < 0) {
                negativeIntegers.add(i);
            } else {
                positiveIntegers.add(i);
            }
        }

        System.out.println(positiveIntegers);
        System.out.println(negativeIntegers);
    }

    private static void task9(int[] numbers1, int[] numbers2) {
        int averageFirstNumbers = 0, averageSecondNumbers = 0;

        for (int i : numbers1) {
            averageFirstNumbers += i;
        }

        for (int i : numbers2) {
            averageSecondNumbers += i;
        }

        averageFirstNumbers /= (double) numbers1.length;
        averageSecondNumbers /= (double) numbers2.length;

        ArrayList<Integer> integers = new ArrayList<>();

        System.out.println(averageFirstNumbers + " : " + averageSecondNumbers);

        addIntegerIntoArray(numbers1, averageFirstNumbers, averageSecondNumbers, integers);
        addIntegerIntoArray(numbers2, averageFirstNumbers, averageSecondNumbers, integers);

        System.out.println(integers);
    }

    private static void addIntegerIntoArray(int[] numbers, int averageFirstNumbers, int averageSecondNumbers, ArrayList<Integer> integers) {
        for (int i : numbers) {
            if (averageFirstNumbers > averageSecondNumbers & i > averageSecondNumbers & i < averageFirstNumbers) {
                integers.add(i);
            } else if (averageSecondNumbers > averageFirstNumbers & i > averageFirstNumbers & i < averageSecondNumbers) {
                integers.add(i);
            }
        }
    }

    private static void task10(int[] numbers) {
        int max = (int) Double.NEGATIVE_INFINITY, min = (int) Double.POSITIVE_INFINITY;
        int firstMaxIndex = 0, firstMinIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) { max = numbers[i]; firstMaxIndex = i; }
            if (numbers[i] < min) { min = numbers[i]; firstMinIndex = i; }
        }

        System.out.println(max + " : " + firstMaxIndex);
        System.out.println(min + " : " + firstMinIndex);

        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (i != firstMaxIndex & numbers[i] == max) {
                continue;
            }

            if (i != firstMinIndex & numbers[i] == min) {
                continue;
            }

            integers.add(numbers[i]);
        }

        System.out.println(integers);
    }

    private static void task10Variant2(int[] numbers) {
        int max = (int) Double.NEGATIVE_INFINITY, min = (int) Double.POSITIVE_INFINITY;
        int lastMaxIndex = 0, lastMinIndex = 0;

        for (int i = numbers.length - 1; i > -1; i--) {
            if (numbers[i] > max) { max = numbers[i]; lastMaxIndex = i; }
            if (numbers[i] < min) { min = numbers[i]; lastMinIndex = i; }
        }

        System.out.println(max + " : " + lastMaxIndex);
        System.out.println(min + " : " + lastMinIndex);

        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (i != lastMaxIndex & numbers[i] == max) {
                continue;
            }

            if (i != lastMinIndex & numbers[i] == min) {
                continue;
            }

            integers.add(numbers[i]);
        }

        System.out.println(integers);
    }
}