package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import UI.LostPassword;
import controller.AppManagement;
import controller.FileManager;
import model.User;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Pantalla que recopila informacion de login
 * @author Fabi
 *
 */
public class LoginWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField txtPass;
	LoginWindow LoginFrame;

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
	 * @param txtUser, este txt recibira la informacion del nombre de usuario
	 * @param txtPass, este txt recibira la informacion de la contrasena
	 * @param btnNewButton, este boton comprobara que exista el usuario en data.cv, de ser asi, dirigira a la MainWindow, sino, dara la posibilidad de volver a intentarlo
	 * @param btnRecuperar, este boton llevara a la ventana LostPassword
	 */
	public LoginWindow() {
		this.LoginFrame = this;
		
		FileManager filemanager = new FileManager();
		AppManagement AppManage = new AppManagement();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¡Volviste! Te extraniamos");
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
		 * Este txt recibira la informacion del nombre de usuario
		 * @param txtUser
		 */
		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtUser.setBounds(160, 144, 180, 25);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		/** 
		 * Este txt recibira la informacion de la contrasena
		 * @param txtPass
		 */
		txtPass = new JTextField();
		txtPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPass.setColumns(10);
		txtPass.setBounds(160, 207, 180, 25);
		contentPane.add(txtPass);
		
		/** 
		 * Este boton comprobara que exista el usuario en data.cv, de ser asi, dirigira a la MainWindow, sino, dara la posibilidad de volver a intentarlo
		 * @param btnNewButton
		 */
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					//Checking if the password and user match and exist
					if(filemanager.ReadFileForPassword(txtUser.getText(), txtPass.getText())) {
						
						User Nuser = AppManage.LoginSuccesful(txtUser.getText(), txtPass.getText());
						MainWindow Main = new MainWindow(Nuser);
						
						Main.setVisible(true);
						LoginFrame.dispose();
					}
					else {
						JOptionPane.showMessageDialog(LoginFrame, "Usuario y/o contrasenia incorrecta" , "InfoBox: " + "Error", JOptionPane.INFORMATION_MESSAGE);
					}
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(LoginFrame, "Error al acceder a la base de datos" , "InfoBox: " + "Error", JOptionPane.INFORMATION_MESSAGE);
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(160, 269, 99, 34);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ohh, ¿olvidaste tu contrasenia?");
		lblNewLabel_1_1.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(46, 332, 300, 27);
		contentPane.add(lblNewLabel_1_1);
		
		/** 
		 * Este boton llevara a la ventana LostPassword
		 * @param btnRecuperar
		 */
		JButton btnRecuperar = new JButton("Si :')");
		btnRecuperar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LostPassword miLost = new LostPassword();
				LoginFrame.dispose();
				miLost.show();
			}
		});
		btnRecuperar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRecuperar.setBounds(315, 335, 76, 23);
		contentPane.add(btnRecuperar);
	}

}
