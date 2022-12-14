package controller;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import model.Audio;
import model.ImagePost;
import model.NAdmin;
import model.NUser;
import model.Post;
import model.User;
import model.Video;
import java.io.File;
import java.io.IOException;
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
	public ArrayList<Post> SearchPostByDate(String date, ArrayList<User> AllUsers){
		
		ArrayList<Post> ListOfPostsByDate = new ArrayList<Post>();
		
		//Searching for matvhin hashtag in each user
		for (User aUser : AllUsers) {					
			
			// Search applies to every post
			for (Post post : aUser.getUserPosts()) {
					
				if(date.equals(post.getDate())) { // If the post has the hashtag it is stored in the list
					ListOfPostsByDate.add(post);
				}
				
						
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
	public ArrayList<Post> SearchPostByhastag(String Hashtag, ArrayList<User> AllUsers){
		
		//List where al posts with a matching hastag weill appear
		ArrayList<Post> ListOfPostsWithHastag = new ArrayList<Post>();
		
		//Searching for matvhin hashtag in each user
		for (User aUser : AllUsers) {
			
			// Search applies to every post
			for (Post post : aUser.getUserPosts()) {
				
				// and the loop check every string in the array list of hastags that the post has
				for (String _HashtagInList : post.getHashtags()) {
					
					if(Hashtag.equals(_HashtagInList)) { // If the post has the hashtag it is stored in the list
						ListOfPostsWithHastag.add(post);
					}
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
	public ArrayList<Post> SearchPostByAuthor(String user, ArrayList<User> postsAllUsers){
		
		ArrayList<Post> PostsWithSpecAuthor = new ArrayList<Post>();
		
		//Looking int the users
		for (User aUser : postsAllUsers) {
			
			for (Post post : aUser.getUserPosts()) {
				
				//Looking for a matching username
				if(user.equals(post.getAuthor())) {
					PostsWithSpecAuthor.add(post);
				}
				
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
	public User LoginSuccesful(String user, String Password) {
		
		FileManager LoginManager = new FileManager();
		
		//THe name of the admin is already set, so Only if the name is the same
		//An admin account is logged in
		if(LoginManager.ReadFileForPassword(user, Password) && user.equals("ramon")) {
			
			User nUser = new NAdmin(user, Password);
			return nUser;
		}
		
		//If the user exists then login is made as a normal user
		else if(LoginManager.ReadFileForPassword(user, Password)) {
			User nUser = new NAdmin(user, Password);
			return nUser;
		}
		return null;
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
	
	/**
	 * Method that receives enough information to create a post of type Image
	 * @param PostinUser the usar that is making the post
	 * @param postLink the link were the user got the video from
	 * @param PostFylePath the fylepath necesary to analize ande get the data
	 * @return Returns a mediapost of type image 
	 */
	public ImagePost CreateImagePostFromMetaData(User PostinUser, String postLink, String PostFilePath) {
		
		ImagePost newImg = null;
		
		try {
			//Saving the post author
			String Author = PostinUser.getUsername();
			
		    // convert the file name into string to get file extension
			File file = new File(PostFilePath);
		    String fileName = file.toString();
		    String extension = "";
		    
		    int index = fileName.lastIndexOf('.');
		    if(index > 0) {
		      extension = fileName.substring(index + 1);
		    }
			
		    //Saving the size of the file in KB
			Double ImgSize = (double) (file.length() / 1000);
			
			//Getting resolution (Height times width) of the image
			BufferedImage imo;
	        imo = ImageIO.read(new File(PostFilePath));
			String resolution = (imo.getHeight()) + "X" + imo.getWidth();
			newImg = new ImagePost(Author, postLink, extension, resolution, ImgSize);
			newImg.setPostType(4);
			
			return newImg;
			
		} catch (Exception e) {
			System.out.println("No se pudo completar la tarea, puede que el archivo "
					+ "seleccionado no corresponda al tipo de archivo que se desea postear");
		}
		return newImg;
		
		
	}
	
	/**
	 * Method that receives enough information to create a post of type video
	 * @param PostinUser the usar that is making the post
	 * @param postLink the link were the user got the video from
	 * @param PostFilePath the fylepath necesary to analize ande get the data 
	 * @return Returns a mediapost of type video
	 */
	public Video CreateVideoPostFromMetaData(User PostinUser, String postLink, String PostFilePath) {
		
		Video newVideo = null;
		
		try {
			
			//Saving the post author
			String Author = PostinUser.getUsername();
			
			//Setting an arbitrary value for frame rate
			int frameRate = 60;
			
			//Getting file size 
			File file = new File(PostFilePath);
			Double ImgSize = (double) (file.length() / 1000);
			
			
			newVideo = new Video(Author, postLink, frameRate, ImgSize);
			newVideo.setPostType(5);
			return newVideo;
			
		} catch (Exception e) {
			System.out.println("No se pudo completar la tarea, puede que el archivo "
					+ "seleccionado no corresponda al tipo de archivo que se desea postear");
		}
		
		return null;
		
	}
	
	/**
	 * Method that receives enough information to create a post of type video
	 * @param PostinUser the usar that is making the post
	 * @param postLink the link were the user got the video from
	 * @param PostFylePath the fylepath necesary to analize ande get the data
	 * @return Returns a mediapost of type audio
	 */
	public Audio CreateAudioPostFromMetaData(User PostinUser, String postLink, String PostFilePath) {
		Audio newAudio = null;
		try {
			
			//Saving the post author
			String Author = PostinUser.getUsername();
			
			//Setting an arbitrary value for Sample Ratio
			int SampleRatio = 44;
			
			//Setting an arbitrary value for bitDepth
			int bitDepth = 24;
			
			//Getting file size 
			File file = new File(PostFilePath);
			Double AudioSize = (double) (file.length() / 1000);
			
			newAudio = new Audio(Author, postLink, SampleRatio, bitDepth, AudioSize);
			newAudio.setPostType(3);
			return newAudio;
			
		} catch (Exception e) {
			System.out.println("No se pudo completar la tarea, puede que el archivo "
					+ "seleccionado no corresponda al tipo de archivo que se desea postear");
		}
		
		return null;
	}
	
	/**
	 * A method that takes the current user and searchs for it in the list of al users, when a match is found
	 * the post is saved to the respective user
	 * @param AllUsers
	 * @param ActualUser
	 * @param SavingPost
	 */
	public void SavePostToUser(ArrayList<User> AllUsers, User ActualUser, Post SavingPost) {
		
		for (User user : AllUsers) {
			if(user.getUsername().equals(ActualUser.getUsername())) {
				
				user.getUserPosts().add(SavingPost);
			}
		}
		
	}
	
	/**
	 * A method that receives a string and saves all the hastags present in it to a post
	 * @param StringOfHash
	 * @param CreatedPost
	 */
	public void SetHashtagsFromString(String StringOfHash, Post CreatedPost) {
		
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
