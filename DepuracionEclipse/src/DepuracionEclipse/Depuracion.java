package DepuracionEclipse;

import java.util.Scanner;

public class Depuracion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int numeroLeido;
		
		for(int i = 0; i < 5 ; i++) {
			System.out.println("Introduce un n�mero: ");
			numeroLeido = input.nextInt();
			
			if(esPar(numeroLeido)) {
				System.out.println("El n�mero le�do es par" + numeroLeido);
			}else {
				System.out.println("El n�mero le�do es impar" + numeroLeido);
			}
			
		}
		
		System.out.println("El programa ha terminado.");
		
		input.close();
		
	}
	static boolean esPar(int numero){
		System.out.println("Voy a evaluar el n�mero");
		if(numero % 2 == 0) {
			return true;
		}
		return false;
	}

}
