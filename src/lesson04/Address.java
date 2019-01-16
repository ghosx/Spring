package lesson04;

public class Address {
    private String street;

    public Address() {
    }

    public Address(String stree) {
        this.street = stree;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                '}';
    }
}
