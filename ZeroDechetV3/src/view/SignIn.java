import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;


public class SignIn extends JFrame {

	private JPanel contentPane;
	private JTextField PseudotextField;
	private JTextField MotdePasseField;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
					frame.setVisible(true);
				} catch (Exception e) {
					System.out.println("erreur");;
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignIn() {
		setTitle("Z\u00E9roD\u00E9chet");
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
			
			JLabel connectionLBL = new JLabel("CONNECTION");
			connectionLBL.setForeground(new Color(0, 0, 128));
	        connectionLBL.setFont(new Font("Century Gothic", Font.BOLD, 20));
	        connectionLBL.setBounds(125, 95, 157, 49);
	        contentPane.add(connectionLBL);
		
	        JButton InscrireButton = new JButton("GO! ");
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
	        
	        JLabel Erreur = new JLabel("Erreur");
	        Erreur.setHorizontalAlignment(SwingConstants.CENTER);
	        Erreur.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	        Erreur.setForeground(Color.RED);
	        Erreur.setBounds(125, 43, 176, 39);
	        contentPane.add(Erreur);
			
	        JLabel PseudoLBL = new JLabel("Pseudo");
	        PseudoLBL.setForeground(Color.WHITE);
	        PseudoLBL.setFont(new Font("Century Gothic", Font.BOLD, 19));
	        PseudoLBL.setBounds(125, 160, 89, 29);
	        contentPane.add(PseudoLBL);
			
	        JLabel MotdePasseLBL = new JLabel("Mot de Passe");
	        MotdePasseLBL.setForeground(Color.WHITE);
	        MotdePasseLBL.setFont(new Font("Century Gothic", Font.BOLD, 19));
	        MotdePasseLBL.setBounds(125, 250, 192, 36);
	        contentPane.add(MotdePasseLBL);
			
			MotdePasseField = new JPasswordField();
			MotdePasseField.setColumns(10);
			MotdePasseField.setBounds(125, 280, 176, 38);
			MotdePasseField.setForeground(new Color(0, 0, 128));
			contentPane.add(MotdePasseField);
			/*
			InscrireButton.addActionListener(new ActionListener() {
				public void actionPerformed(249, -11ent e) {
					
					
				}
			});
			*/
			JLabel bg1 = new JLabel(); // initialization of JLabel
			bg1.setIcon(new ImageIcon("C:\\Users\\Aymeric\\Documents\\Ephec\\bac 2\\Java\\ZeroDechet\\Img\\b1111bis.png"));
			bg1.setBounds(-141, -14, 699, 513); 
			contentPane.add(bg1);// adding JLabel to content pane
	}
}
