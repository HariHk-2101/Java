package Manasa_mam;

public class Determine_the_Winner_of_a_Bowling_Game_2660 {

	public static void main(String[] args) {
		
		int [] player1 = {4,10,7,9};
		int [] player2 = {6,5,2,3};
		
	
		System.out.println(isWinner(player1,player2));
	}
	  public static int isWinner(int[] player1, int[] player2) {
	        
		  int sum=0;
	        for(int i=0;i<player1.length;i++)
	        {
	        	
	        	if(i>0&&player1[i-1]==10 || i>1&&player1[i-2]==10)
	        	{
	        		sum=sum+player1[i]*2;
	        	}
	        	else
	        	{
	        		sum=sum+player1[i];
	        	}
	        }
	      int sum1=0;
	        for(int i=0;i<player2.length;i++)
	        {
	        	
	        	if(i>0&&player2[i-1]==10 || i>1&&player2[i-2]==10)
	        	{
	        		sum=sum+player2[i]*2;
	        	}
	        	else
	        	{
	        		sum=sum+player2[i];
	        	}
	        }
	        
	     int res= (sum==sum1)?0:(sum>sum1)?1:2;
	     
	     return res;
	    }
}
