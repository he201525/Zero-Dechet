package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import view.SignUp;
import view.SignIn;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Cette classe est la vue pour choisir si on s'inscrit ou se connecte
 * @author Sébastien Raemdonck
 * @author Aymeric Ponjée
 * @author Zita Almasy
 *
 */
public class WelcomePage extends JFrame {

	private JPanel connecteBtn;
	private JButton ConnecteToiBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage frame = new WelcomePage();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void closeWelcomePage() {
		this.dispose();
	}

	/**
	 * Création de la fenêtre 
	 */
	public WelcomePage() {
		
		
		setResizable(false);
		setTitle("Z\u00E9roD\u00E9chet");
		setBackground(SystemColor.desktop);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 500);
		connecteBtn = new JPanel();
		connecteBtn.setBackground(new Color(0, 153, 255));
		connecteBtn.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(connecteBtn);
		
		ConnecteToiBtn = new JButton("Connecte toi :");
		ConnecteToiBtn.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		ConnecteToiBtn.setBounds(47, 351, 315, 25);
		
		JButton InscritToiBtn = new JButton("Inscrit toi :");
		InscritToiBtn.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		InscritToiBtn.setBounds(47, 313, 315, 25);
		SimpleAttributeSet centrer = new SimpleAttributeSet();
		StyleConstants.setAlignment(centrer, StyleConstants.ALIGN_CENTER);
		connecteBtn.setLayout(null);
		
		JLabel lblBienvenueToi = new JLabel("Bienvenue à toi !");
		lblBienvenueToi.setForeground(SystemColor.inactiveCaptionText);
		lblBienvenueToi.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblBienvenueToi.setBounds(121, 93, 234, 45);
		connecteBtn.add(lblBienvenueToi);
		
		JLabel lblCherDefenseurDe = new JLabel("Cher d\u00E9fenseur de la nature ");
		lblCherDefenseurDe.setForeground(SystemColor.inactiveCaptionText);
		lblCherDefenseurDe.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblCherDefenseurDe.setBounds(64, 120, 298, 45);
		connecteBtn.add(lblCherDefenseurDe);
		
		JLabel lblzerodchet = new JLabel("#ZeroD\u00E9chet");
		lblzerodchet.setForeground(SystemColor.inactiveCaptionText);
		lblzerodchet.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblzerodchet.setBounds(134, 187, 144, 45);
		connecteBtn.add(lblzerodchet);
		connecteBtn.add(ConnecteToiBtn);
		connecteBtn.add(InscritToiBtn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Republic\\Desktop\\JAVA\\Fond_blanc.png"));
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(47, 43, 315, 239);
		connecteBtn.add(lblNewLabel);
		
		JLabel lblInsta = new JLabel("Instagram : zerodechetapp");
		lblInsta.setForeground(new Color(255, 255, 255));
		lblInsta.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblInsta.setBounds(35, 429, 210, 25);
		connecteBtn.add(lblInsta);
		
		JLabel lblInfo = new JLabel("N'h\u00E9sitez pas \u00E0 nous envoy\u00E9 vos photos ZeroD\u00E9chet :");
		lblInfo.setForeground(new Color(255, 255, 255));
		lblInfo.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblInfo.setBounds(35, 389, 357, 27);
		connecteBtn.add(lblInfo);
		
		JLabel lblMail = new JLabel("Mail : zerodechetapp@gmail.com");
		lblMail.setForeground(new Color(255, 255, 255));
		lblMail.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblMail.setBounds(35, 415, 234, 16);
		connecteBtn.add(lblMail);
		
		ConnecteToiBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == ConnecteToiBtn) {
					closeWelcomePage();
					SignIn.launch();
					}
				}
		});
		InscritToiBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == InscritToiBtn) {
					closeWelcomePage();
					SignUp.launch();
					}
				}
		});
		
	}
}
