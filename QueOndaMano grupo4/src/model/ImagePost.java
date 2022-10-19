package model;

public class ImagePost extends MediaPost implements Imedia{

	/**
	 * Clase hija de la clase MediaPost, tene la utilidad de crear posts de tipo imagen
	 * El tipo de multimedia de estos posts es 3
	 */
	private String Format;
	private String Resolution;
	
	/**
	 * @param Author
	 * @param Link
	 * @param format Esta variable guarda el formato/tipo de archivo que es (png, jpeg etc)
	 * @param resolution Guarda la resolucion de la imagen que se va a postear.
	 */
	public ImagePost(String Author, String Link, String format, String resolution, double PrgSize) {
		super(Author, Link, PrgSize);
		setResolution(resolution);
		setFormat(format);
		setMediaType(4);
	}

	
	public String getFormat() {
		return Format;
	}


	public void setFormat(String format) {
		Format = format;
	}


	public String getResolution() {
		return Resolution;
	}


	public void setResolution(String resolution) {
		Resolution = resolution;
	}


	@Override
	public String PlayMedia() {
		return "A continuacion se muestra la imagen del post";
		
		// TODO Auto-generated method stub
		
	}

}
