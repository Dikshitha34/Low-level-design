package WithStrategy;

import WithStrategy.Strategy.DriveStrategy;

public class Vehicle {
	DriveStrategy obj;
	
	// constructor-injection
	Vehicle(DriveStrategy ob){
		this.obj=ob;
	}
	
	public void drive() {
		obj.drive();
	}
}
