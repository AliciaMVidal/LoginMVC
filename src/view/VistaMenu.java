package view;

import java.util.Scanner;

import modelo.UsuarioDAOFichero;

public class VistaMenu {

	public static int mostrar() {
		int opcion;
		//TODO: menú de login
		System.out.println("1 - Login");
		System.out.println("2 - Dar de alta");
		Scanner teclado = new Scanner(System.in);
		opcion = teclado.nextInt();
		//1. Logar
		opcion = 1;
		//2. Dar de alta
		
		//TODO: se captura la opción que introduce el usuario
		
		return opcion;
	}
}
