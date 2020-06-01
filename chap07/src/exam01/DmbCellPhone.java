package exam01;
//CellPhone의 자식클래스
public class DmbCellPhone extends CellPhone {
	@Override
	public String toString() {
		return "DmbCellPhone [channel=" + channel + "]";
	}
	int channel;
	@Override
	void powerOn() {
		
		System.out.println("dmb!!");
		//super.powerOn(); // 생성자가 아닌 메소드는 super가 밑에 있어도 괜춘
	}
	public DmbCellPhone() {
		super("samsung", "green");//부모먼저 호출해야함 (밑에 있으면 안됨)
		System.out.println("DmbCellPhone의 생성자입니다.");
	}
	public DmbCellPhone(int channel) {
		this.channel = channel;
		System.out.println("DmbCellPhone의 channel 생성");
	}
}
