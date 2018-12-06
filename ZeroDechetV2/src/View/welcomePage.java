package Projet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

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
		setBounds(100, 100, 981, 491);
		connecteBtn = new JPanel();
		connecteBtn.setBackground(SystemColor.textHighlight);
		connecteBtn.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(connecteBtn);
		
		JLabel vBienvenue = new JLabel("Bienvenue \u00E0 toi \r\ncher d\u00E9fenseur \r\r\nde la nature \r\r\n#ZeroD\u00E9chet");
		vBienvenue.setForeground(Color.LIGHT_GRAY);
		vBienvenue.setBackground(SystemColor.window);
		vBienvenue.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		
		JButton ConnecteToiBtn = new JButton("Connecte toi :");
		
		JButton InscritToiBtn = new JButton("Inscrit toi :");
		GroupLayout gl_connecteBtn = new GroupLayout(connecteBtn);
		gl_connecteBtn.setHorizontalGroup(
			gl_connecteBtn.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_connecteBtn.createSequentialGroup()
					.addGroup(gl_connecteBtn.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_connecteBtn.createSequentialGroup()
							.addGap(307)
							.addGroup(gl_connecteBtn.createParallelGroup(Alignment.LEADING, false)
								.addComponent(InscritToiBtn, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ConnecteToiBtn, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)))
						.addGroup(gl_connecteBtn.createSequentialGroup()
							.addGap(104)
							.addComponent(vBienvenue, GroupLayout.PREFERRED_SIZE, 701, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(148, Short.MAX_VALUE))
		);
		gl_connecteBtn.setVerticalGroup(
			gl_connecteBtn.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_connecteBtn.createSequentialGroup()
					.addContainerGap()
					.addComponent(vBienvenue, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
					.addComponent(ConnecteToiBtn)
					.addGap(18)
					.addComponent(InscritToiBtn)
					.addGap(61))
		);
		connecteBtn.setLayout(gl_connecteBtn);
	}
}
