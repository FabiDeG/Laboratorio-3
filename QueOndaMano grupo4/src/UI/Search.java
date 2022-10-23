package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.FileManager;
import model.EmojiPost;
import model.ImagePost;
import model.MediaPost;
import model.Post;
import model.TxtPost;
import model.User;

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

public class Search extends JFrame {

	private JPanel contentPane;
	private JTextField txtSearch;
	private JTextField textField_1;
	JList lstPost;

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
		
		
		
		ArrayList<User> Alusers = manager.getUsersFromFile();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSearch = new JButton("");
		btnSearch.setIcon(new ImageIcon("C:\\Users\\fabio\\Downloads\\asdfer.jpg"));
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
		lstPost.setBounds(31, 113, 513, 114);
		contentPane.add(lstPost);
		
		
		// Creating a new ComboBoxModel and adding three elements to it corresponding to the type of medio posts.
			DefaultComboBoxModel<String> TypeList = new DefaultComboBoxModel<String>();
			TypeList.addElement("Imagen");
			TypeList.addElement("Audio");
			TypeList.addElement("Video");				
			JComboBox<String> ComboBoxMediType = new JComboBox<String>();
			ComboBoxMediType.setBounds(20, 80, 91, 22);
			ComboBoxMediType.setModel(TypeList);
			ComboBoxMediType.setSelectedIndex(0);
			contentPane.add(ComboBoxMediType);
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//---------------------------------------------------
				
				DefaultListModel<String> PostList = new DefaultListModel<String>();
				
				
				
				System.out.println(Alusers);
				
				
				
				
				
				
				if(!txtSearch.getText().equals("")){
					for (User user : Alusers) {
						
						System.out.println(user.getUserPosts());
						for (Post aPost : user.getUserPosts()) {
							
							
							if (aPost.getPostType() == 1) {
								System.out.println("Emoji");
								PostList.addElement("Por: " + user.getUsername() + " " +  aPost.getDate() + "Post: "+ ((EmojiPost) aPost).getPostEmoji() + " Likes " + aPost.getLikes());
								
								String listString = String.join(", ", aPost.getHashtags());
								PostList.addElement(listString);
								String List2 = String.join(", ", aPost.getComments());
								PostList.addElement(List2);
							}
							
							else if (aPost.getPostType() == 2) {
								System.out.println("txt");
								PostList.addElement("Por: " + user.getUsername() + " " +  aPost.getDate() + " Post: "+ ((TxtPost) aPost).getPostMSG() + " Likes " + aPost.getLikes());
								
								String listString = String.join(", ", aPost.getHashtags());
								PostList.addElement(listString);
								String List2 = String.join(", ", aPost.getComments());
								PostList.addElement(List2);
							}
							
							else if (aPost.getPostType() == 3) {
								System.out.println("Aud");
								PostList.addElement("Emoji\nA");
								
								String listString = String.join(", ", aPost.getHashtags());
								PostList.addElement(listString);
								String List2 = String.join(", ", aPost.getComments());
								PostList.addElement(List2);
							}
							
							else if (aPost.getPostType() == 4) {
								System.out.println("Img");
								PostList.addElement("Autor: " + aPost.getAuthor() + "" + aPost.getDate() + "Link: " + ((MediaPost) aPost).getLink()+ "Resolucion: " + ((ImagePost) aPost).getResolution()+ "Format: " + ((ImagePost) aPost).getFormat() + "Likes: " + aPost.getLikes());
								
								
								
								String listString = String.join(", ", aPost.getHashtags());
								PostList.addElement(listString);
								
								String List2 = String.join(", ", aPost.getComments());
								PostList.addElement(List2);
							}
							
							else if (aPost.getPostType() == 5) {
								System.out.println("vid");
								PostList.addElement("Emoji\nA");
								
								String listString = String.join(", ", aPost.getHashtags());
								PostList.addElement(listString);
								String List2 = String.join(", ", aPost.getComments());
								PostList.addElement(List2);
							}
							
							
						}
						
						lstPost.setModel(PostList);
					}
					
					
				}

				else {
					JOptionPane.showMessageDialog(null, "Ingrese un criterio de busqueda", "Informacion", JOptionPane.WARNING_MESSAGE, null);
				}
			}
		});
		
	}
}
