package round_2.lesson4;

public class Fighter extends Plane {
    private int bulletsStock;
    private int missileCount;

    public Fighter(int speed, double weight, double length, double width, int passengerCapacity,
                   String manufacturerCompany, int engineHorsePower, double wingspanWidth, double flightRange,
                   double flightHeight, int countStuff, int turbineCount, String departureAirfield,
                   String arrivalAirfield, int bulletsStock, int missileCount) {
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
}
