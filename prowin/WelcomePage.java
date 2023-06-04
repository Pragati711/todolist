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
import javax.swing.ImageIcon;
import java.awt.Color;

public class WelcomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage frame = new WelcomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**	 * Create the frame.
	 */
	public WelcomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton b1 = new JButton("Travelling");
		b1.setForeground(new Color(0, 0, 0));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Travelling t=new Travelling();
				t.show();
			}
		});
		b1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b1.setBounds(204, 121, 254, 53);
		contentPane.add(b1);
		
		JButton b2 = new JButton(" Mandatory to do list");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mandatorytodolist d =new Mandatorytodolist();
				d.show();
			}
		});
		b2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b2.setBounds(204, 326, 254, 53);
		contentPane.add(b2);
		
		JButton b3 = new JButton("Spring to do list");
		b3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Springtodolist s=new Springtodolist();
				s.show();
				
				
			}
		});
		b3.setBounds(204, 235, 254, 47);
		contentPane.add(b3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\91741\\OneDrive\\Pictures\\wel1.jpg"));
		lblNewLabel.setBounds(0, 0, 683, 491);
		contentPane.add(lblNewLabel);
	}
}