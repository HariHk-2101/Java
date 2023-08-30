package Video_Task_Encaps;

public class Student {

	private int student_id;
	private String name;
	private char grade;
	
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public char addGrade(char grade)
	{
		this.grade=grade;	
		return this.grade;
	}
}
