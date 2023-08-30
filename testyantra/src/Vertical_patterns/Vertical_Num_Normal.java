package Vertical_patterns;

public class Vertical_Num_Normal {
  public static void main(String[] args) {
	
	  int num=7;
	  char c='A';
	  for(int i=1;i<=num;i++)
	  {
		  for(int j=1;j<num+i;j++)
		  {
			  if(j>num-i)
			  {
				  System.out.print(i+" ");
			  }
			  else
			  {
				  System.out.print("  ");
			  }
		  }
		  System.out.println();
		  c++;
	  }
}
}
