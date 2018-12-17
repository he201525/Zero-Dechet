import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Component;
import java.awt.Dimension;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private String path;
	private JTextField PseudotextField;
	private JTextField EmailtextField;
	private JTextField MotdePassetextField;
	private JTextField ConfirmerLeMotdePassetextField;

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
		setBounds(100, 100, 709, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
			
			JButton InscrireButton = new JButton("GO! ");
			InscrireButton.setBackground(new Color(0, 255, 0));
			InscrireButton.setForeground(new Color(0, 191, 255));
			InscrireButton.setFont(new Font("Comfortaa", Font.PLAIN, 13));
			InscrireButton.setBounds(28, 271, 117, 29);
			contentPane.add(InscrireButton);
			path="Images/bg1.png"; // path to the image
			
			PseudotextField = new JTextField();
			PseudotextField.setBounds(18, 37, 130, 26);
			contentPane.add(PseudotextField);
			PseudotextField.setColumns(10);
			
			JSeparator separator = new JSeparator();
			separator.setBounds(25, 251, 130, 12);
			contentPane.add(separator);
			
			JLabel emailLBL = new JLabel("Email");
			emailLBL.setForeground(new Color(105, 105, 105));
			emailLBL.setFont(new Font("Comfortaa", Font.PLAIN, 13));
			emailLBL.setBounds(18, 76, 61, 16);
			contentPane.add(emailLBL);
			
			JLabel PseudoLBL = new JLabel("Pseudo");
			PseudoLBL.setForeground(new Color(105, 105, 105));
			PseudoLBL.setFont(new Font("Comfortaa", Font.PLAIN, 13));
			PseudoLBL.setBounds(18, 21, 61, 16);
			contentPane.add(PseudoLBL);
			
			EmailtextField = new JTextField();
			EmailtextField.setColumns(10);
			EmailtextField.setBounds(18, 92, 137, 26);
			contentPane.add(EmailtextField);
			
			JLabel MotdePasseLBL = new JLabel("Mot de Passe");
			MotdePasseLBL.setForeground(new Color(105, 105, 105));
			MotdePasseLBL.setFont(new Font("Comfortaa", Font.PLAIN, 13));
			MotdePasseLBL.setBounds(18, 130, 137, 16);
			contentPane.add(MotdePasseLBL);
			
			MotdePassetextField = new JTextField();
			MotdePassetextField.setColumns(10);
			MotdePassetextField.setBounds(18, 147, 137, 26);
			contentPane.add(MotdePassetextField);
			
			JLabel ConfirmerLeMotdePasseLBL = new JLabel("Confirmer le Mot de Passe");
			ConfirmerLeMotdePasseLBL.setForeground(new Color(105, 105, 105));
			ConfirmerLeMotdePasseLBL.setFont(new Font("Comfortaa", Font.PLAIN, 13));
			ConfirmerLeMotdePasseLBL.setBounds(18, 185, 279, 16);
			contentPane.add(ConfirmerLeMotdePasseLBL);
			
			ConfirmerLeMotdePassetextField = new JTextField();
			ConfirmerLeMotdePassetextField.setColumns(10);
			ConfirmerLeMotdePassetextField.setBounds(19, 202, 137, 26);
			contentPane.add(ConfirmerLeMotdePassetextField);
			
			
			JLabel bg1 = new JLabel(); // initialization of JLabel
			bg1.setIcon(new ImageIcon("/Users/ZitaAlmasy/Desktop/JAVA/bg11.png"));
			bg1.setBounds(168, 0, 381, 330); 
			contentPane.add(bg1);// adding JLabel to content pane
			Image newImg = img.getScaledInstance(bg1.getWidth(), bg1.getHeight(), Image.SCALE_SMOOTH); 
			ImageIcon MyImage = new ImageIcon(path); // set the path to the MyImage
			Image img = MyImage.getImage(); // converting ImageIcon into Image
			//then scaling of this image to the size of JLabel
			ImageIcon image = new ImageIcon(newImg); // finally set the image to the JLabel ...
			
			
	}
}
