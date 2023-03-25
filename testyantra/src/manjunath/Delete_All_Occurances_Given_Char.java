package manjunath;

public class Delete_All_Occurances_Given_Char {

	public static void main(String[] args) {
		String s="testyantra";
		char ch[]=s.toCharArray();
		
		int size=s.length();
		char c='t';
		
		int i=0;
		String res="";
		
		while(i!=size)
		{
			if(ch[i] !=c)
			{
				res=res + ch[i];
			}
			++i;
		}
		System.out.println(res);
	}
}
