package exam06;

public class Car {
	private int speed;
	private boolean stop;
	
	public Car() {}
	
	public int getSpeed() 
	{ 
		System.out.print("현재 속도: ");
		return speed; 
	}
	
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", stop=" + stop + "]";
	}

	public void setSpeed(int speed) //매개변수명은 필드명과 동일하게 맞춤
	{
		//검증
		if(speed <0)
		{
			this.speed  = 0;
			System.out.println("오류 ");
			return;
		}
		else
			this.speed = speed;
		System.out.println("현재 속도: "+this.speed);
	}

	public boolean isStop() { //boolean은 get을 is로 
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
		System.out.println("현재 속도: "+this.speed);
	}
}
