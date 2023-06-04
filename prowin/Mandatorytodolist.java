package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Mandatorytodolist extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mandatorytodolist frame = new Mandatorytodolist();
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
	public Mandatorytodolist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton b1 = new JButton("Dream job");
		b1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dreamjob1 o =new Dreamjob1();
				o.show();

			}
		});
		b1.setBounds(233, 117, 154, 30);
		contentPane.add(b1);

		JButton b2 = new JButton("Live the life at fullest");
		b2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Livethelifeatfullest a =new Livethelifeatfullest();
			a.show();

			}
		});
		b2.setBounds(205, 235, 220, 30);
		contentPane.add(b2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\91741\\OneDrive\\Pictures\\mand1.jpg"));
		lblNewLabel.setBounds(0, 0, 647, 456);
		contentPane.add(lblNewLabel);

	}
}