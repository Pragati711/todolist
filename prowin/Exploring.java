package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Exploring extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exploring frame = new Exploring();
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
	public Exploring() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Exploring");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel.setBounds(24, 55, 133, 13);
		contentPane.add(lblNewLabel);

		JLabel l1 = new JLabel("");
		l1.setForeground(new Color(0, 0, 0));
		l1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l1.setBounds(10, 108, 399, 13);
		contentPane.add(l1);
		l1.setText("Learning different cultures.");

		JLabel l2 = new JLabel("");
		l2.setForeground(new Color(0, 0, 0));
		l2.setFont(new Font("Times New Roman", Font.BOLD, 21));
		l2.setBounds(0, 153, 433, 13);
		contentPane.add(l2);
		l2.setText("Learning different languages");

		JLabel l3 = new JLabel("");
		l3.setForeground(new Color(0, 0, 0));
		l3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l3.setBounds(0, 204, 433, 13);
		contentPane.add(l3);
		l3.setText("Exploring tastes");
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\91741\\OneDrive\\Pictures\\expl.jpg"));
		lblNewLabel_1.setBounds(0, 0, 663, 392);
		contentPane.add(lblNewLabel_1);
	}

}