package exam01;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.setObject("홍길동");
		String name = (String) box.getObject();
		Apple apple = new Apple();
		box.setObject(apple);
		Apple a = (Apple) box.getObject();
		
	}
}
