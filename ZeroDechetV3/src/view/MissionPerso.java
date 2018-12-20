import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MissionPerso extends JFrame {
	private JPanel contentPane;
	private JTextField levelfld;
	private JTextField phraseM1txt;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MissionPerso frame = new MissionPerso();
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
	public MissionPerso() {
		setTitle("Z\u00E9roD\u00E9chet");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton flecheBTN = new JButton("");
		flecheBTN.setIcon(new ImageIcon("/Users/ZitaAlmasy/Desktop/JAVA/flèche.png"));
		flecheBTN.setBackground(new Color(51, 204, 0));
		flecheBTN.setBounds(26, 404, 68, 55);
		contentPane.add(flecheBTN);
		
		JButton envoyerBTN = new JButton("Envoyer");
		envoyerBTN.setBackground(new Color(51, 204, 0));
		envoyerBTN.setForeground(Color.WHITE);
		envoyerBTN.setFont(new Font("Comfortaa", Font.PLAIN, 13));
		envoyerBTN.setBounds(296, 389, 94, 28);
		contentPane.add(envoyerBTN);
		
		JLabel mission1 = new JLabel("Laisse nous ton idée dans la case grise");
		mission1.setToolTipText("");
		mission1.setFont(new Font("Comfortaa", Font.BOLD, 14));
		mission1.setBackground(new Color(119, 136, 153));
		mission1.setForeground(new Color(255, 255, 255));
		mission1.setBounds(21, 128, 333, 28);
		contentPane.add(mission1);
		
		JLabel fondOrange = new JLabel("");
		fondOrange.setIcon(new ImageIcon("C:\\Users\\Aymeric\\Documents\\Ephec\\bac 2\\Java\\ZeroDechet\\Img\\fond_orange.png"));
		fondOrange.setHorizontalAlignment(SwingConstants.RIGHT);
		fondOrange.setForeground(Color.WHITE);
		fondOrange.setFont(new Font("Comfortaa", Font.BOLD, 13));
		fondOrange.setBackground(new Color(255, 102, 0));
		fondOrange.setBounds(285, 19, 41, 28);
		contentPane.add(fondOrange);

		
		
		
		JTextPane monIdeeJtextp = new JTextPane();
		monIdeeJtextp.setBackground(new Color(153, 153, 153));
		monIdeeJtextp.setForeground(Color.WHITE);
		monIdeeJtextp.setFont(new Font("Comfortaa", Font.PLAIN, 13));
		monIdeeJtextp.setBounds(21, 168, 367, 201);
		contentPane.add(monIdeeJtextp);
		
		JTextPane titre = new JTextPane();
		titre.setBounds(22, 30, 366, 51);
		titre.setFont(new Font("Comfortaa", Font.BOLD, 20));
		titre.setForeground(new Color(102, 102, 102));
		titre.setBackground(new Color(255, 255, 255));
		titre.setText("As-tu des idées de missions pour atteindre le zéro dechet ? ");
		contentPane.add(titre);
	}
}
