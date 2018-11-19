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

public class LoginForm {

	public JFrame frame;
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
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 954, 606);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.scrollbar);
		panel.setBounds(102, 90, 638, 346);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUsername.setBounds(235, 119, 280, 28);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setEchoChar('*');
		pwdPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pwdPassword.setBounds(235, 181, 280, 28);
		panel.add(pwdPassword);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setBounds(77, 121, 139, 25);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(79, 183, 115, 25);
		panel.add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
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
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBounds(388, 254, 127, 50);
		panel.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancel.setBounds(235, 254, 127, 50);
		panel.add(btnCancel);
		
		lblMessage = new JLabel("");
		lblMessage.setForeground(Color.RED);
		lblMessage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(195, 222, 280, 19);
		panel.add(lblMessage);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(778, 13, 127, 33);
		frame.getContentPane().add(btnRegister);
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnForgetPassword = new JButton("Forget Password");
		btnForgetPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnForgetPassword.setBounds(587, 13, 179, 33);
		frame.getContentPane().add(btnForgetPassword);
	}
}
