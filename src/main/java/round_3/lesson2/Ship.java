package round_3.lesson2;

import java.io.*;

public class Ship extends Vehicle implements Externalizable {
    @Serial
    private static final long serialVersionUID = 9058163615604245664L;
    private double displacement; // водотонажність
    private double length;
    private transient Boat boat;

    public Ship() { }

    public Ship(int speed, int year, Engine engine, double displacement, double length, Boat boat) {
        super(speed, year, engine);
        this.displacement = displacement;
        this.length = length;
        this.boat = boat;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    @Override
    public String toString() {
        return super.toString() + "Ship{" +
                "displacement=" + displacement +
                ", length=" + length +
                ", boat=" + boat +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        // Write super object
        out.writeInt(super.getSpeed());
        out.writeInt(super.getYear());
        out.writeObject(super.getEngine().getType());
        out.writeInt(super.getEngine().getPower());

        // Write this object
        out.writeDouble(this.getDisplacement());
        out.writeDouble(this.getLength());

        // Write Boat object
        out.writeInt(this.getBoat().getPassengerCount());
        out.writeObject(this.getBoat().getMaterial());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // Read super object
        super.setSpeed(in.readInt());
        super.setYear(in.readInt());

        Engine engine = new Engine();
        engine.setType((String) in.readObject());
        engine.setPower(in.readInt());

        super.setEngine(engine);

        // Read this object
        this.setDisplacement(in.readDouble());
        this.setLength(in.readDouble());

        // Read Boat object
        Boat boat = new Boat();
        boat.setPassengerCount(in.readInt());
        boat.setMaterial((String) in.readObject());
        this.setBoat(boat);
    }
}
