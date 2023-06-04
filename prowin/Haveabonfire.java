package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Haveabonfire extends JFrame {

	private JPanel contentPane;
	private JLabel l3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Haveabonfire frame = new Haveabonfire();
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
	public Haveabonfire() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Have a bonfire");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(45, 78, 246, 13);
		contentPane.add(lblNewLabel);

		JLabel l1 = new JLabel("");
		l1.setForeground(new Color(255, 255, 255));
		l1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l1.setBounds(45, 150, 555, 13);
		contentPane.add(l1);
		l1.setText("Firewood");

		JLabel l2 = new JLabel("");
		l2.setForeground(new Color(255, 255, 255));
		l2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l2.setBounds(45, 173, 452, 13);
		contentPane.add(l2);
		l2.setText("Bug Spray");

		l3 = new JLabel("");
		l3.setForeground(new Color(255, 255, 255));
		l3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l3.setBounds(45, 188, 452, 31);
		contentPane.add(l3);
		l3.setText("Food.");

		JLabel l4 = new JLabel("");
		l4.setForeground(new Color(255, 255, 255));
		l4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l4.setBounds(40, 220, 457, 13);
		contentPane.add(l4);
		l4.setText("Speakers.");

		JLabel l5 = new JLabel("");
		l5.setForeground(new Color(255, 255, 255));
		l5.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l5.setBounds(40, 243, 457, 13);
		contentPane.add(l5);
		l5.setText("Camping chair");

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\91741\\OneDrive\\Pictures\\bonfire1.jpg"));
		lblNewLabel_1.setBounds(-10, 51, 675, 354);
		contentPane.add(lblNewLabel_1);
		
		JLabel l6 = new JLabel("New label");
		l6.setForeground(new Color(255, 255, 255));
		l6.setBounds(45, 268, 131, 13);
		contentPane.add(l6);
		l6.setText("MarshMellow Skewers");
	}
}