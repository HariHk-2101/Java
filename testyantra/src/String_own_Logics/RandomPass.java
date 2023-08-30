package String_own_Logics;

import java.util.Random;
import java.util.Scanner;

public class RandomPass {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name...");
		String name=sc.next();
		System.out.println("Enter Email...");
		String email=sc.next();
 
		String n ="0123456789";
		String spl="@#$!%^&*-";
		
		Random r = new Random();

		char[] ch = name.toCharArray();
		char[] ch1 = email.toCharArray();
		String random = "";
		int f = 0;
		int l = ch1.length - 1;
		int count = 0;
		while (f < l) {
			if (count < 8) {
				random += ch[f];
				random += ch1[l];
				random+=n.charAt(count);
				random

				f += 2;
				l -= 2;
				count++;
			}
		}

		System.out.println(random);
	}
}
