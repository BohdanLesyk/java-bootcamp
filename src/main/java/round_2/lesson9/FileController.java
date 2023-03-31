package round_2.lesson9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileController {
    public List<String> readDataFromFile(File file) {
        List<String> fileData = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                fileData.add(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File '" + file.getPath() + "' not found");
            e.printStackTrace(System.err);
        } catch (IOException e) {
            System.err.println("Can't read from file");
            e.printStackTrace(System.err);
        }

        return fileData;
    }

    public List<List<Entity>> parseDataFrom(File file) {
        List<String> fileData = readDataFromFile(file);
        List<Entity> smallEntities = new ArrayList<>();
        List<Entity> middleEntities = new ArrayList<>();
        List<Entity> largeEntities = new ArrayList<>();
        String[] fields;
        Entity entity;

        for (int i = 1; i < fileData.size(); i++) {
            fields = fileData.get(i).split(" +");
            entity = new Entity(fields[1], Double.parseDouble(fields[2]), fields[3]);

            if (entity.getVolume() <= 0.5) {
                smallEntities.add(entity);
            } else if (entity.getVolume() >= 1) {
                largeEntities.add(entity);
            } else {
                middleEntities.add(entity);
            }
        }

        return List.of(smallEntities, middleEntities, largeEntities);
    }

    public void writeDataTo(List<Entity> entities, File file, boolean append) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, append))) {
            int currentNumber = 0;
            List<String> fileData = readDataFromFile(file);

            if (!append) {
                printWriter.println("N  Bottle  Volume  Material");
            }

            if (file.exists() && fileData.size() > 1) {
                currentNumber = Integer.parseInt(String.valueOf(fileData.get(fileData.size() - 1).charAt(0)));
            }

            for (Entity entity : entities) {
                printWriter.printf("%1$-3s%2$-8s%3$-8s%4$-8s\n",
                        ++currentNumber,
                        entity.getBottle(),
                        entity.getVolume(),
                        entity.getMaterial());
            }

            printWriter.flush();
        } catch (FileNotFoundException e) {
            System.err.println("File '" + file.getPath() + "' not found");
            e.printStackTrace(System.err);
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    public void sortDataAtFile(File file, String... comparingOrder) {
        List<String> fileData = readDataFromFile(file);
        List<Entity> entities = new ArrayList<>();
        String[] fields;
        Entity entity;

        for (int i = 1; i < fileData.size(); i++) {
            fields = fileData.get(i).split(" +");
            entity = new Entity(fields[1], Double.parseDouble(fields[2]), fields[3]);
            entities.add(entity);
        }

        switch (comparingOrder[0] + comparingOrder[1] + comparingOrder[2]) {
            case "Bottle Volume Material" -> entities.sort(new Entity.ComparatorByEntityBottleVolumeMaterial());
            case "Material Volume Bottle" -> entities.sort(new Entity.ComparatorByEntityMaterialVolumeBottle());
            default -> entities.sort(new Entity.ComparatorByEntityVolumeMaterialBottle());
        }

        writeDataTo(entities, file, false);

        System.out.println("Sorted data in file '" + file.getPath() + "' successfully!");
    }
}
