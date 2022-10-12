package model;

/**
 * Esta interfaz sirve para todos los posts para poder reproducirlos. 
 * PlayMedia princiaplmente desplega un mensaje el cual varia 
 * dependiendo del post
 * @author andre
 *
 */
public interface Imedia {
	/**
	 * Metodo que muestra un mensaje dependiendo del tipo de post. Todos los post sobreescriben
	 * este metodo
	 */
	public void PlayMedia();
}
