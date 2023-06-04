package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Decorateeastereggs extends JFrame {

	private JPanel contentPane;
	private JLabel l3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Decorateeastereggs frame = new Decorateeastereggs();
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
	public Decorateeastereggs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Decorate easter eggs");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel.setBounds(45, 78, 210, 13);
		contentPane.add(lblNewLabel);

		JLabel l1 = new JLabel("");
		l1.setForeground(new Color(0, 0, 0));
		l1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l1.setBounds(10, 150, 788, 13);
		contentPane.add(l1);
		l1.setText("From tattos to pom-pom eggs to once with celebrity faces & the iconic doors from palm springs. ");

		JLabel l2 = new JLabel("");
		l2.setForeground(new Color(0, 0, 0));
		l2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l2.setBounds(45, 173, 452, 13);
		contentPane.add(l2);
		l2.setText("1.Watercolor tattoo easter eggs.");

		l3 = new JLabel("");
		l3.setForeground(new Color(0, 0, 0));
		l3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l3.setBounds(45, 188, 452, 31);
		contentPane.add(l3);
		l3.setText("2.Celebrity easter eggs");

		JLabel l4 = new JLabel("");
		l4.setForeground(new Color(0, 0, 0));
		l4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l4.setBounds(40, 220, 457, 13);
		contentPane.add(l4);
		l4.setText("3.Nesting easter eggs");

		JLabel l5 = new JLabel("");
		l5.setForeground(new Color(0, 0, 0));
		l5.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l5.setBounds(40, 243, 457, 13);
		contentPane.add(l5);
		l5.setText("4.Palm spring easter eggs.");
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\91741\\OneDrive\\Pictures\\decorate1.jpg"));
		lblNewLabel_1.setBounds(0, 0, 808, 483);
		contentPane.add(lblNewLabel_1);

	}
}