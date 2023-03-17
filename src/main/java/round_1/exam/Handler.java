package round_1.exam;

import java.util.ArrayList;
import java.util.List;

public class Handler {
    private static final String str1 = "I originally approached Java as just another programming language. But as time passed and I studied it more deeply. I began to see that the fundamental intent of this language was different from other languages I had seen up to that point. Programming is about managing complexity. The complexity of the problem you want to solve. Laid upon the complexity of the machine in which it is solved.";
    private static final String str2 = "Because of this complexity most of our programming projects fail. And yet of all the programming languages of which I am aware. Almost none have gone all out and decided that their main design goal would be to conquer the complexity of developing and maintaining programs. Many language design decisions were made with complexity in mind. But at some point there were always other issues that were considered essential to be added into the mix.";
    private static double averageCountOfWordsInFirstSentence = 0, averageCountOfWordsInSecondSentence = 0;

    public static void main(String[] args) {
        findAverageCountOfWordsInSentences();
        createStringWithFourWordsFromTwoStrings();
    }

    private static void findAverageCountOfWordsInSentences() {
        List<Integer> countOfWordsInFirstString = new ArrayList<>();
        List<Integer> countOfWordsInSecondString = new ArrayList<>();
        int wordsCount, sentenceIndex = 0;

        System.out.println("First string:");

        for (String sentence : str1.split("[.] ")) {
            wordsCount = sentence.split(" ").length;
            countOfWordsInFirstString.add(wordsCount);
            averageCountOfWordsInFirstSentence += wordsCount;
            System.out.println("Sentence " + ++sentenceIndex + " - " + wordsCount + " words");
        }

        sentenceIndex = 0;
        System.out.println("Second string:");

        for (String sentence: str2.split("[.] ")) {
            wordsCount = sentence.split(" ").length;
            countOfWordsInSecondString.add(wordsCount);
            averageCountOfWordsInSecondSentence += wordsCount;
            System.out.println("Sentence " + ++sentenceIndex + " - " + wordsCount + " words");
        }

        averageCountOfWordsInFirstSentence /= countOfWordsInFirstString.size();
        averageCountOfWordsInSecondSentence /= countOfWordsInSecondString.size();

        System.out.println("Average count of words in first string is " + averageCountOfWordsInFirstSentence);
        System.out.println("Average count of words in second string is " + averageCountOfWordsInSecondSentence);
    }

    private static void createStringWithFourWordsFromTwoStrings() {
        String str3 = "";

        if (averageCountOfWordsInFirstSentence < averageCountOfWordsInSecondSentence) {
            str3 += str1.substring(0, str1.indexOf(' ', str1.indexOf(' ') + 1));
            str3 += str2.substring(str2.lastIndexOf(' ', str2.lastIndexOf(' ') - 1));
        } else {
            str3 += str2.substring(0, str2.indexOf(' ', str2.indexOf(' ') + 1));
            str3 += str1.substring(str1.lastIndexOf(' ', str1.lastIndexOf(' ') - 1));
        }

        System.out.println(str3);
    }
}
