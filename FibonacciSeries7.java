
public class FibonacciSeries7 {

	public static void main(String[] args) {
		int n=8,f=0,s=1,t,i;
		System.out.println("Fibonacci Series:");
		System.out.println(f);
		System.out.println(s);
		for(i=2;i<n;i++)
		{
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
		}

	}

}
