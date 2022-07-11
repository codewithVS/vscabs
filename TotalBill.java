package VScabs;

abstract class TotalBill {
	protected double rate;
	abstract void getRate();
	public void processBill(int km) {
		System.out.println("Cost of total journey : "+(km*rate) + " INR");
	}
}


