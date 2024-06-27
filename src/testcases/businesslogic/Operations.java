package testcases.businesslogic;

public class Operations {

	public static int add(int a, int b) {
		
		return a+b;
	}
	
	public static long getFactorial(int n) {
		int f=1;
		if(n<0) {
			return -1;
		}
		for(int i=1;i<=n;i++) {
			f=f*i;
			
		}
		return f;
	}
	
	public static boolean isPrime(int n) {
		int n1=n;
		for(int i=2;i<n;i++) {
			if(n1<0 || n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPalindrome(int n) {
		
		int n1 = n, rev = 0;
		while(n!=0) {
			
			rev= rev*10 + n%10;
			n = n/10;
		}
		
		return n1 == rev;
	}
	
	
}