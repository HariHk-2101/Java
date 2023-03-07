package _04_03_23;



public class Test {

	public static void main(String[] args) {
		
		Strong();
	}
	
	
	public static void Strong() {
		
	int num=145;
	
	int sum=0;
	
	int temp=num;
	
	while(num>0)
	{
		int rem=num%10;
		
		int prod=1;
		for (int i = 1; i <=rem; i++)
		{
			prod*=i;
		}	
		
			sum+=prod;
			
			num/=10;
		
	}
	
	if(sum==temp)
	{
		System.out.println("strong");
	}
	else
	{
		System.out.println("Not A strong");
	}
		
	}
}
