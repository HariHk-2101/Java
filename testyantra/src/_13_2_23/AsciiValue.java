package _13_2_23;

public class AsciiValue {

	public static void main(String[] args) {
		char ch='A';
		do
		{
			System.out.println(ch+" Ascii value is "+(int)ch);
			ch++;
		}
		while(ch<='Z');
	}
}
