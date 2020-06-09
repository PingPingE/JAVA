package ex01;
import java.sql.Date;

//데이터 관리 클래스(직접적)
public class Exam {
	public Subject sub ;
	
	public Exam()
	{
		sub = new Subject();
	}
	public int getMath() {
		return sub.getMath();
	}
	public void setMath(int math) {
		if (math < 0 || 100 <math)
			System.out.println("0~100까지의 범위만 입력이 가능합니다.");
		sub.setMath(math);
	}
	public int getCom() {
		return sub.getCom();
	}
	public void setCom(int com) {
		if (com < 0 || 100 <com)	
			System.out.println("0~100까지의 범위만 입력이 가능합니다.");
		sub.setCom(com);
	}
	public int getEng() {
		return sub.getEng();
	}
	public void setEng(int eng) {
		if (eng < 0 || 100 <eng)	
			System.out.println("0~100까지의 범위만 입력이 가능합니다.");
		sub.setEng(eng);
	}
	public int getKor() {
		return sub.getKor();
	}
	public void setKor(int kor) {
		if (kor < 0 || 100 <kor)	
			System.out.println("0~100까지의 범위만 입력이 가능합니다.");
		sub.setKor(kor);
	}
	public int getTotal() {
		return sub.getEng()+sub.getCom()+sub.getKor()+sub.getMath();
	}
	public float getAvg() {
		return getTotal()/3.0f;
	}	

}
