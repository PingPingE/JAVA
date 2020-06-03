package exam02;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box();
		box.setT("홍길동");
		System.out.println(box.getT());
		
		Box<Integer> box1 = new Box();
		box1.setT(15);
		System.out.println(box1.getT());
	}
}
