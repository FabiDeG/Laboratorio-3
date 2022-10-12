package model;

import java.util.ArrayList;

/**
 * Clase padre de todos los tipos de post posibles.
 * Esta clase no puede instansiarse. Todas las clases hijas deberan de solicitar
 * Autor y la fecha de la publicacion
 * @author Ricardo Chuy
 *
 */
public abstract class Post {
	protected String Author; 
	protected String Date;
	protected int PostType;
	protected int Likes;
	protected ArrayList<String> Comments;
	protected ArrayList<String> Hashtags;
	
	/**
	 * 
	 * @param author Es el nombre de usuario de la persona que creo el post
	 * @param date Es la fecha de cuando se creo el post
	 */
	Post(String author, String date){
		setAuthor(author);
		setDate(date);
		Comments = new ArrayList<String>();
		Hashtags = new ArrayList<String>();
		setLikes(0);
	}


	public String getAuthor() {
		return Author;
	}


	public void setAuthor(String author) {
		Author = author;
	}


	public String getDate() {
		return Date;
	}


	public void setDate(String date) {
		Date = date;
	}


	public int getPostType() {
		return PostType;
	}


	public void setPostType(int postType) {
		PostType = postType;
	}


	public int getLikes() {
		return Likes;
	}


	public void setLikes(int likes) {
		Likes = likes;
	}


	public ArrayList<String> getComments() {
		return Comments;
	}


	public void setComments(ArrayList<String> comments) {
		Comments = comments;
	}


	public ArrayList<String> getHashtags() {
		return Hashtags;
	}


	public void setHashtags(ArrayList<String> hashtags) {
		Hashtags = hashtags;
	}
	
	
}
