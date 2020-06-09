package ex01;
import java.util.*;

//데이터 관리 클래스(간접적)
public class ExamList {
	private int current;
	private Exam exams[];
	Scanner scan = new Scanner(System.in);

	public ExamList(int current, Exam[] exams) {
		super();
		this.current = current;
		this.exams = exams;
	}
	
	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public void setExam(Exam exams) {
		this.exams[current] = exams;
	}
	
	public Exam getExam(int i)
	{
		return exams[i];
	}
	
	public ExamList()
	{
		this(0, new Exam[3]);
	}

	public void add()
	{
		current++;
		if(exams.length >= current) {
			Exam[] temp = new Exam[current + 3];
			for(int i=0; i<current; i++) {
				temp[i] = exams[i];
			}
			exams = temp;
		}
	}
}
