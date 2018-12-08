import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;

public class level extends JFrame {

	private JPanel contentPane;
	private JTextField Levelfld;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					level frame = new level();
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
	public level() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Levelfld = new JTextField();
		Levelfld.setBounds(5, 5, 440, 28);
		Levelfld.setFont(new Font("Comfortaa", Font.PLAIN, 15));
		Levelfld.setForeground(new Color(112, 128, 144));
		Levelfld.setBackground(new Color(255, 255, 255));
		Levelfld.setText("Level");
		contentPane.add(Levelfld);
		Levelfld.setColumns(10);
		
		JLabel mission1 = new JLabel("Mission 1");
		mission1.setFont(new Font("Comfortaa", Font.PLAIN, 13));
		mission1.setBackground(new Color(119, 136, 153));
		mission1.setForeground(new Color(255, 255, 255));
		mission1.setBounds(25, 60, 169, 28);
		contentPane.add(mission1);
		
		JLabel mission2 = new JLabel("Mission 2");
		mission2.setForeground(Color.WHITE);
		mission2.setFont(new Font("Comfortaa", Font.PLAIN, 13));
		mission2.setBackground(new Color(119, 136, 153));
		mission2.setBounds(25, 122, 169, 28);
		contentPane.add(mission2);
		
		JLabel mission3v = new JLabel("Mission 3");
		mission3v.setForeground(Color.WHITE);
		mission3v.setFont(new Font("Comfortaa", Font.PLAIN, 13));
		mission3v.setBackground(new Color(119, 136, 153));
		mission3v.setBounds(25, 192, 169, 28);
		contentPane.add(mission3v);
	}
}
