package week2;

public class Vehicle {
    int maxSpeed;
    int wheels;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;
    double fuelCapacity;

    void horn() {
        System.out.println("Beep!");
    }
}
