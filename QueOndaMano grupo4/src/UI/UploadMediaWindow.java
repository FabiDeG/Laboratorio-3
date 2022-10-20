package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AppManagement;
import controller.FileManager;
import model.Audio;
import model.ImagePost;
import model.Video;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

/**
 * Pantalla en la que el usuario puede subir sus archivos para luego publicarlos
 * @author Fabi
 *
 */
public class UploadMediaWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldLink;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UploadMediaWindow frame = new UploadMediaWindow(null);
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
	public UploadMediaWindow(MainWindow mainframe) {
		
		FileManager PostManager = new FileManager();
		AppManagement AppManage = new AppManagement();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldLink = new JTextField();
		textFieldLink.setBounds(20, 121, 165, 20);
		contentPane.add(textFieldLink);
		textFieldLink.setColumns(10);
		
		
		// Creating a new ComboBoxModel and adding three elements to it.
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
		
		JLabel lblCopiaAquiEl = new JLabel("Copia aqui el link de donde obtuviste la imagen");
		lblCopiaAquiEl.setBounds(21, 94, 274, 28);
		contentPane.add(lblCopiaAquiEl);
		
		JButton btnChooseFile = new JButton("Selecciona Archivo");
		btnChooseFile.setBounds(20, 187, 165, 22);
		contentPane.add(btnChooseFile);
		
		JLabel lblEligeElArchivo = new JLabel("Elige el archivo de tu computadora, para crear tu post");
		lblEligeElArchivo.setBounds(20, 159, 295, 28);
		contentPane.add(lblEligeElArchivo);
		
		
		btnChooseFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hola");
				final JFileChooser  fileDialog = new JFileChooser();
				
				
				int returnVal = fileDialog.showOpenDialog(null);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					
					try {
						String filePath = fileDialog.getSelectedFile().getAbsolutePath();
						System.out.println(filePath);
						String LinkOfPost = textFieldLink.getText();
						
						//Depending on the type of media that is selected, a diferente object is created
						if(ComboBoxMediType.getSelectedIndex() == 0) {
							ImagePost newVidPost = AppManage.CreateImagePostFromMetaData(null, LinkOfPost, filePath);
							System.out.println("1");
						}
						
						else if(ComboBoxMediType.getSelectedIndex() == 1) {
							Audio newVidPost = AppManage.CreateAudioPostFromMetaData(null, LinkOfPost, filePath);
							System.out.println("2");
						}
						
						else if(ComboBoxMediType.getSelectedIndex() == 2) {
							Video newVidPost = AppManage.CreateVideoPostFromMetaData(null, LinkOfPost, filePath);
							System.out.println("3");
						}
						
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				
			}});
	}
}
