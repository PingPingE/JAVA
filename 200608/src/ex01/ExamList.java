package ex01;

public class ExamList{
	int current= 0;
	Exam exams[] = new Exam[100000000];
	
	public ExamList() {
		super();
	}
	public void setExams(Exam target) {
		this.exams[current] = target;
	}
}
