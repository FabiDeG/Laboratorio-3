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
		
		
		
		
		ArrayList<User> TestArrayList = Filemanager.getUsersFromFile();
		for (User user : TestArrayList) {
			
			System.out.println(user.getUsername());
			System.out.println(user.getUserPosts());
			
			for(Post post :user.getUserPosts()) {
				System.out.println("Si");
				for(String hashtag : post.getHashtags()) {
					System.out.println(hashtag);
				}
				
			}
			
		}
		
		
		String StringOfhash= "#hola#ca   gava.io,cmara#pedro#a#lo#mi# #";
		ImagePost newpost = new ImagePost("Prueba", "si", "sino", "sisi", 30);
		
		
		
		
	}
	
	
}
