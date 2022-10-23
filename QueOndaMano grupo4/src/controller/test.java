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
		
		ArrayList<User> Fix = new ArrayList<User>();
		Filemanager.setAllUsersFromFile(Fix);
		Filemanager.SaveAllUsersToFile(Fix);
		
		ArrayList<User> TestArrayList = Filemanager.getUsersFromFile();
		for (User user : TestArrayList) {
			
			for(Post post :user.getUserPosts()) {
				
				for(String hashtag : post.getHashtags()) {
					System.out.println(hashtag);
				}
				
			}
			System.out.println(user.getUserPosts());
		}
		
		
		String StringOfhash= "#hola#ca   gava.io,cmara#pedro#a#lo#mi# #";
		ImagePost newpost = new ImagePost("Prueba", "si", "sino", "sisi", 30);
		
		SetHashtagsFromString(StringOfhash, newpost);
		
		
	}
	
	/**
	 * A method that receives a string and saves all the hastags present in it to a post
	 * @param StringOfHash
	 * @param CreatedPost
	 */
	public static void SetHashtagsFromString(String StringOfHash, Post CreatedPost) {
		
		//Array that will store all the hashtags, splitted by the methodspli
		String[] splitted = StringOfHash.split("#");
		
		//The split method saves blank and " " spaces, so the condition makes it so this values 
		//are not saved as hashtags
		for(int i = 0 ; i < splitted.length; i++) {
			
			//
			if(!splitted[i].equals("") && !splitted[i].equals(" ")) {
				//Saving the splited value, adding the #, and then adding it to de listo of hashtags 
				//of the given post
				String hash = "#" + splitted[i];
				CreatedPost.getHashtags().add(hash);
			
			}
			
			
		}
		
	}
}
