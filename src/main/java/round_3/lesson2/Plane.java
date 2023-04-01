package round_3.lesson2;

import java.io.*;

public class Plane extends Vehicle implements Serializable {
    @Serial
    private static final long serialVersionUID = 9145120402446378862L;
    private String model;
    private double flightRange;
    private transient Chassis chassis;

    public Plane(int speed, int year, Engine engine, String model, double flightRange, Chassis chassis) {
        super(speed, year, engine);

        this.model = model;
        this.flightRange = flightRange;
        this.chassis = chassis;
    }

    public String getModel() {
        return model;
    }

    public double getFlightRange() {
        return flightRange;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    @Override
    public String toString() {
        return super.toString() + "Plane{" +
                "model='" + model + '\'' +
                ", flightRange=" + flightRange +
                ", chassis=" + chassis +
                '}';
    }

    @Serial
    private void writeObject(ObjectOutputStream stream) throws IOException {
        // Write super object
        stream.writeInt(super.getSpeed());
        stream.writeInt(super.getYear());
        stream.writeObject(super.getEngine().getType());
        stream.writeInt(super.getEngine().getPower());

        // Write this object
        stream.defaultWriteObject();

        // Write Wheel object
        stream.writeDouble(this.getChassis().getWheel().getCharge());
        stream.writeDouble(this.getChassis().getWheel().getDiameter());

        // Write Chassis object
        stream.writeInt(this.getChassis().getCountWheels());
    }

    @Serial
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        // Read super object
        super.setSpeed(stream.readInt());
        super.setYear(stream.readInt());

        Engine engine = new Engine();
        engine.setType((String) stream.readObject());
        engine.setPower(stream.readInt());
        super.setEngine(engine);

        // Read this object
        stream.defaultReadObject();

        // Read Wheel object
        Wheel wheel = new Wheel();
        wheel.setCharge(stream.readDouble());
        wheel.setDiameter(stream.readDouble());

        // Read Chassis object
        Chassis chassis = new Chassis();
        chassis.setWheel(wheel);
        chassis.setCountWheels(stream.readInt());

        this.setChassis(chassis);
    }
}
