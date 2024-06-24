package Lab08;

public class Student extends Person{
	
	private double mark;
	private String grade;
	
	public Student(String id, String name, int age, double mark) {
		super(id, name, age);
		this.mark = mark;
	}
	
	public double getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade() {
		switch((int)this.mark) {
		case 8, 9, 10: 
			this.grade = "A";
			break;
		case 7: 
			this.grade = "B";
			break;
		case 6: 
			this.grade = "C";
			break;
		case 5:
			this.grade = "D";
			break;
		default: 
			this.grade = "tach cmnr";
			break;
		
		}
	}
	public String toString() {
		return "Student [mark=" + mark + ", grade=" + grade + "]";
	}

	
	
}
