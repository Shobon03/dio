package segundo_desafio;

import java.util.Scanner;

public class FibonacciRapido {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    int n = sc.nextInt();
	    double sqrt5 = Math.sqrt(5), sum, sub;
	    
	    if (n > 0 && n <= 50) {
	    
	      sum = Math.pow(((1 + sqrt5) / 2), n);
	      sub = Math.pow(((1 - sqrt5) / 2), n);
	      
	      System.out.printf("%.1f", (sum - sub) / sqrt5);
	    
	    }
	    
	    sc.close();
		
			
	}

}
