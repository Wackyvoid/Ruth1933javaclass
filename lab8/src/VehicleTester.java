public class VehicleTester {
    public static void main(String[] args) {
        Bike newBike = new Bike();
        Scooter newScooter = new Scooter();
        newBike.movingBackward();
        newBike.movingForward();
        newScooter.movingBackward();
        newScooter.movingForward();

        Car car = new Car(30.0);
        System.out.println(car);
        car.movingForward();
        car.movingBackward();
        System.out.println("Total Number of Vehicles: " + Vehicle.getNumVehicles());
        Helicopter newHelicopter = new Helicopter(5.0);
        System.out.println(newHelicopter);
        newHelicopter.movingForward();
        newHelicopter.movingBackward();
        System.out.println("Total Number of Vehicles: " + Vehicle.getNumVehicles());
    }
}
