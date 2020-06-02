package exam01;

public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//해당 메소드를 받아가서 커스터마이징
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	// 나중에 새로운 기능을 추가할때 용이(위 처럼 추상메소드로 선언하면 이미 받아서 활용하고 있는 클래스들이 오류나니까)
	default void setMute(boolean mute)
	{
		if(mute)
		{
			System.out.println("무음 처리");
		}
		else
		{
			System.out.println("무음 해제");
		}
	}
	
	static void changeBattery()
	{
		System.out.println("건전지 교환");
	}
	
}
