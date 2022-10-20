package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import UI.MainWindow;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JList;
import javax.swing.JPanel;
import java.awt.List;
import javax.swing.JButton;
import java.awt.Font;

/**
 * Pantalla extra dentro de Jframe que se encargara de mostrar los post de las personas
 * @author Fabi
 *
 */
public class content extends JInternalFrame implements Runnable {

	ArrayList<String> array = new ArrayList<String>();
	private int CounterC = 0;
	private JPanel panel;
	private JScrollPane scrollPane;
	
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
		setBounds(100, 100, 1037, 575);
		getContentPane().setLayout(null);
		
		List list = new List();
		list.setBounds(0, 0, 855, 546);
		getContentPane().add(list);
		
		JButton btnNewButton = new JButton("Comentar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(885, 182, 107, 51);
		getContentPane().add(btnNewButton);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		 panel = new JPanel();
		 panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		 scrollPane = new JScrollPane(panel);
		 scrollPane.setVerticalScrollBarPolicy(
		 JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		 scrollPane.setAutoscrolls(true);
		 
		 if (MainWindow.PublicO == 1) {
		        {
		        	String posts = MainWindow.txtComentar.getText();
		        	MainWindow.txtComentar.setText("");
		        	array.add(posts);
		        	MainWindow.PublicO = (MainWindow.PublicO - 1);
		        	

		        }
		 }
	}
}
