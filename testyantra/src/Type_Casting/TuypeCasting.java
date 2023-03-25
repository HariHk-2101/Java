package Type_Casting;

public class TuypeCasting {

	public static void main(String[] args) {
		
		System.out.println("======Widening======");
		
		byte b=3;
		short s=b;
		System.out.println("byte to short :"+s);
		
		short s1=45;
		int i=s1;
		System.out.println("short to int :"+i);
		
		
		int i1=23224324;
		long l=i1;
		
		System.out.println("int to long :"+l);
		
		float f=3.2f;
		double d=f;
		System.out.println("float to double :"+d);
		
		char ch='m';
		int i2=ch;
		System.out.println("char to int :"+i2);
		
		byte b3=23;
		int i7= b3;
		System.out.println(i7);
		
		byte b4=88;
		long l3=b4;
		System.out.println(l3);
		
		short s4=138;
		long l4=s4;
		System.out.println(l4);
		
		System.out.println("========Narrowing========");
		
		//Narrowing
		
		long l2= 28738382758358258l;
		int i3=(int)l2;
		
		System.out.println(i3);
		
		int i4=873589839;
		short s3=(short)i4;
		System.out.println(s3);
		
		short s6=9969;
		byte b2=(byte)s6;
		System.out.println(b2);
		
		double d1=3434.3;
		float f1=(float)d1;
		System.out.println(f1);
		
		float f3=38.47484f;
		short s5=(short)f3;
		
		System.out.println(s5);
		
		double d2=8778.77;
		int i6=(int)d2;
		System.out.println(i6);
		
		double d3=776.7;
		char ch1=(char)d3;
		System.out.println(ch1);
		
		
		

	}

}
