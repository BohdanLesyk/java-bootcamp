package round_3.lesson2;

public class Wheel {
    private double charge;
    private double diameter;

    public Wheel() { }

    public Wheel(double charge, double diameter) {
        this.charge = charge;
        this.diameter = diameter;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "charge=" + charge +
                ", diameter=" + diameter +
                '}';
    }
}
