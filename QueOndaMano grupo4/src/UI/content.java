package UI;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

/**
 * Pantalla extra dentro de Jframe que se encargara de mostrar los post de las personas
 * @author Fabi
 *
 */
public class content extends JInternalFrame {
	private JTextField textField;

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
		getContentPane().setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(411, 10, 17, 48);
		getContentPane().add(scrollBar);
		
		textField = new JTextField();
		textField.setBounds(108, 97, 96, 19);
		getContentPane().add(textField);
		textField.setColumns(10);

	}
}
