package Video_Task_Encaps;

public class Person_Driver {

	public static void main(String[] args) {
		
		Person p1=new Person();
		
		p1.setAge(23);
		p1.setName("HK");
		p1.setCountry("India");
		
		int age=p1.getAge();
		if(age>=1&&age<=100) {
		System.out.println("Person name : "+p1.getName()+"\nPerson Age : "+p1.getAge()+"\nPerson Country : "+p1.getCountry());
		}
		else
		{
			System.out.println("Age Is Invalid...");
		}
	}
}
