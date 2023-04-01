package round_3.lesson1;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileController {
    private static int WORD_LENGTH_LIMIT;

    static {
        final Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Give max number of symbols in words which will be deleted: ");
            WORD_LENGTH_LIMIT = scanner.nextInt();

            if (WORD_LENGTH_LIMIT <= 0) {
                System.out.println("Please, provide positive number");
            }
        } while (WORD_LENGTH_LIMIT <= 0);
    }

    public static void processFile(File sourceFile, File targetFile) {
        final StringBuilder builder = new StringBuilder();
        Matcher matcher;

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile))) {
            String line;
            int matchCount, startIndex, endIndex;

            while ((line = reader.readLine()) != null) {
                builder.append(line).append('\n');
                String regex = "\\b\\w{%d}[^aeiouyAEIOUY,.!?:;\\\"\\s]\\b".formatted(WORD_LENGTH_LIMIT - 1);
                matcher = Pattern.compile(regex).matcher(line);
                matchCount = 0;

                while (matcher.find()) {
                    startIndex = matcher.start() - matchCount - matchCount * WORD_LENGTH_LIMIT;
                    endIndex = matcher.end() - matchCount - matchCount * WORD_LENGTH_LIMIT;

                    builder.delete(startIndex, endIndex);

                    if (builder.charAt(startIndex) == ' ') {
                        builder.deleteCharAt(startIndex);
                    }

                    matchCount++;
                }

                writer.write(builder.toString());
                builder.delete(0, builder.length());
                writer.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Words has deleted from file '" + sourceFile.getAbsolutePath() + "' with length of " +
                WORD_LENGTH_LIMIT + " symbols and has written to file '" + targetFile.getAbsolutePath() + "'");
    }
}
