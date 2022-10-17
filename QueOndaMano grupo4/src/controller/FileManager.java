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
	
	/**
	 * Controlador de archivos para poder leer, escribir y encriptar los mismos
	 */
	
	/**
	 * MEthod that searchs if a user name exists
	 * @param user name
	 * @return true if the user name is found on the data.csv file
	 */
	public boolean UserExists(String user) {
		
		String line;
		
		try {
			// Reading the file and searching if there is a user 
			BufferedReader br = new BufferedReader(new FileReader(Myfile));
			while((line = br.readLine()) != null) {
				
				String[] fields = line.split(",");
				
				String UserName =  fields[USER_NAME];
				
				if(user.equals(UserName)) {
					return true;
		
				}
			}
	          br.close();
	       
			
		// Catching the exception if the file is not found or if there is an IOException.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//User does not exist or password was incorrect
		
		return false;
	}
	
	/**
	 * Verifica si una contrasenia esta en el archivo de usuarios
	 * @param user
	 * @param pasword
	 * @return regresa si se encontro una conicidencia entre un usuario
	 * y la contrasenia ingresada
	 */
	public boolean ReadFileForPassword(String user, String pasword){
		
		String line;
		
		try {
			// Reading the file and searching if there is a user 
			BufferedReader br = new BufferedReader(new FileReader(Myfile));
			while((line = br.readLine()) != null) {
				
				String[] fields = line.split(",");
				
				String UserPasswrd = fields[USER_PASSWORD];
				
				//Checking de current line for matching user name
				if(UserExists(user)) {
					
					// If there is a matching password with its user name then the user exists
					// All paswords in the file ar ciphered, so the decripter is necesarry to check the password
					if(pasword.equals(DecriptInput(UserPasswrd))) {
						System.out.println("Concidencia");
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
		
		//User does not exist or password was incorrect
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
		
		char[] alphabet = {	'a', 'b', 'c', 'd', 'e', 
				'f', 'g', 'h', 'i', 'j',
				'k', 'l', 'm', 'n',
				'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x',
				'y', 'z', 'A', 'B', 'C',
				'D', 'E', 'F', 'G', 'H',
				'I', 'J', 'K', 'L', 'M',
				'N', 'Ñ', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V',
				'W', 'W', 'Z', '0', '1',
				'2', '3', '4', '5', '6',
				'7', '8', '9'};
		
		int[] indexesOfText = new int[textToEncript.length()];
		
		// turning the string into a chain of numberes that represent their position int the alphabet
		for (int i = 0; i < textToEncript.length(); i++) {
			char aCharIntoText = textToEncript.charAt(i);
			
			for (int j = 0; j < alphabet.length; j++) { //Search the char in the alphabet to get it index
				
				if (aCharIntoText == alphabet[j]) { // Compare the char with all the elements in the alphabet
					indexesOfText[i] = j; //If found then save the index into the numeric array
					break; //short circuit the for loop 
				}
			}
			
		}	
		
		//Modify de list of numeric values adding 3 to the position
		
		for (int k = 0; k < indexesOfText.length; k++) {
			indexesOfText[k] = ((indexesOfText[k] + 2) % alphabet.length);
			
			while (indexesOfText[k] < 0) { //prevent negative values
				indexesOfText[k] += alphabet.length;
			}
			
		}
		
		//Using the list of new numeric values, turn the list into letters based on the new alphabet position
		String NewTxt = "";
		for (int m = 0; m < indexesOfText.length; m++) {
			NewTxt = NewTxt + alphabet[indexesOfText[m] ]; //get the char according with its index
		}

		return NewTxt;	
	}
	
	/**
	 * Desencriptaruna cadena de text recibida
	 * @param textToDecript
	 * @return texto desencriptado
	 */
	public String DecriptInput(String textToDecript) {
		
		char[] alphabet = {	'a', 'b', 'c', 'd', 'e', 
				'f', 'g', 'h', 'i', 'j',
				'k', 'l', 'm', 'n',
				'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x',
				'y', 'z', 'A', 'B', 'C',
				'D', 'E', 'F', 'G', 'H',
				'I', 'J', 'K', 'L', 'M',
				'N', 'Ñ', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V',
				'W', 'W', 'Z', '0', '1',
				'2', '3', '4', '5', '6',
				'7', '8', '9'};
		
		int[] indexesOfText = new int[textToDecript.length()];
		
		// turning the string into a chain of numberes that represent their position int the alphabet
		for (int i = 0; i < textToDecript.length(); i++) {
			char aCharIntoText = textToDecript.charAt(i);
			
			for (int j = 0; j < alphabet.length; j++) { //Search the char in the alphabet to get it index
				
				if (aCharIntoText == alphabet[j]) { // Compare the char with all the elements in the alphabet
					indexesOfText[i] = j; //If found then save the index into the numeric array
					break; //short circuit the for loop 
				}
			}
			
		}	
		
		//Modify de list of numeric values adding 3 to the position
		
		for (int k = 0; k < indexesOfText.length; k++) {
			indexesOfText[k] = ((indexesOfText[k] + -2) % alphabet.length);
			
			while (indexesOfText[k] < 0) { //prevent negative values
				indexesOfText[k] += alphabet.length;
			}
			
		}
		
		//Using the list of new numeric values, turn the list into letters based on the new alphabet position
		String NewTxt = "";
		for (int m = 0; m < indexesOfText.length; m++) {
			NewTxt = NewTxt + alphabet[indexesOfText[m] ]; //get the char according with its index
		}
		
		return NewTxt;	
	}

}
