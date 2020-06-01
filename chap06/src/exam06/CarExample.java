package exam06;

public class CarExample {
	public static void main(String[] args) {
		Car mycar = new Car();
//		mycar.speed = 50; // private이므로 접근X
		mycar.setSpeed(-50); //setter로 접근
		
//		System.out.println(mycar.speed); 
		System.out.println(mycar.getSpeed()); //getter로 접근
		mycar.setSpeed(100);
		System.out.println(mycar.toString());
		if(!mycar.isStop())
			mycar.setStop(true);
		System.out.println(mycar.toString());
	}
}
