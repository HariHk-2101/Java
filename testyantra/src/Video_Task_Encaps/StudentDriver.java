package Video_Task_Encaps;

public class StudentDriver {

	public static void main(String[] args) {
		Student s1 = new Student();

		s1.setName("Hk");
		s1.setStudent_id(137);

		System.out.println("Student Name : " + s1.getName() + "\nStudent ID : " + s1.getStudent_id());
		
		char ch=s1.addGrade('A');
		
		if(ch>='A'&&ch<='F')
		{
			System.out.println("Student Grade : "+ch);
		}
		else
		{
			System.out.println("Grade Is Invalid...");
		}
	}

}
