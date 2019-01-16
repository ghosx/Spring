package lesson02;

public class Car {
    private String name;
    private int price;
    private int wheel;

    public Car(String name, int price, int wheel) {
        this.name = name;
        this.price = price;
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", wheel=" + wheel +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
}
