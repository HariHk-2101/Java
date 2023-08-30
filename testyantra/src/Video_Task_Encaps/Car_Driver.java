package Video_Task_Encaps;

public class Car_Driver {

	public static void main(String[] args) {
		
		Car c1=new Car();
		
		c1.setCompany_name("BMW");
		c1.setModel_name("bm123w");
		c1.setYear(2023);
		
		
		
		int mil=c1.getMileage();
		
		if(mil>=10&&mil<=25)
		{
			System.out.println("CarCompany :"+c1.getCompany_name()+
					 "\nCarModelName : "+c1.getModel_name()+
					 "\nCar Year : "+c1.getYear());
			System.out.println("Car Mileage : "+mil);
		}
		else
		{
			System.out.println("Car Mileage Is Not Matched...");
		}
						 
	}
}
