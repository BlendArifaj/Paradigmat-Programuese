package UILayer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSplitPane;
import java.awt.Point;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JScrollPane;
import java.awt.Component;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Frame;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;

public class frmMain extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMain frame = new frmMain();
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
	public frmMain() {
		setUndecorated(true);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocationByPlatform(true);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, screenSize.width, screenSize.height);
		contentPane = new JPanel();
		contentPane.setMinimumSize(new Dimension(4000, 10));
		contentPane.setPreferredSize(new Dimension(4000, 10));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setMaximumSize(new Dimension(160, 32767));
		panel.setBackground(new Color(51, 51, 51));
		panel.setPreferredSize(new Dimension(250, 10));
		panel.setBounds(new Rectangle(0, 0, 200, 0));
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(null);
		
		JLabel lblC1 = new JLabel("");
		lblC1.setOpaque(true);
		lblC1.setBackground(new Color(0, 255, 255));
		lblC1.setBounds(238, 86, 12, 85);
		panel.add(lblC1);
		
		JLabel lblNotificationsZero = new JLabel("");
		lblNotificationsZero.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNotificationsZero.setIcon(new ImageIcon(frmMain.class.getResource("/Images/notification_zero.png")));
		lblNotificationsZero.setBounds(100, 86, 50, 50);
		panel.add(lblNotificationsZero);
		
		JLabel lblC2 = new JLabel("");
		lblC2.setOpaque(true);
		lblC2.setBackground(Color.CYAN);
		lblC2.setBounds(238, 275, 12, 82);
		panel.add(lblC2);
		
		JLabel lblC3 = new JLabel("");
		lblC3.setOpaque(true);
		lblC3.setBackground(Color.CYAN);
		lblC3.setBounds(238, 461, 12, 82);
		panel.add(lblC3);
		
		JLabel lblC4 = new JLabel("");
		lblC4.setOpaque(true);
		lblC4.setBackground(Color.CYAN);
		lblC4.setBounds(238, 647, 12, 82);
		panel.add(lblC4);
		
		JLabel lblNewLabel = new JLabel("Notifications");
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setForeground(new Color(169, 169, 169));
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblNewLabel.setBounds(61, 138, 128, 30);
		panel.add(lblNewLabel);
		
		JLabel label_13 = new JLabel("");
		label_13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_13.setIcon(new ImageIcon(frmMain.class.getResource("/Images/dashboard_diploma_icon.png")));
		label_13.setBounds(100, 275, 50, 50);
		panel.add(label_13);
		
		JLabel lblDiploma = new JLabel("Thesis");
		lblDiploma.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblDiploma.setForeground(new Color(169, 169, 169));
		lblDiploma.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblDiploma.setBounds(94, 327, 61, 30);
		panel.add(lblDiploma);
		
		JLabel label_14 = new JLabel("");
		label_14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_14.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings-gears.png")));
		label_14.setBounds(100, 461, 50, 50);
		panel.add(label_14);
		
		JLabel lblSettings = new JLabel("Settings");
		lblSettings.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSettings.setForeground(new Color(169, 169, 169));
		lblSettings.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblSettings.setBounds(84, 513, 81, 30);
		panel.add(lblSettings);
		
		JLabel label_15 = new JLabel("");
		label_15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_15.setIcon(new ImageIcon(frmMain.class.getResource("/Images/bars.png")));
		label_15.setBounds(100, 647, 50, 50);
		panel.add(label_15);
		
		JLabel lblStatistics = new JLabel("Statistics");
		lblStatistics.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblStatistics.setForeground(new Color(169, 169, 169));
		lblStatistics.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblStatistics.setBounds(81, 699, 87, 30);
		panel.add(lblStatistics);
		
		JPanel panel_4 = new JPanel();
		panel_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4.setOpaque(false);
		panel_4.setBounds(0, 69, 250, 123);
		panel.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_5.setOpaque(false);
		panel_5.setBounds(0, 253, 250, 123);
		panel.add(panel_5);
		
		JPanel panel_11 = new JPanel();
		panel_11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_11.setOpaque(false);
		panel_11.setBounds(0, 441, 250, 123);
		panel.add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_12.setOpaque(false);
		panel_12.setBounds(0, 625, 250, 123);
		panel.add(panel_12);
		
		JButton btnMyAccount = new JButton("MY ACCOUNT");
		btnMyAccount.setContentAreaFilled(false);
		btnMyAccount.setFocusPainted(false);
		btnMyAccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMyAccount.setForeground(new Color(102, 102, 102));
		btnMyAccount.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		btnMyAccount.setBorder(UIManager.getBorder("Button.border"));
		btnMyAccount.setBounds(34, 794, 186, 64);
		panel.add(btnMyAccount);
		
		JPanel panel_1 = new JPanel();
		panel_1.setMinimumSize(new Dimension(10, 200));
		panel_1.setPreferredSize(new Dimension(10, 170));
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JPanel panel_3 = new JPanel();
		panel_3.setMinimumSize(new Dimension(250, 200));
		panel_3.setPreferredSize(new Dimension(250, 200));
		panel_3.setSize(new Dimension(160, 0));
		panel_3.setMaximumSize(new Dimension(250, 32767));
		panel_3.setBackground(new Color(51, 204, 204));
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(frmMain.class.getResource("/Images/dashboard_logo_icon.png")));
		lblLogo.setBounds(66, 23, 117, 117);
		panel_3.add(lblLogo);
		
		JPanel panel_6 = new JPanel();
		panel_6.setMinimumSize(new Dimension(10, 200));
		panel_6.setMaximumSize(new Dimension(32767, 200));
		panel_6.setBackground(new Color(51, 204, 255));
		panel_6.setPreferredSize(new Dimension(270, 200));
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblAdminIcon = new JLabel("");
		lblAdminIcon.setIcon(new ImageIcon(frmMain.class.getResource("/Images/professor.png")));
		lblAdminIcon.setBounds(1478, 29, 128, 128);
		panel_6.add(lblAdminIcon);
		
		JLabel lblAdministrata = new JLabel("Administrata");
		lblAdministrata.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		lblAdministrata.setBounds(1286, 119, 163, 38);
		panel_6.add(lblAdministrata);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(82, 46, 608, 547);
		panel_2.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		layeredPane.add(panel_7, "name_644204069213778");
		
		JLabel label = new JLabel("Emri");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(121, 62, 118, 41);
		panel_7.add(label);
		
		JLabel label_1 = new JLabel("Mbiemri");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(121, 133, 118, 41);
		panel_7.add(label_1);
		
		JLabel label_2 = new JLabel("Email");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_2.setBounds(121, 202, 118, 41);
		panel_7.add(label_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(249, 141, 252, 33);
		panel_7.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(249, 206, 252, 33);
		panel_7.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(249, 66, 252, 33);
		panel_7.add(textField_2);
		
		JLabel label_3 = new JLabel("Telephone");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_3.setBounds(121, 265, 118, 41);
		panel_7.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(249, 269, 252, 33);
		panel_7.add(textField_3);
		
		JLabel label_4 = new JLabel("Qyteti");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_4.setBounds(121, 331, 118, 41);
		panel_7.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(249, 335, 252, 33);
		panel_7.add(textField_4);
		
		JButton button_5 = new JButton("Cancel");
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_5.setBounds(176, 442, 136, 50);
		panel_7.add(button_5);
		
		JButton button_6 = new JButton("Save");
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_6.setBounds(322, 442, 136, 50);
		panel_7.add(button_6);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		layeredPane.add(panel_8, "name_644214732250083");
		
		JList<Object> list = new JList<Object>();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setFont(new Font("Tahoma", Font.PLAIN, 18));
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		list.setBounds(76, 50, 452, 183);
		panel_8.add(list);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBounds(76, 244, 150, 35);
		panel_8.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1.setBounds(265, 244, 150, 35);
		panel_8.add(comboBox_1);
		
		JButton button_7 = new JButton("Upload");
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_7.setBounds(76, 323, 150, 35);
		panel_8.add(button_7);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Koment");
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane.setBounds(265, 324, 233, 108);
		panel_8.add(textPane);
		
		JButton button_8 = new JButton("Dergo");
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_8.setBounds(433, 490, 150, 35);
		panel_8.add(button_8);
		
		JLabel label_5 = new JLabel("Lista e punimeve");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBackground(SystemColor.textHighlight);
		label_5.setBounds(75, 22, 120, 28);
		panel_8.add(label_5);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		layeredPane.add(panel_9, "name_644227992296227");
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBounds(10, 35, 588, 251);
		panel_9.add(panel_10);
		
		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setBounds(0, 0, 588, 251);
		panel_10.add(scrollPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("Te dhenat shtese lidhje me temen , statusin si dhe nese eshte plagjiature , tregohet perqindja sa eshte edhe pse eshte e refuzuar");
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPane_1.setBackground(SystemColor.menu);
		textPane_1.setBounds(10, 297, 311, 151);
		panel_9.add(textPane_1);
		
		JLabel label_6 = new JLabel("Lista e temave");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(10, 11, 99, 14);
		panel_9.add(label_6);
		
		JButton button = new JButton("Profile");
		button.setBounds(177, 652, 126, 37);
		panel_2.add(button);
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton button_1 = new JButton("Tema");
		button_1.setBounds(177, 687, 126, 37);
		panel_2.add(button_1);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton button_2 = new JButton("Settings");
		button_2.setBounds(177, 754, 126, 37);
		panel_2.add(button_2);
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton button_3 = new JButton("Log out");
		button_3.setBounds(177, 789, 126, 37);
		panel_2.add(button_3);
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton button_4 = new JButton("Statistikat");
		button_4.setBounds(177, 720, 126, 37);
		panel_2.add(button_4);
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
	}
}
