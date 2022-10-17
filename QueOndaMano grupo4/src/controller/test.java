package controller;
import controller.FileManager;
import controller.AppManagement;

public class test {
	public static void main(String[] arg) {
		
		FileManager Filemanager = new FileManager();
		
		Filemanager.ReadFileForPassword("ramon", "234");
		
		String cadena = "12mari";
		System.out.println(cadena);
		
		cadena = Filemanager.EncriptInput(cadena);
		
		System.out.println(cadena);
		
		cadena = Filemanager.DecriptInput(cadena);
		System.out.println(cadena);
		
		
	}
}
