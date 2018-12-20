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

public class level extends JFrame {

	private JPanel contentPane;
	private JTextField levelfld;
	private JTextField phraseM1txt;
	private JTextField pharseM2txt;
	private JTextField phraseM3txt;
	private JTextField XPm2;
	private JTextField XPm1;
	private JTextField XPm3;
	private JTextField totalXP;

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
		
		JButton no3BTN = new JButton("");
		no3BTN.setBackground(new Color(204, 51, 0));
		no3BTN.setBounds(355, 411, 41, 28);
		contentPane.add(no3BTN);
		
		JButton no2BTN = new JButton("");
		no2BTN.setBackground(new Color(204, 51, 0));
		no2BTN.setBounds(355, 275, 41, 28);
		contentPane.add(no2BTN);
		
		JButton no1BTN = new JButton("");
		no1BTN.setBackground(new Color(204, 51, 0));
		no1BTN.setBounds(355, 140, 41, 28);
		contentPane.add(no1BTN);
		
		JButton ok3BTN = new JButton("");
		ok3BTN.setBackground(new Color(51, 204, 0));
		ok3BTN.setBounds(355, 371, 41, 28);
		contentPane.add(ok3BTN);
		
		JButton ok2BTN = new JButton("");
		ok2BTN.setBackground(new Color(51, 204, 0));
		ok2BTN.setBounds(355, 235, 41, 28);
		contentPane.add(ok2BTN);
		
		JButton ok1BTN = new JButton("");
		ok1BTN.setBackground(new Color(51, 204, 0));
		ok1BTN.setBounds(355, 100, 41, 28);
		contentPane.add(ok1BTN);
		
		JLabel mission1 = new JLabel("Mission 1");
		mission1.setFont(new Font("Comfortaa", Font.BOLD, 14));
		mission1.setBackground(new Color(119, 136, 153));
		mission1.setForeground(new Color(255, 255, 255));
		mission1.setBounds(25, 58, 169, 28);
		contentPane.add(mission1);
		
		JLabel mission2 = new JLabel("Mission 2");
		mission2.setForeground(Color.WHITE);
		mission2.setFont(new Font("Comfortaa", Font.PLAIN, 13));
		mission2.setBackground(new Color(119, 136, 153));
		mission2.setBounds(25, 197, 169, 28);
		contentPane.add(mission2);
		
		JLabel mission3v = new JLabel("Mission 3");
		mission3v.setForeground(Color.WHITE);
		mission3v.setFont(new Font("Comfortaa", Font.PLAIN, 13));
		mission3v.setBackground(new Color(119, 136, 153));
		mission3v.setBounds(25, 332, 169, 28);
		contentPane.add(mission3v);
		
		XPm2 = new JTextField();
		XPm2.setEditable(false);
		XPm2.setBackground(new Color(255, 102, 0));
		XPm2.setForeground(new Color(255, 255, 255));
		XPm2.setFont(new Font("Comfortaa", Font.PLAIN, 13));
		XPm2.setHorizontalAlignment(SwingConstants.CENTER);
		XPm2.setText("150 XP");
		XPm2.setBounds(308, 197, 77, 26);
		contentPane.add(XPm2);
		XPm2.setColumns(10);
		
		XPm1 = new JTextField();
		XPm1.setEditable(false);
		XPm1.setText("150 XP");
		XPm1.setHorizontalAlignment(SwingConstants.CENTER);
		XPm1.setForeground(Color.WHITE);
		XPm1.setFont(new Font("Comfortaa", Font.PLAIN, 13));
		XPm1.setColumns(10);
		XPm1.setBackground(new Color(255, 102, 0));
		XPm1.setBounds(308, 60, 77, 26);
		contentPane.add(XPm1);
		
		XPm3 = new JTextField();
		XPm3.setEditable(false);
		XPm3.setText("150 XP");
		XPm3.setHorizontalAlignment(SwingConstants.CENTER);
		XPm3.setForeground(Color.WHITE);
		XPm3.setFont(new Font("Comfortaa", Font.PLAIN, 13));
		XPm3.setColumns(10);
		XPm3.setBackground(new Color(255, 102, 0));
		XPm3.setBounds(308, 333, 77, 26);
		contentPane.add(XPm3);
		
		JLabel XpRecu = new JLabel("");
		XpRecu.setHorizontalAlignment(SwingConstants.RIGHT);
		XpRecu.setForeground(Color.WHITE);
		XpRecu.setFont(new Font("Comfortaa", Font.PLAIN, 13));
		XpRecu.setBounds(268, 20, 52, 27);
		contentPane.add(XpRecu);
		
		JLabel fondOrange = new JLabel("");
		fondOrange.setIcon(new ImageIcon("C:\\Users\\Aymeric\\Documents\\Ephec\\bac 2\\Java\\ZeroDechet\\Img\\fond_orange.png"));
		fondOrange.setHorizontalAlignment(SwingConstants.RIGHT);
		fondOrange.setForeground(Color.WHITE);
		fondOrange.setFont(new Font("Comfortaa", Font.BOLD, 13));
		fondOrange.setBackground(new Color(255, 102, 0));
		fondOrange.setBounds(285, 19, 41, 28);
		contentPane.add(fondOrange);
		
		totalXP = new JTextField();
		totalXP.setEditable(false);
		totalXP.setText(" /  150 XP");
		totalXP.setHorizontalAlignment(SwingConstants.RIGHT);
		totalXP.setForeground(Color.WHITE);
		totalXP.setFont(new Font("Comfortaa", Font.BOLD, 13));
		totalXP.setColumns(10);
		totalXP.setBackground(new Color(255, 102, 0));
		totalXP.setBounds(323, 19, 66, 28);
		contentPane.add(totalXP);
		
		levelfld = new JTextField();
		levelfld.setEditable(false);
		levelfld.setHorizontalAlignment(SwingConstants.LEFT);
		levelfld.setBounds(6, 6, 398, 50);
		levelfld.setFont(new Font("Comfortaa", Font.BOLD, 20));
		levelfld.setForeground(new Color(102, 102, 102));
		levelfld.setBackground(new Color(255, 255, 255));
		levelfld.setText("Level x");
		contentPane.add(levelfld);
		levelfld.setColumns(10);
		
		phraseM1txt = new JTextField();
		phraseM1txt.setEditable(false);
		phraseM1txt.setBackground(new Color(153, 153, 153));
		phraseM1txt.setForeground(Color.WHITE);
		phraseM1txt.setFont(new Font("Comfortaa", Font.PLAIN, 13));
		phraseM1txt.setText(" Achète locale bb");
		phraseM1txt.setBounds(6, 81, 398, 100);
		contentPane.add(phraseM1txt);
		phraseM1txt.setColumns(10);
		
		pharseM2txt = new JTextField();
		pharseM2txt.setEditable(false);
		pharseM2txt.setText(" Ramasse 5 canettes");
		pharseM2txt.setForeground(new Color(255, 255, 255));
		pharseM2txt.setFont(new Font("Comfortaa", Font.PLAIN, 13));
		pharseM2txt.setColumns(10);
		pharseM2txt.setBackground(new Color(153, 153, 153));
		pharseM2txt.setBounds(6, 220, 398, 100);
		contentPane.add(pharseM2txt);
		
		phraseM3txt = new JTextField();
		phraseM3txt.setEditable(false);
		phraseM3txt.setText(" Fait un composte dans le fond de ton jardin");
		phraseM3txt.setForeground(Color.WHITE);
		phraseM3txt.setFont(new Font("Comfortaa", Font.PLAIN, 13));
		phraseM3txt.setColumns(10);
		phraseM3txt.setBackground(new Color(153, 153, 153));
		phraseM3txt.setBounds(6, 355, 398, 100);
		contentPane.add(phraseM3txt);
	}
}
