package controller;
import controller.FileManager;
import controller.AppManagement;

public class test {
	public static void main(String[] arg) {
		
		FileManager Filemanager = new FileManager();
		
		Filemanager.ReadFileForPassword("ramosn", "32");
		Filemanager.UserExists("ramon");
		
		String cadena = "mi";
		System.out.println(cadena);
		
		cadena = Filemanager.EncriptInput(cadena);
		
		System.out.println(cadena);
		
		cadena = Filemanager.DecriptInput(cadena);
		System.out.println(cadena);
		
		
		String newUser = "ramosn";
		String newpsw = "32";
		
		Filemanager.SaveUserToFile(newUser, newpsw);
		
	}
}
