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
					frame.setUndecorated(true);
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
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
			
			JButton InscrireButton = new JButton("GO! ");
			InscrireButton.setBackground(new Color(240, 248, 255));
			InscrireButton.setForeground(new Color(0, 153, 255));
			InscrireButton.setFont(new Font("Comfortaa", Font.PLAIN, 13));
			InscrireButton.setBounds(262, 372, 117, 29);
			contentPane.add(InscrireButton);
			
			PseudotextField = new JTextField();
			PseudotextField.setBounds(124, 136, 176, 26);
			contentPane.add(PseudotextField);
			PseudotextField.setColumns(10);
			
			JLabel emailLBL = new JLabel("Email");
			emailLBL.setForeground(Color.WHITE);
			emailLBL.setFont(new Font("Comfortaa", Font.BOLD, 15));
			emailLBL.setBounds(124, 186, 61, 16);
			contentPane.add(emailLBL);
			
			JLabel PseudoLBL = new JLabel("Pseudo");
			PseudoLBL.setForeground(Color.WHITE);
			PseudoLBL.setFont(new Font("Comfortaa", Font.BOLD, 15));
			PseudoLBL.setBounds(124, 116, 61, 16);
			contentPane.add(PseudoLBL);
			
			EmailtextField = new JTextField();
			EmailtextField.setColumns(10);
			EmailtextField.setBounds(124, 206, 176, 26);
			contentPane.add(EmailtextField);
			
			JLabel MotdePasseLBL = new JLabel("Mot de Passe");
			MotdePasseLBL.setForeground(Color.WHITE);
			MotdePasseLBL.setFont(new Font("Comfortaa", Font.BOLD, 15));
			MotdePasseLBL.setBounds(124, 260, 130, 16);
			contentPane.add(MotdePasseLBL);
			
			MotdePassetextField = new JTextField();
			MotdePassetextField.setColumns(10);
			MotdePassetextField.setBounds(124, 276, 176, 26);
			contentPane.add(MotdePassetextField);
			
			
			JLabel bg1 = new JLabel(); // initialization of JLabel
			bg1.setIcon(new ImageIcon("/Users/ZitaAlmasy/Desktop/JAVA/b1111bis.png"));
			bg1.setBounds(-225, -46, 699, 513); 
			contentPane.add(bg1);// adding JLabel to content pane
			
			
			
	}
}
