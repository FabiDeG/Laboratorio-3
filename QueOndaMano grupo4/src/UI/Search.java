package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AppManagement;
import controller.FileManager;
import model.Audio;
import model.EmojiPost;
import model.ImagePost;
import model.MediaPost;
import model.Post;
import model.TxtPost;
import model.User;
import model.Video;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Search extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtSearch;
	private JTextField textField_1;
	JList lstPost;
	private JLabel lblParaLasFechas;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search frame = new Search(null, "");
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
	public Search(ArrayList<User> theUsers, String search) {
		
		FileManager manager = new FileManager();
		AppManagement AppManage = new AppManagement();
		
		
		ArrayList<User> Alusers = manager.getUsersFromFile();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSearch = new JButton("");
		btnSearch.setIcon(new ImageIcon("/documents/asdfer.png"));
		btnSearch.setBounds(618, 15, 48, 50);
		contentPane.add(btnSearch);
		
		txtSearch = new JTextField();
		txtSearch.setText(search);
		String theSearch = txtSearch.getText();
		
		txtSearch.setHorizontalAlignment(SwingConstants.CENTER);
		txtSearch.setText("Search...");
		txtSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSearch.setBounds(10, 10, 594, 58);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(604, 10, 81, 58);
		contentPane.add(textField_1);
		
		lstPost = new JList();
		lstPost.setBounds(20, 136, 646, 365);
		contentPane.add(lstPost);
		
		
		// Creating a new ComboBoxModel and adding three elements to it corresponding to the type of medio posts.
			DefaultComboBoxModel<String> TypeList = new DefaultComboBoxModel<String>();
			TypeList.addElement("Usuario");
			TypeList.addElement("Hashtag");
			TypeList.addElement("Fecha");				
			JComboBox<String> ComboBoxMediType = new JComboBox<String>();
			ComboBoxMediType.setBounds(241, 80, 91, 22);
			ComboBoxMediType.setModel(TypeList);
			ComboBoxMediType.setSelectedIndex(0);
			contentPane.add(ComboBoxMediType);
			
			JLabel lblNewLabel = new JLabel("Que tipo de busqueda desea realizar?");
			lblNewLabel.setBounds(20, 71, 226, 31);
			contentPane.add(lblNewLabel);
			
			lblParaLasFechas = new JLabel("Para las fechas se debe buscar con el formato (DD/MM/AAAA) como 01/08/2022 por ejemplo, y los hastagas con el #");
			lblParaLasFechas.setBounds(20, 106, 665, 31);
			contentPane.add(lblParaLasFechas);
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//---------------------------------------------------
				
				
				DefaultListModel<String> PostList = new DefaultListModel<String>();
				System.out.println(Alusers);
				ArrayList<Post> PostsToShow = new ArrayList<Post>(); 
				//Search only if the space is no blank
				if(!txtSearch.getText().equals("")){
					//Search by Username
					if(ComboBoxMediType.getSelectedIndex() == 0) {
						PostsToShow = AppManage.SearchPostByAuthor(txtSearch.getText(), Alusers);
					}
					
					//Search by Hastag
					else if(ComboBoxMediType.getSelectedIndex() == 1) {
						PostsToShow = AppManage.SearchPostByhastag(txtSearch.getText(), Alusers);
					}
					
					//Search by date
					else if(ComboBoxMediType.getSelectedIndex() == 2) {
						PostsToShow = AppManage.SearchPostByDate(txtSearch.getText(), Alusers);
					}
					
					
						for (Post aPost : PostsToShow) {
							
							
							if (aPost.getPostType() == 1) {
								System.out.println("Emoji");
								PostList.addElement("Por: " + aPost.getAuthor() + " " +  aPost.getDate() + "Post: "+ ((EmojiPost) aPost).getPostEmoji() + " Likes " + aPost.getLikes());
								
								String listString = String.join(", ", aPost.getHashtags());
								PostList.addElement(listString);
								String List2 = String.join(", ", aPost.getComments());
								PostList.addElement(List2);
							}
							
							else if (aPost.getPostType() == 2) {
								System.out.println("txt");
								PostList.addElement("Por: " + aPost.getAuthor() + " " +  aPost.getDate() + " Post: "+ ((TxtPost) aPost).getPostMSG() + " Likes " + aPost.getLikes());
								
								String listString = String.join(", ", aPost.getHashtags());
								PostList.addElement(listString);
								String List2 = String.join(", ", aPost.getComments());
								PostList.addElement(List2);
							}
							
							else if (aPost.getPostType() == 3) {
								System.out.println("Aud");
								
								PostList.addElement("Autor:  " + aPost.getAuthor() + " " + aPost.getDate() + " Link: " + ((MediaPost) aPost).getLink()+ " SampleRatio " + ((Audio) aPost).getSampleRatio()
										+ " BitDepth " + ((Audio) aPost).getBitDepth() + " Size In KB: " + ((Audio) aPost).getProgramSize() + " Likes: " + aPost.getLikes());
	
								
								String listString = String.join(", ", aPost.getHashtags());
								PostList.addElement(listString);
								String List2 = String.join(", ", aPost.getComments());
								PostList.addElement(List2);
							}
							
							else if (aPost.getPostType() == 4) {
								System.out.println("Img");
								PostList.addElement("Autor:  " + aPost.getAuthor() + " " + aPost.getDate() + " Link: " + ((MediaPost) aPost).getLink()+ " Resolucion: " + ((ImagePost) aPost).getResolution()
										+ " Format: " + ((ImagePost) aPost).getFormat() + " Size In KB: " + ((ImagePost) aPost).getProgramSize() + " Likes: " + aPost.getLikes());
	
								String listString = String.join(", ", aPost.getHashtags());
								PostList.addElement(listString);
								
								String List2 = String.join(", ", aPost.getComments());
								PostList.addElement(List2);
							}
							
							else if (aPost.getPostType() == 5) {
								System.out.println("vid");
								PostList.addElement("Autor:  " + aPost.getAuthor() + " " + aPost.getDate() + " Link: " + ((MediaPost) aPost).getLink()+ " FrameRate " + ((Video) aPost).getFrameRate()
										+ " Size In KB: " + ((Video) aPost).getProgramSize() + " Likes: " + aPost.getLikes());
								
								String listString = String.join(", ", aPost.getHashtags());
								PostList.addElement(listString);
								String List2 = String.join(", ", aPost.getComments());
								PostList.addElement(List2);
							}
							
							
						}
						
						lstPost.setModel(PostList);
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Ingrese un criterio de busqueda", "Informacion", JOptionPane.WARNING_MESSAGE, null);
				}
			}
		});
		
	}
}
