package UILayer;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Business.UserRegister;
import DataLogic.Departamenti;
import DataLogic.Fakulteti;
import DataLogic.Hash;
import DataLogic.Profesori;
import DataLogic.Studenti;
import DataLogic.Universiteti;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Enumeration;

public class RegisterUser {

	JFrame frame;
	private JTextField txtPID;
	private JTextField txtPEmri;
	private JTextField txtPMbiemri;
	private JTextField txtPTel;
	private JPasswordField pwdP;
	private JTextField txtPEmail;
	private static RegisterUser window;
	static int HEIGHT = 665;
	static int WIDTH = 964;
	private JPanel panel;
	private JPanel profesorPanel;
	private JPanel studentPanel;
	public static JTextField txtStdID;
	public static JTextField txtStdEmri;
	public static JTextField txtStdMbiemri;
	public static JTextField txtStdTel;
	public static JPasswordField pwdStd;
	public static JTextField txtStdEmail;
	public static JButton button;
	public static JComboBox cmbDepartamentet;
	public static JComboBox cmbNiveli;
	public static JComboBox cmbQytetet;
	public static JComboBox cmbFakulteti;
	public static JComboBox cmbUniversiteti;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new RegisterUser();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
                               
	public RegisterUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.POPUP);
		frame.setBounds(100, 100, 1015, 797);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		studentPanel = new JPanel();
		studentPanel.setLayout(null);
		studentPanel.setBounds(12, 13, 973, 724);
		frame.getContentPane().add(studentPanel);
		
		JLabel label_1 = new JLabel("Mbush te dhenat e meposhtme");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_1.setBounds(12, 24, 331, 26);
		studentPanel.add(label_1);
		
		JLabel label_2 = new JLabel("ID :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_2.setBounds(44, 81, 261, 26);
		studentPanel.add(label_2);
		
		JLabel label_3 = new JLabel("EMRI :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_3.setBounds(44, 131, 261, 26);
		studentPanel.add(label_3);
		
		JLabel label_4 = new JLabel("MBIEMRI :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_4.setBounds(44, 181, 261, 26);
		studentPanel.add(label_4);
		
		JLabel label_5 = new JLabel("PASSWORD :");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_5.setBounds(44, 231, 261, 26);
		studentPanel.add(label_5);
		
		JLabel label_6 = new JLabel("EMAIL :");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_6.setBounds(44, 281, 261, 26);
		studentPanel.add(label_6);
		
		txtStdID = new JTextField();
		txtStdID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtStdID.setColumns(10);
		txtStdID.setBounds(260, 76, 299, 37);
		studentPanel.add(txtStdID);
		
		txtStdEmri = new JTextField();
		txtStdEmri.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtStdEmri.setColumns(10);
		txtStdEmri.setBounds(260, 126, 299, 37);
		studentPanel.add(txtStdEmri);
		
		txtStdMbiemri = new JTextField();
		txtStdMbiemri.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtStdMbiemri.setColumns(10);
		txtStdMbiemri.setBounds(260, 176, 299, 37);
		studentPanel.add(txtStdMbiemri);
		
		txtStdTel = new JTextField();
		txtStdTel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtStdTel.setColumns(10);
		txtStdTel.setBounds(260, 326, 299, 37);
		studentPanel.add(txtStdTel);
		
		pwdStd = new JPasswordField();
		pwdStd.setFont(new Font("Tahoma", Font.PLAIN, 19));
		pwdStd.setBounds(260, 226, 299, 37);
		studentPanel.add(pwdStd);
		
	
		
		JButton button_1 = new JButton("Cancel");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				profesorPanel.setSize(new Dimension(0, 0));
				studentPanel.setSize(new Dimension(0, 0));
				panel.setSize(new Dimension(WIDTH, HEIGHT));
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		button_1.setBounds(846, 606, 115, 57);
		studentPanel.add(button_1);
		
		JLabel label_7 = new JLabel("TEL :");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_7.setBounds(44, 331, 261, 26);
		studentPanel.add(label_7);
		
		txtStdEmail = new JTextField();
		txtStdEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtStdEmail.setColumns(10);
		txtStdEmail.setBounds(260, 276, 299, 37);
		studentPanel.add(txtStdEmail);
		
		JLabel lblDepartamenti = new JLabel("DEPARTAMENTI :");
		lblDepartamenti.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblDepartamenti.setBounds(44, 501, 261, 26);
		studentPanel.add(lblDepartamenti);
		
		cmbDepartamentet = new JComboBox();
//		cmbDepartamentet.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				if(cmbFakulteti.getSelectedIndex() != 0) {
//					Fakulteti fk = new Fakulteti();
//					fk.inicializoFakultetin(cmbFakulteti.getSelectedItem().toString());
//					for (Departamenti dept : fk.getDepartamentet()) {
//						cmbDepartamentet.addItem(dept.getDeparamenti());
//					}
//				}else {
//					JOptionPane.showMessageDialog(null, "Zgjedheni nje fakultet se pari!");
//				}
//				
//			}
//		});
		cmbDepartamentet.setModel(new DefaultComboBoxModel(new String[] {"Zgjedhe departamentin!"}));
		cmbDepartamentet.setFont(new Font("Tahoma", Font.PLAIN, 19));
		cmbDepartamentet.setBounds(260, 496, 299, 37);
		studentPanel.add(cmbDepartamentet);
		//Shtimi i departamenteve
		Departamenti dept = new Departamenti();
		Enumeration<String> departamentet = dept.getDepartamentet();
		while(departamentet.hasMoreElements()) {
			cmbDepartamentet.addItem(departamentet.nextElement());
		}
		///
		
		cmbNiveli = new JComboBox();
		cmbNiveli.setModel(new DefaultComboBoxModel(new String[] {"Zgjedhe nivelin e studimeve!", "Bachelor", "Master"}));
		cmbNiveli.setFont(new Font("Tahoma", Font.PLAIN, 19));
		cmbNiveli.setBounds(260, 556, 299, 37);
		studentPanel.add(cmbNiveli);

		JLabel lblNiveliIStudimeve = new JLabel("NIVELI I STUDIMEVE :");
		lblNiveliIStudimeve.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNiveliIStudimeve.setBounds(44, 561, 261, 26);
		studentPanel.add(lblNiveliIStudimeve);
		
		JLabel lblQyteti = new JLabel("QYTETI :");
		lblQyteti.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblQyteti.setBounds(44, 621, 261, 26);
		studentPanel.add(lblQyteti);
		
		cmbQytetet = new JComboBox();
		cmbQytetet.setFont(new Font("Tahoma", Font.PLAIN, 19));
		cmbQytetet.setBounds(260, 616, 299, 37);
		studentPanel.add(cmbQytetet);
		//Shtimi i qyteteve
		cmbQytetet.addItem("Zgjedhe qytetin!");
		cmbQytetet.addItem("Prishtine");
		cmbQytetet.addItem("Peje");
		cmbQytetet.addItem("Prizren");
		cmbQytetet.addItem("Gjakove");
		cmbQytetet.addItem("Mitrovice");
		
		JLabel lblFakulteti = new JLabel("FAKULTETI :");
		lblFakulteti.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblFakulteti.setBounds(44, 441, 261, 26);
		studentPanel.add(lblFakulteti);
		
		cmbFakulteti = new JComboBox();
//		cmbFakulteti.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent arg0) {
//				if(cmbUniversiteti.getSelectedIndex() != 0) {
//					Universiteti uni = new Universiteti();
//					uni.inicializoUniversitetin(cmbUniversiteti.getSelectedItem().toString());
//					System.out.println(uni.getID());
//					System.out.println(uni.getFakultetet());
//				}else {
//					JOptionPane.showMessageDialog(null, "Zgjedheni nje universitet se pari!");
//				}
//				
//			}
//		});
		cmbFakulteti.setModel(new DefaultComboBoxModel(new String[] {"Zgjedhe fakultetin!"}));
		///
		Fakulteti fakulteti = new Fakulteti();
		Enumeration<String> fakultetet = fakulteti.getFakultetet();
		while(fakultetet.hasMoreElements()) {
			cmbFakulteti.addItem(fakultetet.nextElement());
		}
		///
		cmbFakulteti.setFont(new Font("Tahoma", Font.PLAIN, 19));
		cmbFakulteti.setBounds(260, 436, 299, 37);
		studentPanel.add(cmbFakulteti);
		
		JLabel lblUniversiteti = new JLabel("UNIVERSITETI :");
		lblUniversiteti.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblUniversiteti.setBounds(44, 381, 261, 26);
		studentPanel.add(lblUniversiteti);
		
		cmbUniversiteti = new JComboBox();
		cmbUniversiteti.setModel(new DefaultComboBoxModel(new String[] {"Zgjedhe Universitetin!"}));
		cmbUniversiteti.setFont(new Font("Tahoma", Font.PLAIN, 19));
		cmbUniversiteti.setBounds(260, 376, 299, 37);
		studentPanel.add(cmbUniversiteti);
		Universiteti uni = new Universiteti();
		Enumeration<String> universitetet = uni.getUniversitetet();
		while(universitetet.hasMoreElements()) {
			cmbUniversiteti.addItem(universitetet.nextElement());
		}
		profesorPanel = new JPanel();
		profesorPanel.setBounds(12, 13, 0, 0);
		frame.getContentPane().add(profesorPanel);
		profesorPanel.setLayout(null);
		
		JLabel lblMbushTeDhenat = new JLabel("Mbush te dhenat e meposhtme");
		lblMbushTeDhenat.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblMbushTeDhenat.setBounds(12, 24, 331, 26);
		profesorPanel.add(lblMbushTeDhenat);
		
		JLabel lblID = new JLabel("ID :");
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblID.setBounds(44, 81, 261, 26);
		profesorPanel.add(lblID);
		
		JLabel lblEmri = new JLabel("EMRI :");
		lblEmri.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblEmri.setBounds(44, 141, 261, 26);
		profesorPanel.add(lblEmri);
		
		JLabel lblMbiemri = new JLabel("MBIEMRI :");
		lblMbiemri.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblMbiemri.setBounds(44, 201, 261, 26);
		profesorPanel.add(lblMbiemri);
		
		JLabel lblPassword = new JLabel("PASSWORD :");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblPassword.setBounds(44, 261, 261, 26);
		profesorPanel.add(lblPassword);
		
		JLabel lblEmail = new JLabel("EMAIL :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblEmail.setBounds(44, 321, 261, 26);
		profesorPanel.add(lblEmail);
		
		txtPID = new JTextField();
		txtPID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPID.setBounds(317, 76, 299, 37);
		profesorPanel.add(txtPID);
		txtPID.setColumns(10);
		
		txtPEmri = new JTextField();
		txtPEmri.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPEmri.setColumns(10);
		txtPEmri.setBounds(317, 136, 299, 37);
		profesorPanel.add(txtPEmri);
		
		txtPMbiemri = new JTextField();
		txtPMbiemri.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPMbiemri.setColumns(10);
		txtPMbiemri.setBounds(317, 196, 299, 37);
		profesorPanel.add(txtPMbiemri);
		
		txtPTel = new JTextField();
		txtPTel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPTel.setColumns(10);
		txtPTel.setBounds(317, 376, 299, 37);
		profesorPanel.add(txtPTel);
		
		pwdP = new JPasswordField();
		pwdP.setFont(new Font("Tahoma", Font.PLAIN, 19));
		pwdP.setBounds(317, 256, 299, 37);
		profesorPanel.add(pwdP);
		
		JButton btnPRegister = new JButton("Register");
		btnPRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String password = Hash.saltedHashString(new String(pwdP.getPassword()),txtPID.getText());
				Profesori newProfesori = new Profesori(txtPID.getText(),txtPEmri.getText(),txtPMbiemri.getText(),txtPEmail.getText(),password,txtPTel.getText());
				if(newProfesori.insertNewProfesor()) {
					JOptionPane.showMessageDialog(null, "Jeni regjistruar me sukses! Jeni ne listen e pritjes se Administrates per pranim!");

				}else {
					JOptionPane.showMessageDialog(null, "Gabim gjate regjistrimit! Ju lutem kontrolloni te dhenat!");
				}
			}
		});
		btnPRegister.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnPRegister.setBounds(317, 452, 115, 57);
		profesorPanel.add(btnPRegister);
		
		JButton btnPCancel = new JButton("Cancel");
		btnPCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				profesorPanel.setSize(new Dimension(0, 0));
				studentPanel.setSize(new Dimension(0, 0));
				panel.setSize(new Dimension(WIDTH, HEIGHT));
			}
		});
		btnPCancel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnPCancel.setBounds(501, 452, 115, 57);
		profesorPanel.add(btnPCancel);
		
		JLabel label = new JLabel("TEL :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label.setBounds(44, 381, 261, 26);
		profesorPanel.add(label);
		
		txtPEmail = new JTextField();
		txtPEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPEmail.setColumns(10);
		txtPEmail.setBounds(317, 316, 299, 37);
		profesorPanel.add(txtPEmail);
		
		panel = new JPanel();
		panel.setBounds(12, 13, 0, 0);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnRegisterAsStudent = new JButton("STUDENT");
		btnRegisterAsStudent.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnRegisterAsStudent.setBounds(480, 269, 223, 131);
		
		panel.add(btnRegisterAsStudent);
		btnRegisterAsStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setSize(new Dimension(0, 0));
				profesorPanel.setSize(new Dimension(0, 0));
				studentPanel.setSize(new Dimension(WIDTH, HEIGHT));
			}
		});
		
		JButton btnNewButton = new JButton("PROFESSOR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setSize(new Dimension(0, 0));
				studentPanel.setSize(new Dimension(0, 0));
				profesorPanel.setSize(new Dimension(WIDTH, HEIGHT));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton.setBounds(246, 269, 223, 131);
		panel.add(btnNewButton);
		
		JLabel lblRegisterAs = new JLabel("Register as ");
		lblRegisterAs.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblRegisterAs.setBounds(246, 215, 223, 29);
		panel.add(lblRegisterAs);
		
		button = new JButton("Register");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				Studenti newStudent = new Studenti(txtStdID.getText(),txtStdEmri.getText(),txtStdMbiemri.getText(),
						txtStdEmail.getText(),new String(pwdStd.getPassword()),txtStdTel.getText(),
						cmbDepartamentet.getSelectedItem().toString(), cmbQytetet.getSelectedItem().toString(),cmbNiveli.getSelectedItem().toString());
				if(newStudent.insertNewStudent()) {
					JOptionPane.showMessageDialog(null, "Jeni regjistruar me sukses! Jeni ne listen e pritjes se Administrates per pranim!");
				}else {
					JOptionPane.showMessageDialog(null, "Gabim gjate regjistrimit! Ju lutem kontrolloni te dhenat!");
				}
	
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 21));
		button.setBounds(686, 606, 115, 57);
		studentPanel.add(button);
	}
}
