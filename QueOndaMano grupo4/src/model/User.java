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
}
