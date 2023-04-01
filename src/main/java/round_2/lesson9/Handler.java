package round_2.lesson9;

import java.io.File;
import java.util.List;

/**
 * For correct work the following program put one of the next arguments as
 * program arguments: <br>
 * 1. `Bottle Volume Material` OR <br>
 * 2. `Material Volume Bottle`
 */
public class Handler {
    public static void main(String[] args) {
        FileController fileController = new FileController();
        List<String> fileData = fileController.readDataFromFile(new File("src/InputFiles/file1"));
        EntityView.printListOfStrings(fileData);
        System.out.println("=================================================");

        fileData = fileController.readDataFromFile(new File("src/InputFiles/file2"));
        EntityView.printListOfStrings(fileData);
        System.out.println("=================================================");

        fileData = fileController.readDataFromFile(new File("src/InputFiles/file3"));
        EntityView.printListOfStrings(fileData);
        System.out.println("=================================================");

        List<List<Entity>> entities = fileController.parseDataFrom(new File("src/InputFiles/file1"));
        EntityView.printListOfEntities(entities.get(0));
        System.out.println("=================================================");
        EntityView.printListOfEntities(entities.get(1));
        System.out.println("=================================================");
        EntityView.printListOfEntities(entities.get(2));
        System.out.println("=================================================");
        fileController.parseDataFrom(new File("src/InputFiles/file2"));
        fileController.parseDataFrom(new File("src/InputFiles/file3"));

        fileController.writeDataTo(entities.get(0), new File("src/OutputFiles/small"), false);
        fileController.writeDataTo(entities.get(1), new File("src/OutputFiles/middle"), false);
        fileController.writeDataTo(entities.get(2), new File("src/OutputFiles/large"), false);

        entities = fileController.parseDataFrom(new File("src/InputFiles/file2"));
        fileController.writeDataTo(entities.get(0), new File("src/OutputFiles/small"), true);
        fileController.writeDataTo(entities.get(1), new File("src/OutputFiles/middle"), true);
        fileController.writeDataTo(entities.get(2), new File("src/OutputFiles/large"), true);

        entities = fileController.parseDataFrom(new File("src/InputFiles/file3"));
        fileController.writeDataTo(entities.get(0), new File("src/OutputFiles/small"), true);
        fileController.writeDataTo(entities.get(1), new File("src/OutputFiles/middle"), true);
        fileController.writeDataTo(entities.get(2), new File("src/OutputFiles/large"), true);

        fileController.sortDataAtFile(new File("src/OutputFiles/small"), args);
    }
}
