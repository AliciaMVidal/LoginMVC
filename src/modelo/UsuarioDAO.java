package modelo;

import controller.Login;

public class UsuarioDAO {

	public static boolean usuarioLogado(Usuario u) {
		boolean resultado = false;
		//TODO: comprobar que el usuaro existe y la clave es correcta (se valida contra los valores de las constantes):
		String user = u.getUser();
		String passw = u.getPass();
	
		if(user.equals(Login.USER)) {
			
			if(passw.equals(Login.PASS)) {
				 return resultado = true;
			}
		}
		
		//TODO: 1_ el usuario existe -> comprobar contraseña
		//TODO: 1_1_ si la contraseña es correcta -> resultado = true;
		//TODO: 1_2_ si la contraseña no es correcta -> resultado = false;
		//TODO: 2_ el usuario no existe -> resultado = false; (ya está con este valor por defecto)
		return resultado;
	}


}
