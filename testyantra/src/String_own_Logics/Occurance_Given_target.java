package String_own_Logics;

public class Occurance_Given_target {

	public static void main(String[] args) {
		
		String s="java";
		
		char target='j';
		
		int count=0;
		
		boolean flag=false;
		for (int i = 0; i < s.length(); i++) {
			
			if(target==s.charAt(i))
			{
				count++;
			   flag=true;
			}
		}
		
		
		if(flag==true)
		System.out.println(target+" = "+count);
		else
		System.out.println(target+" Char is Not Found");
	}
}
