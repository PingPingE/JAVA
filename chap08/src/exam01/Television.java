package exam01;

public class Television implements RemoteControl, Searchable{

	int volume;
	@Override
	public void turnOn() {
		System.out.println("전원 ON");
	}

	@Override
	public void turnOff() {
		System.out.println("전원 OFF");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public void search(String url) {
		System.out.println(url);
	}
	
}
