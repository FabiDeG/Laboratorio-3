package controller;
import controller.FileManager;
import controller.AppManagement;

public class test {
	public static void main(String[] arg) {
		
		FileManager Filemanager = new FileManager();
		
		Filemanager.ReadFileForPassword("ramosn", "32");
		Filemanager.UserExists("ramon");
		
	}
}
