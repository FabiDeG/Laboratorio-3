package controller;

import java.io.File;

public class FileManager {

	/**
	 * Variables para poder buscar informacion en el codigo de forma mas sencilla
	 */
	private static final int USER_NAME = 0;
	private static final int USER_PASSWORD = 1;
	/**
	 * Controlador de archivos para poder leer, escribir y encriptar los mismos
	 */
	
	/**
	 * Verifica si una contrasenia esta en el archivo de usuarios
	 * @param user
	 * @param pasword
	 * @param usersFile
	 * @return regresa si se encontro una conicidencia entre un usuario
	 * y la contrasenia ingresada
	 */
	public boolean ReadFileForPassword(String user, String pasword, File usersFile){
		return false;

	}
	
	/**
	 * Guardar nuevo usario en el archivo de usuarios
	 * @param user
	 * @param pswrd
	 * @param usersfile
	 */
	public void SaveUserToFile(String user, String pswrd, File usersfile) {
		
	}
	
	/**
	 * Encriptar una cadena de texto recibida
	 * @param textToEncript
	 * @return text encriptado
	 */
	public String EncriptInput(String textToEncript) {
		return textToEncript;	
	}
	
	/**
	 * Desencriptaruna cadena de text recibida
	 * @param textToDecript
	 * @return texto desencriptado
	 */
	public String DecriptInput(String textToDecript) {
		return textToDecript;	
	}

}
