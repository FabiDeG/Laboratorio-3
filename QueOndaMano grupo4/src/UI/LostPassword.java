package UI;

import java.awt.BorderLayout;
import UI.SignInWindow;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Pantalla que ayuda a usuario a recuperar su contrasena
 * @author Fabi
 *
 */
public class LostPassword extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LostPassword frame = new LostPassword();
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
	public LostPassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Se te advirtió... Perdona <3");
		lblNewLabel.setBounds(158, 203, 177, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblAyComoLo = new JLabel("Ay, como lo sentimos...");
		lblAyComoLo.setFont(new Font("Monospaced", Font.PLAIN, 16));
		lblAyComoLo.setBounds(105, 42, 252, 41);
		contentPane.add(lblAyComoLo);
		
		JLabel lblAhoraSoloTe = new JLabel("Ahora solo te queda hacer otra cuenta");
		lblAhoraSoloTe.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblAhoraSoloTe.setBounds(71, 71, 331, 41);
		contentPane.add(lblAhoraSoloTe);
		
		JButton btnNoNosOdies = new JButton("No nos odies");
		btnNoNosOdies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignInWindow miSign = new SignInWindow();
				miSign.show();
			}
		});
		btnNoNosOdies.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNoNosOdies.setBounds(158, 144, 130, 35);
		contentPane.add(btnNoNosOdies);
		
		JLabel lblPresionaAqu = new JLabel("Presiona aquí");
		lblPresionaAqu.setBounds(192, 110, 177, 50);
		contentPane.add(lblPresionaAqu);
	}
}
