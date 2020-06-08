package exam02;

public class Student {
	public int sno;
	public String name;
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student)
		{
			Student stu = (Student) obj;
			return stu.name.equals(name) && stu.sno == sno;
		}
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return sno+name.hashCode();
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
	
}
