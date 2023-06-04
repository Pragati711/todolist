package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Dreamjob1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dreamjob1 frame = new Dreamjob1();
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
	public Dreamjob1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Dream job");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(41, 24, 146, 45);
		contentPane.add(lblNewLabel);

		JLabel l1 = new JLabel("");
		l1.setForeground(new Color(0, 0, 0));
		l1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l1.setBounds(39, 198, 586, 13);
		contentPane.add(l1);
		l1.setText("New York Jobs");

		JLabel l2 = new JLabel("");
		l2.setForeground(new Color(0, 0, 0));
		l2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l2.setBounds(39, 221, 605, 13);
		contentPane.add(l2);
		l2.setText("San Francisco Jobs");


		JLabel l3 = new JLabel("");
		l3.setForeground(new Color(0, 0, 0));
		l3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l3.setBounds(38, 244, 533, 13);
		contentPane.add(l3);
	    l3.setText("Marketing Jobs");

		JLabel l4 = new JLabel("");
		l4.setForeground(new Color(0, 0, 0));
		l4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l4.setBounds(41, 267, 662, 13);
		contentPane.add(l4);
		l4.setText("Seattle Jobs");
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\91741\\OneDrive\\Pictures\\drejob1.jpg"));
		lblNewLabel_1.setBounds(0, 0, 680, 494);
		contentPane.add(lblNewLabel_1);

	}

}