import java.util.*;

enum spotStatus {
	taken, vacant;
}

class Vehicle {
	int size;
	int licensePlate;
	Date startTime;
	Date endTime;
	int charge;
	Spot spot;
	
	void enter() {
		this.startTime = new Date();
	}
	
	void exit() {
		this.endTime = new Date();
	}
	
	int getCharge() {
		return 0;
	}
}

class Bike extends Vehicle {
	int size = 1;
	Bike(int licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	int getCharge() {
		return 1;
	}
}

class Car extends Vehicle {
	int size = 2;
	Car(int licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	int getCharge() {
		return 100;
	}
}

class Truck extends Vehicle {
	int size = 2;
	Truck(int licensePlate) {
		this.licensePlate = licensePlate;
	}	
}

class Spot {
	int size;
	int id;
}


public class ParkingLot {
	List<Spot> availableSpots;
	int totalMoneyEarned = 0;
	
	boolean spotAvailable(Vehicle v) {
		// Should check list of all spots and return availability
		return true;
	}
	
	void occupySpot(Vehicle v) {
		// Choose a spot and remove it from available spots
	}
	
	void emptySpot(Vehicle v) {
		// Add the spot back to the available spots
	}
	
	void addVehicle(Vehicle v) {
		if(spotAvailable(v)) {
			occupySpot(v);
			v.enter();
		} else {
			System.out.println("No Spot Available");
		}
	}
	
	void removeVehicle(Vehicle v) {
		emptySpot(v);
		v.exit();
		totalMoneyEarned += v.getCharge();
	}
}
