
public class CheckArmstrong10 {

	public static void main(String[] args) {
		int num=153,var,rev=0,temp;    
		  
		  temp=num;    
		  while(num>0){    
		   var=num%10;  
		   rev=rev+(var*var*var);    
		   num=num/10;    
		  }    
		  if(rev==temp)    
		   System.out.println("153 is an armstrong number ");    
		  else    
		   System.out.println("153 is not an armstrong number"); 
	}

}
