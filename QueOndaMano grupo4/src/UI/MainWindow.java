package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import UI.Post;
import UI.content;
import model.User;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.Component;
import UI.UserProfileWindow;
import UI.UploadMediaWindow;
import UI.Emojis;
import net.miginfocom.swing.MigLayout;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;

/**
 * Main window que contiene casi todas las acciones que se puede realizar en la aplicacion
 * @author Fabi
 *
 */
public class MainWindow extends JFrame {

	
	private JPanel contentPane;
	public static JTextField txtComentar;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_4;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_3;
	public static int PublicO = 0;
	
	private MainWindow selfMainWindow;
	private User currentUser;
	private ArrayList<User> AllsavedUsers;
	
	content ventanita;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		this.selfMainWindow = this;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1051, 757);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Post miPost = new Post();
		// content.add(Post);
		miPost.setVisible(true);
		
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\fabio\\Downloads\\ddd.jpg"));
		btnNewButton.setSelectedIcon(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UploadMediaWindow miUpload = new UploadMediaWindow(selfMainWindow);
				miUpload.show();
			}
		});
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PublicO = (PublicO + 1);
				ventanita.run();
			}
		});
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\fabio\\Downloads\\adefds.jpg"));
		btnNewButton_3.setBounds(10, 7, 49, 51);
		contentPane.add(btnNewButton_3);
		
		JDesktopPane Content = new JDesktopPane();
		Content.setBounds(0, 62, 1037, 575);
		ventanita = new content();
		Content.add(ventanita);
		ventanita.setBounds(new Rectangle(0, 0, 1037, 575));
		contentPane.add(Content);
		ventanita.setVisible(true);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\fabio\\Downloads\\Captura de pantalla 2022-10-16 235935.jpg"));
		lblNewLabel_1.setBounds(357, 5, 282, 51);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserProfileWindow miProfile = new UserProfileWindow();
				miProfile.show();
			}
		});
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\fabio\\Downloads\\adss.jpg"));
		btnNewButton_4.setBounds(972, 6, 49, 49);
		contentPane.add(btnNewButton_4);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\fabio\\Downloads\\klksdf.png"));
		btnNewButton_2.setBounds(979, 658, 58, 50);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Emojis miEmoji = new Emojis();
				miEmoji.show();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\fabio\\Downloads\\kkk.jpg"));
		btnNewButton_1.setBounds(920, 658, 49, 50);
		contentPane.add(btnNewButton_1);
		btnNewButton.setBounds(861, 658, 49, 50);
		contentPane.add(btnNewButton);
		
		txtComentar = new JTextField();
		txtComentar.setHorizontalAlignment(SwingConstants.RIGHT);
		txtComentar.setForeground(Color.BLACK);
		txtComentar.setText("dff");
		txtComentar.setBounds(0, 647, 851, 69);
		contentPane.add(txtComentar);
		txtComentar.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtComentar.setColumns(10);
		
		textField = new JTextField();
		textField.setText("m");
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(845, 647, 192, 69);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(0, 3, 1037, 59);
		contentPane.add(textField_1);
		textField_1.setEditable(false);
		textField_1.setEnabled(false);
		textField_1.setBackground(Color.WHITE);
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_1.setColumns(10);
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
