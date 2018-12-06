package UILayer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

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
import javax.swing.AbstractListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;

public class frmMain extends JFrame {

	private JPanel contentPane;
	private JTextField txtSearch;
	private JTable table;
	private JTextField txtNoftimet;
	private JTable table_1;
	private JTextField txtPasswordText;
	private JTextField txtProfile;
	private JTextField lblShtoTeDhenaText;
	private JTextField lblModifikoText;
	private JTextField txtKontrollo;
	private JTextField txtUniversitet;
	private JTextField txtFakultet;
	private JTextField txtDepartament;
	private JTextField txtLenda;
	private JTextField temaDiplomes;
	private JTable table_3;
	private JTextField txtEmri;
	private JTextField txtMbiemri;
	private JTextField txtEmail;
	private JTextField txtTel;
	private JTextField txtUniversiteti;
	private JTextField txtFakulteti;
	private JTextField txtDepartamenti;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtCancelBtn;
	private JTextField txtSaveBtn;
	private JTextField txtStudentPassword;
	private JTextField txtStudentProfile;
	private JTextField txtStatusiITemes;
	private JTextField txtShikoDokumentin;
	private JTextField txtStatistikat;
	private JTextField txtShkruajTemen;
	private JTextField txtProfesori;
	private JTextField txtDepartamenti_1;
	private JTextField txtUpload;
	private JTextField txtAdd;

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
		
		JPanel panelMenu = new JPanel();
		panelMenu.setMaximumSize(new Dimension(160, 32767));
		panelMenu.setBackground(new Color(51, 51, 51));
		panelMenu.setPreferredSize(new Dimension(250, 10));
		panelMenu.setBounds(new Rectangle(0, 0, 200, 0));
		contentPane.add(panelMenu, BorderLayout.WEST);
		panelMenu.setLayout(null);
		
		JLabel lblC1 = new JLabel("");
		lblC1.setOpaque(true);
		lblC1.setBackground(new Color(0, 255, 255));
		lblC1.setBounds(238, 86, 12, 85);
		panelMenu.add(lblC1);
		
		JLabel lblNotificationsZero = new JLabel("");
		lblNotificationsZero.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNotificationsZero.setIcon(new ImageIcon(frmMain.class.getResource("/Images/notification_zero.png")));
		lblNotificationsZero.setBounds(100, 86, 50, 50);
		panelMenu.add(lblNotificationsZero);
		
		JLabel lblC2 = new JLabel("");
		lblC2.setOpaque(true);
		lblC2.setBackground(Color.CYAN);
		lblC2.setBounds(238, 275, 12, 82);
		panelMenu.add(lblC2);
		
		JLabel lblC3 = new JLabel("");
		lblC3.setOpaque(true);
		lblC3.setBackground(Color.CYAN);
		lblC3.setBounds(238, 461, 12, 82);
		panelMenu.add(lblC3);
		
		JLabel lblC4 = new JLabel("");
		lblC4.setOpaque(true);
		lblC4.setBackground(Color.CYAN);
		lblC4.setBounds(238, 647, 12, 82);
		panelMenu.add(lblC4);
		
		JLabel lblNewLabel = new JLabel("Notifications");
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setForeground(new Color(169, 169, 169));
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblNewLabel.setBounds(61, 138, 128, 30);
		panelMenu.add(lblNewLabel);
		
		JLabel label_13 = new JLabel("");
		label_13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_13.setIcon(new ImageIcon(frmMain.class.getResource("/Images/dashboard_diploma_icon.png")));
		label_13.setBounds(100, 275, 50, 50);
		panelMenu.add(label_13);
		
		JLabel lblDiploma = new JLabel("Thesis");
		lblDiploma.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblDiploma.setForeground(new Color(169, 169, 169));
		lblDiploma.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblDiploma.setBounds(94, 327, 61, 30);
		panelMenu.add(lblDiploma);
		
		JLabel label_14 = new JLabel("");
		label_14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_14.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings-gears.png")));
		label_14.setBounds(100, 461, 50, 50);
		panelMenu.add(label_14);
		
		JLabel lblSettings = new JLabel("Settings");
		lblSettings.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSettings.setForeground(new Color(169, 169, 169));
		lblSettings.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblSettings.setBounds(84, 513, 81, 30);
		panelMenu.add(lblSettings);
		
		JLabel label_15 = new JLabel("");
		label_15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_15.setIcon(new ImageIcon(frmMain.class.getResource("/Images/bars.png")));
		label_15.setBounds(100, 647, 50, 50);
		panelMenu.add(label_15);
		
		JLabel lblStatistics = new JLabel("Statistics");
		lblStatistics.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblStatistics.setForeground(new Color(169, 169, 169));
		lblStatistics.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblStatistics.setBounds(81, 699, 87, 30);
		panelMenu.add(lblStatistics);
		
		JPanel panelMenuNotifications = new JPanel();
		
		panelMenuNotifications.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelMenuNotifications.setOpaque(false);
		panelMenuNotifications.setBounds(0, 69, 250, 123);
		panelMenu.add(panelMenuNotifications);
		
		JPanel panelMenuThesis = new JPanel();
		panelMenuThesis.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelMenuThesis.setOpaque(false);
		panelMenuThesis.setBounds(0, 253, 250, 123);
		panelMenu.add(panelMenuThesis);
		
		JPanel panelMenuSettings = new JPanel();
		panelMenuSettings.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelMenuSettings.setOpaque(false);
		panelMenuSettings.setBounds(0, 441, 250, 123);
		panelMenu.add(panelMenuSettings);
		
		JPanel panelMenuStats = new JPanel();
		panelMenuStats.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelMenuStats.setOpaque(false);
		panelMenuStats.setBounds(0, 625, 250, 123);
		panelMenu.add(panelMenuStats);
		
		JButton btnMyAccount = new JButton("MY ACCOUNT");
		btnMyAccount.setContentAreaFilled(false);
		btnMyAccount.setFocusPainted(false);
		btnMyAccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMyAccount.setForeground(new Color(102, 102, 102));
		btnMyAccount.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		btnMyAccount.setBorder(UIManager.getBorder("Button.border"));
		btnMyAccount.setBounds(34, 794, 186, 64);
		panelMenu.add(btnMyAccount);
		
		JPanel panelTop = new JPanel();
		panelTop.setMinimumSize(new Dimension(10, 200));
		panelTop.setPreferredSize(new Dimension(10, 170));
		contentPane.add(panelTop, BorderLayout.NORTH);
		panelTop.setLayout(new BoxLayout(panelTop, BoxLayout.X_AXIS));
		
		JPanel panelLogo = new JPanel();
		panelLogo.setMinimumSize(new Dimension(250, 200));
		panelLogo.setPreferredSize(new Dimension(250, 200));
		panelLogo.setSize(new Dimension(160, 0));
		panelLogo.setMaximumSize(new Dimension(250, 32767));
		panelLogo.setBackground(new Color(51, 204, 204));
		panelTop.add(panelLogo);
		panelLogo.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(frmMain.class.getResource("/Images/dashboard_logo_icon.png")));
		lblLogo.setBounds(66, 23, 117, 117);
		panelLogo.add(lblLogo);
		
		JPanel panelPerson = new JPanel();
		panelPerson.setMinimumSize(new Dimension(10, 200));
		panelPerson.setMaximumSize(new Dimension(32767, 200));
		panelPerson.setBackground(new Color(51, 204, 255));
		panelPerson.setPreferredSize(new Dimension(270, 200));
		panelTop.add(panelPerson);
		panelPerson.setLayout(null);
		
		JLabel lblAdminIcon = new JLabel("");
		lblAdminIcon.setIcon(new ImageIcon(frmMain.class.getResource("/Images/professor.png")));
		lblAdminIcon.setBounds(1271, 4, 128, 128);
		panelPerson.add(lblAdminIcon);
		
		JLabel lblAdministrata = new JLabel("Administrata");
		lblAdministrata.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		lblAdministrata.setBounds(1250, 127, 163, 38);
		panelPerson.add(lblAdministrata);
		
		JPanel panelMain = new JPanel();
		contentPane.add(panelMain, BorderLayout.CENTER);
		panelMain.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 11, 1427, 865);
		panelMain.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panelAdministrataNjoftimet = new JPanel();
		panelAdministrataNjoftimet.setBackground(SystemColor.textHighlightText);
		layeredPane.add(panelAdministrataNjoftimet, "name_5552777502348");
		panelAdministrataNjoftimet.setLayout(null);
		
		txtSearch = new JTextField();
		txtSearch.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtSearch.setBounds(445, 56, 407, 63);
		panelAdministrataNjoftimet.add(txtSearch);
		txtSearch.setText("Search");
		txtSearch.setBorder(null);
		txtSearch.setColumns(10);
		
		JLabel lblSearch = new JLabel("");
		lblSearch.setIcon(new ImageIcon(frmMain.class.getResource("/Images/myaccount_rectangle.png")));
		lblSearch.setBounds(436, 40, 433, 94);
		panelAdministrataNjoftimet.add(lblSearch);
		
		JLabel lblSearchIcon = new JLabel("");
		lblSearchIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
		lblSearchIcon.setBounds(894, 56, 73, 69);
		panelAdministrataNjoftimet.add(lblSearchIcon);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(256, 171, 797, 165);
		panelAdministrataNjoftimet.add(scrollPane);
		
		String[] columnNames = {"Tema",
                "Viti",
                "Profesori"};

		Object[][] data = {
		{"Data Mining", "2017",
		"Blerim Reha", new Integer(10), new Boolean(false)},
		{"Siguria te dhenave", "2018",
		"Lule Ahmedi", new Integer(3), new Boolean(true)},
		{"Artificial Intellegence", "2018",
		"Agni Dika", new Integer(2), new Boolean(false)}
		};
		
		JTable table_2 = new JTable(data, columnNames);
		table_2.setBackground(SystemColor.window);
		table_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(table_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 374, 1427, 491);
		panelAdministrataNjoftimet.add(panel);
		panel.setLayout(null);
		
		txtNoftimet = new JTextField();
		txtNoftimet.setBounds(545, 11, 128, 61);
		txtNoftimet.setBackground(SystemColor.menu);
		txtNoftimet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtNoftimet.setText("Noftimet");
		txtNoftimet.setBorder(null);
		panel.add(txtNoftimet);
		txtNoftimet.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(256, 133, 797, 165);
		scrollPane_1.setViewportBorder(null);
		panel.add(scrollPane_1);
		
		String[] columnNames1 = {"Tema",
                "Viti",
                "Profesori"};

		Object[][] data1 = {
		{"Data Mining", "2017",
		"Blerim Reha", new Integer(10), new Boolean(false)}
		};
		
		table_1 = new JTable(data1,columnNames1);
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblKontrolloTemen = new JLabel("");
		lblKontrolloTemen.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/control.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
		lblKontrolloTemen.setBounds(1137, 204, 56, 69);
		panel.add(lblKontrolloTemen);
		
		txtKontrollo = new JTextField();
		txtKontrollo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtKontrollo.setBackground(SystemColor.menu);
		txtKontrollo.setText("Kontrollo");
		txtKontrollo.setBorder(null);
		txtKontrollo.setBounds(1114, 137, 106, 41);
		panel.add(txtKontrollo);
		txtKontrollo.setColumns(10);
		
		JPanel panelAdministrataSettings = new JPanel();
		layeredPane.add(panelAdministrataSettings, "name_5566602185450");
		panelAdministrataSettings.setLayout(null);
		
		lblModifikoText = new JTextField();
		lblModifikoText.setText("Modifiko");
		lblModifikoText.setOpaque(false);
		lblModifikoText.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblModifikoText.setColumns(10);
		lblModifikoText.setBorder(null);
		lblModifikoText.setBounds(836, 592, 128, 49);
		panelAdministrataSettings.add(lblModifikoText);
		
		JLabel lblModifikoIcon = new JLabel("");
		lblModifikoIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pencil-edit-button.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		lblModifikoIcon.setBounds(842, 480, 109, 101);
		panelAdministrataSettings.add(lblModifikoIcon);
		
		JLabel lblModifikoRectangle = new JLabel("");
		lblModifikoRectangle.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		lblModifikoRectangle.setBounds(755, 455, 271, 198);
		panelAdministrataSettings.add(lblModifikoRectangle);
		
		lblShtoTeDhenaText = new JTextField();
		lblShtoTeDhenaText.setText("Shto");
		lblShtoTeDhenaText.setOpaque(false);
		lblShtoTeDhenaText.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblShtoTeDhenaText.setColumns(10);
		lblShtoTeDhenaText.setBorder(null);
		lblShtoTeDhenaText.setBounds(463, 592, 63, 49);
		panelAdministrataSettings.add(lblShtoTeDhenaText);
		
		JLabel lblShtoTeDhenaIcon = new JLabel("");
		lblShtoTeDhenaIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		lblShtoTeDhenaIcon.setBounds(436, 480, 109, 101);
		panelAdministrataSettings.add(lblShtoTeDhenaIcon);
		
		txtProfile = new JTextField();
		txtProfile.setText("Profile");
		txtProfile.setOpaque(false);
		txtProfile.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtProfile.setColumns(10);
		txtProfile.setBorder(null);
		txtProfile.setBounds(842, 313, 92, 49);
		panelAdministrataSettings.add(txtProfile);
		
		JLabel lblProfileIcon = new JLabel("");
		lblProfileIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		lblProfileIcon.setBounds(836, 189, 109, 113);
		panelAdministrataSettings.add(lblProfileIcon);
		
		JLabel lblProfileRectangle = new JLabel("");
		lblProfileRectangle.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		lblProfileRectangle.setBounds(755, 175, 271, 198);
		panelAdministrataSettings.add(lblProfileRectangle);
		
		JLabel lblPasswordIcon = new JLabel("");
		lblPasswordIcon.setBounds(436, 201, 109, 101);
		lblPasswordIcon.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_password_button.png")));
		panelAdministrataSettings.add(lblPasswordIcon);
		
		txtPasswordText = new JTextField();
		txtPasswordText.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtPasswordText.setText("Password");
		txtPasswordText.setOpaque(false);
		txtPasswordText.setBorder(null);
		txtPasswordText.setBounds(426, 313, 150, 49);
		panelAdministrataSettings.add(txtPasswordText);
		txtPasswordText.setColumns(10);
		
		JLabel lblPasswordRectangle = new JLabel("");
		lblPasswordRectangle.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		lblPasswordRectangle.setBounds(358, 175, 271, 198);
		panelAdministrataSettings.add(lblPasswordRectangle);
		
		JLabel lblShtoTeDhenaRectangle = new JLabel("");
		lblShtoTeDhenaRectangle.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		lblShtoTeDhenaRectangle.setBounds(358, 455, 271, 198);
		panelAdministrataSettings.add(lblShtoTeDhenaRectangle);
		
		JPanel panelAdministrataSettingsShto = new JPanel();
		layeredPane.add(panelAdministrataSettingsShto, "name_11316344101076");
		panelAdministrataSettingsShto.setLayout(null);
		
		txtLenda = new JTextField();
		txtLenda.setText("Lenda");
		txtLenda.setOpaque(false);
		txtLenda.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtLenda.setColumns(10);
		txtLenda.setBorder(null);
		txtLenda.setBounds(853, 640, 82, 37);
		panelAdministrataSettingsShto.add(txtLenda);
		
		txtDepartament = new JTextField();
		txtDepartament.setText("Departament");
		txtDepartament.setOpaque(false);
		txtDepartament.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtDepartament.setColumns(10);
		txtDepartament.setBorder(null);
		txtDepartament.setBounds(403, 640, 173, 37);
		panelAdministrataSettingsShto.add(txtDepartament);
		
		txtFakultet = new JTextField();
		txtFakultet.setText("Fakultet");
		txtFakultet.setOpaque(false);
		txtFakultet.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtFakultet.setColumns(10);
		txtFakultet.setBorder(null);
		txtFakultet.setBounds(843, 295, 105, 37);
		panelAdministrataSettingsShto.add(txtFakultet);
		
		JLabel lblShtoLendaIcon = new JLabel("");		
		lblShtoLendaIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		lblShtoLendaIcon.setBounds(843, 548, 105, 81);
		panelAdministrataSettingsShto.add(lblShtoLendaIcon);
		
		JLabel lblShtoLendaRectangle = new JLabel("");
		lblShtoLendaRectangle.setBounds(760, 499, 271, 198);
		lblShtoLendaRectangle.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		panelAdministrataSettingsShto.add(lblShtoLendaRectangle);
		
		JLabel lblShtoDepartamentIcon = new JLabel("");
		lblShtoDepartamentIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		lblShtoDepartamentIcon.setBounds(433, 548, 105, 81);
		panelAdministrataSettingsShto.add(lblShtoDepartamentIcon);
		
		JLabel lblShtoFakultetIcon = new JLabel("");
		lblShtoFakultetIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		lblShtoFakultetIcon.setBounds(843, 189, 105, 81);
		panelAdministrataSettingsShto.add(lblShtoFakultetIcon);
		
		txtUniversitet = new JTextField();
		txtUniversitet.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtUniversitet.setText("Universitet");
		txtUniversitet.setBounds(419, 295, 143, 37);
		txtUniversitet.setOpaque(false);
		txtUniversitet.setBorder(null);
		panelAdministrataSettingsShto.add(txtUniversitet);
		txtUniversitet.setColumns(10);
		
		JLabel lblShtoUniversitetIcon = new JLabel("");
		lblShtoUniversitetIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		lblShtoUniversitetIcon.setBounds(433, 189, 105, 81);
		panelAdministrataSettingsShto.add(lblShtoUniversitetIcon);
		
		JLabel lblShtoUniversitetRectangle = new JLabel("");
		lblShtoUniversitetRectangle.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		lblShtoUniversitetRectangle.setBounds(348, 152, 271, 198);
		panelAdministrataSettingsShto.add(lblShtoUniversitetRectangle);
		
		JLabel lblShtoFakultetRectangle = new JLabel("");
		lblShtoFakultetRectangle.setBounds(760, 152, 271, 198);
		lblShtoFakultetRectangle.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		panelAdministrataSettingsShto.add(lblShtoFakultetRectangle);
		
		JLabel lblShtoDepartamentRectangle = new JLabel("");
		lblShtoDepartamentRectangle.setBounds(348, 499, 271, 198);
		lblShtoDepartamentRectangle.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		panelAdministrataSettingsShto.add(lblShtoDepartamentRectangle);
		
		JPanel panelAdministrataBtnKontrollo = new JPanel();
		panelAdministrataBtnKontrollo.setBackground(SystemColor.text);
		layeredPane.add(panelAdministrataBtnKontrollo, "name_13891205811588");
		panelAdministrataBtnKontrollo.setLayout(null);
		
		JTextArea txtrDetajeTeTemes = new JTextArea();
		txtrDetajeTeTemes.setText("Detaje te temes se diplomes pas       kontrollimit nga algoritmi per plagjiature");
		txtrDetajeTeTemes.setFont(new Font("Monospaced", Font.PLAIN, 25));
		txtrDetajeTeTemes.setBounds(346, 313, 567, 493);
		txtrDetajeTeTemes.setLineWrap(true);
		panelAdministrataBtnKontrollo.add(txtrDetajeTeTemes);
		
		temaDiplomes = new JTextField();
		temaDiplomes.setFont(new Font("Tahoma", Font.PLAIN, 25));
		temaDiplomes.setText("Tema Diplomes Data Mining 2017");
		temaDiplomes.setBounds(346, 159, 580, 87);
		temaDiplomes.setBorder(null);
		temaDiplomes.setOpaque(false);
		panelAdministrataBtnKontrollo.add(temaDiplomes);
		temaDiplomes.setColumns(10);
		
		JLabel temaRectangle = new JLabel("");
		temaRectangle.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")).getImage().getScaledInstance(600, 100, Image.SCALE_SMOOTH)));
		temaRectangle.setBounds(335, 147, 598, 111);
		panelAdministrataBtnKontrollo.add(temaRectangle);
		
		JLabel detajeTemesDiplomes = new JLabel("");
		detajeTemesDiplomes.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")).getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH)));
		detajeTemesDiplomes.setBounds(328, 307, 598, 499);
		panelAdministrataBtnKontrollo.add(detajeTemesDiplomes);
		
		JPanel panelAdministrataThesis = new JPanel();
		panelAdministrataThesis.setBackground(Color.WHITE);
		layeredPane.add(panelAdministrataThesis, "name_14640927326397");
		panelAdministrataThesis.setLayout(null);
		
		JLabel lblSearchThesis = new JLabel("");
		lblSearchThesis.setBounds(226, 150, 616, 109);
		lblSearchThesis.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")).getImage().getScaledInstance(600, 100, Image.SCALE_SMOOTH)));
		panelAdministrataThesis.add(lblSearchThesis);
		
		JLabel lblSearchThesisIcon = new JLabel("");
		lblSearchThesisIcon.setBounds(879, 150, 100, 100);
		lblSearchThesisIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		panelAdministrataThesis.add(lblSearchThesisIcon);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(226, 319, 743, 91);
		panelAdministrataThesis.add(scrollPane_2);
		
		String[] AdministrataColumnNamesThesis = {"Tema",
                "Studenti",
                "Departamenti",
                "Viti",};

		Object[][] Administratadata = {
		{"Data Mining", "Blend Arifaj","Kompjuterike","2017", new Integer(10), new Boolean(false)},
		{"Data Mining", "Arianit Lubishtani",	"Kompjuterike","2017", new Integer(10), new Boolean(false)},
		{"Data Mining", "Fjolla Beqiri","Kompjuterike","2017", new Integer(10), new Boolean(false)},
		{"Data Mining", "Blend Arifaj","Kompjuterike","2017", new Integer(10), new Boolean(false)}
		};
		
		table_3 = new JTable(Administratadata,AdministrataColumnNamesThesis);
		table_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPane_2.setViewportView(table_3);
		
		JPanel panelAdministrataStats = new JPanel();
		layeredPane.add(panelAdministrataStats, "name_15438420206650");
		
		JPanel panelStudentMyAccount = new JPanel();
		panelStudentMyAccount.setBackground(Color.WHITE);
		layeredPane.add(panelStudentMyAccount, "name_20772975047901");
		panelStudentMyAccount.setLayout(null);
		
		txtEmri = new JTextField();
		txtEmri.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtEmri.setText("Emri");
		txtEmri.setBorder(null);
		txtEmri.setBounds(119, 136, 150, 48);
		panelStudentMyAccount.add(txtEmri);
		txtEmri.setColumns(10);
		
		JLabel lblStudentEmriMyAccount = new JLabel("");
		lblStudentEmriMyAccount.setIcon(new ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")));
		lblStudentEmriMyAccount.setBounds(333, 111, 423, 105);
		panelStudentMyAccount.add(lblStudentEmriMyAccount);
		
		txtMbiemri = new JTextField();
		txtMbiemri.setText("Mbiemri");
		txtMbiemri.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtMbiemri.setColumns(10);
		txtMbiemri.setBorder(null);
		txtMbiemri.setBounds(119, 240, 150, 48);
		panelStudentMyAccount.add(txtMbiemri);
		
		JLabel lblStudentMbiemriMyAccount = new JLabel("");
		lblStudentMbiemriMyAccount.setIcon(new ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")));
		lblStudentMbiemriMyAccount.setBounds(333, 208, 423, 105);
		panelStudentMyAccount.add(lblStudentMbiemriMyAccount);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBounds(119, 338, 150, 48);
		panelStudentMyAccount.add(txtEmail);
		
		txtTel = new JTextField();
		txtTel.setText("Tel");
		txtTel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtTel.setColumns(10);
		txtTel.setBorder(null);
		txtTel.setBounds(119, 442, 150, 48);
		panelStudentMyAccount.add(txtTel);
		
		txtUniversiteti = new JTextField();
		txtUniversiteti.setText("Universiteti");
		txtUniversiteti.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtUniversiteti.setColumns(10);
		txtUniversiteti.setBorder(null);
		txtUniversiteti.setBounds(119, 541, 164, 48);
		panelStudentMyAccount.add(txtUniversiteti);
		
		txtFakulteti = new JTextField();
		txtFakulteti.setText("Fakulteti");
		txtFakulteti.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtFakulteti.setColumns(10);
		txtFakulteti.setBorder(null);
		txtFakulteti.setBounds(119, 637, 164, 48);
		panelStudentMyAccount.add(txtFakulteti);
		
		txtDepartamenti = new JTextField();
		txtDepartamenti.setText("Departamenti");
		txtDepartamenti.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtDepartamenti.setColumns(10);
		txtDepartamenti.setBorder(null);
		txtDepartamenti.setBounds(119, 735, 182, 48);
		panelStudentMyAccount.add(txtDepartamenti);
		
		JLabel lblStudentEmailMyAccount = new JLabel("");
		lblStudentEmailMyAccount.setIcon(new ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")));
		lblStudentEmailMyAccount.setBounds(333, 308, 423, 105);
		panelStudentMyAccount.add(lblStudentEmailMyAccount);
		
		JLabel lblStudentTelMyAccount = new JLabel("");
		lblStudentTelMyAccount.setIcon(new ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")));
		lblStudentTelMyAccount.setBounds(333, 417, 423, 105);
		panelStudentMyAccount.add(lblStudentTelMyAccount);
		
		JLabel lblStudentUniversitetiMyAccount = new JLabel("");
		lblStudentUniversitetiMyAccount.setIcon(new ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")));
		lblStudentUniversitetiMyAccount.setBounds(333, 515, 423, 105);
		panelStudentMyAccount.add(lblStudentUniversitetiMyAccount);
		
		JLabel lblStudentFakultetiMyAccount = new JLabel("");
		lblStudentFakultetiMyAccount.setIcon(new ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")));
		lblStudentFakultetiMyAccount.setBounds(333, 609, 423, 105);
		panelStudentMyAccount.add(lblStudentFakultetiMyAccount);
		
		JLabel lblStudentDepartamentMyAccount = new JLabel("");
		lblStudentDepartamentMyAccount.setIcon(new ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")));
		lblStudentDepartamentMyAccount.setBounds(333, 704, 423, 105);
		panelStudentMyAccount.add(lblStudentDepartamentMyAccount);
		
		JPanel panelStudentProfile = new JPanel();
		panelStudentProfile.setBackground(Color.WHITE);
		layeredPane.add(panelStudentProfile, "name_21421619482368");
		panelStudentProfile.setLayout(null);
		
		txtSaveBtn = new JTextField();
		txtSaveBtn.setHorizontalAlignment(SwingConstants.CENTER);
		txtSaveBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSaveBtn.setText("SAVE");
		txtSaveBtn.setBorder(null);
		txtSaveBtn.setColumns(10);
		txtSaveBtn.setBounds(528, 689, 186, 64);
		panelStudentProfile.add(txtSaveBtn);
		
		txtCancelBtn = new JTextField();
		txtCancelBtn.setHorizontalAlignment(SwingConstants.CENTER);
		txtCancelBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCancelBtn.setText("CANCEL");
		txtCancelBtn.setBorder(null);
		txtCancelBtn.setBounds(311, 689, 186, 64);
		panelStudentProfile.add(txtCancelBtn);
		txtCancelBtn.setColumns(10);
		
		textField = new JTextField();
		textField.setText("Emri");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(123, 219, 150, 48);
		panelStudentProfile.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("Mbiemri");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(123, 322, 150, 48);
		panelStudentProfile.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("Email");
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(123, 434, 150, 48);
		panelStudentProfile.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("Tel");
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBounds(123, 533, 150, 48);
		panelStudentProfile.add(textField_3);
		
		JLabel lblStudentEmriProfile = new JLabel("");
		lblStudentEmriProfile.setIcon(new ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")));
		lblStudentEmriProfile.setBounds(303, 193, 423, 105);
		panelStudentProfile.add(lblStudentEmriProfile);
		
		JLabel lblStudentMbiemriProfile = new JLabel("");
		lblStudentMbiemriProfile.setIcon(new ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")));
		lblStudentMbiemriProfile.setBounds(303, 296, 423, 105);
		panelStudentProfile.add(lblStudentMbiemriProfile);
		
		JLabel lblStudentEmailProfile = new JLabel("");
		lblStudentEmailProfile.setIcon(new ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")));
		lblStudentEmailProfile.setBounds(303, 398, 423, 105);
		panelStudentProfile.add(lblStudentEmailProfile);
		
		JLabel lblStudentTelProfile = new JLabel("");
		lblStudentTelProfile.setIcon(new ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")));
		lblStudentTelProfile.setBounds(303, 500, 423, 105);
		panelStudentProfile.add(lblStudentTelProfile);
		
		JLabel lblCancelBtn = new JLabel("");
		lblCancelBtn.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")).getImage().getScaledInstance(200, 80, Image.SCALE_SMOOTH)));
		lblCancelBtn.setBounds(303, 672, 207, 100);
		panelStudentProfile.add(lblCancelBtn);
		
		JLabel lblSaveBtn = new JLabel("");
		lblSaveBtn.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")).getImage().getScaledInstance(200, 80, Image.SCALE_SMOOTH)));
		lblSaveBtn.setBounds(520, 672, 207, 100);
		panelStudentProfile.add(lblSaveBtn);
		
		JPanel panelStudentSettings = new JPanel();
		panelStudentSettings.setBackground(Color.WHITE);
		layeredPane.add(panelStudentSettings, "name_22149151830299");
		panelStudentSettings.setLayout(null);
		
		txtStudentProfile = new JTextField();
		txtStudentProfile.setText("Profile");
		txtStudentProfile.setOpaque(false);
		txtStudentProfile.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtStudentProfile.setColumns(10);
		txtStudentProfile.setBorder(null);
		txtStudentProfile.setBounds(548, 342, 74, 42);
		panelStudentSettings.add(txtStudentProfile);
		
		JLabel lblStudentSettingsProfileIcon = new JLabel("New label");
		lblStudentSettingsProfileIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings_password_button.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		lblStudentSettingsProfileIcon.setBounds(538, 231, 100, 100);
		panelStudentSettings.add(lblStudentSettingsProfileIcon);
		
		txtStudentPassword = new JTextField();
		txtStudentPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtStudentPassword.setText("Password");
		txtStudentPassword.setBorder(null);
		txtStudentPassword.setOpaque(false);
		txtStudentPassword.setBounds(174, 342, 107, 42);
		panelStudentSettings.add(txtStudentPassword);
		txtStudentPassword.setColumns(10);
		
		JLabel lblStudentSettingsPassIcon = new JLabel("New label");
		lblStudentSettingsPassIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings_password_button.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		lblStudentSettingsPassIcon.setBounds(174, 231, 100, 100);
		panelStudentSettings.add(lblStudentSettingsPassIcon);
		
		JLabel lblStudentSettingsPassRectangle = new JLabel("");
		lblStudentSettingsPassRectangle.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		lblStudentSettingsPassRectangle.setBounds(107, 217, 239, 183);
		panelStudentSettings.add(lblStudentSettingsPassRectangle);
		
		JLabel lblStudentSettingsProfile = new JLabel("");
		lblStudentSettingsProfile.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		lblStudentSettingsProfile.setBounds(464, 217, 239, 183);
		panelStudentSettings.add(lblStudentSettingsProfile);
		
		JPanel panelStudentStats = new JPanel();
		panelStudentStats.setBackground(Color.WHITE);
		layeredPane.add(panelStudentStats, "name_22814355849101");
		panelStudentStats.setLayout(null);
		
		txtStatusiITemes = new JTextField();
		txtStatusiITemes.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtStatusiITemes.setText("Statusi i temes tuaj");
		txtStatusiITemes.setBounds(257, 60, 265, 59);
		txtStatusiITemes.setBorder(null);
		panelStudentStats.add(txtStatusiITemes);
		txtStatusiITemes.setColumns(10);
		
		JLabel lblStatusiTemesIcon = new JLabel("");
		lblStatusiTemesIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checked.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		lblStatusiTemesIcon.setBounds(325, 152, 115, 100);
		panelStudentStats.add(lblStatusiTemesIcon);
		
		txtShikoDokumentin = new JTextField();
		txtShikoDokumentin.setText("Shiko dokumentin");
		txtShikoDokumentin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtShikoDokumentin.setColumns(10);
		txtShikoDokumentin.setBorder(null);
		txtShikoDokumentin.setBounds(820, 60, 265, 59);
		panelStudentStats.add(txtShikoDokumentin);
		
		JLabel lblShikoDokumentinIcon = new JLabel("");
		lblShikoDokumentinIcon.setBounds(884, 130, 100, 118);
		lblShikoDokumentinIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pdf.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		panelStudentStats.add(lblShikoDokumentinIcon);
		
		txtStatistikat = new JTextField();
		txtStatistikat.setText("Statistikat");
		txtStatistikat.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtStatistikat.setColumns(10);
		txtStatistikat.setBorder(null);
		txtStatistikat.setBounds(586, 447, 148, 59);
		panelStudentStats.add(txtStatistikat);
		
		JPanel panelStudentDiploma = new JPanel();
		panelStudentDiploma.setBackground(Color.WHITE);
		layeredPane.add(panelStudentDiploma, "name_244271854762");
		panelStudentDiploma.setLayout(null);
		
		txtAdd = new JTextField();
		txtAdd.setText("Add");
		txtAdd.setOpaque(false);
		txtAdd.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAdd.setColumns(10);
		txtAdd.setBorder(null);
		txtAdd.setBounds(826, 726, 71, 46);
		panelStudentDiploma.add(txtAdd);
		
		JLabel lblStudentDiplomaShto = new JLabel("");
		lblStudentDiplomaShto.setIcon(new ImageIcon(frmMain.class.getResource("/Images/login_rectangle_login.png")));
		lblStudentDiplomaShto.setBounds(761, 726, 200, 46);
		panelStudentDiploma.add(lblStudentDiplomaShto);
		
		txtUpload = new JTextField();
		txtUpload.setText("Upload");
		txtUpload.setOpaque(false);
		txtUpload.setHorizontalAlignment(SwingConstants.CENTER);
		txtUpload.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUpload.setColumns(10);
		txtUpload.setBorder(null);
		txtUpload.setBounds(807, 595, 114, 46);
		panelStudentDiploma.add(txtUpload);
		
		JLabel lblStudentDiplomaUploadIcon = new JLabel("");
		lblStudentDiplomaUploadIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/upload.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		lblStudentDiplomaUploadIcon.setBounds(814, 484, 107, 111);
		panelStudentDiploma.add(lblStudentDiplomaUploadIcon);
		
		txtDepartamenti_1 = new JTextField();
		txtDepartamenti_1.setText("Departamenti");
		txtDepartamenti_1.setOpaque(false);
		txtDepartamenti_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtDepartamenti_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtDepartamenti_1.setColumns(10);
		txtDepartamenti_1.setBorder(null);
		txtDepartamenti_1.setBounds(207, 499, 375, 79);
		panelStudentDiploma.add(txtDepartamenti_1);
		
		txtProfesori = new JTextField();
		txtProfesori.setText("Fakulteti");
		txtProfesori.setOpaque(false);
		txtProfesori.setHorizontalAlignment(SwingConstants.CENTER);
		txtProfesori.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtProfesori.setColumns(10);
		txtProfesori.setBorder(null);
		txtProfesori.setBounds(207, 355, 375, 79);
		panelStudentDiploma.add(txtProfesori);
		
		txtShkruajTemen = new JTextField();
		txtShkruajTemen.setHorizontalAlignment(SwingConstants.CENTER);
		txtShkruajTemen.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtShkruajTemen.setText("Shkruaj temen");
		txtShkruajTemen.setBounds(351, 140, 579, 79);
		txtShkruajTemen.setBorder(null);
		txtShkruajTemen.setOpaque(false);
		panelStudentDiploma.add(txtShkruajTemen);
		txtShkruajTemen.setColumns(10);
		
		JLabel lblStudentDiplomaTema = new JLabel("");
		lblStudentDiplomaTema.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")).getImage().getScaledInstance(600, 100, Image.SCALE_SMOOTH)));
		lblStudentDiplomaTema.setBounds(341, 126, 608, 105);
		panelStudentDiploma.add(lblStudentDiplomaTema);
		
		JLabel lblStudentDiplomaFakulteti = new JLabel("");
		lblStudentDiplomaFakulteti.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")).getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH)));
		lblStudentDiplomaFakulteti.setBounds(197, 345, 400, 105);
		panelStudentDiploma.add(lblStudentDiplomaFakulteti);
		
		JLabel lblStudentDiplomaDepart = new JLabel("Departamenti");
		lblStudentDiplomaDepart.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")).getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH)));
		lblStudentDiplomaDepart.setBounds(197, 484, 400, 105);
		panelStudentDiploma.add(lblStudentDiplomaDepart);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Blerim Rexha", "Lule Ahmedi", "Agni Dika"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(197, 646, 399, 84);
		panelStudentDiploma.add(comboBox);
		
		JLabel lblStudentDiplomaUpload = new JLabel("");
		lblStudentDiplomaUpload.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		lblStudentDiplomaUpload.setBounds(761, 472, 200, 177);
		panelStudentDiploma.add(lblStudentDiplomaUpload);
				
	}
}
