package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Travelling extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travelling frame = new Travelling();
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
	public Travelling() {
		getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Adventure camp");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adventurecamp ac =new Adventurecamp();
				ac.show();

			}
		});
		btnNewButton.setBounds(238, 141, 209, 35);
		getContentPane().add(btnNewButton);



		JButton btnNewButton_1 = new JButton("Exploring");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exploring e1 =new Exploring();
				e1.show();


			}
		});
		btnNewButton_1.setBounds(238, 272, 209, 35);
		getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nandk\\OneDrive\\Pictures\\bunchh.png"));
		lblNewLabel.setBounds(0, 10, 660, 474);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\91741\\OneDrive\\Pictures\\travel1.jpg"));
		lblNewLabel_1.setBounds(0, 0, 680, 439);
		getContentPane().add(lblNewLabel_1);
	}
}