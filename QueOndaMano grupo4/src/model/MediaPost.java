package model;

public abstract class MediaPost extends Post{
	
	/**
	 * La clase de mediaPost, tambien se divide en subclases, por lo que tambien tiene una
	 * variable para determinar el tipo Multimedia que se quiere agregar como post.
	 * Hay 3 tipos distintos de multimedia 
	 */
	protected int MediaType;
	protected double ProgramSize;
	protected String Link;
	
	/**
	 * Esta clase se extiende de Post, pero no es instanciable porque abran distintos tipos
	 * de post multimedia. Las multimedias son tipo post 3. (Nota: Hay 3 tipos de multimedia
	 * que derivan de esta clase)
	 * @param Author
	 * @param Date
	 * @param Link, este es un link/nombre/direccion del archivo que se le solicitara al usuario. 
	 * El link tiene que ser la direccion web del archivo 
	 */
	MediaPost(String Author, String Link, double PrgSize){
		super(Author);
		setLink(Link);
		setPostType(3);	
		setProgramSize(PrgSize);
	}

	public String getLink() {
		return Link;
	}

	public void setLink(String link) {
		Link = link;
	}

	public int getMediaType() {
		return MediaType;
	}

	public void setMediaType(int mediaType) {
		MediaType = mediaType;
	}

	public double getProgramSize() {
		return ProgramSize;
	}

	public void setProgramSize(double programSize) {
		ProgramSize = programSize;
	}
	
	
}
