package round_2.lesson5.task1and2;

import java.util.Objects;

public class Fighter extends Plane {
    private int bulletsStock;
    private int missileCount;

    public Fighter() {
    }

    public Fighter(int bulletsStock, int missileCount) {
        this.bulletsStock = bulletsStock;
        this.missileCount = missileCount;
    }

    public Fighter(int bulletsStock, int missileCount, int engineHorsePower, double wingspanWidth, double flightRange, double flightHeight, int countStuff, int turbineCount, String departureAirfield, String arrivalAirfield) {
        super(engineHorsePower, wingspanWidth, flightRange, flightHeight, countStuff, turbineCount, departureAirfield, arrivalAirfield);

        this.bulletsStock = bulletsStock;
        this.missileCount = missileCount;
    }

    public Fighter(double length, double width, int passengerCapacity, String manufacturerCompany, int engineHorsePower,
                   double wingspanWidth, double flightRange, double flightHeight, int countStuff, int turbineCount,
                   String departureAirfield, String arrivalAirfield, int bulletsStock, int missileCount, int speed,
                   double weight) {
        super(speed, weight, length, width, passengerCapacity, manufacturerCompany, engineHorsePower, wingspanWidth,
                flightRange, flightHeight, countStuff, turbineCount, departureAirfield, arrivalAirfield);

        this.bulletsStock = bulletsStock;
        this.missileCount = missileCount;
    }

    protected int getBulletsStock() {
        return bulletsStock;
    }

    void setBulletsStock(int bulletsStock) {
        this.bulletsStock = bulletsStock;
    }

    protected int getMissileCount() {
        return missileCount;
    }

    void setMissileCount(int missileCount) {
        this.missileCount = missileCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fighter fighter = (Fighter) o;

        return getBulletsStock() == fighter.getBulletsStock()
                && getMissileCount() == fighter.getMissileCount();
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "bulletsStock=" + bulletsStock +
                ", missileCount=" + missileCount +
                '}';
    }
}
