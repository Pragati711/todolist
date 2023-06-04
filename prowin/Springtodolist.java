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

public class Springtodolist extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Springtodolist frame = new Springtodolist();
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
	public Springtodolist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton b1 = new JButton("Decorate Easter eggs");
		b1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Decorateeastereggs de =new Decorateeastereggs();
			de.show();

			}
		});
		b1.setBounds(168, 72, 219, 30);
		contentPane.add(b1);
		
		JButton b3 = new JButton("Have a bonfire");
		b3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Haveabonfire a =new Haveabonfire();
				a.show();
				
			}
		});
		b3.setBounds(168, 162, 219, 31);
		contentPane.add(b3);
		
		JButton b4 = new JButton("Fly a kite");
		b4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Flyakite fk =new Flyakite();
				fk.show();
			}
		});
		b4.setBounds(186, 251, 201, 30);
		contentPane.add(b4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\91741\\OneDrive\\Pictures\\spring1.jpg"));
		lblNewLabel.setBounds(0, 0, 657, 445);
		contentPane.add(lblNewLabel);

		

			}
}

	
