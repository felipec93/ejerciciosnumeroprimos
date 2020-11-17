package Primos;

import java.util.Random;
import java.util.Scanner;

public class Primosejercicio {
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
	
		
		int contador, i, numero;
		
		System.out.print("Ingrese el numero");
		numero =  leer.nextInt();
		
		contador = 0;
	
		for (i=1; i<=numero; i++)
		{
			if((numero % i)== 0)
			{
				contador++;
			}
		}
		
		if (contador <=2)
		{
			System.out.println("El numero es primo" + numero);
		}else
		{
			System.out.println("NO ES primo" + numero);
		}
	
	
	
	
}
}
