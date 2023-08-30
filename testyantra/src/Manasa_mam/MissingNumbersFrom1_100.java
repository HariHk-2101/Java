package Manasa_mam;

public class MissingNumbersFrom1_100 {

	public static void main(String[] args) {
		int ar[]= {1,3,7,6,2};
		int n[]=new int[ar.length+1];
		int i;
		for(i=0;i<=ar.length;i++) {
			n[i]=0;
		}
		
		for ( i = 0; i < ar.length; i++) {
			n[ar[i]-1]=1;
		}
		int ans=0;
		for ( i = 0; i <= ar.length; i++) {
			if(n[i]==0) {
				ans=i+1;
			}
		}
		System.out.println(ans);
	}
}
