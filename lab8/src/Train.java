public class Train extends Vehicle {
    private double mpg;

    public Train(double d) {
        this.mpg = d;
        nVehicles ++;
    }

    public Train() {
        this.mpg = 470.0;
        nVehicles ++;
    }

    public double getMPG() {
        return mpg;
    }

    public void movingForward() {
        System.out.println("Train moving forward");
    }

    public void movingBackward() {
        System.out.println("Train moving backward");
    }

    public void enteringStation() {
        System.out.println("Train entering station");
    }

    public void leavingStation() {
        System.out.println("Train leaving station");
    }

    public String toString() {
        return "Train:" + mpg;
    }
}
