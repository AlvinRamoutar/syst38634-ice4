package TestDrivenDev;

public class PrimeNo {
	
	public static boolean checkPrime(int n) { 
	int i,m=0; //,flag=0;  //flag = 0 means by default its prime    
	boolean flag = true;
	  m=n/2;  
	  
	  if(n==0||n==1){  
	  
		flag =false; 		// not prime number
		  
	  }
	  
	  else{  
	   for(i=2;i<=m;i++){      
	    if(n%i==0){      
	         
	    	flag=false;   // not prime number
	    	break;	          
	    }      
	   }      
	   
	  
	  }//end of else  
	  
	  
	 return flag;

	
} // end of method
	
	public static boolean checkEven(int i) {
		if(i%2==0) return true;
		else
			return false;
	}

	// Checks odd numbers
	public static boolean checkOdd(int i) {
		if(i%2!=0) return true;
		else
			return false;
	}
	
	// Checks if supplied object is of type integer
	public static <T> boolean isNumber(T number) {
		try {
			Integer.parseInt(number.toString());
			return true;
		} catch(Exception e) {
			return false;
		}
	}
}
