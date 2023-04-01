package KrishnaSandeep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Del_Ele_using_Collection {

	public static void main(String[] args) {
       String[] s= {"Red","Green","Blue"};
       
      List<String>sl=new ArrayList(Arrays.asList(s));
      
        sl.remove("Red");
      
      System.out.println(sl); 
	}
}
