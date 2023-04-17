package Day_Tasks_Num;

public class Ternary_Operator_3_4_5 {

	public static void main(String[] args) {
		
	
	int a=10;
	int b=20;
	int c=30;
	
	int op=(a>b&&a>c)?a:(b>c)?b:c;
	System.out.println("Using 3 Operators "+op);
	
	int a1=10;
	int b1=50;
	int c1=30;
	int d1=40;
	
	int op1=(a1>b1&&a1>c1&&a1>d1) ? a1: (b1>c1&&b1>d1) ?b1: (c1>d1) ?c1:d1;
	System.out.println("Using 4 Operators "+op1);
	
	int a2=10;
	int b2=50;
	int c2=30;
	int d2=70;
	int e2=40;
	
	int op2=(a2>b2&&a2>c2&&a2>d2&&a2>e2) ? a2: (b2>c2&&b2>d2&&b2>e2) ?b2: (c2>d2&&c2>e2) ?c2: (d2>e2) ?d2:e2;
	System.out.println("Using 4 Operators "+op2);
}
}
