package primeiro_desafio;

import java.io.IOException;
import java.util.Scanner;

public class AMudancaContinua {

	public static void main(String[] args) throws IOException {
		
		Scanner leitor = new Scanner(System.in);
    	
    	while (leitor.hasNext()) {
    		double  graus = leitor.nextDouble();
    		if (graus <= 360) {
    			
    			if (graus < 90 || graus == 360) System.out.println("Bom Dia!!");
        		else if (graus >= 90 && graus < 180) System.out.println("Boa Tarde!!");
        		else if (graus >= 180 && graus < 270) System.out.println("Boa Noite!!");
        		else if (graus >= 270 && graus < 360) System.out.println("De Madrugada!!");
        		else System.out.println("Bom Dia!!");
    			
    			
    			Double horas, minutos, segundos;
    			
    			horas = (graus / 15) + 6;
    			if (horas > 23) horas -= 24;	
    			
    			minutos = (horas - horas.intValue()) * 60;
    			segundos = (minutos - minutos.intValue()) * 60;
    			
    			if (segundos > 59) {    			    
    			    segundos = (double) 0;
    			    minutos++;
    			}
    			
    			System.out.printf("%02d:%02d:%02d%n", horas.intValue(), minutos.intValue(), segundos.intValue());
    			
    		}
    		
    	}
    	
    	leitor.close();

	}
	
}
