package VScabs;

public class SelectVehicle {
	public TotalBill getVeh(String PlanType) {
		if (PlanType==null) {
			return null;
		}
		if (PlanType .equalsIgnoreCase("Bike")) {
			//subclass constructor 
			return new Bike();
		}
		if (PlanType .equalsIgnoreCase("Auto")) {
			return new Auto();
		}
		if (PlanType .equalsIgnoreCase("car")) {
			return new Car();
		}
		if (PlanType .equalsIgnoreCase("PrimeSuv")) {
			return new PrimeSuv();
		}
		return null;
	}


}
