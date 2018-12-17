package Projet;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextPane;

public class LvlPlanet extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LvlPlanet frame = new LvlPlanet();
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
	public LvlPlanet() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel terre1 = new JLabel("");
		terre1.setIcon(new ImageIcon("C:\\Users\\Aymeric\\Documents\\Ephec\\bac 2\\Java\\ZeroDechet\\Img\\bg1.png"));
		terre1.setBounds(306, 316, 105, 105);
		contentPane.add(terre1);
		
		JLabel terre2 = new JLabel("");
		terre2.setIcon(new ImageIcon("C:\\Users\\Aymeric\\Documents\\Ephec\\bac 2\\Java\\ZeroDechet\\Img\\bg2.png"));
		terre2.setBounds(148, 316, 105, 105);
		contentPane.add(terre2);
		
		JLabel terre3 = new JLabel("");
		terre3.setIcon(new ImageIcon("C:\\Users\\Aymeric\\Documents\\Ephec\\bac 2\\Java\\ZeroDechet\\Img\\bg3.png"));
		terre3.setBounds(306, 164, 105, 105);
		contentPane.add(terre3);
		
		JLabel terre4 = new JLabel("");
		terre4.setIcon(new ImageIcon("C:\\Users\\Aymeric\\Documents\\Ephec\\bac 2\\Java\\ZeroDechet\\Img\\bg4.png"));
		terre4.setBounds(148, 164, 105, 105);
		contentPane.add(terre4);
		
		JLabel terre5 = new JLabel("");
		terre5.setIcon(new ImageIcon("C:\\Users\\Aymeric\\Documents\\Ephec\\bac 2\\Java\\ZeroDechet\\Img\\bg5.png"));
		terre5.setBounds(306, 13, 105, 105);
		contentPane.add(terre5);
		
		JLabel terre6 = new JLabel("");
		terre6.setIcon(new ImageIcon("C:\\Users\\Aymeric\\Documents\\Ephec\\bac 2\\Java\\ZeroDechet\\Img\\bg6.png"));
		terre6.setBounds(148, 13, 105, 105);
		contentPane.add(terre6);
		
		JTextPane txtLevels = new JTextPane();
		txtLevels.setForeground(new Color(255, 255, 255));
		txtLevels.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		txtLevels.setBackground(new Color(0, 153, 255));
		txtLevels.setText("Levels :");
		txtLevels.setBounds(26, 13, 93, 42);
		contentPane.add(txtLevels);
		
		JTextPane textLvl1 = new JTextPane();
		textLvl1.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		textLvl1.setBackground(new Color(0, 153, 255));
		textLvl1.setForeground(new Color(255, 255, 255));
		textLvl1.setText("1 \u00E0 5");
		textLvl1.setBounds(179, 118, 43, 32);
		contentPane.add(textLvl1);
		
		JTextPane textLvl2 = new JTextPane();
		textLvl2.setBackground(new Color(0, 153, 255));
		textLvl2.setForeground(new Color(255, 255, 255));
		textLvl2.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		textLvl2.setText("6 \u00E0 10");
		textLvl2.setBounds(333, 118, 52, 27);
		contentPane.add(textLvl2);
		
		JTextPane textLvl3 = new JTextPane();
		textLvl3.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		textLvl3.setForeground(new Color(255, 255, 255));
		textLvl3.setBackground(new Color(0, 153, 255));
		textLvl3.setText("11 \u00E0 15");
		textLvl3.setBounds(169, 270, 61, 32);
		contentPane.add(textLvl3);
		
		JTextPane textLvl4 = new JTextPane();
		textLvl4.setForeground(new Color(255, 255, 255));
		textLvl4.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		textLvl4.setBackground(new Color(0, 153, 255));
		textLvl4.setText("16 \u00E0 20");
		textLvl4.setBounds(333, 270, 61, 33);
		contentPane.add(textLvl4);
		
		JTextPane textLvl5 = new JTextPane();
		textLvl5.setBackground(new Color(0, 153, 255));
		textLvl5.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		textLvl5.setForeground(new Color(255, 255, 255));
		textLvl5.setText("21 \u00E0 25");
		textLvl5.setBounds(169, 420, 61, 35);
		contentPane.add(textLvl5);
		
		JTextPane textLvl6 = new JTextPane();
		textLvl6.setForeground(new Color(255, 255, 255));
		textLvl6.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		textLvl6.setBackground(new Color(0, 153, 255));
		textLvl6.setText("26 \u00E0 30");
		textLvl6.setBounds(333, 420, 61, 35);
		contentPane.add(textLvl6);	
	}
}
