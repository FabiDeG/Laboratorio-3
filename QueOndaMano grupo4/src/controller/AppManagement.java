package controller;

import java.util.ArrayList;

import model.Post;

/**
 * Controlador logico de distintos procesos de la aplicacion
 * @author andre
 *
 */
public class AppManagement {
	AppManagement(){
		
	}
	
	/**
	 * Verificacion de largo texto correcto para posts
	 * @param TextInput, esta es la cadena de texto de la cual se desea evaluar el largo
	 * @return regresa verdadero si la cadena de texto es menor o igual a 20 caracteres
	 */
	public boolean CorrectTxtLength(String TextInput){
		return true;
		
	}
	
	/**
	 * Metodo para eliminar posts propios de un usuario o para que un admin
	 * pueda remover los que crea necesarios
	 * @param ListOfPosts, una lista de posts que puede ser los posts de un usuario,
	 * o bien puede ser la lista de todos los posts guardados (solo el administrador tiene 
	 * acceso a este para borrar datos)
	 * @param userType, el tipo de usuario que desea borrar un post (si es admin puede
	 * borrar cualquier post)
	 */
	public void DeletePost(ArrayList<Post> ListOfPosts, int userType) {
		
	}
	
	/**
	 * Recibe un post cualquier e incrementa su cantidad de likes en 1
	 * @param post
	 */
	public void LikePost(Post post) {
		
	}
	
	/**
	 * Recibe un post cualquiera y agrega un comentario (cadena de texto)
	 * al ArrayList de comentarios de dicho post
	 * @param post, el post al cual se le desea agregar el comentario
	 */
	public void CommentPost(Post post) {
		
	}

	/**
	 * Metodo que busca a todos los posts hechos en una fecha en especifico
	 * @param date, fecha de la cual se estan buscando los posts
	 * @param posts, Lista de todos los posts disponibles
	 * @return lista de todos los posts con la fecha especificada
	 */
	public ArrayList<Post> SearchPostByDate(String date, ArrayList<Post> posts){
		
		return posts;
	}
	
	/**
	 * Metodo que busca todos los posts con un hashtag especifico
	 * @param Hashtag el hastag que deben de tener los posts que se buscan
	 * @param posts lista de todos los posts disponibles
	 * @return una lista con todos los posts que contienen el hastag solicitado
	 */
	public ArrayList<Post> SearchPostByhastag(String Hashtag, ArrayList<Post> posts){
		return posts;
	}
	
	/**
	 * Metodo que busca todos los posts hechos por un usuario en especifico
	 * @param user el nombre del usuario del que se buscan los posts
	 * @param posts todos los posts disponibles
	 * @return una lista con todos los posts que ha realizado un usuario
	 */
	public ArrayList<Post> SearchPostByAuthor(String user, ArrayList<Post> posts){
		return posts;
	}
	
	/**
	 * Metodo que recibe un usario y contrasenia e indica si la informacion
	 * obtenida es correta
	 * @param user nombre del usuario que desea ingresar
	 * @param Password contrasnia del usuario
	 * @return se regresa true si se logro ingresar correctamente
	 */
	public boolean LoginSuccesful(String user, String Password) {
		return true;
	}
	
	/**
	 * Metodo que servira para poder crear un nuevo usuario
	 * @param user nuevo nombre de usuario
	 * @param Password nueva contrasenia
	 */
	public void SignIn(String user, String Password) {
	}
	
	/**
	 * Metodo que busca un hastag especifico en todos los posts disponibles
	 * @param hashtag el hastag que se esta buscando
	 * @param listOfPosts lista de todos los posts
	 * @return verdadero si se encontro el hastag deseado
	 */
	public boolean HashtagExists(String hashtag, ArrayList<Post> listOfPosts) {
		return false;	
	}
}
