package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Search extends JFrame {

	private JPanel contentPane;
	private JTextField txtSearch;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search frame = new Search();
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
	public Search() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\fabio\\Downloads\\asdfer.jpg"));
		btnNewButton.setBounds(618, 15, 48, 50);
		contentPane.add(btnNewButton);
		
		txtSearch = new JTextField();
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
	}

}
