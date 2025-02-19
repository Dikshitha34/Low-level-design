package WithStrategy;

import WithStrategy.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
	OffRoadVehicle(){
		super(new SportsDriveStrategy());
	}
}
