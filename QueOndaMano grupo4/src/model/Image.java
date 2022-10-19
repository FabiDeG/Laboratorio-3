package model;

public class Image extends MediaPost implements Imedia{

	/**
	 * Clase hija de la clase MediaPost, tene la utilidad de crear posts de tipo imagen
	 * El tipo de multimedia de estos posts es 3
	 */
	private String Format;
	private int Resolution;
	
	/**
	 * @param Author
	 * @param Link
	 * @param format Esta variable guarda el formato/tipo de archivo que es (png, jpeg etc)
	 * @param resolution Guarda la resolucion de la imagen que se va a postear.
	 */
	Image(String Author, String Link, String format, int resolution) {
		super(Author, Link);
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


	public int getResolution() {
		return Resolution;
	}


	public void setResolution(int resolution) {
		Resolution = resolution;
	}


	@Override
	public String PlayMedia() {
		return "A continuacion se muestra la imagen del post";
		
		// TODO Auto-generated method stub
		
	}

}
