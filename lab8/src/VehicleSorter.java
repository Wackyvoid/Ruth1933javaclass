import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class VehicleSorter {
	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();


		Car car = new Car(30.0);
		System.out.println("Total Number of Vehicles: " + Vehicle.getNumVehicles());
		Helicopter newHelicopter = new Helicopter(5.0);
		System.out.println("Total Number of Vehicles: " + Vehicle.getNumVehicles());
		Train newTrain = new Train(500.0);
		System.out.println("Total Number of Vehicles: " + Vehicle.getNumVehicles());
		//TODO: add vehicle objects of different types to your list
		//	e.g. vehicles.add(new Vehicle());
		//
		vehicles.add(car);
		vehicles.add(newHelicopter);
		vehicles.add(newTrain);

		Collections.sort(vehicles);
		for (Vehicle v : vehicles) {
			System.out.println(v);
		}
	}
}
