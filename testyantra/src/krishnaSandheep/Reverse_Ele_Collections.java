package krishnaSandheep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse_Ele_Collections {

	public static void main(String[] args) {
		
		List<Integer> li =new ArrayList<>();
		
		li.add(1);
		li.add(2);
		li.add(3);
		
		System.out.println("Before Reverse "+li);
		
		Collections.reverse(li);
		
		System.out.println("After Reverse "+li);
				
	}
}
