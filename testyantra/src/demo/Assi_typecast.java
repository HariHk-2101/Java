package demo;

public class Assi_typecast {

	public static void main(String[] args) {
		
		double d=10.325;
		int i=(int)d;
		System.out.println("double to int :"+i);
		
		int i1=68;
		char ch=(char)i1;
		System.out.println("int to char :"+ch);
		
		char ch1='Z';
		int i2=ch1;
		System.out.println("char to int :"+i2);
		
		int amount =500;
		double cost =13.5;
		int calculate = (int)(amount/cost);
		System.out.println("result :"+calculate);
	}
}
