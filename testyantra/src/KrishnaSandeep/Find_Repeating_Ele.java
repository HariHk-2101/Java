package KrishnaSandeep;

public class Find_Repeating_Ele {

	public static void main(String[] args) {
		//Don't change inputs
		//this program only works when array ele is less than b array length
     int a[]= {1,5,1,4,5,3};
     
     int b[]=new int[a.length];
     
     for(int i=0;i<b.length;i++) {
    	 if(b[a[i]]==1) {
    		 System.out.println(a[i]);
    	 }else {
    		 b[a[i]]++;
    	 }
     }
	}

}
