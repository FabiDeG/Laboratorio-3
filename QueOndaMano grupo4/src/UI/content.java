package UI;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

/**
 * Pantalla extra dentro de Jframe que se encargara de mostrar los post de las personas
 * @author Fabi
 *
 */
public class content extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					content frame = new content();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public content() {
		setBounds(100, 100, 450, 300);

	}

}
