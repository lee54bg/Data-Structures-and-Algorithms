package ProgrammingQuestions;

public class ConsecutivePrime {
	
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// Display all the numbers starting from 0 to 1,000,000
		/*for(int i = 0; i <= 1000000; i++)
			if(isPrime(i))
				System.out.println(i);*/
		
		int counter		= 0;
		long sum		= 0;
		int maxLength	= 0;
		
		for(int i = 2; i < 1000000; i++) {
			if(isPrime(i)) {
				sum += i;
				counter++;
			}
			
			if(isPrime(sum)) {
				if(maxLength < counter)
					System.out.println("Sum: "
							+ sum + ""
							+ ", Counter: "
							+ counter);
			}
		}
			
			
	}
	
	public static boolean isPrime(long sum) {
	    if(sum == 2)
	    	return true;
		if (sum % 2 == 0)
	    	return false;
	    for(int i = 3; i * i <= sum ; i += 2) {
	        if(sum % i == 0)
	            return false;
	    }
	    return true;
	}
}

