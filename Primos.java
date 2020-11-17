package Primos;

import java.util.Random;
import java.util.Scanner;

public class Primos {
	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		System.out.println(" 88888888888888888888888888888888888888888 ");
		System.out.println(" -  ___________________________________  +");
		System.out.println(" + | AUTOR:ANDRES FELIPE BOTINA        | -");
		System.out.println(" - |         FECHA: 16-noviembre-2020    | +");
		System.out.println(" + |       PROGRAMA DE ING. INDUSTRIAL | -");
		System.out.println(" - |              ID:  760728          | +");
		System.out.println(" + |___________________________________| -");
		System.out.println(" 88888888888888888888888888888888888888888");

		boolean condicion = false; 

		do { 

			Random random = new Random(); 

			int intRandom = random.nextInt(1000); 

			condicion = true;

			int contador, i, numero; 

			numero = intRandom; 

			contador = 0; 

			for (i = 1; i <= numero; i++) 
			{
				if ((numero % i) == 0) 
				{
					contador++;
				}
			}

			if (contador <= 2)
				condicion = false; 

			System.out.println("numero : " + intRandom + " finalizara cuando sea primo ");

		} while (condicion); 

	}
}
