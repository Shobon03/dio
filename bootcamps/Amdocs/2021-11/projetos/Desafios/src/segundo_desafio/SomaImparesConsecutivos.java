package segundo_desafio;

import java.util.Scanner;

public class SomaImparesConsecutivos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    int x, y, temp, sum = 0;
	    
	    x = sc.nextInt();	
	    y = sc.nextInt();
	    
	    if (x > y) {
	    	
	    	temp = x;
	    	x = y;
	    	y = temp;
	    	
	    }
	    
	    x++;
	    while (x < y) {
	    	
	    	if (x % 2 != 0) sum += x;
	    	x++;
	    	
	    }
	    	
	    
	    System.out.println(sum);
	    
	    sc.close();

	}

}
