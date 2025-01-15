package controladores;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean esCerrado = false;
		byte opcionUsuario;
		int numero1 = 0;
		int numero2 = 0;
		int total;
		do {
		System.out.println("-------MENÚ-------");
		System.out.println("0.Cerrar Menú");
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Multiplicar");
		System.out.println("4.Dividir");
		System.out.println("----------------");
		System.out.println("Elija la opción deseada: ");
		opcionUsuario = scanner.nextByte();
		
		switch (opcionUsuario) {
		case 0: {
			System.out.println("Cerrando menú...");
			esCerrado = true;
		}
		case 1: {
			System.out.println("Introduzca el primer número: ");
			numero1 = scanner.nextInt();
			System.out.println("Introduzca el segundo número: ");
			numero2 = scanner.nextInt();
			System.out.println("Sumando...");
			total = numero1 + numero2;
			System.out.println("La suma en total es: " + total);
		}
		case 2: {
			System.out.println("Introduzca el primer número: ");
			numero1 = scanner.nextInt();
			System.out.println("Introduzca el segundo número: ");
			numero2 = scanner.nextInt();
			System.out.println("Restando...");
			total = numero1 - numero2;
			System.out.println("La suma en total es: " + total);
		}
		case 3: {
			System.out.println("Introduzca el primer número: ");
			numero1 = scanner.nextInt();
			System.out.println("Introduzca el segundo número: ");
			numero2 = scanner.nextInt();
			System.out.println("Multiplicando...");
			total = numero1 * numero2;
			System.out.println("La suma en total es: " + total);
		}
		case 4: {
			System.out.println("Introduzca el dividendo: ");
			numero1 = scanner.nextInt();
			System.out.println("Introduzca el divisor: ");
			numero2 = scanner.nextInt();
			System.out.println("Multiplicando...");
			total = numero1 / numero2;
			System.out.println("El cociente es: " + total);
		}
		default:
			System.out.println("Opción inexistente");
		}

		}while(!esCerrado);
	}

}