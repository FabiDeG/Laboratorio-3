package controller;
import controller.FileManager;
import model.Post;
import model.User;

import java.util.ArrayList;

import controller.AppManagement;

public class test {
	public static void main(String[] arg) {
		
		FileManager Filemanager = new FileManager();
		
		Filemanager.ReadFileForPassword("ramosn", "10");
		Filemanager.UserExists("ramon");
		
		String name = "hola";
		String psw = "hola";
		
		
		ArrayList<User> mylist = new ArrayList<User>();
		Filemanager.SaveUserToFile(name, psw);
		Filemanager.setAllUsersFromFile(mylist);
		
		System.out.println(mylist.get(4).getUsername());
		
		
	}
}
