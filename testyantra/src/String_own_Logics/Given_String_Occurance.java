package String_own_Logics;

public class Given_String_Occurance {
	public static void main(String[] args) {
		String s="hi hi h9 hii h9".toLowerCase();
		
		String [] s1=s.split(" ");
		
		String key="h9";
		
		int count=0;
		
		for (int i = 0; i < s1.length; i++) {
			
			if(s1[i].equals(key))
			{
				count++;
			}
		}
		if(count>0) {
		System.out.println(key+" present in "+count+ " times");
		}
		else
		{
			System.out.println(key+" Is Not Present In The Given String..");
		}
	}
}
