package ex01;

public class ExamList{
	int current;
	Exam exams[];
	
	public ExamList(int current, Exam[] exams) {
		super();
		this.current = current;
		this.exams = exams;
	}
	public void setExams(Exam target) {
		this.exams[current] = target;
	}
}
