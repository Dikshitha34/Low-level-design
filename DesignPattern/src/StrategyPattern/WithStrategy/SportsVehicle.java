package WithStrategy;

import WithStrategy.Strategy.DriveStrategy;
import WithStrategy.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

	SportsVehicle() {
		super(new SportsDriveStrategy());
//		this.ob=ob;
		// TODO Auto-generated constructor stub
	}
	
}
