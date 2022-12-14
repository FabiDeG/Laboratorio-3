package model;

import java.io.Serializable;

/**
 * Clase creada para todos los post que sean de tipo emoji. 
 * Unicamente seran posts que contegan un emoticon hecho con caracteres 
 * @author andre
 *
 */
public class EmojiPost extends Post implements Serializable{
	private String PostEmoji;
	
	/**
	 * Cuando se crea un post de tipo emoji, este se marca automaticamente
	 * como post de tipo 1.
	 * @param Auth 
	 * @param emoji, son los caracteres que se publicaran como un emoticon
	 */
	public EmojiPost(String Author, String emoji){
		super(Author);
		setPostEmoji(emoji);
		setPostType(1);
	}

	public String getPostEmoji() {
		return PostEmoji;
	}

	public void setPostEmoji(String postEmoji) {
		PostEmoji = postEmoji;
	}

	@Override
	public String PlayMedia() {
		
		return "Este es el emoji del post";
		// TODO Auto-generated method stub
		
	}
	
	
}
