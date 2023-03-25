package manjunath;

public class UpperToLower {
	public static void main(String[] args) {
		String s1="testyantra";
		String s2="TEST";
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
       int size=a.length;
	   int size1=b.length;
    	int i=0;
    	int j=0;
		while(i!=size) {
			if(a[i]!=' ') {
			  a[i]=(char)(a[i]-32);
			}
			++i;
		}
		System.out.println(a);
	
		while(j!=size1) {
			if(b[j]!=' ') {
			  b[j]=(char)(b[j]+32);
			}
			++j;
		}
		System.out.println(b);
		}
}
