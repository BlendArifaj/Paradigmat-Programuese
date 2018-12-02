package UILayer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import com.sun.prism.Image;

import Business.Login;
import DataLogic.Administrata;
import DataLogic.Profesori;
import DataLogic.Studenti;

import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Frame;

public class Dashboard {

	public JFrame frame;
	private JTextField txtMbiemri;
	private JTextField txtEmail;
	private JTextField txtEmri;
	private JTextField txtTel;
	private JTextField txtQyteti;
	private JTable table;
	private Login objLogin;
	private Object user;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Dashboard() {
		initialize();
	}
	public Dashboard(Login loginObj) {
		initialize();
		this.objLogin = loginObj;
		mbushTeDhenat();
	}

	private void mbushTeDhenat() {
		if(this.objLogin.getLloji().equals("Student")) {
			Studenti user = new Studenti();
			user.getStudenti(this.objLogin.getUsername());
			mbushTeDhenatStudent(user);
		}else if(this.objLogin.getLloji().equals("Profesor")) {
			Profesori user = new Profesori();
			user.getProfesori(this.objLogin.getUsername());
			mbushTeDhenatProfesor(user);
		}else {
			Administrata user = new Administrata();
			user.getAdministrata(this.objLogin.getUsername());
			mbushTeDhenatAdministrata(user);
		}
	}
	private void mbushTeDhenatStudent(Studenti studenti) {
		txtEmri.setText(studenti.getEmri());
		txtMbiemri.setText(studenti.getMbiemri());
		txtEmail.setText(studenti.getEmail());
		txtQyteti.setText(studenti.getQyteti());
		txtTel.setText(studenti.getTel());
	}
	private void mbushTeDhenatProfesor(Profesori profesori) {
		
	}
	private void mbushTeDhenatAdministrata(Administrata administrata) {
		
	}
	@SuppressWarnings({ "restriction", "serial" })
	private void initialize() {
		frame = new JFrame();
		frame.setExtendedState(Frame.MAXIMIZED_HORIZ);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//frame.setUndecorated(true);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(633, 243, 608, 547);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panelProfile = new JPanel();
		panelProfile.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		layeredPane.add(panelProfile, "name_1165539454758");
		panelProfile.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Emri");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(121, 62, 118, 41);
		panelProfile.add(lblNewLabel);
		
		JLabel lblMbiemri = new JLabel("Mbiemri");
		lblMbiemri.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMbiemri.setBounds(121, 133, 118, 41);
		panelProfile.add(lblMbiemri);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setBounds(121, 202, 118, 41);
		panelProfile.add(lblEmail);
		
		txtMbiemri = new JTextField();
		txtMbiemri.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtMbiemri.setColumns(10);
		txtMbiemri.setBounds(249, 141, 252, 33);
		panelProfile.add(txtMbiemri);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEmail.setColumns(10);
		txtEmail.setBounds(249, 206, 252, 33);
		panelProfile.add(txtEmail);
		
		txtEmri = new JTextField();
		txtEmri.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEmri.setColumns(10);
		txtEmri.setBounds(249, 66, 252, 33);
		panelProfile.add(txtEmri);
		
		JLabel lblTelephone = new JLabel("Telephone");
		lblTelephone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTelephone.setBounds(121, 265, 118, 41);
		panelProfile.add(lblTelephone);
		
		txtTel = new JTextField();
		txtTel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTel.setColumns(10);
		txtTel.setBounds(249, 269, 252, 33);
		panelProfile.add(txtTel);
		
		JLabel lblQyteti = new JLabel("Qyteti");
		lblQyteti.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQyteti.setBounds(121, 331, 118, 41);
		panelProfile.add(lblQyteti);
		
		txtQyteti = new JTextField();
		txtQyteti.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtQyteti.setColumns(10);
		txtQyteti.setBounds(249, 335, 252, 33);
		panelProfile.add(txtQyteti);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCancel.setBounds(176, 442, 136, 50);
		panelProfile.add(btnCancel);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSave.setBounds(322, 442, 136, 50);
		panelProfile.add(btnSave);
		
		JPanel panelTemat = new JPanel();
		panelTemat.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		layeredPane.add(panelTemat, "name_1165555233826");
		panelTemat.setLayout(null);
		
		JList<Object> list = new JList<Object>();
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setFont(new Font("Tahoma", Font.PLAIN, 18));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Tema Diplomes 2018 , Blend Arifaj", "Data Mining 2017 , Blend Arifaj", "Punim Shkencor 2018 , Blend Arifaj"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(76, 50, 452, 183);
		panelTemat.add(list);
		
		JComboBox comboBoxFakulteti = new JComboBox();
		comboBoxFakulteti.setFont(new Font("Tahoma", Font.PLAIN, 14));
		((JLabel) comboBoxFakulteti.getRenderer()).setHorizontalAlignment(JLabel.CENTER);		
		comboBoxFakulteti.setModel(new DefaultComboBoxModel(new String[] {"FIEK", "FIM", "Fakulteti Ekonomik"}));
		comboBoxFakulteti.setBounds(76, 244, 150, 35);
		panelTemat.add(comboBoxFakulteti);
		
		JComboBox comboBoxProfesori = new JComboBox();
		comboBoxProfesori.setModel(new DefaultComboBoxModel(new String[] {"Blerim Rexha", "Besmir Sejdiu", "Adnan Maxhuni", "Kadri Sylejmani"}));
		comboBoxProfesori.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBoxProfesori.setBounds(265, 244, 150, 35);
		panelTemat.add(comboBoxProfesori);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnUpload.setBounds(76, 323, 150, 35);
		panelTemat.add(btnUpload);
		
		JTextPane txtpnKoment = new JTextPane();
		txtpnKoment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnKoment.setText("Koment");
		txtpnKoment.setBounds(265, 324, 233, 108);
		panelTemat.add(txtpnKoment);
		
		JButton btnDergo = new JButton("Dergo");
		btnDergo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDergo.setBounds(433, 490, 150, 35);
		panelTemat.add(btnDergo);
		
		JLabel lblListaEPunimeve = new JLabel("Lista e punimeve");
		lblListaEPunimeve.setBackground(UIManager.getColor("FormattedTextField.selectionBackground"));
		lblListaEPunimeve.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblListaEPunimeve.setBounds(75, 22, 120, 28);
		panelTemat.add(lblListaEPunimeve);
		
		JPanel panelStatistika = new JPanel();
		layeredPane.add(panelStatistika, "name_1165603519412");
		panelStatistika.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 35, 588, 251);
		panelStatistika.add(panel);
		table = new JTable();
		table.setBounds(0, 0, 588, 251);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBackground(SystemColor.control);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Tema Diplomes ", "Kompjuterike", "Blerim Rexha", "2017", "PO"},
				{"Data Mining", "Kompjuterike", "Lule Ahmedi", "2018", "JO"},
				{"Punim Shkencor", "Kompjuterike", "Agni Dika", "2018", "JO"},
			},
			new String[] {
				"Tema", "Departamenti", "Profesori", "Viti", "Statusi"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(199);
		table.getColumnModel().getColumn(1).setPreferredWidth(103);
		table.getColumnModel().getColumn(2).setPreferredWidth(121);
		panel.setLayout(null);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 0, 588, 251);
		panel.add(scrollPane);
		panel.add(table.getTableHeader(), BorderLayout.PAGE_START);
		
		JTextPane txtStatusi = new JTextPane();
		txtStatusi.setBackground(SystemColor.control);
		txtStatusi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtStatusi.setText("Te dhenat shtese lidhje me temen , statusin si dhe nese eshte plagjiature , tregohet perqindja sa eshte edhe pse eshte e refuzuar");
		txtStatusi.setBounds(10, 297, 311, 151);
		panelStatistika.add(txtStatusi);
		
		JLabel lblTemat = new JLabel("Lista e temave");
		lblTemat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTemat.setBounds(10, 11, 99, 14);
		panelStatistika.add(lblTemat);
		
		JPanel panelSettings = new JPanel();
		layeredPane.add(panelSettings, "name_466441317131");
		panelSettings.setLayout(null);
		
		JButton btnNdryshoFjalekalimin = new JButton("Fjalekalimi");
		btnNdryshoFjalekalimin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNdryshoFjalekalimin.setBounds(41, 48, 183, 101);
		panelSettings.add(btnNdryshoFjalekalimin);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.setBounds(408, 427, 106, 37);
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
				layeredPane.add(panelProfile);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnProfile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(btnProfile);
		
		JButton btnTemat = new JButton("Tema");
		btnTemat.setBounds(408, 462, 106, 37);
		btnTemat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
				layeredPane.add(panelTemat);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnTemat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(btnTemat);
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.setBounds(408, 529, 106, 37);
		btnSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
				layeredPane.add(panelSettings);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnSettings.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(btnSettings);
		
		JLabel lblStudent = new JLabel("Blend Arifaj");
		lblStudent.setBounds(634, 33, 118, 30);
		lblStudent.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 22));
		frame.getContentPane().add(lblStudent);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.setBounds(408, 564, 106, 37);
		btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(btnLogOut);
		
		ImageIcon imageIcon = new ImageIcon("C:\\Users\\Arianit\\Downloads\\student.png");
		java.awt.Image image = imageIcon.getImage();
	    java.awt.Image newimg = image.getScaledInstance(60, 60,  java.awt.Image.SCALE_SMOOTH);  
	    imageIcon = new ImageIcon(newimg);
		
		JLabel imgStudent = new JLabel(imageIcon);
		imgStudent.setBounds(28, 11, 106, 66);
		frame.getContentPane().add(imgStudent);
		
		JButton btnStatistikat = new JButton("Statistikat");
		btnStatistikat.setBounds(408, 495, 106, 37);
		btnStatistikat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
				layeredPane.add(panelStatistika);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnStatistikat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(btnStatistikat);
	}
}
