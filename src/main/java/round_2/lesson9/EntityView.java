package round_2.lesson9;

import java.util.List;

public class EntityView {

    public static void print(String str) {
        System.out.println(str);
    }

    public static void printListOfStrings(List<String> strings) {
        for (String str : strings) {
            print(str);
        }
    }

    public static void printEntityModel(Entity entity) {
        System.out.println(entity);
    }

    public static void printListOfEntities(List<Entity> entities) {
        for (Entity entity : entities) {
            printEntityModel(entity);
        }
    }
}
