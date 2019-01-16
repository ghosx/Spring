package lesson05;

public class Car {
    private int wheel;
    private double price;

    public Car() {
        System.out.println("Car's constructor");
    }

    public Car(int wheel, double price) {
        this.wheel = wheel;
        this.price = price;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel=" + wheel +
                ", price=" + price +
                '}';
    }
}
