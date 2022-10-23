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
		btnhappyface.setIcon(null);
		btnhappyface.setBounds(10, 10, 50, 50);
		contentPane.add(btnhappyface);
		
		JButton btnreallyhappy = new JButton("");
		btnreallyhappy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(":D");
			}
		});
		btnreallyhappy.setIcon(null);
		btnreallyhappy.setBounds(76, 10, 50, 52);
		contentPane.add(btnreallyhappy);
		
		JButton btnguinio = new JButton("");
		btnguinio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(";)");
			}
		});
		btnguinio.setIcon(null);
		btnguinio.setBounds(144, 10, 50, 52);
		contentPane.add(btnguinio);
		
		JButton btnsorprendido = new JButton("");
		btnsorprendido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("⊙﹏⊙");
			}
		});
		btnsorprendido.setIcon(null);
		btnsorprendido.setBounds(212, 10, 50, 50);
		contentPane.add(btnsorprendido);
		
		JButton btngaru = new JButton("");
		btngaru.setIcon(null);
		btngaru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("ಠ_ಠ");
			}
		});
		btngaru.setBounds(280, 10, 50, 52);
		contentPane.add(btngaru);
		
		JButton btnlloro = new JButton("");
		btnlloro.setIcon(null);
		btnlloro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("ಥ_ಥ");
			}
		});
		btnlloro.setBounds(347, 10, 50, 52);
		contentPane.add(btnlloro);
		
		JButton btntroste = new JButton("");
		btntroste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("(҂◡_◡)");
			}
		});
		btntroste.setIcon(null);
		btntroste.setBounds(419, 10, 50, 50);
		contentPane.add(btntroste);
		
		JButton btnwtf = new JButton("");
		btnwtf.setIcon(null);
		btnwtf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("（　ﾟДﾟ）");
			}
		});
		btnwtf.setBounds(487, 10, 50, 50);
		contentPane.add(btnwtf);
		
		JButton btnuy = new JButton("");
		btnuy.setIcon(null);
		btnuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("( ͡° ͜ʖ ͡°)");
			}
		});
		btnuy.setBounds(10, 72, 50, 50);
		contentPane.add(btnuy);
		
		JButton btnloveeyes = new JButton("");
		btnloveeyes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("♥‿♥");
			}
		});
		btnloveeyes.setIcon(null);
		btnloveeyes.setBounds(76, 72, 50, 50);
		contentPane.add(btnloveeyes);
		
		JButton btnheart = new JButton("");
		btnheart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("♥");
			}
		});
		btnheart.setIcon(null);
		btnheart.setBounds(144, 72, 50, 50);
		contentPane.add(btnheart);
		
		JButton btnbeso = new JButton("");
		btnbeso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("( ˘ ³˘)♥");
			}
		});
		btnbeso.setIcon(null);
		btnbeso.setBounds(212, 72, 50, 50);
		contentPane.add(btnbeso);
		
		JButton btnconsternado = new JButton("");
		btnconsternado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("(._.)");
			}
		});
		btnconsternado.setIcon(null);
		btnconsternado.setBounds(280, 72, 50, 50);
		contentPane.add(btnconsternado);
		
		JButton btnFabi = new JButton("");
		btnFabi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("(;-;)");
			}
		});
		btnFabi.setIcon(null);
		btnFabi.setBounds(347, 72, 50, 50);
		contentPane.add(btnFabi);
		
		JButton btnojitos = new JButton("");
		btnojitos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("(｡◕‿◕｡)");
			}
		});
		btnojitos.setIcon(null);
		btnojitos.setBounds(419, 72, 50, 50);
		contentPane.add(btnojitos);
		
		JButton btnestilo = new JButton("");
		btnestilo.setIcon(null);
		btnestilo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("(っ▀-▀)つ");
			}
		});
		btnestilo.setBounds(487, 72, 50, 50);
		contentPane.add(btnestilo);
		
		JButton btnNewButton_2_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1_1_1_1_1.setBounds(10, 134, 50, 52);
		contentPane.add(btnNewButton_2_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1_1_1_1_1_1.setBounds(76, 134, 50, 52);
		contentPane.add(btnNewButton_2_1_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1_1_1_1_1_1_1.setBounds(144, 134, 50, 52);
		contentPane.add(btnNewButton_2_1_1_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1.setBounds(212, 134, 50, 52);
		contentPane.add(btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(280, 134, 50, 52);
		contentPane.add(btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(347, 134, 50, 52);
		contentPane.add(btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(419, 134, 50, 52);
		contentPane.add(btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(487, 134, 50, 52);
		contentPane.add(btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(10, 196, 50, 52);
		contentPane.add(btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(76, 196, 50, 52);
		contentPane.add(btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(144, 196, 50, 52);
		contentPane.add(btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(212, 196, 50, 52);
		contentPane.add(btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(280, 196, 50, 52);
		contentPane.add(btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(347, 196, 50, 52);
		contentPane.add(btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(419, 196, 50, 52);
		contentPane.add(btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(487, 196, 50, 52);
		contentPane.add(btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(10, 260, 470, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(487, 258, 55, 52);
		contentPane.add(btnNewButton_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1);
	}
}
