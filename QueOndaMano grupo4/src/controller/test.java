package controller;
import controller.FileManager;
import model.ImagePost;
import model.NUser;
import model.Post;
import model.TxtPost;
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


		
		System.out.println(mylist.toString());
		
		Filemanager.SaveAllUsersToFile(mylist);
		
		ArrayList<User> TestArrayList = Filemanager.getUsersFromFile();
		
		for (User user : TestArrayList) {
			System.out.println(user.getUserPosts());
		}
	}
}
