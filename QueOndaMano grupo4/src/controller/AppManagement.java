package controller;

import java.util.ArrayList;

import model.NUser;
import model.Post;
import model.User;
import model.Video;

/**
 * Controlador logico de distintos procesos de la aplicacion
 * @author andre
 *
 */
public class AppManagement {
	
	/**
	 * Verificacion de largo texto correcto para posts
	 * @param TextInput, esta es la cadena de texto de la cual se desea evaluar el largo
	 * @return regresa verdadero si la cadena de texto es menor o igual a 20 caracteres
	 */
	public boolean CorrectTxtLength(String TextInput){
		
		if(TextInput.length() <= 20) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Metodo para eliminar posts propios de un usuario o para que un admin
	 * pueda remover los que crea necesarios
	 * @param ListOfPosts, una lista de posts que puede ser los posts de un usuario,
	 * o bien puede ser la lista de todos los posts guardados (solo el administrador tiene 
	 * acceso a este para borrar datos)
	 * @param user, el tipo de usuario que desea borrar se obtiene de esta un 
	 * variable post (si es admin puede borrar cualquier post)
	 */
	public void DeletePost(ArrayList<Post> ListOfPosts, User user, int NumberOfPostToDelete) {
		
		int userType = user.getTipo();
		String PostAuthor = ListOfPosts.get(NumberOfPostToDelete).getAuthor();
		String UserName = user.getUsername(); 
		
		try {
			
			// Si el tipo de usuario es 0, es un amin y puede borrar cualquier post
			// O bien si el nombre de usuario es el mismo del autor del post
			if(userType == 0 || PostAuthor.equals(UserName)) {
				ListOfPosts.remove(NumberOfPostToDelete);
			}
				
		} catch (Exception e) {
			System.out.println("El numero de post no corresponde a ninguno de los posts disponibles");
		}
	}
	
	/**
	 * Recibe un post cualquiera e incrementa su cantidad de likes en 1
	 * @param post
	 */
	public void LikePost(Post post) {	
		post.setLikes( post.getLikes() + 1);
	}
	
	/**
	 * Recibe un post cualquiera y agrega un comentario (cadena de texto)
	 * al ArrayList de comentarios de dicho post
	 * @param post el post al cual se le desea agregar el comentario
	 * @param Comment es el comentario que se  le quiere agregar al post
	 */
	public void CommentPost(Post post, String Comment) {
		post.getComments().add(Comment);
	}

	/**
	 * Metodo que busca a todos los posts hechos en una fecha en especifico
	 * @param date, fecha de la cual se estan buscando los posts
	 * @param posts, Lista de todos los posts disponibles
	 * @return lista de todos los posts con la fecha especificada
	 */
	public ArrayList<Post> SearchPostByDate(String date, ArrayList<Post> posts){
		
		ArrayList<Post> ListOfPostsByDate = new ArrayList<Post>();
		
		for (Post post : posts) {
			
			if(date.equals(post.getDate())) {
				ListOfPostsByDate.add(post);
			}
		}
		
		return ListOfPostsByDate;
	}
	
	/**
	 * Metodo que busca todos los posts con un hashtag especifico
	 * @param Hashtag el hastag que deben de tener los posts que se buscan
	 * @param posts lista de todos los posts disponibles
	 * @return una lista con todos los posts que contienen el hastag solicitado
	 */
	public ArrayList<Post> SearchPostByhastag(String Hashtag, ArrayList<Post> posts){
		
		//List where al posts with a matching hastag weill appear
		ArrayList<Post> ListOfPostsWithHastag = new ArrayList<Post>();
		
		// Search applies to every post
		for (Post post : posts) {
			// and the loop check every string in the array list of hastags that the post has
			for (String _HashtagInList : post.getHashtags()) {
				
				if(Hashtag.equals(_HashtagInList)) { // If the post has the hastag it is stored in the list
					ListOfPostsWithHastag.add(post);
				}
			}
				
		}
		return ListOfPostsWithHastag;
	}		
	
	/**
	 * Metodo que busca todos los posts hechos por un usuario en especifico
	 * @param user el nombre del usuario del que se buscan los posts
	 * @param posts todos los posts disponibles
	 * @return una lista con todos los posts que ha realizado un usuario
	 */
	public ArrayList<Post> SearchPostByAuthor(String user, ArrayList<Post> posts){
		
		ArrayList<Post> PostsWithSpecAuthor = new ArrayList<Post>();
		
		for (Post post : posts) {
			if(user.equals(post.getAuthor())) {
				PostsWithSpecAuthor.add(post);
			}
		}
		
		return PostsWithSpecAuthor;
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
	 * Metodo que servira para poder crear un nuevo usuario y guardarlo en la lista de usuarios
	 * @param user nuevo nombre de usuario
	 * @param Password nueva contrasenia
	 * @param ListOdAllusers todos los usuarios guardados en una lista
	 */
	public void SignIn(String user, String Password, ArrayList<User> ListOfAllusers) {
		
		FileManager signInManager = new FileManager();
		
		//If user does not exist, create new user
		if(!signInManager.UserExists(user)) {
			
			NUser NewUser = new NUser(user, Password);
			ListOfAllusers.add(NewUser);
		}
		
	}
	
	public void CreatPostFromMetaData(User PostinUser, String postLink, String PostFylePath) {
		
		
	}
}
