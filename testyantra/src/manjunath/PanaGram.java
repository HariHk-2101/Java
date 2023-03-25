package manjunath;

public class PanaGram {

	public static void main(String[] args) {
		String x="qwertyuiopasdfghjklzxcvbnm";
		x=x.toUpperCase();
	      int[] a=new int[26];
	      char[] y=x.toCharArray();
	      
	      int i=0;
	      while(i!=y.length) {
	    	  int index=y[i]-65;
	    	  a[index]=1;
	    	  ++i;  
	      }
	      i=0;
	      while(i!=26) {
	    	  if(a[i]==1) {
	    		  ++i;
	    	  }else {
	    		  System.out.println("Non panagram");
	    		  System.exit(0);
	    	  }
	      }
	      System.out.println("Panagram");
	}
}
