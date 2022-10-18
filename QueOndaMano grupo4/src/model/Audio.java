package model;

public class Audio extends MediaPost implements Imedia{
	
	/**
	 * Este tipo de multimedia tiene el sample ratio del audio y tambien una variable
	 * extra para el bitDepth
	 */
	private double sampleRatio;
	private int bitDepth;
	
	/**
	 * Clase para los posts multimedia de tipo video. Estos tienen tipo de multimadia 2.
	 * La clase de audio deriva de la clase MediaPost.
	 * @param Author
	 * @param Date
	 * @param Link
	 * @param samplRatio variable que guarda el sample ratio de un audio
	 * @param bitdepth variable que guarda el bit depth de un audio
	 */
	public Audio(String Author, String Date, String Link, double samplRatio, int bitdepth) {
		super(Author, Date, Link);
		setMediaType(3);
		setSampleRatio(samplRatio);
		setBitDepth(bitdepth);
	}
	
	public double getSampleRatio() {
		return sampleRatio;
	}


	public void setSampleRatio(double sampleRatio) {
		this.sampleRatio = sampleRatio;
	}


	public int getBitDepth() {
		return bitDepth;
	}


	public void setBitDepth(int bitDepth) {
		this.bitDepth = bitDepth;
	}


	@Override
	public String PlayMedia() {
		return "Se está repoduciendo el audio";
		// TODO Auto-generated method stub
		
	}

}
