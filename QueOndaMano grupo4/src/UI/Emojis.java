package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Emojis extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emojis frame = new Emojis();
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
	public Emojis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnhappyface = new JButton("");
		btnhappyface.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(":)");
			}
		});
		btnhappyface.setIcon(new ImageIcon(Emojis.class.getResource("/documents/happyface.png")));
		btnhappyface.setBounds(48, 33, 50, 50);
		contentPane.add(btnhappyface);
		
		JButton btnreallyhappy = new JButton("");
		btnreallyhappy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(":D");
			}
		});
		btnreallyhappy.setIcon(new ImageIcon(Emojis.class.getResource("/documents/reallyhappy.png")));
		btnreallyhappy.setBounds(128, 31, 50, 52);
		contentPane.add(btnreallyhappy);
		
		JButton btnguinio = new JButton("");
		btnguinio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(";)");
			}
		});
		btnguinio.setIcon(new ImageIcon(Emojis.class.getResource("/documents/;).png")));
		btnguinio.setBounds(212, 33, 50, 52);
		contentPane.add(btnguinio);
		
		JButton btnsorprendido = new JButton("");
		btnsorprendido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("⊙﹏⊙");
			}
		});
		btnsorprendido.setIcon(new ImageIcon(Emojis.class.getResource("/documents/sorprendido.png")));
		btnsorprendido.setBounds(293, 33, 50, 50);
		contentPane.add(btnsorprendido);
		
		JButton btngaru = new JButton("");
		btngaru.setIcon(null);
		btngaru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("ಠ_ಠ");
			}
		});
		btngaru.setBounds(90, 104, 50, 50);
		contentPane.add(btngaru);
		
		JButton btntroste = new JButton("");
		btntroste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("(҂◡_◡)");
			}
		});
		btntroste.setIcon(null);
		btntroste.setBounds(170, 104, 50, 50);
		contentPane.add(btntroste);
		
		JButton btnwtf = new JButton("");
		btnwtf.setIcon(null);
		btnwtf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("（　ﾟДﾟ）");
			}
		});
		btnwtf.setBounds(251, 104, 50, 50);
		contentPane.add(btnwtf);
		
		JButton btnuy = new JButton("");
		btnuy.setIcon(null);
		btnuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("( ͡° ͜ʖ ͡°)");
			}
		});
		btnuy.setBounds(337, 104, 50, 50);
		contentPane.add(btnuy);
		
		JButton btnloveeyes = new JButton("");
		btnloveeyes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("♥‿♥");
			}
		});
		btnloveeyes.setIcon(null);
		btnloveeyes.setBounds(419, 104, 50, 50);
		contentPane.add(btnloveeyes);
		
		JButton btnheart = new JButton("");
		btnheart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("<3");
			}
		});
		btnheart.setIcon(new ImageIcon(Emojis.class.getResource("/documents/heart.png")));
		btnheart.setBounds(48, 174, 50, 50);
		contentPane.add(btnheart);
		
		JButton btnbeso = new JButton("");
		btnbeso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("( ˘ ³˘)♥");
			}
		});
		btnbeso.setIcon(null);
		btnbeso.setBounds(128, 174, 50, 50);
		contentPane.add(btnbeso);
		
		JButton btnconsternado = new JButton("");
		btnconsternado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("(._.)");
			}
		});
		btnconsternado.setIcon(new ImageIcon(Emojis.class.getResource("/documents/consternado.png")));
		btnconsternado.setBounds(212, 174, 50, 50);
		contentPane.add(btnconsternado);
		
		JButton btnFabi = new JButton("");
		btnFabi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("(;-;)");
			}
		});
		btnFabi.setIcon(new ImageIcon(Emojis.class.getResource("/documents/faby.png")));
		btnFabi.setBounds(293, 174, 50, 50);
		contentPane.add(btnFabi);
		
		JButton btnojitos = new JButton("");
		btnojitos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("(｡◕‿◕｡)");
			}
		});
		btnojitos.setIcon(null);
		btnojitos.setBounds(371, 174, 50, 50);
		contentPane.add(btnojitos);
		
		JButton btnestilo = new JButton("");
		btnestilo.setIcon(null);
		btnestilo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("(っ▀-▀)つ");
			}
		});
		btnestilo.setBounds(455, 174, 50, 50);
		contentPane.add(btnestilo);
		
		textField = new JTextField();
		textField.setBounds(10, 260, 470, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton bntsend = new JButton("");
		bntsend.setIcon(new ImageIcon(Emojis.class.getResource("/documents/klksdf.png")));
		bntsend.setBounds(487, 258, 55, 52);
		contentPane.add(bntsend);
		
		JButton btnuy_1 = new JButton("");
		btnuy_1.setBounds(371, 33, 50, 50);
		contentPane.add(btnuy_1);
		
		JButton btnuy_1_1 = new JButton("");
		btnuy_1_1.setBounds(455, 33, 50, 50);
		contentPane.add(btnuy_1_1);
	}
}
