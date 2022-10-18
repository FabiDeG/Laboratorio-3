package model;

public class Video extends MediaPost{
	/**
	 * Los videos incluyen una variable extra para guardar el fram rate del video
	 */
	private int FrameRate;
	
	/**
	 * El constructor de la clase video es para los posts de tipo video. Los videos son clases hijas
	 * de multimedia y multimedia es una clase hija de Posts.
	 * Dentro del constructor se define a este tipo de post como Multimedia de tipo 1
	 * @param Author
	 * @param Date
	 * @param Link
	 * @param FrameRate, el frame rate del video que se desea subir
	 */
	public Video(String Author, String Date, String Link, int FrameRate) {
		super(Author, Date, Link);
		setMediaType(5);
		setFrameRate(FrameRate);
	}

	public int getFrameRate() {
		return FrameRate;
	}

	public void setFrameRate(int frameRate) {
		FrameRate = frameRate;
	}

	@Override
	public String PlayMedia() {
		return "Se esta reproduciendo el video";
		// TODO Auto-generated method stub
		
	}

}
