/**
 * 
 */
package model;

/**
 *
 */
public class User {

	/**
	 * 
	 */
	public User() {
		// TODO Auto-generated constructor stub
		
	}

	/**
	 * Se declaran las varibles
	 */
	
	protected int tipo;
	public static final int NUser = 0;
	public static final int NAdmin = 1;
	protected String Username;
	protected String Password;
	protected String UserPosts;
	
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
	
	public String getUserPosts() {
		return UserPosts;
	}

	/**
	 * set Password
	 */
	public void setUserPosts(String UserPosts) {
		this.UserPosts = UserPosts;
	}
}
