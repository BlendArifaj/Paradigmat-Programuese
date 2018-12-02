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

import com.sun.java.swing.plaf.windows.resources.windows;

import javax.swing.UIManager;
import java.awt.Frame;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Point;
import java.awt.ComponentOrientation;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginForm {

	public JFrame frmLogin;
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
					window.frmLogin.setVisible(true);
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
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		frmLogin = new JFrame();
		JButton btnCancel = new JButton("Cancel");
		frmLogin.getContentPane().setBackground(new Color(72, 209, 204));
		frmLogin.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		frmLogin.setBackground(new Color(238, 232, 170));
		frmLogin.setExtendedState(Frame.MAXIMIZED_BOTH);
		frmLogin.setBounds(new Rectangle(0, 0, 0, 0));
		frmLogin.setUndecorated(true);
		frmLogin.setResizable(false);
		frmLogin.setVisible(true);
		///////////////////////////////////////////////
		frmLogin.setTitle("Login");
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginForm.class.getResource("/Images/logo.png")));
		frmLogin.setBounds(0, 0, screenSize.width, screenSize.height);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(new Color(245, 245, 245));
		loginPanel.setBounds(743, 195, 434, 690);
		frmLogin.getContentPane().add(loginPanel);
		loginPanel.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(73, 327, 288, 25);
		loginPanel.add(lblUsername);
		lblUsername.setForeground(new Color(0, 0, 0));
		lblUsername.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 24));
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(73, 419, 288, 25);
		loginPanel.add(lblPassword);
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 24));
		
		JButton btnLogin = new JButton("Login");
		txtUsername = new JTextField();
		txtUsername.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				      btnLogin.doClick();
				   }
				if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				      btnCancel.doClick();
				   }
			}
		});
		txtUsername.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsername.setBorder(null);
		txtUsername.setBackground(new Color(211, 211, 211));
		txtUsername.setName("");
		txtUsername.setToolTipText("");
		txtUsername.setBounds(73, 354, 288, 40);
		loginPanel.add(txtUsername);
		txtUsername.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 24));
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				      btnLogin.doClick();
				   }
				if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				      btnCancel.doClick();
				   }
			}
		});
		pwdPassword.setHorizontalAlignment(SwingConstants.CENTER);
		pwdPassword.setBorder(null);
		pwdPassword.setBackground(new Color(211, 211, 211));
		pwdPassword.setToolTipText("");
		pwdPassword.setBounds(73, 447, 288, 40);
		loginPanel.add(pwdPassword);
		pwdPassword.setEchoChar('*');
		pwdPassword.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 24));
		
		
		btnLogin.setBounds(73, 530, 127, 50);
		loginPanel.add(btnLogin);
		btnLogin.setBackground(new Color(95, 158, 160));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login newLogin = new Login(txtUsername.getText(),new String(pwdPassword.getPassword()));
				if(newLogin.isCorrect) {
					frmLogin.setVisible(false);
					Dashboard newd = new Dashboard(newLogin);
					//newd.frame.setVisible(true);
					frmMain o=new frmMain();
					o.setVisible(true);
							
				}else {
					lblMessage.setText("Please check your username/password!");
				}
			}
		});
		btnLogin.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 24));
		
		btnCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancel.setBounds(234, 530, 127, 50);
		loginPanel.add(btnCancel);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmLogin.dispose();
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 24));
		btnCancel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		btnCancel.setBackground(new Color(95, 158, 160));
		
		lblMessage = new JLabel("");
		lblMessage.setBounds(73, 495, 288, 19);
		loginPanel.add(lblMessage);
		lblMessage.setForeground(Color.RED);
		lblMessage.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblRegister = new JLabel("New user? Register here");
		lblRegister.setBounds(73, 618, 288, 22);
		loginPanel.add(lblRegister);
		lblRegister.setForeground(new Color(0, 0, 0));
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		lblRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		JLabel lblForgotPassword = new JLabel("Forgot password? Click here");
		lblForgotPassword.setBounds(73, 642, 288, 22);
		loginPanel.add(lblForgotPassword);
		lblForgotPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblForgotPassword.setForeground(new Color(0, 0, 0));
		lblForgotPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgotPassword.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(LoginForm.class.getResource("/Images/loginPic.png")));
		label.setBounds(88, 30, 256, 256);
		loginPanel.add(label);
	}
}
