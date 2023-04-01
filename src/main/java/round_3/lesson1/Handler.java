package round_3.lesson1;

import java.io.File;

public class Handler {
    public static void main(String[] args) {
        FileController.processFile(new File("src/InputFiles/source"), new File("src/OutputFiles/target"));
    }
}
