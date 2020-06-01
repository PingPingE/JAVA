package exam01;
//부모클래스
public class CellPhone {
	String model;
	String color;
	void powerOn()
	{
		System.out.println("전원 ON");
	}
	public CellPhone() {
		System.out.println("CellPhone의 생성자입니다.");
	}
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println(model+" "+ color);
	}
}
