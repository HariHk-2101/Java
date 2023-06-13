package Manasa_mam;

public class Roman_to_Integer_13 {

	
	
	public static void main(String[] args) {
		
		Roman_to_Integer_13 r=new Roman_to_Integer_13();
		
		System.out.println(r.romanToInt("XVI"));
		
		
	}
	 public int romanToInt(String s) {
	        
	        int res=0;
	        for(int i=0;i<s.length();i++)
	        {
	            int current=roman(s.charAt(i));

	            int next=0;

	            if(i+1<s.length())
	            {
	                next=roman(s.charAt(i+1));
	            }
	            if(current<next)
	            {
	            	res=res-current;
	            }
	            else
	            {
	            	res=res+current;
	            }

	        }
	        return res;
	        
	    }
	    public static int roman(int num)
	    {
	        switch(num)
	        {
	            case 'I':return 1;
	            case 'V':return 5;
	            case 'X':return 10;
	            case 'L':return 50;
	            case 'C':return 100;
	            case 'D':return 500;
	            case 'M':return 1000;
	            default : return 0;
	        }
	    }
}
