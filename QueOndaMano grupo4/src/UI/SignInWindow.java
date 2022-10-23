package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AppManagement;
import controller.FileManager;
import model.NUser;
import model.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

/**
 * Pantalla que recopila informacion de sign in
 * @author Fabi
 *
 */
public class SignInWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField txtPassw;
	private JTextField txtCPassw;
	private SignInWindow SignIn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignInWindow frame = new SignInWindow();
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
	 * @param txtPassw, este txt recibira la informacion de la contrasena del usuario
	 * @param txtCPassw, este txt recibira la informacion de la contrasena que se escriba y se compararan
	 * @param btnCrearCuenta, este boton se encargara de ver que se cumpla que las contrasenas sean iguales y de guardar los datos del usuario en data.cv, de ser asi, dirigira a la MainWindow, de no ser asi, dara la oportunidad de volver a intentarlo
	 */
	public SignInWindow() {
		this.SignIn = this;
		FileManager filemanager = new FileManager();
		AppManagement AppManage = new AppManagement();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 442, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblholaNosComplace = new JLabel("¡Hola!");
		lblholaNosComplace.setFont(new Font("Monospaced", Font.PLAIN, 16));
		lblholaNosComplace.setBounds(172, 21, 71, 41);
		contentPane.add(lblholaNosComplace);
		
		JLabel lblNosComplaceSaber = new JLabel("Nos complace saber que formaras parte de");
		lblNosComplaceSaber.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblNosComplaceSaber.setBounds(58, 53, 390, 41);
		contentPane.add(lblNosComplaceSaber);
		
		JLabel lblNuestraGranFamilia = new JLabel("nuestra gran familia");
		lblNuestraGranFamilia.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblNuestraGranFamilia.setBounds(131, 83, 426, 41);
		contentPane.add(lblNuestraGranFamilia);
		
		JLabel lblNewLabel = new JLabel("Ingresa tus datos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(160, 121, 129, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Usuario:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(98, 172, 99, 27);
		contentPane.add(lblNewLabel_2);
		
		/** 
		 * Este txt recibira la informacion del nombre de usuario
		 * @param txtUser
		 */
		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtUser.setColumns(10);
		txtUser.setBounds(160, 173, 180, 25);
		contentPane.add(txtUser);
		
		JLabel lblNewLabel_2_1 = new JLabel("Contrasenia:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(82, 224, 99, 27);
		contentPane.add(lblNewLabel_2_1);
		
		/** 
		 * Este txt recibira la informacion de la contrasena del usuario
		 * @param txtPassw
		 */
		txtPassw = new JTextField();
		txtPassw.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPassw.setColumns(10);
		txtPassw.setBounds(172, 225, 180, 25);
		contentPane.add(txtPassw);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Comprobar contrasenia:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_1.setBounds(42, 272, 171, 27);
		contentPane.add(lblNewLabel_2_1_1);
		
		/** 
		 * Este txt recibira la informacion de la contrasena que se escriba y se compararan
		 * @param txtCPassw
		 */
		txtCPassw = new JTextField();
		txtCPassw.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCPassw.setColumns(10);
		txtCPassw.setBounds(205, 273, 180, 25);
		contentPane.add(txtCPassw);
		
		/** 
		 * Este boton se encargara de ver que se cumpla que las contrasenas sean iguales y de guardar los datos del usuario en data.cv, de ser asi, dirigira a la MainWindow, de no ser asi, dara la oportunidad de volver a intentarlo
		 * @param btnCrearCuenta
		 */
		JButton btnCrearCuenta = new JButton("Crear cuenta");
		btnCrearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//Checking if the user name is available
			if(!filemanager.UserExists(txtUser.getText() ) ) {
				System.out.println("Nuevo Usuario");
				
				//Create new user only if user is available and
				if(txtPassw.getText().equals(txtCPassw.getText() ) && !txtPassw.getText().equals("") ){
					System.out.println("Iguales");
					
					//Se guarda el usuario al archivo de data, donde se guardan los usuarios y sus contrasenias encriptadas
					filemanager.SaveUserToFile(txtUser.getText(), txtPassw.getText());
					
					//Se crea un objeto para el nuevo usuario, encriptando su contrasenia
					NUser newUser = new NUser(txtUser.getText(), filemanager.EncriptInput(txtPassw.getText() ));
					
					//Lista que se le pasara a un metodo para actualizar el archivo con el arraylist de toda la base de datos
					ArrayList<User> SavingUsers = filemanager.getUsersFromFile();
					SavingUsers.add(newUser);
					
					//Guardar cambios al archivo con toda la informacion (UserPost)
					filemanager.SaveAllUsersToFile(SavingUsers);
					
					User Nuser = AppManage.LoginSuccesful(txtUser.getText(), txtPassw.getText());
					MainWindow Main = new MainWindow(Nuser);
					
					Main.setVisible(true);
					
					SignIn.dispose();
					
				}
				else {
					JOptionPane.showMessageDialog(SignIn, "Las contrasenias no son iguales" , "InfoBox: " + "Error", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
			else {
				JOptionPane.showMessageDialog(SignIn, "El nombre de usuario ya existe" , "InfoBox: " + "Error", JOptionPane.INFORMATION_MESSAGE);
			}
			
			
			
			
			}
		});
		btnCrearCuenta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCrearCuenta.setBounds(148, 391, 145, 34);
		contentPane.add(btnCrearCuenta);
		
		JLabel lblNoOlvidesTu = new JLabel("No olvides tu contrasenia...");
		lblNoOlvidesTu.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblNoOlvidesTu.setBounds(116, 339, 426, 41);
		contentPane.add(lblNoOlvidesTu);
		
		JLabel lblNotaImportanteLos = new JLabel("NOTA IMPORTANTE LOS CARACTERES ESPECIALES NO SON RECOMENDADOS");
		lblNotaImportanteLos.setFont(new Font("Monospaced", Font.PLAIN, 10));
		lblNotaImportanteLos.setBounds(22, 301, 426, 41);
		contentPane.add(lblNotaImportanteLos);
	}

}
