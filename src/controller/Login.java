package controller;

import modelo.Usuario;
import modelo.UsuarioDAO;
import modelo.UsuarioDAOFichero;
import view.VistaFormulario;
import view.VistaMenu;
import view.VistaNoOk;
import view.VistaOk;

public class Login {
	public static final String USER = "admin";
	public static final String PASS = "admin";
	
	public static void main(String[] args) {
		
		int opcion = VistaMenu.mostrar();
		
		
		
		switch (opcion) {
		//Loguin
		case 1:
			//Constantes
			Usuario usuario = VistaFormulario.mostrar();
		//	boolean logado = UsuarioDAO.usuarioLogado(usuario);
			//Fichero
			UsuarioDAOFichero udao = new UsuarioDAOFichero();
			boolean logado = udao.leerFichero(usuario);
			
			//El usuario existe en el repositorio y la clave es correcta
			if(logado) {
				//TODO: vista OK -> mensaje apropiado
				
				VistaOk.mensaje();
			}
			//El usuario no existe en el repositorio y/o la contraseña no es correcta
			else {
				//TODO: vista NO OK -> volver al formulario y mensaje apropiado
				VistaNoOk.mensaje();
				Login.main(args);
			}
			
			break;
		//Alta
		case 2:
			//TODO: implementar el alta
			
			break;
		default:
			break;
		}
	}
	

}
