
public class FactorialNum8 {

	public static void main(String[] args) {
		int n=6,i,j;
		for(i=1;i<=n;i++)
		{
			int fact=1;
			for(j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			System.out.println("Factorial of " + (i) + "= " + (fact));
		}

	}

}
