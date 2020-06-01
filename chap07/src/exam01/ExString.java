package exam01;

//String은 final class이므로 자식클래스를 생성할 수 없음
public class ExString{
	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		sc.speedUp();
		System.out.println(sc.speed);
		sc.stop();
		System.out.println(sc.speed);
	}

}
