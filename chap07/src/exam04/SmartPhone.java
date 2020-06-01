package exam04;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	//자식클래스들은 똑같은 메소드 이름으로 각자의 기능을 구현할 수 있다. 이것이 추상화의 장점
	@Override
	public void bellOn() {
	
	}
	
}
