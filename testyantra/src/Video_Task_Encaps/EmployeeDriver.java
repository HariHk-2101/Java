package Video_Task_Encaps;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		
		e1.setEmployee_id(137);
		e1.setEmployee_name("Hk");
	    
		
		System.out.println("Employee id : "+e1.getEmployee_id()+"\nEmployee Name : "+e1.getEmployee_name()+"\n"+e1.getSalary());
		
	}
}
