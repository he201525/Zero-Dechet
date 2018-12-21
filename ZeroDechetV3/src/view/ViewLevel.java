package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Joueur;
import model.Level;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class ViewLevel extends JFrame {

	private JPanel contentPane;
	private JLabel mission1;
	private JLabel mission2;
	private JLabel mission3;
	private JLabel XpRecu;
	
	private JTextField levelfld;
	private JTextField XPm2;
	private JTextField XPm1;
	private JTextField XPm3;
	private JTextField totalXP;
	private JLabel fondOrange;
	private JButton ok1BTN;
	private JButton no1BTN;
	private JButton ok2BTN;
	private JButton no2BTN;
	private JButton ok3BTN;
	private JButton no3BTN;
	private JTextField grism1txt;
	private JTextField grism2txt;
	private JTextField grism3txt;
	private JLabel lblMission1;
	private JLabel lblMission2;
	private JLabel lblMission3;
	private JLabel gris1;
	private JLabel gris2;
	private JLabel gris3;

	static Level lvl;
	static Joueur player;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					player = new Joueur();
					//lvl = new Level(1);
					ViewLevel frame = new ViewLevel();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewLevel() {
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
		
		mission1 = new JLabel("Mission1");
		mission1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		mission1.setBackground(new Color(119, 136, 153));
		mission1.setForeground(new Color(255, 255, 255));
		mission1.setBounds(25, 58, 169, 28);
		contentPane.add(mission1);
		
		mission2 = new JLabel("Mission2");
		mission2.setForeground(Color.WHITE);
		mission2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		mission2.setBackground(new Color(119, 136, 153));
		mission2.setBounds(25, 197, 169, 28);
		contentPane.add(mission2);
		
		mission3 = new JLabel("Mission3");
		mission3.setForeground(Color.WHITE);
		mission3.setFont(new Font("Century Gothic", Font.BOLD, 14));
		mission3.setBackground(new Color(119, 136, 153));
		mission3.setBounds(25, 332, 169, 28);
		contentPane.add(mission3);
		
		XpRecu =  new JLabel(Integer.toString(player.getExpUser()));
		XpRecu.setHorizontalAlignment(SwingConstants.RIGHT);
		XpRecu.setForeground(Color.WHITE);
		XpRecu.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		XpRecu.setBounds(268, 20, 52, 27);
		contentPane.add(XpRecu);
		
		fondOrange = new JLabel("");
		fondOrange.setIcon(new ImageIcon("C:\\Users\\Republic\\Desktop\\JAVA\\fond_orange.png"));
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
		totalXP.setFont(new Font("Century Gothic", Font.BOLD, 13));
		totalXP.setColumns(10);
		totalXP.setBackground(new Color(255, 102, 0));
		totalXP.setBounds(323, 19, 66, 28);
		contentPane.add(totalXP);
		
		levelfld = new JTextField();
		levelfld.setEditable(false);
		levelfld.setHorizontalAlignment(SwingConstants.LEFT);
		levelfld.setBounds(6, 6, 398, 50);
		levelfld.setFont(new Font("Century Gothic", Font.BOLD, 20));
		levelfld.setForeground(new Color(102, 102, 102));
		levelfld.setBackground(new Color(255, 255, 255));
		levelfld.setText("Level " );
		contentPane.add(levelfld);
		levelfld.setColumns(10);
		
		XPm1 = new JTextField();
		XPm1.setEditable(false);
		XPm1.setText(""/*lvl.getMissions().get(0).getExp() + " XP"*/);
		XPm1.setHorizontalAlignment(SwingConstants.CENTER);
		XPm1.setForeground(Color.WHITE);
		XPm1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		XPm1.setColumns(10);
		XPm1.setBackground(new Color(255, 102, 0));
		XPm1.setBounds(308, 60, 77, 26);
		contentPane.add(XPm1);
		
		XPm2 = new JTextField();
		XPm2.setEditable(false);
		XPm2.setBackground(new Color(255, 102, 0));
		XPm2.setForeground(new Color(255, 255, 255));
		XPm2.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		XPm2.setHorizontalAlignment(SwingConstants.CENTER);
		XPm2.setText(""/*lvl.getMissions().get(1).getExp() + " XP"*/);
		XPm2.setBounds(308, 197, 77, 26);
		contentPane.add(XPm2);
		XPm2.setColumns(10);
		
		XPm3 = new JTextField();
		XPm3.setEditable(false);
		XPm3.setText(""/*lvl.getMissions().get(2).getExp() + " XP"*/);
		XPm3.setHorizontalAlignment(SwingConstants.CENTER);
		XPm3.setForeground(Color.WHITE);
		XPm3.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		XPm3.setColumns(10);
		XPm3.setBackground(new Color(255, 102, 0));
		XPm3.setBounds(308, 333, 77, 26);
		contentPane.add(XPm3);
		
		ok1BTN = new JButton("V");
		ok1BTN.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		ok1BTN.setBackground(new Color(51, 204, 0));
		ok1BTN.setBounds(349, 100, 47, 28);
		contentPane.add(ok1BTN);
		
		no1BTN = new JButton("X");
		no1BTN.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		no1BTN.setBackground(new Color(204, 51, 0));
		no1BTN.setBounds(349, 140, 47, 28);
		contentPane.add(no1BTN);
		
		ok2BTN = new JButton("V");
		ok2BTN.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		ok2BTN.setBackground(new Color(51, 204, 0));
		ok2BTN.setBounds(349, 235, 47, 28);
		contentPane.add(ok2BTN);
		
		no2BTN = new JButton("X");
		no2BTN.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		no2BTN.setBackground(new Color(204, 51, 0));
		no2BTN.setBounds(349, 275, 47, 28);
		contentPane.add(no2BTN);
		
		ok3BTN = new JButton("V");
		ok3BTN.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		ok3BTN.setBackground(new Color(51, 204, 0));
		ok3BTN.setBounds(349, 371, 47, 28);
		contentPane.add(ok3BTN);
		
		no3BTN = new JButton("X");
		no3BTN.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		no3BTN.setBackground(new Color(204, 51, 0));
		no3BTN.setBounds(349, 411, 47, 28);
		contentPane.add(no3BTN);
		
		grism1txt = new JTextField();
		grism1txt.setForeground(Color.WHITE);
		grism1txt.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		grism1txt.setEditable(false);
		grism1txt.setColumns(10);
		grism1txt.setBackground(new Color(153, 153, 153));
		grism1txt.setBounds(344, 81, 58, 100);
		contentPane.add(grism1txt);
		
		grism2txt = new JTextField();
		grism2txt.setForeground(Color.WHITE);
		grism2txt.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		grism2txt.setEditable(false);
		grism2txt.setColumns(10);
		grism2txt.setBackground(new Color(153, 153, 153));
		grism2txt.setBounds(344, 220, 58, 100);
		contentPane.add(grism2txt);
		
		grism3txt = new JTextField();
		grism3txt.setForeground(Color.WHITE);
		grism3txt.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		grism3txt.setEditable(false);
		grism3txt.setColumns(10);
		grism3txt.setBackground(new Color(153, 153, 153));
		grism3txt.setBounds(344, 355, 58, 100);
		contentPane.add(grism3txt);
		
		lblMission1 = new JLabel(/*lvl.getMissions().get(0).getContenu()*/);
		lblMission1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblMission1.setForeground(Color.WHITE);
		lblMission1.setBounds(16, 81, 321, 100);
		contentPane.add(lblMission1);
		
		lblMission2 = new JLabel(/*lvl.getMissions().get(1).getContenu()*/);
		lblMission2.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblMission2.setForeground(Color.WHITE);
		lblMission2.setBounds(16, 220, 321, 100);
		contentPane.add(lblMission2);
		
		lblMission3 = new JLabel(/*lvl.getMissions().get(2).getContenu()*/);
		lblMission3.setForeground(Color.WHITE);
		lblMission3.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblMission3.setBounds(16, 355, 321, 100);
		contentPane.add(lblMission3);
		
		gris1 = new JLabel("");
		gris1.setIcon(new ImageIcon("C:\\Users\\Republic\\Desktop\\JAVA\\Fond_gris.png"));
		gris1.setBounds(16, 81, 321, 100);
		contentPane.add(gris1);
		
		gris2 = new JLabel("");
		gris2.setIcon(new ImageIcon("C:\\Users\\Republic\\Desktop\\JAVA\\Fond_gris.png"));
		gris2.setBounds(16, 220, 321, 100);
		contentPane.add(gris2);
		
		gris3 = new JLabel("");
		gris3.setIcon(new ImageIcon("C:\\Users\\Republic\\Desktop\\JAVA\\Fond_gris.png"));
		gris3.setBounds(16, 355, 321, 100);
		contentPane.add(gris3);
	}
}
