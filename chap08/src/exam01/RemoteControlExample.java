package exam01;

public class RemoteControlExample {
	public static void main(String[] args) {
		//익명 구현 클래스(일회성) 생성 및 익명 구현 객체 생성
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("일회용 전원 on");
			}

			@Override
			public void turnOff() {
				System.out.println("일회용 전원 off");
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("볼륨 조절");
			}
		}; //세미콜론 필수
		rc.setMute(true);
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(10);
	}
}
