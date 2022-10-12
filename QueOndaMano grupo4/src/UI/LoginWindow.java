package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow frame = new LoginWindow();
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
	public LoginWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¡Volviste! Te extrañamos");
		lblNewLabel.setFont(new Font("Monospaced", Font.PLAIN, 16));
		lblNewLabel.setBounds(88, 34, 252, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa tus datos para ingresar");
		lblNewLabel_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(73, 74, 300, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Usuario:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(100, 143, 99, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(88, 206, 99, 27);
		contentPane.add(lblNewLabel_2_1);
		
		/** 
		 * Este txt recibirá la información del nombre de usuario
		 */
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtUser.setBounds(160, 144, 180, 25);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		/** 
		 * Este txt recibirá la información de la contraseña
		 */
		
		txtPass = new JTextField();
		txtPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPass.setColumns(10);
		txtPass.setBounds(160, 207, 180, 25);
		contentPane.add(txtPass);
		
		/** 
		 * Este botón comprobará que exista el usuario en data.cv, de ser así, dirigirá a la MainWindow, sino, dará la posibilidad de volver a intentarlo
		 */
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(160, 269, 99, 34);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ohh, ¿olvidaste tu contraseña?");
		lblNewLabel_1_1.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(53, 332, 300, 27);
		contentPane.add(lblNewLabel_1_1);
		
		/** 
		 * Este botón llevará a la ventana LostPassword
		 */
		
		JButton btnRecuperar = new JButton("Sí :')");
		btnRecuperar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRecuperar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRecuperar.setBounds(303, 335, 76, 23);
		contentPane.add(btnRecuperar);
	}

}