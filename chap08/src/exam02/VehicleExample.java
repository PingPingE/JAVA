package exam02;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle v = new Car();
		if(v instanceof Bus){System.out.println("Bus");}
		else if (v instanceof Car) {System.out.println("Car");}
	}
}
