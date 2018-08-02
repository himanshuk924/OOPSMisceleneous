package Vehicle;

public class Vehicle {
	private int speed;
	private double direction;
	private String ownerName;
	private static int highestVehicleId = 0;
	private final int vehicleId;
	
	
	public Vehicle() {
		vehicleId = highestVehicleId +1;
		highestVehicleId++;
	}

	public Vehicle(String ownerName) {
		super();
		this.ownerName = ownerName;
		vehicleId = highestVehicleId +1;
		direction = 0;
		highestVehicleId++;
	}
	
	public void changeSpeed(int speed)
	{
		this.speed = speed;
	}
	
	public void stopSpeed()
	{
		
		speed = 0;
	}

	public double turn(double angle)
	{
		direction = direction +angle;
		if(direction>360)
		{
			direction = 360-direction;
		}
		return direction;
	}	
	public double turn(String directionHand)
	{
		if(directionHand.equals("right"))
		{
			direction = direction+90;
			if(direction>360 || direction<0)
			{
				direction = 360-direction;
			}
			
		}
		else
		{
			direction = direction-90;
			if(direction>360 || direction<0) 
			{
				direction = 360-direction;
			}
		}
		return direction;
	}
	public int getHighestVehicleId()
	{
		return highestVehicleId;
	}
	
	public String toString()
	{
		String vehicleDetails;
		vehicleDetails = "the vehicle with Registration ID: " + vehicleId + " have owner " +ownerName+ " and have current speed: "+speed+ " and direction "+direction;
		return vehicleDetails;
	}
	
}
