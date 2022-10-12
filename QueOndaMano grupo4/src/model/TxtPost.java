package model;

public class TxtPost extends Post{
	
	private String PostMSG;
	
	/**
	 * Este es el segundo tipo de post posible, un post que es un mensaje de texto
	 * El tipo de post es 2
	 * @param Author
	 * @param Date
	 * @param txtForPost, es el texto que el usuarios desea poner en su post de texto
	 */
	public TxtPost(String Author, String Date, String txtForPost){
		super(Author, Date);
		setPostType(2);
		setPostMSG(txtForPost);		
	}

	public String getPostMSG() {
		return PostMSG;
	}

	public void setPostMSG(String postMSG) {
		PostMSG = postMSG;
	}

	@Override
	public void PlayMedia() {
		// TODO Auto-generated method stub
		
	}
		
	

}
