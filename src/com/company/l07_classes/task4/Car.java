package com.company.l07_classes.task4;

public class Car {

    private String brand;
    private int productionYear;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int year) {
        this.brand = brand;
        productionYear = year;
    }

    @Override
    public String toString() {
        if (productionYear > 0) {
            return "\nCar brand: " + brand + "\n" +
                    "Production Year: " + productionYear;
        } else {
            return "\nCar brand: " + brand;
        }
    }

}
