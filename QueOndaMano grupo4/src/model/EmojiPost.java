package model;

/**
 * Clase creada para todos los post que sean de tipo emoji. 
 * Unicamente seran posts que contegan un emoticon hecho con caracteres 
 * @author andre
 *
 */
public class EmojiPost extends Post{
	private String PostEmoji;
	
	/**
	 * Cuando se crea un post de tipo emoji, este se marca automaticamente
	 * como post de tipo 1.
	 * @param Auth 
	 * @param Date
	 * @param emoji, son los caracteres que se publicaran como un emoticon
	 */
	EmojiPost(String Author, String Date, String emoji){
		super(Author, Date);
		setPostEmoji(emoji);
		setPostType(1);
	}

	public String getPostEmoji() {
		return PostEmoji;
	}

	public void setPostEmoji(String postEmoji) {
		PostEmoji = postEmoji;
	}
	
	
}
