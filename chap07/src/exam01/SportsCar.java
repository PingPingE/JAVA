package exam01;

public class SportsCar extends Car {
	@Override
	public void speedUp() {this.speed += 10;}
	
//	@Override
//	public void stop() //final메소드이므로 오버라이딩 안됨
//	{
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
}
