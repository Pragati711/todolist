package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Flyakite extends JFrame {

	private JPanel contentPane;
	private JLabel l3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flyakite  frame = new Flyakite ();
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
	public Flyakite() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Fly a kite ");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(45, 78, 149, 13);
		contentPane.add(lblNewLabel);

		JLabel l1 = new JLabel("");
		l1.setForeground(new Color(0, 0, 0));
		l1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l1.setBounds(45, 150, 555, 13);
		contentPane.add(l1);
		l1.setText("1.Delta Kites.");

		JLabel l2 = new JLabel("");
		l2.setForeground(new Color(0, 0, 0));
		l2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l2.setBounds(45, 173, 452, 13);
		contentPane.add(l2);
		l2.setText("2.Diamond kites.");

		l3 = new JLabel("");
		l3.setForeground(new Color(0, 0, 0));
		l3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l3.setBounds(45, 188, 452, 31);
		contentPane.add(l3);
		l3.setText("3.Parafoil kites.");

		JLabel l4 = new JLabel("");
		l4.setForeground(new Color(0, 0, 0));
		l4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l4.setBounds(40, 220, 457, 13);
		contentPane.add(l4);
		l4.setText("4.Sled kites.");

		

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\nandk\\Downloads\\apppppppllllee bk (1).jpg"));
		lblNewLabel_1.setBounds(0, 0, 675, 473);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\91741\\OneDrive\\Pictures\\fly1.jpg"));
		lblNewLabel_2.setBounds(0, 0, 675, 473);
		contentPane.add(lblNewLabel_2);
	}
}