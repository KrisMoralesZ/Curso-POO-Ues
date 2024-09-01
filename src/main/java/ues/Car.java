package ues;

public class Car {
    private String brand;
    private String model;
    private int year;

    static void start(Car car){}
    static void drive(Car car){}
    static void accelerate(Car car){}
    static void stop(Car car){}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
