package lesson07;

public class Car {
    private int wheel;
    private double price;
    private double radius; //轮胎周长

    public Car() {
    }

    public Car(int wheel, double price, double radius) {
        this.wheel = wheel;
        this.price = price;
        this.radius = radius;
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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel=" + wheel +
                ", price=" + price +
                ", radius=" + radius +
                '}';
    }
}
