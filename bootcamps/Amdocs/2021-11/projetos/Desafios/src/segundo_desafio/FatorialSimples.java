package segundo_desafio;

import java.util.Scanner;

public class FatorialSimples {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		  
		int N = 0, fat = 1;
  
		N = sc.nextInt();
		for (int i = N; i > 1; i--) fat *= i;
		
		System.out.println(fat);
		
		sc.close();

	}

}
