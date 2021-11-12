public class Helicopter extends Vehicle {
    private double mpg;

    public Helicopter(double d) {
        this.mpg = d;
        nVehicles ++;
    }

    public Helicopter() {
        this.mpg = 0.3;
        nVehicles ++;
    }

    public double getMPG() {
        return mpg;
    }

    public void movingForward() {
        System.out.println("Helicopter moving forward");
    }

    public void movingBackward() {
        System.out.println("Helicopter moving backward");
    }

    public void movingUp() {
        System.out.println("Helicopter moving up");
    }

    public void movingDown() {
        System.out.println("Helicopter moving down");
    }

    public String toString() {
        return "Helicopter:" + mpg;
    }
}
