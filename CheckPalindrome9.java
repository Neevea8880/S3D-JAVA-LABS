
public class CheckPalindrome9 {

	public static void main(String[] args) {
		int num=565,var,rev=0,temp;    
		  
		  temp=num;    
		  while(num>0){    
		   var=num%10;  
		   rev=(rev*10)+var;    
		   num=num/10;    
		  }    
		  if(rev==temp)    
		   System.out.println("565 is a palindrome number ");    
		  else    
		   System.out.println("565 is not a palindrome number");    
		 
		

	}

}
