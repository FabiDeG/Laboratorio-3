package controller;
import controller.FileManager;
import model.Post;
import model.User;

import java.util.ArrayList;

import controller.AppManagement;

public class test {
	public static void main(String[] arg) {
		
		FileManager Filemanager = new FileManager();
		
		Filemanager.ReadFileForPassword("ramosn", "32");
		Filemanager.UserExists("ramon");
		
		ArrayList<User> mylist = new ArrayList<User>();
		Filemanager.setAllUsersFromFile(mylist);
		
		System.out.println(mylist.get(0).getUsername());
		
	}
}
