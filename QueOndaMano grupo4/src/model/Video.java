package model;

public class Video extends MediaPost{
	
	private int FrameRate;
	
	
	/**
	 * El constructor de la clase video es para los posts de tipo video. Los videos son clases hijas
	 * de multimedia y multimedia es una clase hija de Posts.
	 * Dentro del constructor se define a este tipo de post como Multimedia de tipo 1
	 * @param Author
	 * @param Date
	 * @param Link
	 */
	public Video(String Author, String Date, String Link) {
		super(Author, Date, Link);
		setMediaType(1);
	}

	public int getFrameRate() {
		return FrameRate;
	}

	public void setFrameRate(int frameRate) {
		FrameRate = frameRate;
	}

}
