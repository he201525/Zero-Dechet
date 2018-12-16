package Projet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;

public class welcomePage extends JFrame {

	private JPanel connecteBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcomePage frame = new welcomePage();
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
	public welcomePage() {
		setBackground(SystemColor.desktop);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		connecteBtn = new JPanel();
		connecteBtn.setBackground(new Color(0, 153, 255));
		connecteBtn.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(connecteBtn);
		
		JButton ConnecteToiBtn = new JButton("Connecte toi :");
		
		JButton InscritToiBtn = new JButton("Inscrit toi :");
		
		JTextPane txtDeBienvenue = new JTextPane();
		txtDeBienvenue.setForeground(new Color(102, 102, 102));
		SimpleAttributeSet centrer = new SimpleAttributeSet();
		StyleConstants.setAlignment(centrer, StyleConstants.ALIGN_CENTER);
		txtDeBienvenue.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		txtDeBienvenue.setText("Bienvenue \u00E0 toi !\r\nCher d\u00E9fenseur de la nature \r\n\r\n\r\n#ZeroD\u00E9chet");
		GroupLayout gl_connecteBtn = new GroupLayout(connecteBtn);
		gl_connecteBtn.setHorizontalGroup(
			gl_connecteBtn.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_connecteBtn.createSequentialGroup()
					.addGap(64)
					.addGroup(gl_connecteBtn.createParallelGroup(Alignment.LEADING, false)
						.addComponent(ConnecteToiBtn, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(InscritToiBtn, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
						.addComponent(txtDeBienvenue, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 486, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(70, Short.MAX_VALUE))
		);
		gl_connecteBtn.setVerticalGroup(
			gl_connecteBtn.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_connecteBtn.createSequentialGroup()
					.addContainerGap(25, Short.MAX_VALUE)
					.addComponent(txtDeBienvenue, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(ConnecteToiBtn)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(InscritToiBtn)
					.addGap(60))
		);
		connecteBtn.setLayout(gl_connecteBtn);
	}
}
