package view;

import java.util.Scanner;

import modelo.Usuario;

public class VistaFormulario {

	public static Usuario mostrar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Login");
		System.out.println("usuario");
		String user = teclado.next(); //TODO: scanner
		System.out.println("contraseña");
		String pass = teclado.next(); //TODO: scanner
		
		Usuario u = new Usuario(user, pass);
		return u;
	}
}
