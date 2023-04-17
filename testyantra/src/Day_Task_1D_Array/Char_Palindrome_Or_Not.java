package Day_Task_1D_Array;

public class Char_Palindrome_Or_Not {

	//6.  Check char array is palindrome or not
	public static void main(String[] args) {
		
		char ch[]= {'M','A','D','A','M'};
		
		int temp=0;
		int temp1=ch.length-1;
		boolean flag=true;
		while(temp<temp1)
		{
			if(ch[temp]!=ch[temp1])
			{
				flag=false;
				break;
			}
			temp++;
			temp1--;
		}
		if(flag==true)
		{
			System.out.println("Given Char Array is Palindrome");
		}
		else
		{
			System.out.println("Given Char Array is Not Palindrome");
		}
	}
}
