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
		
		AppManagement manage = new AppManagement();
		NUser newuser = new NUser("ramon", "212");
		ImagePost mo = manage.CreateImagePostFromMetaData(newuser, "wwww.paraos", "C:/Users/andre/Desktop/BRUJULA POLÍTICA.PNG");
		System.out.println(mo.getAuthor());
		System.out.println(mo.getLink());
		System.out.println(mo.getDate());
		System.out.println(mo.getProgramSize());
		System.out.println(mo.getFormat());
		System.out.println(mo.getResolution());
		System.out.println(mo.getResolution());
	
	}
}
