package object_1;

public class Car {
    private final String company;
    private final String carName;
    private final String color;
    private final int speed;

    public Car(String company, String carName, String color, int speed) {
        this.company = company;
        this.carName = carName;
        this.color = color;
        this.speed = speed;
    }

    public String getCompany() {
        return company;
    }

    public String getCarName() {
        return carName;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

}
