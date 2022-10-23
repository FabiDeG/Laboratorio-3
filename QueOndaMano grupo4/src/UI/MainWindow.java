package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import UI.content;
import controller.AppManagement;
import controller.FileManager;
import model.NUser;
import model.User;
import model.Post;
import model.TxtPost;
import UI.Search;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import UI.UserProfileWindow;
import UI.UploadMediaWindow;
import UI.Emojis;
import net.miginfocom.swing.MigLayout;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 * Main window that have all the bottons and txt to start posting and search
 * @author Fabi
 *
 */
public class MainWindow extends JFrame{

	
	private JPanel contentPane;
	public static JTextField txtComentar;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField textField_1;
	private JButton btnNewButton_4;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_3;
	public static int PublicO = 0;
	private JButton btnLike;
	private JButton btnComentar;
	
	private MainWindow selfMainWindow;
	
	// Variables from MODEL package
	private User currentUser;
	private ArrayList<User> AllsavedUsers;
	
	// Variables from CONTROLLER package
	private AppManagement appMan;
	
	
	content ventanita;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow(null);
					frame.addWindowListener(new WindowListener() {
						public void windowClosing(WindowEvent e) {
							JOptionPane.showMessageDialog(null, "Saving to file...", "Información", JOptionPane.WARNING_MESSAGE, null);
							//The method to save all to the file need to be implemented SaveMediatoFile FROM FileManager
							frame.dispose();
							System.exit(0);
						}
						public void windowOpened(WindowEvent e) {}
						public void windowClosed(WindowEvent e) {}
						public void windowIconified(WindowEvent e) {}
						public void windowDeiconified(WindowEvent e) {}
						public void windowActivated(WindowEvent e) {}
						public void windowDeactivated(WindowEvent e) {}
					});
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
	public MainWindow(User TheCurrentuser) {
		this.selfMainWindow = this;
		
		// Reading all the saved users in the UserPost file and saving them to the arrayList
		// That will contain all the saved users
		FileManager FileManager = new FileManager();
		AllsavedUsers = FileManager.getUsersFromFile();
		// Current user that is using the program (Temporarily set to the first saved user in the file, to make tests)
		for (User user : AllsavedUsers) {
			if(user.getUsername().equals(TheCurrentuser.getUsername())) {
				currentUser = user;
			}
		}
		
		
		
		// Initialize the controller variables
		appMan = new AppManagement();
		
		//--------------------------------------------------------------
		// Set layout manager for UI components
		//--------------------------------------------------------------
		Toolkit screenData = this.getToolkit();
		Dimension tama = screenData.getScreenSize();
		this.setSize(583, 406);
		this.setLocationRelativeTo(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(3, 3));
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("QueOndaMano grupo4/bin/documents/adss"));
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
		Box row1 = Box.createHorizontalBox();
		panel1.add(row1);
		//--------------------------------------------------------------
		

		// ******************************************************
		// * FIRST GROUP OF ITEMS
		// ******************************************************
		// Make a search with an specific criteria
		btnNewButton_3 = new JButton("");
		panel1.add(btnNewButton_3);
		btnNewButton_3.setIcon(new ImageIcon(MainWindow.class.getResource("/documents/asdfer.jpg")));
		btnNewButton_3.setMinimumSize(new Dimension(70, 50));
		btnNewButton_3.setPreferredSize(new Dimension(50, 50));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search mySearch = new Search(AllsavedUsers, null);
				mySearch.show();
			}
		});
		
		btnNewButton_7 = new JButton("");
		btnNewButton_7.setIcon(new ImageIcon(MainWindow.class.getResource("/documents/izquierdo.png")));
		btnNewButton_7.setPreferredSize(new Dimension(50, 50));
		btnNewButton_7.setMinimumSize(new Dimension(96, 50));
		panel1.add(btnNewButton_7);
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon(MainWindow.class.getResource("/documents/Captura de pantalla 2022-10-16 235935.jpg")));
		btnNewButton_5.setSelectedIcon(new ImageIcon(MainWindow.class.getResource("/documents/Captura de pantalla 2022-10-16 235935.jpg")));
		btnNewButton_5.setPreferredSize(new Dimension(275, 60));
		btnNewButton_5.setMinimumSize(new Dimension(70, 50));
		panel1.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("");
		btnNewButton_6.setIcon(new ImageIcon(MainWindow.class.getResource("/documents/Descargas")));
		btnNewButton_6.setPreferredSize(new Dimension(50, 50));
		btnNewButton_6.setMinimumSize(new Dimension(96, 50));
		panel1.add(btnNewButton_6);
		
		// Search by HASHTAG (#)
		btnNewButton_4 = new JButton("");
		panel1.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(MainWindow.class.getResource("/documents/adss.jpg")));
		btnNewButton_4.setMinimumSize(new Dimension(96, 50));
		btnNewButton_4.setPreferredSize(new Dimension(45, 50));
		panel1.add(lblNewLabel_1);
		// ******************************************************
		// * FIRST GROUP OF ITEMS
		// ******************************************************
		
		
		
		
		// ******************************************************
		// * SECOND GROUP OF ITEMS
		// ******************************************************  
		DefaultListModel<String> modelo = new DefaultListModel<>();
		JList posts = new JList();
		posts.setModel(modelo);
		posts.setMinimumSize(new Dimension(400, 200));
		posts.setPreferredSize(new Dimension(400, 200));
		// Show the posts from the current user
		/*
		ArrayList<Post> userPosts = currentUser.getUserPosts();
		Post postAux = null;
		for (int k = 0; k < userPosts.size(); k++) {
			if (userPosts.g)
			postAux = userPosts.get(k);
			postAux.getPostMSG();
		}
		*/
		// Comment button
		btnComentar = new JButton("Comentar");
		btnComentar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnComentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//UserProfileWindow miProfile = new UserProfileWindow();
				//miProfile.show();
				int selectedPost = posts.getSelectedIndex();
				if (selectedPost > -1) {
					String coment1 = JOptionPane.showInputDialog(null, "Ingresa un comentario", "Comment", JOptionPane.NO_OPTION);
					if (coment1 != null && !coment1.trim().isEmpty()) {
						modelo.add(selectedPost + 1, "     " + coment1);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Necesitas seleccionar un Post", "Información", JOptionPane.WARNING_MESSAGE, null);
				}
			}
		});
		btnComentar.setIcon(null);
		btnComentar.setMinimumSize(new Dimension(100, 50));
		btnComentar.setPreferredSize(new Dimension(100, 50));
		btnComentar.setMaximumSize(new Dimension(100, 50));
		// Like button
		btnLike = new JButton("");
		btnLike.setSelectedIcon(new ImageIcon(MainWindow.class.getResource("/documents/Sinlike.png")));
		btnLike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//---------------------------------------------------
				int selectedPost = posts.getSelectedIndex();
				if (selectedPost > -1) {
					JOptionPane.showMessageDialog(null, "LIKE", "Información", JOptionPane.WARNING_MESSAGE, null);
					int selectedPostToComment = posts.getSelectedIndex();
					btnLike.setIcon(new ImageIcon(MainWindow.class.getResource("/documents/Sinlike.png")));
					// This method needs to be created
					//appMan.CommentPost();
				}
				else {
					JOptionPane.showMessageDialog(null, "Necesitas seleccionar un Post para darle LIKE", "Informacion", JOptionPane.WARNING_MESSAGE, null);
				}
			}
		});
		btnLike.setIcon(new ImageIcon(MainWindow.class.getResource("/documents/Sinliike.png")));
		btnLike.setMinimumSize(new Dimension(100, 50));
		btnLike.setPreferredSize(new Dimension(50, 50));
		btnLike.setMaximumSize(new Dimension(100, 50));
		
		
		Box col = Box.createVerticalBox();
		col.add(btnComentar);
		col.add(btnLike);
		JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		panel2.add(posts);
		panel2.add(col);
		// ******************************************************
		// * SECOND GROUP OF ITEMS
		// ******************************************************
		
		
		
		
		
		// ******************************************************
		// * LAST GROUP OF ITEMS
		// ******************************************************
		txtComentar = new JTextField();
		txtComentar.setHorizontalAlignment(SwingConstants.RIGHT);
		txtComentar.setForeground(Color.BLACK);
		txtComentar.setText("dff");
		txtComentar.setBounds(0, 647, 851, 69);
		txtComentar.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtComentar.setColumns(15);
		
		// UPLOAD FILE BTN --------------------------------------------------
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(MainWindow.class.getResource("/documents/ddd.jpg")));
		btnNewButton.setMinimumSize(new Dimension(50, 50));
		btnNewButton.setPreferredSize(new Dimension(50, 50));
		btnNewButton.setSelectedIcon(new ImageIcon(MainWindow.class.getResource("/documents/ddd.jpg")));
		btnNewButton.addActionListener(new ActionListener() {
			///////////////////////////////////////////////////////////////////////////////////////////////////
			public void actionPerformed(ActionEvent e) {
				// Calling the next window and giving the main window as a parameter to to later modify information
				UploadMediaWindow miUpload = new UploadMediaWindow(selfMainWindow);
				miUpload.show();
			}
		});
		
		// EMOJI BTN --------------------------------------------------
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Emojis miEmoji = new Emojis();
				miEmoji.show();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(MainWindow.class.getResource("/documents/kkk.jpg")));
		btnNewButton_1.setMinimumSize(new Dimension(100, 50));
		btnNewButton_1.setPreferredSize(new Dimension(50, 50));

		// PUBLISH BTN --------------------------------------------------
		btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aux = txtComentar.getText();
				String hashTags[] = null;
				if (aux != null && !aux.isEmpty()) {
					modelo.addElement(aux);
					txtComentar.setText("");
					// Split input string
					ArrayList<String> hashTagsArr = null;
					if (aux.contains("#")) {
						hashTagsArr = new ArrayList<String>();
						hashTags = aux.split("#");
						for (int i = 1; i < hashTags.length; i++) {
							hashTagsArr.add("#" + hashTags[i].trim());
						}
					}
					else {
						
						hashTags = new String[1];
						hashTags[0] = aux;
					}
					// *********************************
					// * create a text post
					// *********************************
					TxtPost postToSave = new TxtPost(currentUser.getUsername(), hashTags[0].trim());
					postToSave.setLikes(0);
					if(!(hashTagsArr == null)) {
						postToSave.setHashtags(hashTagsArr);
					}	
					// Save the Post
					appMan.SavePostToUser(AllsavedUsers, currentUser, postToSave);
					FileManager.SaveAllUsersToFile(AllsavedUsers);
				}
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(MainWindow.class.getResource("/documents/klksdf.png")));
		btnNewButton_2.setMinimumSize(new Dimension(52, 50));
		btnNewButton_2.setPreferredSize(new Dimension(55, 50));
		Box row3 = Box.createHorizontalBox();
		row3.add(txtComentar);
		row3.add(btnNewButton);
		row3.add(btnNewButton_1);
		row3.add(btnNewButton_2);
		// ******************************************************
		// * LAST GROUP OF ITEMS
		// ******************************************************
		

		getContentPane().add(panel2, BorderLayout.CENTER);
		getContentPane().add(row3, BorderLayout.SOUTH);
		getContentPane().add(panel1, BorderLayout.NORTH);
		this.pack();
		
	}

	public int getPublicO() {
		return PublicO;
	}

	public void setPublicO(int publicO) {
		PublicO = publicO;
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

	public ArrayList<User> getAllsavedUsers() {
		return AllsavedUsers;
	}

	public void setAllsavedUsers(ArrayList<User> allsavedUsers) {
		AllsavedUsers = allsavedUsers;
	}
}
