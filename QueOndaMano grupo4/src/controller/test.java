package controller;
import controller.FileManager;
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
		
		System.out.println(mylist.get(4).getUsername());
		
		
		System.out.println("-----------------------");
		
		System.out.println("Prueba fecha");
		
		TxtPost newPost = new TxtPost("mario", "Muchos Gusto");
		
		System.out.println(newPost.getAuthor());
		System.out.println(newPost.getDate());
		System.out.println(newPost.getLikes());
		System.out.println(newPost.getPostMSG());
		System.out.println(newPost.getPostType());
		System.out.println(newPost.getComments());
		System.out.println(newPost.getHashtags());
	}
}
