
public class PrimeNum4 {

	public static void main(String[] args) {
		int a=7,temp;
		boolean prime=true;
		for(int i=2;i<=a-1;i++)
		{
	           temp=a%i;
		   if(temp==0)
		   {
		      prime=false;
		      break;
		   }
		}
		if(prime)
		   System.out.println(a + " is a Prime Number");
		else
		   System.out.println(a + " is not a Prime Number");
	}

}
