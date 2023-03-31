package round_2.lesson9;

import java.util.Comparator;

public class Entity {
    private final String bottle;
    private final double volume;
    private final String material;

    public Entity(String bottle, double volume, String material) {
        this.bottle = bottle;
        this.volume = volume;
        this.material = material;
    }

    public String getBottle() {
        return bottle;
    }

    public String getMaterial() {
        return material;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "bottle='" + bottle + '\'' +
                ", volume=" + volume +
                ", material='" + material + '\'' +
                '}';
    }

    public static class ComparatorByEntityVolumeMaterialBottle implements Comparator<Entity> {
        @Override
        public int compare(Entity o1, Entity o2) {
            int result = Double.compare(o1.getVolume(), o2.getVolume());

            if (result == 0) {
                result = o1.getMaterial().compareTo(o2.getMaterial());
            } else if (result == 0) {
                result = o1.getBottle().compareTo(o2.getBottle());
            }

            return result;
        }
    }

    public static class ComparatorByEntityBottleVolumeMaterial implements Comparator<Entity> {
        @Override
        public int compare(Entity o1, Entity o2) {
            int result = o1.getBottle().compareTo(o2.getBottle());

            if (result == 0) {
                result = Double.compare(o1.getVolume(), o2.getVolume());
            } else if (result == 0) {
                result = o1.getMaterial().compareTo(o2.getMaterial());
            }

            return result;
        }
    }

    public static class ComparatorByEntityMaterialVolumeBottle implements Comparator<Entity> {
        @Override
        public int compare(Entity o1, Entity o2) {
            int result = o1.getMaterial().compareTo(o2.getMaterial());

            if (result == 0) {
                result = Double.compare(o1.getVolume(), o2.getVolume());
            } else if (result == 0) {
                result = o1.getBottle().compareTo(o2.getBottle());
            }

            return result;
        }
    }
}
