package UILayer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import Business.Login;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Cursor;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;

public class LoginForm {

	public JFrame frmPlagiarismChecker;
	protected JTextField txtUsername;
	protected JPasswordField pwdPassword;
	protected JLabel lblMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
					window.frmPlagiarismChecker.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPlagiarismChecker = new JFrame();
		frmPlagiarismChecker.setTitle("Plagiarism Checker");
		frmPlagiarismChecker.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginForm.class.getResource("/Images/logo.png")));
		frmPlagiarismChecker.setBounds(750, 300, 434, 460);
		frmPlagiarismChecker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPlagiarismChecker.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setBounds(64, 51, 288, 25);
		frmPlagiarismChecker.getContentPane().add(lblUsername);
		lblUsername.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 24));
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setBounds(64, 143, 288, 25);
		frmPlagiarismChecker.getContentPane().add(lblPassword);
		lblPassword.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 24));
		
		txtUsername = new JTextField();
		txtUsername.setBounds(64, 78, 288, 40);
		frmPlagiarismChecker.getContentPane().add(txtUsername);
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(64, 171, 288, 40);
		frmPlagiarismChecker.getContentPane().add(pwdPassword);
		pwdPassword.setEchoChar('*');
		pwdPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(192, 192, 192));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setBounds(144, 254, 127, 50);
		frmPlagiarismChecker.getContentPane().add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login newLogin = new Login(txtUsername.getText(),new String(pwdPassword.getPassword()));
				if(newLogin.isCorrect) {
					lblMessage.setText("Password/username are correct!");
				}else {
					lblMessage.setText("Please check your username/password!");
				}
			}
		});
		btnLogin.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 24));
		
		lblMessage = new JLabel("");
		lblMessage.setBounds(64, 219, 288, 19);
		frmPlagiarismChecker.getContentPane().add(lblMessage);
		lblMessage.setForeground(Color.RED);
		lblMessage.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblRegister = new JLabel("New user? Register here");
		lblRegister.setForeground(new Color(255, 255, 255));
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblRegister.setBounds(58, 317, 319, 22);
		frmPlagiarismChecker.getContentPane().add(lblRegister);
		
		JLabel lblForgotPassword = new JLabel("Forgot password? Click here");
		lblForgotPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblForgotPassword.setForeground(new Color(255, 255, 255));
		lblForgotPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgotPassword.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblForgotPassword.setBounds(58, 342, 319, 22);
		frmPlagiarismChecker.getContentPane().add(lblForgotPassword);
		
		JLabel label = new JLabel("");
		label.setOpaque(true);
		label.setIcon(new ImageIcon(LoginForm.class.getResource("/Images/bck1.png")));
		label.setBounds(0, -34, 416, 447);
		frmPlagiarismChecker.getContentPane().add(label);
	}
}
