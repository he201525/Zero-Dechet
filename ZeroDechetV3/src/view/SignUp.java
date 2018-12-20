import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;


public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField PseudotextField;
	private JTextField EmailtextField;
	private JTextField MotdePassetextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
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
			
			JLabel lblErreur = new JLabel("Erreur");
			lblErreur.setHorizontalAlignment(SwingConstants.CENTER);
			lblErreur.setForeground(Color.RED);
			lblErreur.setFont(new Font("Century Gothic", Font.PLAIN, 13));
			lblErreur.setBounds(125, 331, 176, 39);
			contentPane.add(lblErreur);
		
			
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

			JLabel inscriptionLBL = new JLabel("INSCRIPTION");
			inscriptionLBL.setForeground(new Color(0, 0, 128));
			inscriptionLBL.setFont(new Font("Century Gothic", Font.BOLD, 20));
			inscriptionLBL.setBounds(125, 95, 157, 49);
			contentPane.add(inscriptionLBL);


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

			MotdePassetextField = new JTextField();
			MotdePassetextField.setForeground(new Color(0, 0, 128));
			MotdePassetextField.setColumns(10);
			MotdePassetextField.setBounds(125, 280, 176, 38);
			contentPane.add(MotdePassetextField);
			
			
			JLabel bg1 = new JLabel(); // initialization of JLabel
			bg1.setIcon(new ImageIcon("C:\\Users\\Aymeric\\Documents\\Ephec\\bac 2\\Java\\ZeroDechet\\Img\\b1111bis.png"));
			bg1.setBounds(-569, -23, 1027, 618); 
			contentPane.add(bg1);// adding JLabel to content pane		
	}
}
