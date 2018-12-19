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


	public class SignIn extends JFrame {

		private JPanel contentPane;
		private JTextField PseudotextField;
		private JTextField MotdePassetextField;

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
					} catch (Exception e) {
						e.printStackTrace();
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
			setBounds(100, 100, 410, 450);
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
				
				MotdePassetextField = new JTextField();
				MotdePassetextField.setColumns(10);
				MotdePassetextField.setBounds(124, 240, 176, 26);
				contentPane.add(MotdePassetextField);
				
				
				JLabel bg1 = new JLabel(); // initialization of JLabel
				bg1.setIcon(new ImageIcon("/Users/ZitaAlmasy/Desktop/JAVA/b1111bis.png"));
				bg1.setBounds(-225, -46, 699, 513); 
				contentPane.add(bg1);// adding JLabel to content pane
				
				
				
		}
	}
