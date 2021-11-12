public class Car extends Vehicle {
    private double mpg;

    public Car(double d) {
        this.mpg = d;
        nVehicles ++;
    }

    public Car() {
        this.mpg = 30.0;
        nVehicles ++;
    }

    public double getMPG() {
        return mpg;
    }

    public void movingForward() {
        System.out.println("Car moving forward");
    }

    public void movingBackward() {
        System.out.println("Car moving backward");
    }
    
    public String toString() {
        return "Car:" + mpg;
    }
}
