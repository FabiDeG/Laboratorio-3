/**
 * 
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 */
public abstract class User implements Serializable{

	/**
	 * Se declaran las varibles
	 */
	
	protected int tipo;
	public static final int NUser = 0;
	public static final int NAdmin = 1;
	protected String Username;
	protected String Password;
	protected ArrayList<Post> UserPosts;
	
	/**
	 * 
	 */
	public User(String Username, String Password) {
		UserPosts = new ArrayList<Post>();
		setUsername(Username);
		setPassword(Password);
		
	}
	
	/**
	 * get tipo
	 */
	
	public int getTipo() {
		return tipo;
	}

	/**
	 * set tipo
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	/**
	 * get Username
	 */
	
	public String getUsername() {
		return Username;
	}

	/**
	 * set Username
	 */
	public void setUsername(String Username) {
		this.Username = Username;
	}
	
	/**
	 * get Password
	 */
	
	public String getPassword() {
		return Password;
	}

	/**
	 * set Password
	 */
	public void setPassword(String Password) {
		this.Password = Password;
	}

	/**
	 * get UserPosts
	 */
	public ArrayList<Post> getUserPosts() {
		return UserPosts;
	}

	/**
	 * set UserPosts
	 */
	public void setUserPosts(ArrayList<Post> userPosts) {
		UserPosts = userPosts;
	}
	
	
	

}
