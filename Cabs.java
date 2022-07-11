package VScabs;

import java.io.*;
public class Cabs {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SelectVehicle selfac = new SelectVehicle();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to VScabs : ");
		System.out.println();
		System.out.println("Enter the Vehicle You want : ");
		String vtype = br.readLine();
		System.out.println("Enter the total distance km");
		int km = Integer.parseInt(br.readLine());
		TotalBill veh=selfac.getVeh(vtype);
		System.out.println("Bill amount for "+vtype+" to ride "+km + " km : ");
		veh.getRate();
		veh.processBill(km);
	}

}
