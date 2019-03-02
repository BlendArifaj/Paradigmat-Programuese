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
import javax.swing.JOptionPane;
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

import Business.Login;
import DataLogic.Departamenti;
import DataLogic.Fakulteti;
import DataLogic.Hash;
import DataLogic.Lenda;
import DataLogic.Profesori;
import DataLogic.Punimi;
import DataLogic.Studenti;
import DataLogic.Universiteti;
import javafx.scene.layout.Pane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;

public class frmMain extends JFrame {

	private JPanel contentPane;
	private JTextField txtSearch;
	private JTable table;
	private JTextField txtNoftimet;
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
	private JTextField lblEmrii;
	private JTextField lblMbiemrii;
	private JTextField lblEmaili;
	private JTextField lblTeli;
	private JTextField lblUniversitetii;
	private JTextField lblFakultetii;
	private JTextField lblDepartamentii;
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
	private JTextField txtUpload;
	private JTextField txtAdd;

	public static JPanel panelAdministrataNjoftimet;
	public static JPanel panelAdministrataSettings;
	public static JPanel panelAdministrataSettingsShto;
	public static JPanel panelAdministrataBtnKontrollo;
	public static JPanel panelAdministrataDiploma;
	public static JPanel panelAdministrataStats;
	public static JPanel panelAdministrataAddDepartament;
	public static JLabel lblAdministrataAddDepartament;
	public static JPanel panelAdministrataAddUniversity;
	public static JPanel panelAdministrataAddLenda;
	public static JPanel panelAdministrataAddFakultet;
	public static JPanel panelStudentMyAccount;
	public static JPanel panelStudentProfile;
	public static JPanel panelStudentStats;
	public static JPanel panelStudentDiploma;
	public static JPanel panelStudentSettings;
	public static JPanel panelStudentNotifications;
	public static JPanel panelProfesorDiploma;
	public static JPanel panelNotificationClicked;
	public static JPanel panelMain;
	public static JPanel panelPerson;
	public static JPanel panelMenu;
	public static JPanel panelMenuNotifications;
	public static JPanel panelMenuThesis;
	public static JPanel panelMenuSettings;
	public static JPanel panelMenuStats;
	public static JPanel panelTop;
	public static JPanel panelLogo;
	public static JPanel panelStudentiChangePassword;
	public static frmMain frame;
	public static List<JPanel> panels = new ArrayList<JPanel>();
	
	public static List<JLabel> labelHighlight = new ArrayList<JLabel>();
	
	public static Login objLogin;
	public static JLabel lblMemberIcon;
	public static JLabel lblMember;
	public static JLabel lblNotificationIcon;
	private JTextField txtStudentNotificationsTema;
	private JTextField txtStudentNotificationsMessage;
	private JTextField txtAdministrataShtoUniversitet;
	private JTextField txtAdministrataShtoFakultetEmri;
	private JTextField txtAdministrataShtoFakultetAdresa;
	private JTextField txtAdministrataShtoDepartamentEmri;
	private JTextField txtAdministrataShtoLendeEmri;
	private JTextField txtShto;
	private JTextField txtAdd_1;
	private JTextField txtAdd_2;
	private JTextField txtAdd_3;
	private JTable tableProfesoriDiploma;
	private JTextField txtSingleNotification;
	private JTextField txtAdministrataShtoDepartamentID;
	private JTextField txtAdministrataShtoFakultetID;
	private JTextField txtEmri;
	private JTextField txtMbiemri;
	private JTextField txtEmail;
	private JTextField txtTel;
	private JTextField txtUniversiteti;
	private JTextField txtFakulteti;
	private JTextField txtDepartamenti;
	private JTextField txtProfileEmri;
	private JTextField txtProfileMbiemri;
	private JTextField txtProfileEmail;
	private JTextField txtProfileTel;
	
	private JButton btnSave;
	private JTextField txtTema;
	private JTextField txtFakulteti_1;
	private JTextField txtDepartamenti_1;
	private JTextField txtProfesori;
	private JTextField lblPassword;
	private JTextField lblNewPassword;
	private JTextField lblRepeatNewPassword;
	private JTextField txtChangePassword;
	private JPasswordField pwdOldPassword;
	private JPasswordField pwdNewPassword;
	private JPasswordField pwdNewPasswordd;
	
	private JComboBox cmbZgjedhFakultetin;
	private JComboBox cmbZgjedhDepartamentin;
	private JComboBox cmbZgjedhProfesorin;
	private JComboBox cmbZgjedhLenden;
	private JTextField txtLenda_1;
	private JTable table_1;
	private JScrollPane scrollPane_1;
	
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public frmMain(Login newLogin) {
		
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
		
		panelMenu = new JPanel();
		panelMenu.setMaximumSize(new Dimension(160, 32767));
		panelMenu.setBackground(new Color(51, 51, 51));
		panelMenu.setPreferredSize(new Dimension(250, 10));
		panelMenu.setBounds(new Rectangle(0, 0, 200, 0));
		contentPane.add(panelMenu, BorderLayout.WEST);
		panelMenu.setLayout(null);
		
		JLabel lblHighlightNotifications = new JLabel("");
		lblHighlightNotifications.setOpaque(true);
		lblHighlightNotifications.setBackground(new Color(0, 255, 255));
		lblHighlightNotifications.setBounds(238, 86, 12, 85);
		panelMenu.add(lblHighlightNotifications);
		
		
		JLabel lblHighlightThesis = new JLabel("");
		lblHighlightThesis.setOpaque(true);
		lblHighlightThesis.setBackground(Color.CYAN);
		lblHighlightThesis.setBounds(238, 275, 12, 82);
		panelMenu.add(lblHighlightThesis);
		
		JLabel lblHighlightSettings = new JLabel("");
		lblHighlightSettings.setOpaque(true);
		lblHighlightSettings.setBackground(Color.CYAN);
		lblHighlightSettings.setBounds(238, 461, 12, 82);
		panelMenu.add(lblHighlightSettings);
		
		JLabel lblHighlightStatistics = new JLabel("");
		lblHighlightStatistics.setOpaque(true);
		lblHighlightStatistics.setBackground(Color.CYAN);
		lblHighlightStatistics.setBounds(238, 647, 12, 82);
		panelMenu.add(lblHighlightStatistics);
		
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
		
		panelMenuNotifications = new JPanel();
		panelMenuNotifications.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelMenuNotifications.setOpaque(false);
		panelMenuNotifications.setBounds(0, 69, 250, 123);
		panelMenu.add(panelMenuNotifications);
		
		panelMenuThesis = new JPanel();
		panelMenuThesis.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelMenuThesis.setOpaque(false);
		panelMenuThesis.setBounds(0, 253, 250, 123);
		panelMenu.add(panelMenuThesis);
		
		panelMenuSettings = new JPanel();
		panelMenuSettings.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelMenuSettings.setOpaque(false);
		panelMenuSettings.setBounds(0, 441, 250, 123);
		panelMenu.add(panelMenuSettings);
		
		panelMenuStats = new JPanel();
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
		btnMyAccount.setBounds(33, 748, 186, 64);
		panelMenu.add(btnMyAccount);
		
		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginForm window = new LoginForm();
				window.frmLogin.setVisible(true);
				
			}
		});
		btnLogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				LoginForm window = new LoginForm();
				window.frmLogin.setVisible(true);
			}
		});
		
		btnLogOut.setForeground(new Color(102, 102, 102));
		btnLogOut.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		btnLogOut.setFocusPainted(false);
		btnLogOut.setContentAreaFilled(false);
		btnLogOut.setBorder(UIManager.getBorder("Button.border"));
		btnLogOut.setBounds(33, 812, 186, 64);
		panelMenu.add(btnLogOut);
		
		panelTop = new JPanel();
		panelTop.setMinimumSize(new Dimension(10, 200));
		panelTop.setPreferredSize(new Dimension(10, 170));
		contentPane.add(panelTop, BorderLayout.NORTH);
		panelTop.setLayout(new BoxLayout(panelTop, BoxLayout.X_AXIS));
		
		panelLogo = new JPanel();
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
		
		panelPerson = new JPanel();
		panelPerson.setMinimumSize(new Dimension(10, 200));
		panelPerson.setMaximumSize(new Dimension(32767, 200));
		panelPerson.setBackground(new Color(51, 204, 255));
		panelPerson.setPreferredSize(new Dimension(270, 200));
		panelTop.add(panelPerson);
		panelPerson.setLayout(null);
		
		// Metoda qe merr si paramter se cfare lloj anetari eshte (student,profesor ose administrator)
		// dhe shfaq ikonen dhe labelen perkatese tek ana djathte larte
		userMember(newLogin);
		
		panelMain = new JPanel();
		contentPane.add(panelMain, BorderLayout.CENTER);
		panelMain.setLayout(null);
		
		//DB
		// Marrja e te dhenave nga Databasa (Tema per studentin)
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
		
		String[] columnNames1 = {"Tema",
                "Viti",
                "Profesori"};

		Object[][] data1 = {
		{"Data Mining", "2017",
		"Blerim Reha", new Integer(10), new Boolean(false)}
		};
		
		//DB
		// Marrja e te dhenave nga Databasa (Tema per administraten)
		String[] AdministrataColumnNamesThesis = {"Tema",
                "Studenti",
                "Departamenti",
                "Profesori",
                "Viti"};

		Object[][] Administratadata = {
		{"Data Mining", "Blend Arifaj","Kompjuterike","2017","Blerim Rexha", new Integer(10), new Boolean(false)},
		{"Data Mining", "Arianit Lubishtani",	"Kompjuterike","2017","Lule Ahmedi", new Integer(10), new Boolean(false)},
		{"Data Mining", "Fjolla Beqiri","Kompjuterike","2017","Agni Dika", new Integer(10), new Boolean(false)},
		{"Data Mining", "Blend Arifaj","Kompjuterike","2017", "Blend Arifaj",new Integer(10), new Boolean(false)}
		};
		
		panelAdministrataDiploma = new JPanel();
		panelAdministrataDiploma.setVisible(false);
		
		panelStudentStats = new JPanel();
		panelStudentStats.setVisible(false);
		
		panelAdministrataStats = new JPanel();
		panelAdministrataStats.setVisible(false);
		
		panelAdministrataBtnKontrollo = new JPanel();
		panelAdministrataBtnKontrollo.setVisible(false);
		
		panelAdministrataSettingsShto = new JPanel();
		panelAdministrataSettingsShto.setVisible(false);
		
		panelStudentProfile = new JPanel();
		panelStudentProfile.setVisible(false);
		
		panelStudentMyAccount = new JPanel();
		panelStudentMyAccount.setVisible(false);
		
		panelStudentSettings = new JPanel();
		panelStudentSettings.setVisible(false);
		
		panelStudentDiploma = new JPanel();
		panelStudentDiploma.setVisible(false);
		
		panelStudentNotifications = new JPanel();
		panelStudentNotifications.setBackground(Color.WHITE);
		panelStudentNotifications.setBounds(0, 0, 1427, 865);
		panelMain.add(panelStudentNotifications);
		panelStudentNotifications.setLayout(null);
		
		// Mesazhi qe do shfaqet kur nje studenti i vjen nje notification(Studenti)
		txtStudentNotificationsMessage = new JTextField();
		txtStudentNotificationsMessage.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtStudentNotificationsMessage.setOpaque(false);
		txtStudentNotificationsMessage.setBorder(null);
		txtStudentNotificationsMessage.setColumns(10);
		txtStudentNotificationsMessage.setBounds(328, 487, 752, 259);
		panelStudentNotifications.add(txtStudentNotificationsMessage);
		
		// Tema qe do te shfaqet per te cilen i vie notifications(Studenti)
		txtStudentNotificationsTema = new JTextField();
		txtStudentNotificationsTema.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtStudentNotificationsTema.setOpaque(false);
		txtStudentNotificationsTema.setBorder(null);
		txtStudentNotificationsTema.setBounds(313, 274, 773, 77);
		panelStudentNotifications.add(txtStudentNotificationsTema);
		txtStudentNotificationsTema.setColumns(10);
		
		JLabel lblNjoftimet = new JLabel("NJOFTIMET");
		lblNjoftimet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNjoftimet.setBounds(578, 66, 196, 65);
		panelStudentNotifications.add(lblNjoftimet);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(317, 205, 725, 146);
		panelStudentNotifications.add(scrollPane_1);
		
		table_1 = new JTable(Administratadata,AdministrataColumnNamesThesis);
		table_1.setBackground(SystemColor.window);
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_1.setFillsViewportHeight(true);
		scrollPane_1.setViewportView(table_1);
		
		
		
		panelStudentNotifications.setVisible(false);

		panelAdministrataNjoftimet = new JPanel();
		panelAdministrataNjoftimet.setBounds(0, 0, 1660, 900);
		panelMain.add(panelAdministrataNjoftimet);
		panelAdministrataNjoftimet.setBackground(SystemColor.textHighlightText);
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
		scrollPane.setBounds(256, 171, 816, 75);
		panelAdministrataNjoftimet.add(scrollPane);
		
		JTable tblAdministrataNotifications = new JTable(data, columnNames);
		tblAdministrataNotifications.setBackground(SystemColor.window);
		tblAdministrataNotifications.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(tblAdministrataNotifications);
		
		panelNotificationClicked = new JPanel();
		panelNotificationClicked.setBackground(Color.WHITE);
		panelNotificationClicked.setBounds(0, 374, 1618, 491);
		panelAdministrataNjoftimet.add(panelNotificationClicked);
		panelNotificationClicked.setLayout(null);
		
		// Tema qe shfaqet pasi te klikohet nje item i tabeles (tblAdministrataNotifications)
		txtSingleNotification = new JTextField();
		txtSingleNotification.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtSingleNotification.setBounds(274, 178, 670, 76);
		txtSingleNotification.setBorder(null);
		txtSingleNotification.setOpaque(false);
		panelNotificationClicked.add(txtSingleNotification);
		txtSingleNotification.setColumns(10);
		
		txtNoftimet = new JTextField();
		txtNoftimet.setBounds(451, 66, 243, 61);
		txtNoftimet.setBackground(Color.WHITE);
		txtNoftimet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtNoftimet.setText("Njoftimi selektuar");
		txtNoftimet.setBorder(null);
		panelNotificationClicked.add(txtNoftimet);
		txtNoftimet.setColumns(10);
		
		// Kur klikohet aplikohet algoritmi per plagjiature per temen perkatese dhe shfaqet dritarja per detaje
		JLabel lblKontrolloTemen = new JLabel("");
		lblKontrolloTemen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblKontrolloTemen.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/control.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
		lblKontrolloTemen.setBounds(1160, 196, 50, 50);
		panelNotificationClicked.add(lblKontrolloTemen);
		
		txtKontrollo = new JTextField();
		txtKontrollo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtKontrollo.setBackground(Color.WHITE);
		txtKontrollo.setText("Kontrollo");
		txtKontrollo.setBorder(null);
		txtKontrollo.setBounds(1134, 144, 106, 41);
		panelNotificationClicked.add(txtKontrollo);
		txtKontrollo.setColumns(10);
		
		JLabel lblSingleNotification = new JLabel("");
		lblSingleNotification.setBounds(258, 138, 705, 155);
		lblSingleNotification.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")).getImage()
				.getScaledInstance(700, 100, Image.SCALE_SMOOTH)));
		panelNotificationClicked.add(lblSingleNotification);
		
		// Kur klikohet hapet tema per te u lexuar
		JLabel lblIconReadThesisPdf = new JLabel("");
		lblIconReadThesisPdf.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pdf.png")).getImage()
				.getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
		lblIconReadThesisPdf.setBounds(985, 171, 70, 83);
		panelNotificationClicked.add(lblIconReadThesisPdf);
		
		// All panels false
		 panelAdministrataNjoftimet.setVisible(false);
		 

		 lblKontrolloTemen.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 		//ADMINISTRATA
		 	}
		 });
		
		String[] StudentNotificationsColumns = {"Id",
				"Tema",
                "Studenti",
                "Departamenti",
                "Viti",
                "Profesori"};

		Object[][] StudentNotificationsData = {
		{"1","Data Mining", "Blend Arifaj","Kompjuterike","2017", "BlerimRexha"},
		{"2","Data Mining", "Arianit Lubishtani",	"Kompjuterike","2017", "LuleAhmedi"}
		};
		
		panelStudentDiploma.setBounds(0, 0, 1427, 865);
		panelMain.add(panelStudentDiploma);
		panelStudentDiploma.setBackground(Color.WHITE);
		panelStudentDiploma.setLayout(null);
		
		txtAdd = new JTextField();
		txtAdd.setText("Add");
		txtAdd.setOpaque(false);
		txtAdd.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAdd.setColumns(10);
		txtAdd.setBorder(null);
		txtAdd.setBounds(824, 678, 71, 46);
		panelStudentDiploma.add(txtAdd);
		
		JLabel lblStudentDiplomaShto = new JLabel("");
		lblStudentDiplomaShto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(cmbZgjedhProfesorin.getSelectedIndex() != 0 && cmbZgjedhLenden.getSelectedIndex() !=0) {
					Profesori newProf = new Profesori();
					newProf.getProfesoriFromEmri(cmbZgjedhProfesorin.getSelectedItem().toString());
					Lenda newLenda = new Lenda();
					newLenda.getLenden(cmbZgjedhLenden.getSelectedItem().toString());
					Punimi newPunim = new Punimi(txtShkruajTemen.getText(),
							newProf.getID(), newLenda.getLenda(),"x");
					newPunim.setStudenti(newLogin.student);
					newPunim.setDepartamenti(newLogin.student.getDepartamenti());
					newPunim.setLenda(newLenda);
					if(newPunim.insertNewPunim()) {
						JOptionPane.showMessageDialog(null, "Keni shtuar me sukses punimin!");
						txtShkruajTemen.setText("");
						cmbZgjedhLenden.setSelectedIndex(0);
						cmbZgjedhProfesorin.setSelectedIndex(0);
					}else {
						JOptionPane.showMessageDialog(null, "Gabim gjate shtimit te punimit - Ne server");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Gabim gjate shtimit te punimit");
				}
			
						//Vendi ku kemi me shtu temen e diplomes
			}
		});
		lblStudentDiplomaShto.setIcon(new ImageIcon(frmMain.class.getResource("/Images/login_rectangle_login.png")));
		lblStudentDiplomaShto.setBounds(761, 678, 200, 46);
		panelStudentDiploma.add(lblStudentDiplomaShto);
		
		txtUpload = new JTextField();
		txtUpload.setText("Upload");
		txtUpload.setOpaque(false);
		txtUpload.setHorizontalAlignment(SwingConstants.CENTER);
		txtUpload.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUpload.setColumns(10);
		txtUpload.setBorder(null);
		txtUpload.setBounds(807, 500, 114, 46);
		panelStudentDiploma.add(txtUpload);
		
		JLabel lblStudentDiplomaUploadIcon = new JLabel("");
		lblStudentDiplomaUploadIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/upload.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		lblStudentDiplomaUploadIcon.setBounds(807, 376, 107, 111);
		panelStudentDiploma.add(lblStudentDiplomaUploadIcon);
		
		txtShkruajTemen = new JTextField();
		txtShkruajTemen.setHorizontalAlignment(SwingConstants.CENTER);
		txtShkruajTemen.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtShkruajTemen.setBounds(332, 140, 579, 79);
		txtShkruajTemen.setBorder(null);
		txtShkruajTemen.setOpaque(false);
		panelStudentDiploma.add(txtShkruajTemen);
		txtShkruajTemen.setColumns(10);
		
		JLabel lblStudentDiplomaTema = new JLabel("");
		lblStudentDiplomaTema.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")).getImage().getScaledInstance(600, 100, Image.SCALE_SMOOTH)));
		lblStudentDiplomaTema.setBounds(322, 126, 608, 105);
		panelStudentDiploma.add(lblStudentDiplomaTema);
		
		// DB
		// Tek Faqja per uploadim te diplomes , mbushja e comboBox me te dhenat nga profesorat e departamentit
		cmbZgjedhProfesorin = new JComboBox();
		cmbZgjedhProfesorin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		cmbZgjedhProfesorin.setModel(new DefaultComboBoxModel(new String[] {"Zgjedheni Profesorin"}));
		cmbZgjedhProfesorin.setBackground(Color.WHITE);
		cmbZgjedhProfesorin.setBounds(322, 571, 363, 84);
		panelStudentDiploma.add(cmbZgjedhProfesorin);
// Me i mor te gjith profesorat nga DB
		Profesori prof = new Profesori();
		Enumeration<String> profesoret = prof.getAllProfesoret();
		while(profesoret.hasMoreElements()) {
			cmbZgjedhProfesorin.addItem(profesoret.nextElement());
		}
		JLabel lblStudentDiplomaUpload = new JLabel("");
		lblStudentDiplomaUpload.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		lblStudentDiplomaUpload.setBounds(761, 376, 200, 177);
		panelStudentDiploma.add(lblStudentDiplomaUpload);
		panels.add(panelStudentDiploma);
		
		txtTema = new JTextField();
		txtTema.setEditable(false);
		txtTema.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtTema.setText("Tema");
		txtTema.setBorder(null);
		txtTema.setBounds(131, 147, 114, 69);
		panelStudentDiploma.add(txtTema);
		txtTema.setColumns(10);
		
		cmbZgjedhDepartamentin = new JComboBox();
		cmbZgjedhDepartamentin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		cmbZgjedhDepartamentin.setBackground(Color.WHITE);
		cmbZgjedhDepartamentin.setBounds(322, 474, 363, 84);
		panelStudentDiploma.add(cmbZgjedhDepartamentin);
		cmbZgjedhDepartamentin.setModel(new DefaultComboBoxModel(new String[] {newLogin.student.getDepartamenti().getDeparamenti()}));

		
		cmbZgjedhFakultetin = new JComboBox();
		cmbZgjedhFakultetin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		cmbZgjedhFakultetin.setBackground(Color.WHITE);
		cmbZgjedhFakultetin.setBounds(322, 376, 363, 84);
		panelStudentDiploma.add(cmbZgjedhFakultetin);
		cmbZgjedhFakultetin.setModel(new DefaultComboBoxModel(new String[] {newLogin.student.getFakulteti().getEmri()}));

		
		txtFakulteti_1 = new JTextField();
		txtFakulteti_1.setEditable(false);
		txtFakulteti_1.setText("Fakulteti");
		txtFakulteti_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtFakulteti_1.setColumns(10);
		txtFakulteti_1.setBorder(null);
		txtFakulteti_1.setBounds(131, 386, 114, 69);
		panelStudentDiploma.add(txtFakulteti_1);
		
		txtDepartamenti_1 = new JTextField();
		txtDepartamenti_1.setEditable(false);
		txtDepartamenti_1.setText("Departamenti");
		txtDepartamenti_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtDepartamenti_1.setColumns(10);
		txtDepartamenti_1.setBorder(null);
		txtDepartamenti_1.setBounds(132, 484, 153, 69);
		panelStudentDiploma.add(txtDepartamenti_1);
		
		txtProfesori = new JTextField();
		txtProfesori.setEditable(false);
		txtProfesori.setText("Profesori");
		txtProfesori.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtProfesori.setColumns(10);
		txtProfesori.setBorder(null);
		txtProfesori.setBounds(131, 581, 129, 69);
		panelStudentDiploma.add(txtProfesori);
		
		txtLenda_1 = new JTextField();
		txtLenda_1.setText("Lenda");
		txtLenda_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtLenda_1.setEditable(false);
		txtLenda_1.setColumns(10);
		txtLenda_1.setBorder(null);
		txtLenda_1.setBounds(131, 678, 129, 69);
		panelStudentDiploma.add(txtLenda_1);
		
		cmbZgjedhLenden = new JComboBox();
		cmbZgjedhLenden.setModel(new DefaultComboBoxModel(new String[] {"Zgjedh Lenden"}));
		cmbZgjedhLenden.setFont(new Font("Tahoma", Font.PLAIN, 30));
		cmbZgjedhLenden.setBackground(Color.WHITE);
		cmbZgjedhLenden.setBounds(322, 668, 363, 84);
		panelStudentDiploma.add(cmbZgjedhLenden);
		panelStudentDiploma.setVisible(false);
		Lenda lendet = new Lenda();
		Enumeration<String> Lendet = lendet.getLendet();
		while(Lendet.hasMoreElements()) {
			cmbZgjedhLenden.addItem(Lendet.nextElement());
		}
		panelStudentiChangePassword = new JPanel();
		panelStudentiChangePassword.setBackground(Color.WHITE);
		panelStudentiChangePassword.setBounds(0, 0, 1427, 865);
		panelMain.add(panelStudentiChangePassword);
		panelStudentiChangePassword.setLayout(null);
		
		txtChangePassword = new JTextField();
		txtChangePassword.setText("Change password");
		txtChangePassword.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtChangePassword.setColumns(10);
		txtChangePassword.setBorder(null);
		txtChangePassword.setBounds(606, 69, 216, 51);
		panelStudentiChangePassword.add(txtChangePassword);
		
		lblPassword = new JTextField();
		lblPassword.setEditable(false);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPassword.setBorder(null);
		lblPassword.setText("Old password");
		
		lblPassword.setBounds(278, 249, 216, 51);
		panelStudentiChangePassword.add(lblPassword);
		lblPassword.setColumns(10);
		
		lblNewPassword = new JTextField();
		lblNewPassword.setEditable(false);
		lblNewPassword.setText("New password");
		lblNewPassword.setBorder(null);
		lblNewPassword.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewPassword.setColumns(10);
		lblNewPassword.setBounds(278, 387, 216, 51);
		panelStudentiChangePassword.add(lblNewPassword);
		
		lblRepeatNewPassword = new JTextField();
		lblRepeatNewPassword.setEditable(false);
		lblRepeatNewPassword.setText("Repeat new password");
		lblRepeatNewPassword.setBorder(null);
		lblRepeatNewPassword.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblRepeatNewPassword.setColumns(10);
		lblRepeatNewPassword.setBounds(278, 522, 268, 51);
		panelStudentiChangePassword.add(lblRepeatNewPassword);
				
				pwdOldPassword = new JPasswordField();
				pwdOldPassword.setBounds(618, 249, 471, 51);
				panelStudentiChangePassword.add(pwdOldPassword);
				
				pwdNewPassword = new JPasswordField();
				pwdNewPassword.setBounds(618, 387, 471, 51);
				panelStudentiChangePassword.add(pwdNewPassword);
				
				pwdNewPasswordd = new JPasswordField();
				pwdNewPasswordd.setBounds(618, 510, 471, 51);
				panelStudentiChangePassword.add(pwdNewPasswordd);
				
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setBounds(605, 225, 520, 98);
				lblNewLabel_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")).
						getImage().getScaledInstance(500, 80, Image.SCALE_SMOOTH)));
				
						panelStudentiChangePassword.add(lblNewLabel_1);
				
				JLabel label_1 = new JLabel("");
				label_1.setBounds(605, 366, 520, 98);
				label_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")).
						getImage().getScaledInstance(500, 80, Image.SCALE_SMOOTH)));
				panelStudentiChangePassword.add(label_1);
				
				JLabel label_6 = new JLabel("");
				label_6.setBounds(605, 490, 520, 98);
				label_6.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")).
						getImage().getScaledInstance(500, 80, Image.SCALE_SMOOTH)));
				panelStudentiChangePassword.add(label_6);
				
				JButton btnCancelPass = new JButton("Cancel");
				btnCancelPass.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panelStudentiChangePassword.setVisible(false);
						panelStudentSettings.setVisible(true);
					}
				});
				btnCancelPass.setFont(new Font("Tahoma", Font.PLAIN, 25));
				btnCancelPass.setBounds(856, 663, 150, 60);
				panelStudentiChangePassword.add(btnCancelPass);
				panelStudentiChangePassword.setVisible(false);

				
				JButton btnSave_1 = new JButton("Save");
				btnSave_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(newLogin.getLloji().equals("Student")) {
							if(newLogin.student.getPassHash().equals(Hash.saltedHashString(new String(pwdOldPassword.getPassword()), newLogin.student.getID()))) {
								if(new String(pwdNewPassword.getPassword()).equals(new String(pwdNewPasswordd.getPassword()))) {
									if(newLogin.student.updateStudentPassword(new String(pwdNewPassword.getPassword()))) {
										JOptionPane.showMessageDialog(null, "Keni bere perditesimin e passwordit me sukses!");
										panelStudentiChangePassword.setVisible(false);
										panelStudentSettings.setVisible(true);
									}else {
										JOptionPane.showMessageDialog(null, "Gabim gjate perditesimit te passwordit");
									}
								}
							}else {
								JOptionPane.showMessageDialog(null, "Passwordi gabim!");
							}
						}else {
							if(newLogin.profesor.getPassHash().equals(Hash.saltedHashString(new String(pwdOldPassword.getPassword()), newLogin.profesor.getID()))) {
								if(new String(pwdNewPassword.getPassword()).equals(new String(pwdNewPasswordd.getPassword()))) {
									if(newLogin.profesor.updateProfesorPassword(new String(pwdNewPassword.getPassword()))) {
										JOptionPane.showMessageDialog(null, "Keni bere perditesimin e passwordit me sukses!");
										panelStudentiChangePassword.setVisible(false);
										panelStudentSettings.setVisible(true);
									}else {
										JOptionPane.showMessageDialog(null, "Gabim gjate perditesimit te passwordit");
									}
								}
							}else {
								JOptionPane.showMessageDialog(null, "Passwordi gabim!");
							}
						}
					}
				});
				btnSave_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
				btnSave_1.setBounds(683, 663, 150, 60);
				panelStudentiChangePassword.add(btnSave_1);
		panelStudentSettings.setBounds(0, 0, 1427, 865);
		panelMain.add(panelStudentSettings);
		panelStudentSettings.setBackground(Color.WHITE);
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
		lblStudentSettingsPassRectangle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelStudentiChangePassword.setVisible(true);
				panelStudentSettings.setVisible(false);
			}
		});
		lblStudentSettingsPassRectangle.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		lblStudentSettingsPassRectangle.setBounds(107, 217, 239, 183);
		panelStudentSettings.add(lblStudentSettingsPassRectangle);
		
		JLabel lblStudentSettingsProfile = new JLabel("");
		lblStudentSettingsProfile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelStudentMyAccount.setVisible(true);
				panelStudentSettings.setVisible(false);
				//Mbushja me vlera
				if(newLogin.getLloji().equals("Student")) {
					txtEmri.setText(newLogin.student.getEmri());
					txtMbiemri.setText(newLogin.student.getMbiemri());
					txtEmail.setText(newLogin.student.getEmail());
					txtTel.setText(newLogin.student.getTel());
					txtUniversiteti.setText(newLogin.student.getUniversiteti().getEmri());
					txtFakulteti.setText(newLogin.student.getFakulteti().getEmri());
					txtDepartamenti.setText(newLogin.student.getDepartamenti().getDeparamenti());
				}else if(newLogin.getLloji().equals("Profesor")) {
					txtEmri.setText(newLogin.profesor.getEmri());
					txtMbiemri.setText(newLogin.profesor.getMbiemri());
					txtEmail.setText(newLogin.profesor.getEmail());
					txtTel.setText(newLogin.profesor.getTel());
					txtUniversiteti.setText("-NOT DEFINED-");
					txtFakulteti.setText("-NOT DEFINED-");
					txtDepartamenti.setText("-NOT DEFINED-");
				}else {
					txtEmri.setText(newLogin.administrat.getEmri());
					txtMbiemri.setText(newLogin.administrat.getMbiemri());
					txtEmail.setText(newLogin.administrat.getEmail());
					txtTel.setText(newLogin.administrat.getTel());
					txtUniversiteti.setText(newLogin.administrat.getFakulteti().getUniversiteti().getEmri());
					txtFakulteti.setText(newLogin.administrat.getFakulteti().getEmri());
					txtDepartamenti.setText("-NOT DEFINED-");
				}
			}
		});
		lblStudentSettingsProfile.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		lblStudentSettingsProfile.setBounds(464, 217, 239, 183);
		panelStudentSettings.add(lblStudentSettingsProfile);
		panelStudentSettings.setVisible(false);
		panelStudentMyAccount.setBounds(0, 0, 1427, 865);
		panelMain.add(panelStudentMyAccount);
		panelStudentMyAccount.setBackground(Color.WHITE);
		panelStudentMyAccount.setLayout(null);
		
		txtFakulteti = new JTextField();
		txtFakulteti.setEditable(false);
		txtFakulteti.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtFakulteti.setColumns(10);
		txtFakulteti.setBorder(null);
		txtFakulteti.setBounds(343, 638, 403, 55);
		panelStudentMyAccount.add(txtFakulteti);
		
		txtDepartamenti = new JTextField();
		txtDepartamenti.setEditable(false);
		txtDepartamenti.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtDepartamenti.setColumns(10);
		txtDepartamenti.setBorder(null);
		txtDepartamenti.setBounds(343, 725, 403, 55);
		panelStudentMyAccount.add(txtDepartamenti);
		
		txtTel = new JTextField();
		txtTel.setEditable(false);
		txtTel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtTel.setColumns(10);
		txtTel.setBorder(null);
		txtTel.setBounds(343, 442, 403, 55);
		panelStudentMyAccount.add(txtTel);
		
		txtEmail = new JTextField();
		txtEmail.setEditable(false);
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBounds(343, 331, 403, 55);
		panelStudentMyAccount.add(txtEmail);
		
		txtMbiemri = new JTextField();
		txtMbiemri.setEditable(false);
		txtMbiemri.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtMbiemri.setColumns(10);
		txtMbiemri.setBorder(null);
		txtMbiemri.setBounds(343, 233, 403, 55);
		panelStudentMyAccount.add(txtMbiemri);
		
		txtUniversiteti = new JTextField();
		txtUniversiteti.setEditable(false);
		txtUniversiteti.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtUniversiteti.setColumns(10);
		txtUniversiteti.setBorder(null);
		txtUniversiteti.setBounds(341, 545, 403, 55);
		panelStudentMyAccount.add(txtUniversiteti);
		
		txtEmri = new JTextField();
		txtEmri.setEditable(false);
		txtEmri.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtEmri.setBounds(341, 136, 403, 55);
		txtEmri.setBorder(null);
		
		panelStudentMyAccount.add(txtEmri);
		txtEmri.setColumns(10);
		
		lblEmrii = new JTextField();
		lblEmrii.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEmrii.setText("Emri");
		lblEmrii.setBorder(null);
		lblEmrii.setBounds(119, 136, 150, 48);
		panelStudentMyAccount.add(lblEmrii);
		lblEmrii.setColumns(10);
		
		JLabel lblStudentEmriMyAccount = new JLabel("");
		lblStudentEmriMyAccount.setIcon(new ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")));
		lblStudentEmriMyAccount.setBounds(333, 111, 423, 105);
		panelStudentMyAccount.add(lblStudentEmriMyAccount);
		
		lblMbiemrii = new JTextField();
		lblMbiemrii.setText("Mbiemri");
		lblMbiemrii.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblMbiemrii.setColumns(10);
		lblMbiemrii.setBorder(null);
		lblMbiemrii.setBounds(119, 240, 150, 48);
		panelStudentMyAccount.add(lblMbiemrii);
		
		JLabel lblStudentMbiemriMyAccount = new JLabel("");
		lblStudentMbiemriMyAccount.setIcon(new ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")));
		lblStudentMbiemriMyAccount.setBounds(333, 208, 423, 105);
		panelStudentMyAccount.add(lblStudentMbiemriMyAccount);
		
		lblEmaili = new JTextField();
		lblEmaili.setText("Email");
		lblEmaili.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEmaili.setColumns(10);
		lblEmaili.setBorder(null);
		lblEmaili.setBounds(119, 338, 150, 48);
		panelStudentMyAccount.add(lblEmaili);
		
		lblTeli = new JTextField();
		lblTeli.setText("Tel");
		lblTeli.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTeli.setColumns(10);
		lblTeli.setBorder(null);
		lblTeli.setBounds(119, 442, 150, 48);
		panelStudentMyAccount.add(lblTeli);
		
		lblUniversitetii = new JTextField();
		lblUniversitetii.setText("Universiteti");
		lblUniversitetii.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblUniversitetii.setColumns(10);
		lblUniversitetii.setBorder(null);
		lblUniversitetii.setBounds(119, 541, 164, 48);
		panelStudentMyAccount.add(lblUniversitetii);
		
		lblFakultetii = new JTextField();
		lblFakultetii.setText("Fakulteti");
		lblFakultetii.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblFakultetii.setColumns(10);
		lblFakultetii.setBorder(null);
		lblFakultetii.setBounds(119, 637, 164, 48);
		panelStudentMyAccount.add(lblFakultetii);
		
		lblDepartamentii = new JTextField();
		lblDepartamentii.setText("Departamenti");
		lblDepartamentii.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblDepartamentii.setColumns(10);
		lblDepartamentii.setBorder(null);
		lblDepartamentii.setBounds(119, 735, 182, 48);
		panelStudentMyAccount.add(lblDepartamentii);
		
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
		lblStudentUniversitetiMyAccount.setBounds(333, 516, 423, 105);
		panelStudentMyAccount.add(lblStudentUniversitetiMyAccount);
		
		JLabel lblStudentFakultetiMyAccount = new JLabel("");
		lblStudentFakultetiMyAccount.setIcon(new ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")));
		lblStudentFakultetiMyAccount.setBounds(333, 609, 423, 105);
		panelStudentMyAccount.add(lblStudentFakultetiMyAccount);
		
		JLabel lblStudentDepartamentMyAccount = new JLabel("");
		lblStudentDepartamentMyAccount.setIcon(new ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")));
		lblStudentDepartamentMyAccount.setBounds(333, 704, 423, 105);
		panelStudentMyAccount.add(lblStudentDepartamentMyAccount);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtEmri.setEditable(true);
				txtMbiemri.setEditable(true);
				txtEmail.setEditable(true);
				txtTel.setEditable(true);
				btnSave.setEnabled(true);
				btnEdit.setEnabled(false);
			}
		});
		btnEdit.setBounds(829, 725, 120, 60);
		panelStudentMyAccount.add(btnEdit);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSave.setEnabled(false);
				btnEdit.setEnabled(true);
				txtEmri.setEditable(false);
				txtMbiemri.setEditable(false);
				txtEmail.setEditable(false);
				txtTel.setEditable(false);
				if(newLogin.getLloji().equals("Student")) {
					newLogin.student.setEmri(txtEmri.getText());
					newLogin.student.setMbiemri(txtMbiemri.getText());
					newLogin.student.setEmail(txtEmail.getText());
					newLogin.student.setTel(txtTel.getText());
					if(newLogin.student.updateStuentData()) {
						JOptionPane.showMessageDialog(null, "Keni perditesuar te dhenat me sukses!");
					}else {
						JOptionPane.showMessageDialog(null, "Gabim gjate perditesimit te te dhenave!");
					}
				}else if(newLogin.getLloji().equals("Profesor")){
					newLogin.profesor.setEmri(txtEmri.getText());
					newLogin.profesor.setMbiemri(txtMbiemri.getText());
					newLogin.profesor.setEmail(txtEmail.getText());
					newLogin.profesor.setTel(txtTel.getText());
					if(newLogin.profesor.updateProfesorData()) {
						JOptionPane.showMessageDialog(null, "Keni perditesuar te dhenat me sukses!");
					}else {
						JOptionPane.showMessageDialog(null, "Gabim gjate perditesimit te te dhenave!");
					}
				}else {
					newLogin.administrat.setEmri(txtEmri.getText());
					newLogin.administrat.setMbiemri(txtMbiemri.getText());
					newLogin.administrat.setEmail(txtEmail.getText());
					newLogin.administrat.setTel(txtTel.getText());
					if(newLogin.administrat.updateAdministrataData()) {
						JOptionPane.showMessageDialog(null, "Keni perditesuar te dhenat me sukses!");
					}else {
						JOptionPane.showMessageDialog(null, "Gabim gjate perditesimit te te dhenave!");
					}
				}
			}
		});
		btnSave.setEnabled(false);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSave.setBounds(972, 725, 120, 60);
		panelStudentMyAccount.add(btnSave);
		panelStudentMyAccount.setVisible(false);
		panelStudentProfile.setBounds(0, 0, 1427, 865);
		panelMain.add(panelStudentProfile);
		panelStudentProfile.setBackground(Color.WHITE);
		panelStudentProfile.setLayout(null);
		
		txtProfileEmail = new JTextField();
		txtProfileEmail.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtProfileEmail.setColumns(10);
		txtProfileEmail.setBorder(null);
		txtProfileEmail.setBounds(311, 429, 403, 53);
		panelStudentProfile.add(txtProfileEmail);
		
		txtProfileMbiemri = new JTextField();
		txtProfileMbiemri.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtProfileMbiemri.setColumns(10);
		txtProfileMbiemri.setBorder(null);
		txtProfileMbiemri.setBounds(311, 322, 403, 53);
		panelStudentProfile.add(txtProfileMbiemri);
		
		txtProfileTel = new JTextField();
		txtProfileTel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtProfileTel.setColumns(10);
		txtProfileTel.setBorder(null);
		txtProfileTel.setBounds(311, 533, 403, 53);
		panelStudentProfile.add(txtProfileTel);
		
		txtProfileEmri = new JTextField();
		txtProfileEmri.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtProfileEmri.setBounds(311, 219, 403, 53);
		txtProfileEmri.setBorder(null);
		
		panelStudentProfile.add(txtProfileEmri);
		txtProfileEmri.setColumns(10);
		
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
		
		JSeparator separator = new JSeparator();
		separator.setBounds(276, 807, 1, 2);
		panelStudentProfile.add(separator);
		panelStudentProfile.setVisible(false);
		
		panelAdministrataAddLenda = new JPanel();
		panelAdministrataAddLenda.setLayout(null);
		panelAdministrataAddLenda.setBackground(Color.WHITE);
		panelAdministrataAddLenda.setBounds(0, 0, 1427, 865);
		panelMain.add(panelAdministrataAddLenda);
		
		txtShto = new JTextField();
		txtShto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtShto.setText("ADD");
		txtShto.setOpaque(false);
		txtShto.setBorder(null);
		txtShto.setBounds(574, 490, 48, 46);
		panelAdministrataAddLenda.add(txtShto);
		txtShto.setColumns(10);
		
		txtAdministrataShtoLendeEmri = new JTextField();
		txtAdministrataShtoLendeEmri.setColumns(10);
		txtAdministrataShtoLendeEmri.setBorder(null);
		txtAdministrataShtoLendeEmri.setBounds(322, 259, 577, 62);
		panelAdministrataAddLenda.add(txtAdministrataShtoLendeEmri);
		
		JLabel lblAdministrataShtoLende = new JLabel("");
		lblAdministrataShtoLende.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")).getImage()
				.getScaledInstance(600, 80, Image.SCALE_SMOOTH)));
		lblAdministrataShtoLende.setBounds(312, 246, 609, 90);
		panelAdministrataAddLenda.add(lblAdministrataShtoLende);
		
		JLabel lblShtoLendeTe = new JLabel("Shto lende te re");
		lblShtoLendeTe.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblShtoLendeTe.setBounds(312, 65, 373, 62);
		panelAdministrataAddLenda.add(lblShtoLendeTe);
		
		JLabel label_5 = new JLabel("Emri");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label_5.setBounds(78, 259, 144, 62);
		panelAdministrataAddLenda.add(label_5);
		
		JLabel btnShtoLendeTeRe = new JLabel("");
		btnShtoLendeTeRe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Lenda newLenda = new Lenda();
				newLenda.setLenda(txtAdministrataShtoLendeEmri.getText());
				if(newLenda.insertLenda()) {
					JOptionPane.showMessageDialog(null, "Me sukses keni shtuar nje Lende te re!");
				}else {
					JOptionPane.showMessageDialog(null, "Ju lutem, kontrolloni te dhenat!");

				}
			}
		});
		btnShtoLendeTeRe.setIcon(new ImageIcon(frmMain.class.getResource("/Images/login_rectangle_login.png")));
		btnShtoLendeTeRe.setBounds(501, 490, 200, 46);
		panelAdministrataAddLenda.add(btnShtoLendeTeRe);
		panelAdministrataAddLenda.setVisible(false);
		
		panelAdministrataAddUniversity = new JPanel();
		panelAdministrataAddUniversity.setBackground(Color.WHITE);
		panelAdministrataAddUniversity.setBounds(0, 0, 1427, 865);
		panelMain.add(panelAdministrataAddUniversity);
		panelAdministrataAddUniversity.setLayout(null);
		
		txtAdd_1 = new JTextField();
		txtAdd_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtAdd_1.setText("ADD");
		txtAdd_1.setBorder(null);
		txtAdd_1.setOpaque(false);
		txtAdd_1.setBounds(464, 419, 51, 46);
		panelAdministrataAddUniversity.add(txtAdd_1);
		txtAdd_1.setColumns(10);
		
		txtAdministrataShtoUniversitet = new JTextField();
		txtAdministrataShtoUniversitet.setBounds(238, 259, 573, 62);
		txtAdministrataShtoUniversitet.setOpaque(false);
		txtAdministrataShtoUniversitet.setBorder(null);
		panelAdministrataAddUniversity.add(txtAdministrataShtoUniversitet);
		txtAdministrataShtoUniversitet.setColumns(10);
		
		JLabel lblAdministrataEmriUniversitetit = new JLabel("");
		lblAdministrataEmriUniversitetit.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")).getImage()
				.getScaledInstance(600, 80, Image.SCALE_SMOOTH)));
		lblAdministrataEmriUniversitetit.setBounds(229, 244, 609, 90);
		panelAdministrataAddUniversity.add(lblAdministrataEmriUniversitetit);
		
		JLabel lblShtoUniversitetTe = new JLabel("Shto Universitet te ri");
		lblShtoUniversitetTe.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblShtoUniversitetTe.setBounds(312, 65, 302, 62);
		panelAdministrataAddUniversity.add(lblShtoUniversitetTe);
		
		JLabel lblEmri = new JLabel("Emri");
		lblEmri.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEmri.setBounds(78, 259, 144, 62);
		panelAdministrataAddUniversity.add(lblEmri);
		
		JLabel btnShtoUniversitetTeRi = new JLabel("");
		btnShtoUniversitetTeRi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Universiteti newUni = new Universiteti();
				newUni.setEmri(txtAdministrataShtoUniversitet.getText());
				if(newUni.insertUniversitetin()) {
					JOptionPane.showMessageDialog(null, "Me sukses keni shtuar nje Universitet te ri!");
				}else {
					JOptionPane.showMessageDialog(null, "Ju lutem, kontrolloni te dhenat!");
				}
			}
		});
		btnShtoUniversitetTeRi.setIcon(new ImageIcon(frmMain.class.getResource("/Images/login_rectangle_login.png")));
		btnShtoUniversitetTeRi.setBounds(390, 419, 200, 46);
		panelAdministrataAddUniversity.add(btnShtoUniversitetTeRi);
		panelAdministrataAddUniversity.setVisible(false);
		
		panelAdministrataAddFakultet = new JPanel();
		panelAdministrataAddFakultet.setLayout(null);
		panelAdministrataAddFakultet.setBackground(Color.WHITE);
		panelAdministrataAddFakultet.setBounds(10, 22, 1427, 865);
		panelMain.add(panelAdministrataAddFakultet);
		
		txtAdd_2 = new JTextField();
		txtAdd_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtAdd_2.setText("ADD");
		txtAdd_2.setOpaque(false);
		txtAdd_2.setBorder(null);
		txtAdd_2.setBounds(557, 600, 54, 46);
		panelAdministrataAddFakultet.add(txtAdd_2);
		txtAdd_2.setColumns(10);
		
		txtAdministrataShtoFakultetAdresa = new JTextField();
		txtAdministrataShtoFakultetAdresa.setColumns(10);
		txtAdministrataShtoFakultetAdresa.setBorder(null);
		txtAdministrataShtoFakultetAdresa.setBounds(322, 479, 573, 62);
		panelAdministrataAddFakultet.add(txtAdministrataShtoFakultetAdresa);
		
		txtAdministrataShtoFakultetEmri = new JTextField();
		txtAdministrataShtoFakultetEmri.setBounds(322, 259, 573, 62);
		txtAdministrataShtoFakultetEmri.setBorder(null);
		panelAdministrataAddFakultet.add(txtAdministrataShtoFakultetEmri);
		txtAdministrataShtoFakultetEmri.setColumns(10);
		
		JLabel lblAdministrataShtoFakultetEmri = new JLabel("");
		lblAdministrataShtoFakultetEmri.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")).getImage()
				.getScaledInstance(600, 80, Image.SCALE_SMOOTH)));
		lblAdministrataShtoFakultetEmri.setBounds(312, 246, 609, 90);
		panelAdministrataAddFakultet.add(lblAdministrataShtoFakultetEmri);
		
		JLabel lblShtoFakultetTe = new JLabel("Shto Fakultet te ri");
		lblShtoFakultetTe.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblShtoFakultetTe.setBounds(312, 65, 302, 62);
		panelAdministrataAddFakultet.add(lblShtoFakultetTe);
		
		JLabel label_2 = new JLabel("Emri");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label_2.setBounds(78, 259, 144, 62);
		panelAdministrataAddFakultet.add(label_2);
		
		JLabel lblUniversiteti = new JLabel("Universiteti");
		lblUniversiteti.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblUniversiteti.setBounds(78, 374, 201, 62);
		panelAdministrataAddFakultet.add(lblUniversiteti);
		
		JLabel lblAdresa = new JLabel("Adresa");
		lblAdresa.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblAdresa.setBounds(78, 492, 144, 62);
		panelAdministrataAddFakultet.add(lblAdresa);
		
		// Gjenerohet nga databasa (lista e universiteteve)
		JComboBox cmbAdministrataUniversitati = new JComboBox();
		cmbAdministrataUniversitati.setFont(new Font("Tahoma", Font.PLAIN, 30));
		cmbAdministrataUniversitati.setModel(new DefaultComboBoxModel(new String[] {"Zgjedhe Universitetin"}));
		cmbAdministrataUniversitati.setBounds(322, 374, 483, 62);
		panelAdministrataAddFakultet.add(cmbAdministrataUniversitati);
		Universiteti uni = new Universiteti();
		Enumeration<String> universitetet = uni.getUniversitetet();
		while(universitetet.hasMoreElements()) {
			cmbAdministrataUniversitati.addItem(universitetet.nextElement());
		}
		
		JLabel lblAdministrataShtoFakultetAdresa = new JLabel("");
		lblAdministrataShtoFakultetAdresa.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")).getImage()
				.getScaledInstance(600, 80, Image.SCALE_SMOOTH)));
		lblAdministrataShtoFakultetAdresa.setBounds(312, 464, 609, 90);
		panelAdministrataAddFakultet.add(lblAdministrataShtoFakultetAdresa);
		
		// Kur klikohet shtohet nje fakultet i ri (administrata)
		JLabel btnShtoFakultetTeRi = new JLabel("");
		btnShtoFakultetTeRi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(cmbAdministrataUniversitati.getSelectedIndex() != 0) {
					Fakulteti newFk = new Fakulteti();
					newFk.setEmri(txtAdministrataShtoFakultetEmri.getText());
					newFk.setID(txtAdministrataShtoFakultetID.getText());
					newFk.setAdresa(txtAdministrataShtoFakultetAdresa.getText());
					uni.inicializoUniversitetin(cmbAdministrataUniversitati.getSelectedItem().toString());
					newFk.setUniversiteti(uni);
					if(newFk.insertNewFakultet()) {
						JOptionPane.showMessageDialog(null, "Me sukses keni shtuar nje Fakultet te ri!");
					}else {
						JOptionPane.showMessageDialog(null, "Ju lutem te kontrolloni te dhenat!");

					}
			}
		}
		});
		btnShtoFakultetTeRi.setIcon(new ImageIcon(frmMain.class.getResource("/Images/login_rectangle_login.png")));
		btnShtoFakultetTeRi.setBounds(488, 600, 200, 46);
		panelAdministrataAddFakultet.add(btnShtoFakultetTeRi);
		
		txtAdministrataShtoFakultetID = new JTextField();
		txtAdministrataShtoFakultetID.setColumns(10);
		txtAdministrataShtoFakultetID.setBorder(null);
		txtAdministrataShtoFakultetID.setBounds(322, 153, 573, 62);
		panelAdministrataAddFakultet.add(txtAdministrataShtoFakultetID);
		
		JLabel lblId_1 = new JLabel("ID");
		lblId_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblId_1.setBounds(78, 164, 144, 62);
		panelAdministrataAddFakultet.add(lblId_1);
		
		JLabel label = new JLabel("");
		label.setBounds(312, 140, 609, 90);
		label.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")).getImage()
				.getScaledInstance(600, 80, Image.SCALE_SMOOTH)));
		panelAdministrataAddFakultet.add(label);
		panelAdministrataAddFakultet.setVisible(false);
		
		panelAdministrataAddDepartament = new JPanel();
		panelAdministrataAddDepartament.setLayout(null);
		panelAdministrataAddDepartament.setBackground(Color.WHITE);
		panelAdministrataAddDepartament.setBounds(0, 0, 1427, 865);
		panelMain.add(panelAdministrataAddDepartament);
		
		txtAdd_3 = new JTextField();
		txtAdd_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtAdd_3.setText("ADD");
		txtAdd_3.setOpaque(false);
		txtAdd_3.setBorder(null);
		txtAdd_3.setBounds(561, 594, 55, 46);
		panelAdministrataAddDepartament.add(txtAdd_3);
		txtAdd_3.setColumns(10);
		
		txtAdministrataShtoDepartamentEmri = new JTextField();
		txtAdministrataShtoDepartamentEmri.setBorder(null);
		txtAdministrataShtoDepartamentEmri.setBounds(322, 261, 577, 62);
		panelAdministrataAddDepartament.add(txtAdministrataShtoDepartamentEmri);
		txtAdministrataShtoDepartamentEmri.setColumns(10);
		
		lblAdministrataAddDepartament = new JLabel("");
		lblAdministrataAddDepartament.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")).getImage()
				.getScaledInstance(600, 80, Image.SCALE_SMOOTH)));
		lblAdministrataAddDepartament.setBounds(312, 246, 609, 90);
		panelAdministrataAddDepartament.add(lblAdministrataAddDepartament);
		
		JLabel lblShtoDepartamentTe = new JLabel("Shto Departament te ri");
		lblShtoDepartamentTe.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblShtoDepartamentTe.setBounds(312, 65, 373, 62);
		panelAdministrataAddDepartament.add(lblShtoDepartamentTe);
		
		JLabel label_3 = new JLabel("Emri");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label_3.setBounds(78, 261, 144, 62);
		panelAdministrataAddDepartament.add(label_3);
		
		JLabel label_4 = new JLabel("Universiteti");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label_4.setBounds(78, 470, 201, 62);
		panelAdministrataAddDepartament.add(label_4);
		
		JComboBox cmbFakultetet = new JComboBox();
		cmbFakultetet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		cmbFakultetet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		cmbFakultetet.setBounds(322, 470, 483, 62);
		panelAdministrataAddDepartament.add(cmbFakultetet);
		cmbFakultetet.addItem("Zgjedheni fakultetin!");
		Fakulteti fakulteti = new Fakulteti();
		Enumeration<String> fakultetet = fakulteti.getFakultetet();
		while(fakultetet.hasMoreElements()) {
			cmbFakultetet.addItem(fakultetet.nextElement());
		}
		// Kur klikohet shtohet nje departament i ri
		JLabel btnShtoDepartamentTeRi = new JLabel("");
		btnShtoDepartamentTeRi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(cmbFakultetet.getSelectedIndex() != 0) {
					Departamenti newDept = new Departamenti();
					newDept.setDeparamenti(txtAdministrataShtoDepartamentEmri.getText());
					newDept.setID(txtAdministrataShtoDepartamentID.getText());
					fakulteti.inicializoFakultetin(cmbFakultetet.getSelectedItem().toString());
					if(fakulteti.insertNewDepartament(newDept)) {
						JOptionPane.showMessageDialog(null, "Me sukses keni shtuar nje departament te ri!");
					}else {
						JOptionPane.showMessageDialog(null, "Ju lutem te kontrolloni te dhenat!");

					}
				}
			}
		});
		btnShtoDepartamentTeRi.setIcon(new ImageIcon(frmMain.class.getResource("/Images/login_rectangle_login.png")));
		btnShtoDepartamentTeRi.setBounds(486, 594, 200, 46);
		panelAdministrataAddDepartament.add(btnShtoDepartamentTeRi);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblId.setBounds(78, 366, 144, 62);
		panelAdministrataAddDepartament.add(lblId);
		
		txtAdministrataShtoDepartamentID = new JTextField();
		txtAdministrataShtoDepartamentID.setColumns(10);
		txtAdministrataShtoDepartamentID.setBorder(null);
		txtAdministrataShtoDepartamentID.setBounds(322, 373, 393, 62);
		panelAdministrataAddDepartament.add(txtAdministrataShtoDepartamentID);
		
		JLabel labelID = new JLabel("");
		labelID.setBounds(312, 349, 455, 108);
		labelID.setIcon(new ImageIcon(frmMain.class.getResource("/Images/myaccount_rectangle.png")));
		panelAdministrataAddDepartament.add(labelID);
		panelAdministrataAddDepartament.setVisible(false);
		
		panelProfesorDiploma = new JPanel();
		panelProfesorDiploma.setBackground(Color.WHITE);
		panelProfesorDiploma.setBounds(0, 0, 1427, 865);
		panelMain.add(panelProfesorDiploma);
		panelProfesorDiploma.setLayout(null);
		
		JLabel lblLita = new JLabel("Lista e temave te diplomes");
		lblLita.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblLita.setBounds(430, 104, 420, 127);
		panelProfesorDiploma.add(lblLita);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(212, 318, 871, 88);
		panelProfesorDiploma.add(scrollPane_3);
		
		tableProfesoriDiploma = new JTable(Administratadata,AdministrataColumnNamesThesis);
		tableProfesoriDiploma.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPane_3.setViewportView(tableProfesoriDiploma);
		panelProfesorDiploma.setVisible(false);
		panelAdministrataSettingsShto.setBounds(0, 0, 1427, 865);
		panelMain.add(panelAdministrataSettingsShto);
		panelAdministrataSettingsShto.setLayout(null);
		
		txtLenda = new JTextField();
		txtLenda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtLenda.setText("Lenda");
		txtLenda.setOpaque(false);
		txtLenda.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtLenda.setColumns(10);
		txtLenda.setBorder(null);
		txtLenda.setBounds(853, 640, 82, 37);
		panelAdministrataSettingsShto.add(txtLenda);
		
		txtDepartament = new JTextField();
		txtDepartament.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtDepartament.setText("Departament");
		txtDepartament.setOpaque(false);
		txtDepartament.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtDepartament.setColumns(10);
		txtDepartament.setBorder(null);
		txtDepartament.setBounds(403, 640, 173, 37);
		panelAdministrataSettingsShto.add(txtDepartament);
		
		txtFakultet = new JTextField();
		txtFakultet.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtFakultet.setText("Fakultet");
		txtFakultet.setOpaque(false);
		txtFakultet.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtFakultet.setColumns(10);
		txtFakultet.setBorder(null);
		txtFakultet.setBounds(843, 295, 105, 37);
		panelAdministrataSettingsShto.add(txtFakultet);
		
		JLabel lblShtoLendaIcon = new JLabel("");		
		lblShtoLendaIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblShtoLendaIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		lblShtoLendaIcon.setBounds(843, 548, 105, 81);
		panelAdministrataSettingsShto.add(lblShtoLendaIcon);
		
		JLabel lblShtoLendaRectangle = new JLabel("");
		lblShtoLendaRectangle.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblShtoLendaRectangle.setBounds(760, 499, 271, 198);
		lblShtoLendaRectangle.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		panelAdministrataSettingsShto.add(lblShtoLendaRectangle);
		
		JLabel lblShtoDepartamentIcon = new JLabel("");
		lblShtoDepartamentIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblShtoDepartamentIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		lblShtoDepartamentIcon.setBounds(433, 548, 105, 81);
		panelAdministrataSettingsShto.add(lblShtoDepartamentIcon);
		
		JLabel lblShtoFakultetIcon = new JLabel("");
		lblShtoFakultetIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblShtoFakultetIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		lblShtoFakultetIcon.setBounds(843, 189, 105, 81);
		panelAdministrataSettingsShto.add(lblShtoFakultetIcon);
		
		txtUniversitet = new JTextField();
		txtUniversitet.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtUniversitet.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtUniversitet.setText("Universitet");
		txtUniversitet.setBounds(419, 295, 143, 37);
		txtUniversitet.setOpaque(false);
		txtUniversitet.setBorder(null);
		panelAdministrataSettingsShto.add(txtUniversitet);
		txtUniversitet.setColumns(10);
		
		JLabel lblShtoUniversitetIcon = new JLabel("");
		lblShtoUniversitetIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblShtoUniversitetIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		lblShtoUniversitetIcon.setBounds(433, 189, 105, 81);
		panelAdministrataSettingsShto.add(lblShtoUniversitetIcon);
		
		JLabel lblShtoUniversitetRectangle = new JLabel("");
		lblShtoUniversitetRectangle.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblShtoUniversitetRectangle.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		lblShtoUniversitetRectangle.setBounds(348, 152, 271, 198);
		panelAdministrataSettingsShto.add(lblShtoUniversitetRectangle);
		
		JLabel lblShtoFakultetRectangle = new JLabel("");
		lblShtoFakultetRectangle.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblShtoFakultetRectangle.setBounds(760, 152, 271, 198);
		lblShtoFakultetRectangle.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		panelAdministrataSettingsShto.add(lblShtoFakultetRectangle);
		
		JLabel lblShtoDepartamentRectangle = new JLabel("");
		lblShtoDepartamentRectangle.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblShtoDepartamentRectangle.setBounds(348, 499, 271, 198);
		lblShtoDepartamentRectangle.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		panelAdministrataSettingsShto.add(lblShtoDepartamentRectangle);
		panelAdministrataBtnKontrollo.setBounds(0, 0, 1660, 900);
		panelMain.add(panelAdministrataBtnKontrollo);
		panelAdministrataBtnKontrollo.setBackground(SystemColor.text);
		panelAdministrataBtnKontrollo.setLayout(null);
		
		JTextArea txtrDetajeTeTemes = new JTextArea();
		txtrDetajeTeTemes.setWrapStyleWord(true);
		txtrDetajeTeTemes.setText("Detaje te temes se diplomes pas       kontrollimit nga algoritmi per plagjiature");
		txtrDetajeTeTemes.setFont(new Font("Monospaced", Font.PLAIN, 25));
		txtrDetajeTeTemes.setBounds(346, 313, 567, 493);
		txtrDetajeTeTemes.setLineWrap(true);
		panelAdministrataBtnKontrollo.add(txtrDetajeTeTemes);
		
		temaDiplomes = new JTextField();
		temaDiplomes.setFont(new Font("Tahoma", Font.PLAIN, 25));
		temaDiplomes.setText("Tema e diplomes \"Data Mining\" (2017)");
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
		panels.add(panelAdministrataBtnKontrollo);
		panelAdministrataStats.setBounds(0, 0, 1427, 865);
		panelMain.add(panelAdministrataStats);
		panelStudentStats.setBounds(0, 0, 1427, 865);
		panelMain.add(panelStudentStats);
		panelStudentStats.setBackground(Color.WHITE);
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
		panelAdministrataDiploma.setBounds(0, 0, 1427, 865);
		panelMain.add(panelAdministrataDiploma);
		panelAdministrataDiploma.setBackground(Color.WHITE);
		panelAdministrataDiploma.setLayout(null);
		
		JLabel lblSearchThesis = new JLabel("");
		lblSearchThesis.setBounds(226, 150, 616, 109);
		lblSearchThesis.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myaccount_rectangle.png")).getImage().getScaledInstance(600, 100, Image.SCALE_SMOOTH)));
		panelAdministrataDiploma.add(lblSearchThesis);
		
		JLabel lblSearchThesisIcon = new JLabel("");
		lblSearchThesisIcon.setBounds(879, 150, 100, 100);
		lblSearchThesisIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		panelAdministrataDiploma.add(lblSearchThesisIcon);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(226, 319, 743, 91);
		panelAdministrataDiploma.add(scrollPane_2);
		
		table_3 = new JTable(Administratadata,AdministrataColumnNamesThesis);
		table_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPane_2.setViewportView(table_3);
		
		panelAdministrataSettings = new JPanel();
		panelAdministrataSettings.setBounds(0, 0, 1427, 865);
		panelMain.add(panelAdministrataSettings);
		panelAdministrataSettings.setVisible(false);
		panelAdministrataSettings.setLayout(null);
		
		lblModifikoText = new JTextField();
		lblModifikoText.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblModifikoText.setText("Modifiko");
		lblModifikoText.setOpaque(false);
		lblModifikoText.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblModifikoText.setColumns(10);
		lblModifikoText.setBorder(null);
		lblModifikoText.setBounds(836, 592, 128, 49);
		panelAdministrataSettings.add(lblModifikoText);
		
		JLabel lblModifikoIcon = new JLabel("");
		lblModifikoIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblModifikoIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pencil-edit-button.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		lblModifikoIcon.setBounds(842, 480, 109, 101);
		panelAdministrataSettings.add(lblModifikoIcon);
		
		JLabel lblModifikoRectangle = new JLabel("");
		lblModifikoRectangle.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblModifikoRectangle.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		lblModifikoRectangle.setBounds(755, 455, 271, 198);
		panelAdministrataSettings.add(lblModifikoRectangle);
		
		lblShtoTeDhenaText = new JTextField();
		lblShtoTeDhenaText.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblShtoTeDhenaText.setText("Shto");
		lblShtoTeDhenaText.setOpaque(false);
		lblShtoTeDhenaText.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblShtoTeDhenaText.setColumns(10);
		lblShtoTeDhenaText.setBorder(null);
		lblShtoTeDhenaText.setBounds(463, 592, 63, 49);
		panelAdministrataSettings.add(lblShtoTeDhenaText);
		
		JLabel lblShtoTeDhenaIcon = new JLabel("");
		lblShtoTeDhenaIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblShtoTeDhenaIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		lblShtoTeDhenaIcon.setBounds(436, 480, 109, 101);
		panelAdministrataSettings.add(lblShtoTeDhenaIcon);
		
		txtProfile = new JTextField();
		txtProfile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtProfile.setText("Profile");
		txtProfile.setOpaque(false);
		txtProfile.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtProfile.setColumns(10);
		txtProfile.setBorder(null);
		txtProfile.setBounds(842, 313, 92, 49);
		panelAdministrataSettings.add(txtProfile);
		
		JLabel lblProfileIcon = new JLabel("");
		lblProfileIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblProfileIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		lblProfileIcon.setBounds(836, 189, 109, 113);
		panelAdministrataSettings.add(lblProfileIcon);
		
		JLabel lblProfileRectangle = new JLabel("");
		lblProfileRectangle.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblProfileRectangle.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		lblProfileRectangle.setBounds(755, 175, 271, 198);
		panelAdministrataSettings.add(lblProfileRectangle);
		
		JLabel lblPasswordIcon = new JLabel("");
		lblPasswordIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblPasswordIcon.setBounds(436, 201, 109, 101);
		lblPasswordIcon.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_password_button.png")));
		panelAdministrataSettings.add(lblPasswordIcon);
		
		txtPasswordText = new JTextField();
		txtPasswordText.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtPasswordText.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtPasswordText.setText("Password");
		txtPasswordText.setOpaque(false);
		txtPasswordText.setBorder(null);
		txtPasswordText.setBounds(426, 313, 150, 49);
		panelAdministrataSettings.add(txtPasswordText);
		txtPasswordText.setColumns(10);
		
		JLabel lblPasswordRectangle = new JLabel("");
		lblPasswordRectangle.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblPasswordRectangle.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		lblPasswordRectangle.setBounds(358, 175, 271, 198);
		panelAdministrataSettings.add(lblPasswordRectangle);
		
		JLabel lblShtoTeDhenaRectangle = new JLabel("");
		lblShtoTeDhenaRectangle.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblShtoTeDhenaRectangle.setIcon(new ImageIcon(frmMain.class.getResource("/Images/settings_button.png")));
		lblShtoTeDhenaRectangle.setBounds(358, 455, 271, 198);
		panelAdministrataSettings.add(lblShtoTeDhenaRectangle);
		/*
		panels.add(panelAdministrataNjoftimet);
		panels.add(panelAdministrataSettings);
		panels.add(panelAdministrataSettingsShto);
		panels.add(panelAdministrataThesis);
		panels.add(panelAdministrataStats);
		panels.add(panelStudentMyAccount);
		panels.add(panelStudentProfile);
		panels.add(panelStudentStats);
		
		labelHighlight.add(lblHighlightNotifications);
		labelHighlight.add(lblHighlightThesis);
		labelHighlight.add(lblHighlightSettings);
		labelHighlight.add(lblHighlightStatistics);
	*/
		 panelAdministrataSettings.setVisible(false);
		 panelAdministrataSettingsShto.setVisible(false);
		 panelAdministrataBtnKontrollo.setVisible(false);
		 panelAdministrataDiploma.setVisible(false);
		 panelAdministrataStats.setVisible(false);
		 panelStudentStats.setVisible(false);
		 panelProfesorDiploma.setVisible(false);
		 
		
		
		if(newLogin.getLloji().equals("Student")) {
			panelStudentDiploma.setVisible(true);
		}else if(newLogin.getLloji().equals("Profesor")) {
			panelProfesorDiploma.setVisible(true);
		}else {
			panelAdministrataDiploma.setVisible(true);			
		}
		
		lblHighlightNotifications.setVisible(false);
		lblHighlightThesis.setVisible(true);
		lblHighlightSettings.setVisible(false);
		lblHighlightStatistics.setVisible(false);
		
		panelMenuNotifications.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//caktoVisible("panelAdministrataNjoftimet");
				//caktoVisibleHighlights(lblHighlightNotifications);
				if(newLogin.getLloji().equals("Student")) {
					panelStudentiChangePassword.setVisible(false);

					panelStudentMyAccount.setVisible(false);
					panelStudentProfile.setVisible(false);
					panelStudentStats.setVisible(false);
					panelStudentDiploma.setVisible(false);
					panelStudentSettings.setVisible(false);
					panelStudentNotifications.setVisible(true);
					//Studenti
				}else if(newLogin.getLloji().equals("Profesor")) {
					panelStudentiChangePassword.setVisible(false);

					panelStudentMyAccount.setVisible(false);
					panelStudentProfile.setVisible(false);
					panelStudentStats.setVisible(false);
					panelProfesorDiploma.setVisible(false);
					panelStudentSettings.setVisible(false);
					panelStudentNotifications.setVisible(true);
					//Profesori
				}else {
					panelStudentMyAccount.setVisible(false);
					panelAdministrataNjoftimet.setVisible(true);
					panelAdministrataSettings.setVisible(false);
					panelAdministrataSettingsShto.setVisible(false);
					panelAdministrataDiploma.setVisible(false);
					panelAdministrataStats.setVisible(false);
					panelAdministrataBtnKontrollo.setVisible(false);	
					panelAdministrataAddDepartament.setVisible(false);
					panelAdministrataAddLenda.setVisible(false);
					panelAdministrataAddFakultet.setVisible(false);
					panelAdministrataAddUniversity.setVisible(false);
				}
				
				lblHighlightNotifications.setVisible(true);
				lblHighlightThesis.setVisible(false);
				lblHighlightSettings.setVisible(false);
				lblHighlightStatistics.setVisible(false);
			}
		});
		

		panelMenuThesis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//caktoVisible("panelAdministrataThesis");
				//caktoVisibleHighlights(lblHighlightThesis);
				if(newLogin.getLloji().equals("Student")) {
					panelStudentiChangePassword.setVisible(false);

					panelStudentMyAccount.setVisible(false);
					panelStudentProfile.setVisible(false);
					panelStudentStats.setVisible(false);
					panelStudentDiploma.setVisible(true);
					panelStudentSettings.setVisible(false);
					panelStudentNotifications.setVisible(false);
				}else if(newLogin.getLloji().equals("Profesor")) {
					panelStudentiChangePassword.setVisible(false);

					panelStudentMyAccount.setVisible(false);
					panelStudentProfile.setVisible(false);
					panelStudentStats.setVisible(false);
					panelProfesorDiploma.setVisible(true);
					panelStudentSettings.setVisible(false);
					panelStudentNotifications.setVisible(false);
				}else {
					panelStudentMyAccount.setVisible(false);
					panelAdministrataNjoftimet.setVisible(false);
					panelAdministrataSettings.setVisible(false);
					panelAdministrataSettingsShto.setVisible(false);
					panelAdministrataDiploma.setVisible(true);
					panelAdministrataStats.setVisible(false);
					panelAdministrataBtnKontrollo.setVisible(false);	
					panelAdministrataAddDepartament.setVisible(false);
					panelAdministrataAddLenda.setVisible(false);
					panelAdministrataAddFakultet.setVisible(false);
					panelAdministrataAddUniversity.setVisible(false);
				}
				
				
				lblHighlightNotifications.setVisible(false);
				lblHighlightThesis.setVisible(true);
				lblHighlightSettings.setVisible(false);
				lblHighlightStatistics.setVisible(false);
			}
		});
				

		panelMenuSettings.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//caktoVisible("panelAdministrataSettings");
				//caktoVisibleHighlights(lblHighlightSettings);
				if(newLogin.getLloji().equals("Student")) {
					panelStudentMyAccount.setVisible(false);
					panelStudentProfile.setVisible(false);
					panelStudentStats.setVisible(false);
					panelStudentDiploma.setVisible(false);
					panelStudentSettings.setVisible(true);
					panelStudentNotifications.setVisible(false);
					panelStudentiChangePassword.setVisible(false);

				}else if(newLogin.getLloji().equals("Profesor")) {
					panelStudentiChangePassword.setVisible(false);

					panelStudentMyAccount.setVisible(false);
					panelStudentProfile.setVisible(false);
					panelStudentStats.setVisible(false);
					panelProfesorDiploma.setVisible(false);
					panelStudentSettings.setVisible(true);
					panelStudentNotifications.setVisible(false);
				}else {
					panelStudentMyAccount.setVisible(false);
					panelAdministrataNjoftimet.setVisible(false);
					panelAdministrataSettings.setVisible(false);
					panelAdministrataSettingsShto.setVisible(true);
					panelAdministrataDiploma.setVisible(false);
					panelAdministrataStats.setVisible(false);
					panelAdministrataBtnKontrollo.setVisible(true);	
					panelAdministrataAddDepartament.setVisible(false);
					panelAdministrataAddLenda.setVisible(false);
					panelAdministrataAddFakultet.setVisible(false);
					panelAdministrataAddUniversity.setVisible(false);
				}
				
				lblHighlightNotifications.setVisible(false);
				lblHighlightThesis.setVisible(false);
				lblHighlightSettings.setVisible(true);
				lblHighlightStatistics.setVisible(false);
			}
		});
		

		lblShtoTeDhenaRectangle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//caktoVisible("panelAdministrataSettingsShto");
				// ADMINISTRATA
			}
		});
		
		lblShtoUniversitetRectangle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//caktoVisible("panelAdministrataStats");
				//labelHighlight.add(lblHighlightStatistics);
				
					panelAdministrataNjoftimet.setVisible(false);
					panelAdministrataSettings.setVisible(false);
					panelAdministrataSettingsShto.setVisible(false);
					panelAdministrataDiploma.setVisible(false);
					panelAdministrataStats.setVisible(false);
					panelAdministrataBtnKontrollo.setVisible(false);	
					panelAdministrataAddDepartament.setVisible(false);
					panelAdministrataAddLenda.setVisible(false);
					panelAdministrataAddFakultet.setVisible(false);
					panelAdministrataAddUniversity.setVisible(true);
			
				
				lblHighlightNotifications.setVisible(false);
				lblHighlightThesis.setVisible(false);
				lblHighlightSettings.setVisible(true);
				lblHighlightStatistics.setVisible(false);	
			}
		});
		
		lblShtoFakultetRectangle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//caktoVisible("panelAdministrataStats");
				//labelHighlight.add(lblHighlightStatistics);
				
					panelAdministrataNjoftimet.setVisible(false);
					panelAdministrataSettings.setVisible(false);
					panelAdministrataSettingsShto.setVisible(false);
					panelAdministrataDiploma.setVisible(false);
					panelAdministrataStats.setVisible(false);
					panelAdministrataBtnKontrollo.setVisible(true);	
					panelAdministrataAddDepartament.setVisible(false);
					panelAdministrataAddLenda.setVisible(false);
					panelAdministrataAddFakultet.setVisible(true);
					panelAdministrataAddUniversity.setVisible(false);
			
				
				lblHighlightNotifications.setVisible(false);
				lblHighlightThesis.setVisible(false);
				lblHighlightSettings.setVisible(true);
				lblHighlightStatistics.setVisible(false);	
			}
		});
		
		lblShtoDepartamentRectangle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//caktoVisible("panelAdministrataStats");
				//labelHighlight.add(lblHighlightStatistics);
				
					panelAdministrataNjoftimet.setVisible(false);
					panelAdministrataSettings.setVisible(false);
					panelAdministrataSettingsShto.setVisible(false);
					panelAdministrataDiploma.setVisible(false);
					panelAdministrataStats.setVisible(false);
					panelAdministrataBtnKontrollo.setVisible(true);	
					panelAdministrataAddDepartament.setVisible(true);
					panelAdministrataAddLenda.setVisible(false);
					panelAdministrataAddFakultet.setVisible(false);
					panelAdministrataAddUniversity.setVisible(false);
			
				
				lblHighlightNotifications.setVisible(false);
				lblHighlightThesis.setVisible(false);
				lblHighlightSettings.setVisible(true);
				lblHighlightStatistics.setVisible(false);	
			}
		});
		
		lblShtoLendaRectangle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//caktoVisible("panelAdministrataStats");
				//labelHighlight.add(lblHighlightStatistics);
				
					panelAdministrataNjoftimet.setVisible(false);
					panelAdministrataSettings.setVisible(false);
					panelAdministrataSettingsShto.setVisible(false);
					panelAdministrataDiploma.setVisible(false);
					panelAdministrataStats.setVisible(false);
					panelAdministrataBtnKontrollo.setVisible(false);	
					panelAdministrataAddDepartament.setVisible(false);
					panelAdministrataAddLenda.setVisible(true);
					panelAdministrataAddFakultet.setVisible(false);
					panelAdministrataAddUniversity.setVisible(false);

				
				lblHighlightNotifications.setVisible(false);
				lblHighlightThesis.setVisible(false);
				lblHighlightSettings.setVisible(true);
				lblHighlightStatistics.setVisible(false);	
			}
		});
		panelMenuStats.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//caktoVisible("panelAdministrataStats");
				//labelHighlight.add(lblHighlightStatistics);
				if(newLogin.getLloji().equals("Student")) {
					panelStudentMyAccount.setVisible(false);
					panelStudentProfile.setVisible(false);
					panelStudentStats.setVisible(true);
					panelStudentDiploma.setVisible(false);
					panelStudentSettings.setVisible(false);
					panelStudentNotifications.setVisible(false);
					panelStudentiChangePassword.setVisible(false);

				}else if(newLogin.getLloji().equals("Profesor")) {
					panelStudentMyAccount.setVisible(false);
					panelStudentProfile.setVisible(false);
					panelStudentStats.setVisible(true);
					panelProfesorDiploma.setVisible(false);
					panelStudentSettings.setVisible(false);			
					panelStudentNotifications.setVisible(false);
					panelStudentiChangePassword.setVisible(false);

				}else {
					
					panelStudentMyAccount.setVisible(false);
					panelAdministrataNjoftimet.setVisible(false);
					panelAdministrataSettings.setVisible(false);
					panelAdministrataSettingsShto.setVisible(false);
					panelAdministrataDiploma.setVisible(false);
					panelAdministrataStats.setVisible(true);
					panelAdministrataBtnKontrollo.setVisible(true);	
					panelAdministrataAddDepartament.setVisible(false);
					panelAdministrataAddLenda.setVisible(false);
					panelAdministrataAddFakultet.setVisible(false);
					panelAdministrataAddUniversity.setVisible(false);
				}
				
				lblHighlightNotifications.setVisible(false);
				lblHighlightThesis.setVisible(false);
				lblHighlightSettings.setVisible(false);
				lblHighlightStatistics.setVisible(true);	
			}
		});
		
		// Te implementohet eventi per butonin MyAccount
		btnMyAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelStudentMyAccount.setVisible(true);
				panelStudentProfile.setVisible(false);
				panelStudentStats.setVisible(false);
				panelStudentDiploma.setVisible(false);
				panelStudentSettings.setVisible(false);
				panelStudentNotifications.setVisible(false);
				panelAdministrataNjoftimet.setVisible(false);
				panelAdministrataSettings.setVisible(false);
				panelAdministrataSettingsShto.setVisible(false);
				panelAdministrataDiploma.setVisible(false);
				panelAdministrataStats.setVisible(false);
				panelAdministrataBtnKontrollo.setVisible(false);	
				panelAdministrataAddDepartament.setVisible(false);
				panelAdministrataAddLenda.setVisible(false);
				panelAdministrataAddFakultet.setVisible(false);
				panelAdministrataAddUniversity.setVisible(false);
				panelStudentiChangePassword.setVisible(false);
				//Mbushja me vlera
				if(newLogin.getLloji().equals("Student")) {
					txtEmri.setText(newLogin.student.getEmri());
					txtMbiemri.setText(newLogin.student.getMbiemri());
					txtEmail.setText(newLogin.student.getEmail());
					txtTel.setText(newLogin.student.getTel());
					txtUniversiteti.setText(newLogin.student.getUniversiteti().getEmri());
					txtFakulteti.setText(newLogin.student.getFakulteti().getEmri());
					txtDepartamenti.setText(newLogin.student.getDepartamenti().getDeparamenti());
				}else if(newLogin.getLloji().equals("Profesor")) {
					txtEmri.setText(newLogin.profesor.getEmri());
					txtMbiemri.setText(newLogin.profesor.getMbiemri());
					txtEmail.setText(newLogin.profesor.getEmail());
					txtTel.setText(newLogin.profesor.getTel());
					txtUniversiteti.setText("-NOT DEFINED-");
					txtFakulteti.setText("-NOT DEFINED-");
					txtDepartamenti.setText("-NOT DEFINED-");
				}else {
					txtEmri.setText(newLogin.administrat.getEmri());
					txtMbiemri.setText(newLogin.administrat.getMbiemri());
					txtEmail.setText(newLogin.administrat.getEmail());
					txtTel.setText(newLogin.administrat.getTel());
					txtUniversiteti.setText(newLogin.administrat.getFakulteti().getUniversiteti().getEmri());
					txtFakulteti.setText(newLogin.administrat.getFakulteti().getEmri());
					txtDepartamenti.setText("-NOT DEFINED-");
				}
			
			}
		});
	}
	public static void caktoVisible(String e){
		for(int i = 0;i<panels.size();i++) {
			if(panels.get(i).getName().equals(e)) {
				panels.get(i).setVisible(true);
				System.out.println("A");
			}else {
				panels.get(i).setVisible(false);
			}	
		}
	}
	
	public static void caktoVisibleHighlights(JLabel e){
		for(int i = 0;i<labelHighlight.size();i++) {
			if(labelHighlight.get(i).getName().equals(e.getName())) {
				labelHighlight.get(i).setVisible(true);
			}else {
				labelHighlight.get(i).setVisible(false);
			}	
		}
	}
	
	public static void userMember(Login user) {
		
		lblMemberIcon = new JLabel("");
		lblNotificationIcon = new JLabel("");
		lblMember = new JLabel(user.getLloji());
		
		if (user.getLloji().equals("Student")) 
		{
			// Ikona e anetarit
			lblMemberIcon.setIcon(new ImageIcon(frmMain.class.getResource("/Images/dashboard_student_icon.png")));
			lblMemberIcon.setBounds(1271, 4, 128, 128);
			panelPerson.add(lblMemberIcon);
			
			// Teksti(label) anetarit
			lblMember.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
			lblMember.setBounds(1250, 127, 163, 38);
			panelPerson.add(lblMember);
			
			// Ikona e notifications
			lblNotificationIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			lblNotificationIcon.setIcon(new ImageIcon(frmMain.class.getResource("/Images/notification_zero.png")));
			lblNotificationIcon.setBounds(100, 86, 50, 50);
			panelMenu.add(lblNotificationIcon);
			
			if(user.student.isNewNjoftim()) {
				lblNotificationIcon.setIcon(new ImageIcon(frmMain.class.getResource("/Images/notification.png")));
			}
			
		}
		else if (user.getLloji().equals("Profesor")) 
		{
			// Ikona e anetarit
			lblMemberIcon.setIcon(new ImageIcon(frmMain.class.getResource("/Images/professor.png")));
			lblMemberIcon.setBounds(1271, 4, 128, 128);
			panelPerson.add(lblMemberIcon);
			
			// Teksti(label) anetarit
			lblMember.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
			lblMember.setBounds(1250, 127, 163, 38);
			panelPerson.add(lblMember);
			
			// Ikona e notifications
			lblNotificationIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			lblNotificationIcon.setIcon(new ImageIcon(frmMain.class.getResource("/Images/notification_zero.png")));
			lblNotificationIcon.setBounds(100, 86, 50, 50);
			panelMenu.add(lblNotificationIcon);
			
			if(user.profesor.isNewNjoftim()) {
				lblNotificationIcon.setIcon(new ImageIcon(frmMain.class.getResource("/Images/notification.png")));
			}
		}
		else if (user.getLloji().equals("Administrata")) 
		{
			// Ikona e anetarit
			lblMemberIcon.setIcon(new ImageIcon(frmMain.class.getResource("/Images/user.png")));
			lblMemberIcon.setBounds(1271, 4, 128, 128);
			panelPerson.add(lblMemberIcon);
			
			// Teksti(label) anetarit
			lblMember.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
			lblMember.setBounds(1250, 127, 163, 38);
			panelPerson.add(lblMember);
			
			// Ikona e notifications
			lblNotificationIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			lblNotificationIcon.setIcon(new ImageIcon(frmMain.class.getResource("/Images/notification_zero.png")));
			lblNotificationIcon.setBounds(100, 86, 50, 50);
			panelMenu.add(lblNotificationIcon);
						
			if(user.administrat.isNewNjoftim()) {
				lblNotificationIcon.setIcon(new ImageIcon(frmMain.class.getResource("/Images/notification.png")));
			}
			
		}
		
}
}
