package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import model.NUser;



public class FileManager {

	/**
	 * Variables para poder buscar informacion en el codigo de forma mas sencilla
	 */
	private static final int USER_NAME = 0;
	private static final int USER_PASSWORD = 1;
	String Myfile = "QueOndaMano grupo4/src/documents/data.csv";
	NUser user;
	
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
	public boolean ReadFileForPassword(String user, String pasword){
		
		System.out.println("User");
		System.out.println(user);
		System.out.println(pasword);
		String line;
		
		try {
			// Reading the file and searching if there is a user 
			BufferedReader br = new BufferedReader(new FileReader(Myfile));
			while((line = br.readLine()) != null) {
				
				String[] fields = line.split(",");
				
				String UserName =  fields[USER_NAME];
				String UserPasswrd = fields[USER_PASSWORD];
				
				System.out.println(UserName);
				System.out.println(UserPasswrd);
				
				
				if(user.equals(UserName)) {
					
					System.out.println("Si");
					
					if(pasword.equals(UserPasswrd)) {
						System.out.println("Usuario encontrado");
						return true;
					}
				}
		
			}
	          br.close();
	       
			
		// Catching the exception if the file is not found or if there is an IOException.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Usuario no encontrado");
		return false;

	}
	/**
	 * Guardar nuevo usario en el archivo de usuarios
	 * @param user
	 * @param pswrd
	 * @param usersfile
	 */
	public void SaveUserToFile(String user, String pswrd) {
		
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
