package primenumbers;

import java.util.ArrayList;

public class PrimeDirective {
	

	  
	  public boolean isPrime(int number){
		    for (int i = 2; i < number; i++){
		      if (number % i == 0) { 
		      return false;
		    } else if (number < 2) {
		      return false;
		    
		    }
		    }
			return true;
		    
		  }
	  
      public ArrayList<Integer> onlyPrimes(int[] numbers) {
	       ArrayList<Integer> primes = new ArrayList<Integer>();
	      for (int number : numbers) {
	        if (isPrime(number)) {
	          primes.add(number);
	        }
	        
	      }
	      return primes;
	      }
		  
		  public static void main(String[] args) {

		  PrimeDirective pd = new PrimeDirective();
		  int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89, 1, 0, 5, 8};
		  

		    System.out.println(pd.onlyPrimes(numbers));
		  }  

		}