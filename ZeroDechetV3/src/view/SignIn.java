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
					frame.setUndecorated(true);
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
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
			InscrireButton.setBounds(269, 354, 117, 29);
			contentPane.add(InscrireButton);
			
			PseudotextField = new JTextField();
			PseudotextField.setBounds(124, 165, 176, 26);
			contentPane.add(PseudotextField);
			PseudotextField.setColumns(10);
			
			JLabel PseudoLBL = new JLabel("Pseudo");
			PseudoLBL.setForeground(Color.WHITE);
			PseudoLBL.setFont(new Font("Comfortaa", Font.BOLD, 15));
			PseudoLBL.setBounds(124, 145, 61, 16);
			contentPane.add(PseudoLBL);
			
			JLabel MotdePasseLBL = new JLabel("Mot de Passe");
			MotdePasseLBL.setForeground(Color.WHITE);
			MotdePasseLBL.setFont(new Font("Comfortaa", Font.BOLD, 15));
			MotdePasseLBL.setBounds(124, 220, 130, 16);
			contentPane.add(MotdePasseLBL);
			
			MotdePasseField = new JPasswordField();
			MotdePasseField.setColumns(10);
			MotdePasseField.setBounds(124, 240, 176, 26);
			contentPane.add(MotdePasseField);
			/*
			InscrireButton.addActionListener(new ActionListener() {
				public void actionPerformed(249, -11ent e) {
					
					
				}
			});
			*/
			JLabel bg1 = new JLabel(); // initialization of JLabel
			bg1.setIcon(new ImageIcon("C:\\Users\\Republic\\Desktop\\JAVA\\b1111bis.png"));
			bg1.setBounds(-225, -46, 699, 513); 
			contentPane.add(bg1);// adding JLabel to content pane
	}
}
