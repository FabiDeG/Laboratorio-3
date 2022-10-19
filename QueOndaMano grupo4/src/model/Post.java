package model;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Clase padre de todos los tipos de post posibles.
 * Esta clase no puede instansiarse. Todas las clases hijas deberan de solicitar
 * Autor y la fecha de la publicacion
 * @author Ricardo Chuy
 *
 */
public abstract class Post implements Imedia{
	protected String Author; 
	protected String Date;
	protected int PostType;
	protected int Likes;
	protected ArrayList<String> Comments;
	protected ArrayList<String> Hashtags;
	
	/**
	 * 
	 * @param author Es el nombre de usuario de la persona que creo el post
	 */
	Post(String author){
		setAuthor(author);
		Comments = new ArrayList<String>();
		Hashtags = new ArrayList<String>();
		setLikes(0);
		
		Date PostDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		setDate(dateFormat.format(PostDate));
		
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
