package view;

//import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import model.Joueur;


import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import view.LvlPlanet;

/**
 * @author Sébastien
 *
 */
public class SignUp extends JFrame implements ActionListener, Observer {

	private JPanel contentPane;
	private JTextField PseudotextField;
	private JTextField EmailtextField;
	private JTextField MotdePassetextField;
	private JLabel MotdePasseLBL;
	private JLabel bg1;
	
	JPasswordField MotdePasseField;
	JButton InscrireButton;
	JLabel inscriptionLBL;
	JLabel PseudoLBL;
	
	Joueur player = new Joueur();
	LvlPlanet level = new LvlPlanet();
	
	
	/**
	 * Launch the application.
	 */
	public static void launch(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void closeSignUp() {
		this.dispose();
	}

	/**
	 * Create the frame.
	 */
	public SignUp() {
		
		
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
			
		InscrireButton = new JButton("GO! ");
        InscrireButton.setBackground(new Color(0, 0, 128));
        InscrireButton.setForeground(Color.WHITE);
        InscrireButton.setFont(new Font("Century Gothic", Font.BOLD, 13));
        InscrireButton.setBounds(154, 383, 117, 38);
        contentPane.add(InscrireButton);

        PseudotextField = new JTextField();
        PseudotextField.setForeground(new Color(0, 0, 128));
        PseudotextField.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        PseudotextField.setBounds(125, 190, 176, 38);
        contentPane.add(PseudotextField);
        PseudotextField.setColumns(10);

        inscriptionLBL = new JLabel("INSCRIPTION");
        inscriptionLBL.setForeground(new Color(0, 0, 128));
        inscriptionLBL.setFont(new Font("Century Gothic", Font.BOLD, 20));
        inscriptionLBL.setBounds(125, 95, 157, 49);
        contentPane.add(inscriptionLBL);

        PseudoLBL = new JLabel("Pseudo");
        PseudoLBL.setForeground(Color.WHITE);
        PseudoLBL.setFont(new Font("Century Gothic", Font.BOLD, 19));
        PseudoLBL.setBounds(125, 160, 89, 29);
        contentPane.add(PseudoLBL);

        MotdePasseLBL = new JLabel("Mot de Passe");
        MotdePasseLBL.setForeground(Color.WHITE);
        MotdePasseLBL.setFont(new Font("Century Gothic", Font.BOLD, 19));
        MotdePasseLBL.setBounds(125, 250, 192, 36);
        contentPane.add(MotdePasseLBL);

        MotdePasseField = new JPasswordField();
        MotdePasseField.setForeground(new Color(0, 0, 128));
        MotdePasseField.setColumns(10);
        MotdePasseField.setBounds(125, 280, 176, 38);
        contentPane.add(MotdePasseField);
			
			
		bg1 = new JLabel(); // initialization of JLabel
		bg1.setIcon(new ImageIcon("C:\\Users\\Republic\\Desktop\\JAVA\\b1111bis.png"));
		bg1.setBounds(-227, -44, 703, 563); 
		contentPane.add(bg1);// adding JLabel to content pane
		
		InscrireButton.addActionListener(this);
			
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == InscrireButton) {
			if(player.Register(PseudotextField.getText(), MotdePasseField.getText())) {
				closeSignUp();
				SignIn.launch();
			}
		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
}
