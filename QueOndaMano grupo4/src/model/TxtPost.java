package model;

public class TxtPost extends Post{
	
	private String PostMSG;
	
	/**
	 * Este es el segundo tipo de post posible, un post que es un mensaje de texto
	 * El tipo de post es 2
	 * @param Author
	 * @param txtForPost es el texto que el usuarios desea poner en su post de texto
	 */
	public TxtPost(String Author, String txtForPost){
		super(Author);
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
	public String PlayMedia() {
		return "Se esta reproduciendo el texto";
		// TODO Auto-generated method stub
		
	}
		
	

}
