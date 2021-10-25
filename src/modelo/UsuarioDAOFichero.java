package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import controller.Login;

public class UsuarioDAOFichero {

	public static final String RUTA_ACCIONES = "login.txt";

	public boolean leerFichero(Usuario u) {
		boolean resultado = false;
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(RUTA_ACCIONES));
			String linea;
			String token = ":";
			while ((linea = br.readLine()) != null) {
				StringTokenizer tokens = new StringTokenizer(linea, ":");
				while (tokens.hasMoreTokens()) {
					// System.out.println(tokens.nextToken());
					if (tokens.nextToken().equals(u.getUser())) {

						if (tokens.nextToken().equals(u.getPass())) {
							return resultado = true;
						} else {
							resultado = false;
						}

					} else {
						resultado = false;
					}
					// System.out.println(linea);
				}
			}
		} catch (FileNotFoundException ex) {

		} catch (IOException ex) {

		}
		return resultado;
	}

	public static boolean usuarioLogado(Usuario u) {
		boolean resultado = false;
		// TODO: comprobar que el usuaro existe y la clave es correcta (se valida contra
		// los valores de las constantes):
		String user = u.getUser();
		String passw = u.getPass();

		if (user.equals(Login.USER)) {

			if (passw.equals(Login.PASS)) {
				return resultado = true;
			}
		}

		// TODO: 1_ el usuario existe -> comprobar contraseña
		// TODO: 1_1_ si la contraseña es correcta -> resultado = true;
		// TODO: 1_2_ si la contraseña no es correcta -> resultado = false;
		// TODO: 2_ el usuario no existe -> resultado = false; (ya está con este valor
		// por defecto)
		return resultado;
	}

}
