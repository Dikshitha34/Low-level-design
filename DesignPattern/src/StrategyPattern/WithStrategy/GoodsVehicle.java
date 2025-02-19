package WithStrategy;

import WithStrategy.Strategy.DriveStrategy;
import WithStrategy.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

	GoodsVehicle() {
		super(new NormalDriveStrategy());
		// TODO Auto-generated constructor stub
	}
	
}
