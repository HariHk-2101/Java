package String_own_Logics;

import java.util.Arrays;

public class Frequency_Of_Words {

	public static void main(String[] args) {

		String s = "Hello hello hello Hello Hello java java java java  hii hii jii joih".toLowerCase();

		String s1[] = s.split(" ");

		for (int i = 0; i < s1.length; i++) 
		{
				int count=1;
			for (int j = i+1; j < s1.length; j++) {

				if (s1[i].equals(s1[j])) {
					count++;
					s1[j] = "";
				}
			}
			if(count>0&&s1[i]!="")
			{
				System.out.println(s1[i]+" = "+count);
			}

		}
		
	}
}
