package primeiro_desafio;

import java.util.Scanner;

public class Colchao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, H, L;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		H = sc.nextInt();
		L = sc.nextInt();
		
		sc.close();
		
		if ((A <= H && B <= L) || 
			(B <= H && A <= L) ||
			(A <= H && C <= L) ||
			(C <= H && A <= L) ||
			(B <= H && C <= L) ||
			(B <= H && C <= L)) 
			System.out.println("S");
		else System.out.println("N");

	}

}
