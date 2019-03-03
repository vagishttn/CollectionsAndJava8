package design.pattern;

enum CarType {
    MICRO, MINI;
}

enum Location {
    INDIA, USA;
}

abstract class Car {
    CarType carType;
    Location location;

    public Car(CarType carType, Location location) {
        this.carType = carType;
        this.location = location;
    }

    abstract void construct();

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", location=" + location +
                '}';
    }
}

class Mini extends Car {

    public Mini(Location location) {
        super(CarType.MINI, location);
    }

    @Override
    void construct() {
        System.out.println("Mini Car");
    }
}

class Micro extends Car {

    public Micro(Location location) {
        super(CarType.MICRO, location);
    }

    @Override
    void construct() {
        System.out.println("Micro Car");
    }
}

class IndianFactory {
    static Car builder(CarType carType) {
        Car car = null;
        switch (carType) {
            case MICRO:
                car = new Micro(Location.INDIA);
                break;
            case MINI:
                car = new Mini(Location.INDIA);
                break;
        }
        return car;
    }
}

class UsaFactory {
    static Car builder(CarType carType) {
        Car car = null;
        switch (carType) {
            case MICRO:
                car = new Micro(Location.USA);
                break;
            case MINI:
                car = new Mini(Location.USA);
                break;
        }
        return car;
    }
}

class CarFactory {
    static Car builder(CarType carType, Location location) {
        Car car = null;
        switch (location) {
            case USA:
                car = UsaFactory.builder(carType);
                break;
            case INDIA:
                car = IndianFactory.builder(carType);
                break;
        }
        return car;
    }
}


public class AbstractCarFactoryDemo {
    public static void main(String[] args) {
        System.out.println(CarFactory.builder(CarType.MICRO, Location.INDIA));
    }
}
