package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AppManagement;
import controller.FileManager;
import model.Audio;
import model.ImagePost;
import model.User;
import model.Video;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

/**
 * In this window you can upload to post
 * @author Fabi
 *
 */
public class UploadMediaWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldLink;
	private UploadMediaWindow MediaWindow;
	private JTextField textFieldHash;

	/**
	 * Create the frame. receiving all the dat from the main window as a variable
	 */
	public UploadMediaWindow(MainWindow mainframe) {
		this.MediaWindow = this;
		
		FileManager FileManager = new FileManager();
		AppManagement AppManage = new AppManagement();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldLink = new JTextField();
		textFieldLink.setBounds(20, 113, 165, 20);
		contentPane.add(textFieldLink);
		textFieldLink.setColumns(10);
		
		
		// Creating a new ComboBoxModel and adding three elements to it corresponding to the type of medio posts.
		DefaultComboBoxModel<String> TypeList = new DefaultComboBoxModel<String>();
		TypeList.addElement("Imagen");
		TypeList.addElement("Audio");
		TypeList.addElement("Video");
		
		JComboBox<String> ComboBoxMediType = new JComboBox<String>();
		ComboBoxMediType.setBounds(20, 54, 91, 22);
		ComboBoxMediType.setModel(TypeList);
		ComboBoxMediType.setSelectedIndex(0);
		contentPane.add(ComboBoxMediType);
		
		
		JLabel lblNewLabel = new JLabel("Elige el tipo de multimedia que deseas postear");
		lblNewLabel.setBounds(20, 22, 261, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblCopiaAquiEl = new JLabel("Copia aqui el link de donde obtuviste el archivo");
		lblCopiaAquiEl.setBounds(20, 87, 274, 28);
		contentPane.add(lblCopiaAquiEl);
		
		JButton btnChooseFile = new JButton("Selecciona Archivo");
		btnChooseFile.setBounds(20, 228, 165, 22);
		contentPane.add(btnChooseFile);
		
		JLabel lblEligeElArchivo = new JLabel("Elige el archivo de tu computadora, para crear tu post");
		lblEligeElArchivo.setBounds(20, 201, 295, 28);
		contentPane.add(lblEligeElArchivo);
		
		JLabel lblColocaLoshastagasQue = new JLabel("Coloca loshastagas que deseas incluir");
		lblColocaLoshastagasQue.setBounds(20, 137, 274, 28);
		contentPane.add(lblColocaLoshastagasQue);
		
		textFieldHash = new JTextField();
		textFieldHash.setColumns(10);
		textFieldHash.setBounds(20, 170, 165, 20);
		contentPane.add(textFieldHash);
		
		
		btnChooseFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hola");
				final JFileChooser  fileDialog = new JFileChooser();
				int returnVal = fileDialog.showOpenDialog(null);
				
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					
					try {
						String filePath = fileDialog.getSelectedFile().getAbsolutePath();
						System.out.println(filePath);
						
						User theUser = mainframe.getCurrentUser();
						
						String LinkOfPost = textFieldLink.getText();
						
						ArrayList<User> AllUsers = mainframe.getAllsavedUsers();
						
						//Depending on the type of media that is selected, a diferente object is created
						if(ComboBoxMediType.getSelectedIndex() == 0) {
							
							ImagePost newImgPost = AppManage.CreateImagePostFromMetaData(mainframe.getCurrentUser(), LinkOfPost, filePath);
							AppManage.SetHashtagsFromString(textFieldHash.getText(), newImgPost);
							
							AppManage.SavePostToUser(AllUsers, theUser, newImgPost);// the post is saved to the specific user and added to the arrayList
							FileManager.SaveAllUsersToFile(AllUsers); // Takes the recently modified arrayList and saves it to the file
							
							
							System.out.println("" + LinkOfPost);
							
							// Disposing the current JFrame.
							MediaWindow.dispose();
						}
						
						else if(ComboBoxMediType.getSelectedIndex() == 1) {
							Audio newAudPost = AppManage.CreateAudioPostFromMetaData(mainframe.getCurrentUser(), LinkOfPost, filePath);
							AppManage.SetHashtagsFromString(textFieldHash.getText(), newAudPost);
							
							AppManage.SavePostToUser(AllUsers, theUser, newAudPost);// the post is saved to the specific user and added to the arrayList
							FileManager.SaveAllUsersToFile(AllUsers); // Takes the recently modified arrayList and saves it to the file
							
							System.out.println("" + LinkOfPost);
														
							// Disposing the current JFrame.
							MediaWindow.dispose();
						}
						
						else if(ComboBoxMediType.getSelectedIndex() == 2) {
							Video newVidPost = AppManage.CreateVideoPostFromMetaData(mainframe.getCurrentUser(), LinkOfPost, filePath);
							AppManage.SetHashtagsFromString(textFieldHash.getText(), newVidPost);
							
							AppManage.SavePostToUser(AllUsers, theUser, newVidPost);// the post is saved to the specific user and added to the arrayList
							FileManager.SaveAllUsersToFile(AllUsers); // Takes the recently modified arrayList and saves it to the file
							
							System.out.println("3");
							
							System.out.println("" + LinkOfPost);
							
							
							// Disposing the current JFrame.
							MediaWindow.dispose();
						}
						
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				
			}});
	}
}
