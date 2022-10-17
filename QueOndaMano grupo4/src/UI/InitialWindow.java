package UI;

import java.awt.BorderLayout;
import UI.LoginWindow;
import UI.SignInWindow;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Pantalla que muestra opciones de login y sign in
 * @author Fabi
 *
 */
public class InitialWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InitialWindow frame = new InitialWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param btnLogin, este boton dirigira a LoginWindow
	 * @param btnSignIn, este boton dirigira a SignInWindow
	 * 
	 */
	public InitialWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¡Bienvenid@ a QuéOndaMano!");
		lblNewLabel.setFont(new Font("Monospaced", Font.PLAIN, 17));
		lblNewLabel.setBounds(101, 23, 289, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("¿Ya tienes cuenta?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(162, 88, 143, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Crea tu cuenta :)");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(172, 178, 112, 24);
		contentPane.add(lblNewLabel_1_1);
		
		/** 
		 * Este boton dirigira a LoginWindow
		 * @param btnLogin
		 */
		JButton btnLogin = new JButton("Log in");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				LoginWindow miLog = new LoginWindow();
				miLog.show();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogin.setBounds(172, 122, 89, 30);
		contentPane.add(btnLogin);
		
		/** 
		 * Este boton dirigira a SignInWindow
		 * @param btnSignIn
		 */
		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignInWindow miSign = new SignInWindow();
				miSign.show();
			}
		});
		btnSignIn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSignIn.setBounds(172, 223, 89, 30);
		contentPane.add(btnSignIn);
	}
}
