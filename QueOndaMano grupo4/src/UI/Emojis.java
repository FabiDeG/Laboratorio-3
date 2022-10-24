package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AppManagement;
import controller.FileManager;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import model.EmojiPost;
import model.User;
import java.util.ArrayList;

public class Emojis extends JFrame {

	
	private JPanel contentPane;
	private JTextField txtKk;

	/**
	 * Create the frame.
	 */
	public Emojis(ArrayList<User> AllUsers, User ActualUser) {
		AppManagement AppManage = new AppManagement();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 561, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnhappyface = new JButton("");
		btnhappyface.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKk.setText(":)");
			}
		});
		btnhappyface.setIcon(new ImageIcon(Emojis.class.getResource("/documents/happyface.png")));
		btnhappyface.setBounds(48, 33, 50, 50);
		contentPane.add(btnhappyface);
		
		JButton btnreallyhappy = new JButton("");
		btnreallyhappy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKk.setText(":D");
			}
		});
		btnreallyhappy.setIcon(new ImageIcon(Emojis.class.getResource("/documents/reallyhappy.png")));
		btnreallyhappy.setBounds(128, 31, 50, 52);
		contentPane.add(btnreallyhappy);
		
		JButton btnguinio = new JButton("");
		btnguinio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKk.setText(";)");
			}
		});
		btnguinio.setIcon(new ImageIcon(Emojis.class.getResource("/documents/;).png")));
		btnguinio.setBounds(212, 33, 50, 52);
		contentPane.add(btnguinio);
		
		JButton btnsorprendido = new JButton("");
		btnsorprendido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKk.setText(":O");
			}
		});
		btnsorprendido.setIcon(new ImageIcon(Emojis.class.getResource("/documents/sorprendido.png")));
		btnsorprendido.setBounds(293, 33, 50, 50);
		contentPane.add(btnsorprendido);
		
		JButton btngato = new JButton("");
		btngato.setIcon(new ImageIcon(Emojis.class.getResource("/documents/gato.png")));
		btngato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKk.setText(":3");
			}
		});
		btngato.setBounds(90, 104, 50, 50);
		contentPane.add(btngato);
		
		JButton btnpacman = new JButton("");
		btnpacman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKk.setText(":v");
			}
		});
		btnpacman.setIcon(new ImageIcon(Emojis.class.getResource("/documents/pacman.png")));
		btnpacman.setBounds(170, 104, 50, 50);
		contentPane.add(btnpacman);
		
		JButton btnlengua = new JButton("");
		btnlengua.setIcon(new ImageIcon(Emojis.class.getResource("/documents/lengua.png")));
		btnlengua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKk.setText(":P");
			}
		});
		btnlengua.setBounds(251, 104, 50, 50);
		contentPane.add(btnlengua);
		
		JButton btnmuerto = new JButton("");
		btnmuerto.setIcon(new ImageIcon(Emojis.class.getResource("/documents/muerto.png")));
		btnmuerto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKk.setText("(x_x)");
			}
		});
		btnmuerto.setBounds(337, 104, 50, 50);
		contentPane.add(btnmuerto);
		
		JButton btnxd = new JButton("");
		btnxd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKk.setText("XD");
			}
		});
		btnxd.setIcon(new ImageIcon(Emojis.class.getResource("/documents/xdd.png")));
		btnxd.setBounds(419, 104, 50, 50);
		contentPane.add(btnxd);
		
		JButton btnheart = new JButton("");
		btnheart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKk.setText("<3");
			}
		});
		btnheart.setIcon(new ImageIcon(Emojis.class.getResource("/documents/heart.png")));
		btnheart.setBounds(48, 174, 50, 50);
		contentPane.add(btnheart);
		
		JButton btnching = new JButton("");
		btnching.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKk.setText("(-_-)");
			}
		});
		btnching.setIcon(new ImageIcon(Emojis.class.getResource("/documents/ching.png")));
		btnching.setBounds(128, 174, 50, 50);
		contentPane.add(btnching);
		
		JButton btnconsternado = new JButton("");
		btnconsternado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKk.setText("(._.)");
			}
		});
		btnconsternado.setIcon(new ImageIcon(Emojis.class.getResource("/documents/consternado.png")));
		btnconsternado.setBounds(212, 174, 50, 50);
		contentPane.add(btnconsternado);
		
		JButton btnFabi = new JButton("");
		btnFabi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKk.setText("(;-;)");
			}
		});
		btnFabi.setIcon(new ImageIcon(Emojis.class.getResource("/documents/faby.png")));
		btnFabi.setBounds(293, 174, 50, 50);
		contentPane.add(btnFabi);
		
		JButton btnmeh = new JButton("");
		btnmeh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKk.setText(":l");
			}
		});
		btnmeh.setIcon(new ImageIcon(Emojis.class.getResource("/documents/meh.png")));
		btnmeh.setBounds(371, 174, 50, 50);
		contentPane.add(btnmeh);
		
		JButton btnojito = new JButton("");
		btnojito.setIcon(new ImageIcon(Emojis.class.getResource("/documents/ojito.png")));
		btnojito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKk.setText("(*-*)");
			}
		});
		btnojito.setBounds(455, 174, 50, 50);
		contentPane.add(btnojito);
		
		txtKk = new JTextField();
		txtKk.setFont(new Font("Calibri", Font.PLAIN, 22));
		txtKk.setBounds(10, 260, 470, 50);
		contentPane.add(txtKk);
		txtKk.setColumns(10);
		
		JButton bntsend = new JButton("");
		bntsend.setIcon(new ImageIcon(Emojis.class.getResource("/documents/klksdf.png")));
		bntsend.setBounds(487, 258, 55, 52);
		contentPane.add(bntsend);
		bntsend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmojiPost newEmoji = new EmojiPost(ActualUser.getUsername(), txtKk.getText());
				AppManage.SavePostToUser(AllUsers, ActualUser,newEmoji);// the post is saved to the specific user and added to the arrayList
				FileManager fileManager = new FileManager();
				fileManager.SaveAllUsersToFile(AllUsers);
			}
		});
		
		JButton btnnoveo = new JButton("");
		btnnoveo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKk.setText(">-<");
			}
		});
		btnnoveo.setIcon(new ImageIcon(Emojis.class.getResource("/documents/noveo.png")));
		btnnoveo.setBounds(371, 33, 50, 50);
		contentPane.add(btnnoveo);
		
		JButton btnbailando = new JButton("");
		btnbailando.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKk.setText("t(-_-t)");
			}
		});
		btnbailando.setIcon(new ImageIcon(Emojis.class.getResource("/documents/dancing.png")));
		btnbailando.setBounds(455, 33, 50, 50);
		contentPane.add(btnbailando);
	}
}
