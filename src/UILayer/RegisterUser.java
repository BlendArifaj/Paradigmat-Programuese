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
	private JTextField txtID;
	private JTextField txtEmri;
	private JTextField txtMbiemri;
	private JTextField txtTel;
	private JPasswordField txtPassword;
	private JTextField txtEmail;
	private static RegisterUser window;
	static int HEIGHT = 665;
	static int WIDTH = 964;
	private JPanel panel;
	private JPanel profesorPanel;
	private JPanel studentPanel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JTextField textField_4;
	private JComboBox cmbDepartamentet;
	private JComboBox cmbNiveli;
	private JComboBox cmbQytetet;
	private JComboBox cmbFakulteti;
	private JComboBox cmbUniversiteti;
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

	/**
	 * Create the application.
	 */
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
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(260, 76, 299, 37);
		studentPanel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(260, 126, 299, 37);
		studentPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(260, 176, 299, 37);
		studentPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(260, 326, 299, 37);
		studentPanel.add(textField_3);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 19));
		passwordField.setBounds(260, 226, 299, 37);
		studentPanel.add(passwordField);
		
		JButton button = new JButton("Register");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String passwordi = Hash.saltedHashString(new String(txtPassword.getPassword()),txtID.getText());
				Studenti newStudent = new Studenti();
				//cmbNiveli.getSelectedItem().toString()
				newStudent.setID(txtID.getText());
				newStudent.setEmri(txtEmri.getText());
				newStudent.setMbiemri(txtMbiemri.getText());
				newStudent.setEmail(txtEmail.getText());
				newStudent.setPass(passwordi);
				newStudent.setTel(txtTel.getText());
				
				Departamenti stdDpt = new Departamenti();
				stdDpt.inicializoDepartamentin(cmbDepartamentet.getSelectedItem().toString());
				newStudent.setDepartamenti(stdDpt);
				
				newStudent.setQyteti(cmbQytetet.getSelectedItem().toString());
				newStudent.setNiveliStudimeve(cmbNiveli.getSelectedItem().toString());
				Fakulteti stdFk = new Fakulteti();
				stdFk.inicializoFakultetin(cmbFakulteti.getSelectedItem().toString());
				newStudent.setFakulteti(stdFk);
				Universiteti stdUni = new Universiteti();
				stdUni.inicializoUniversitetin(cmbUniversiteti.getSelectedItem().toString());
				newStudent.setUniversiteti(stdUni);
				if(newStudent.insertNewStudent()) {
					JOptionPane.showMessageDialog(null, "Jeni regjistruar me sukses! Jeni ne listen e pritjes se Administrates per pranim!");

				}else {
					JOptionPane.showMessageDialog(null, "Gabim gjate regjistrimit! Ju lutem kontrolloni te dhenat!");
				}
				//UserRegister newUser = new UserRegister(1);
				//newUser.setRegisterStudent(newStudent);
				//if(newUser.registerStudent()) {
				//}else {
				//}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 21));
		button.setBounds(686, 654, 115, 57);
		studentPanel.add(button);
		
		JButton button_1 = new JButton("Cancel");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				profesorPanel.setSize(new Dimension(0, 0));
				studentPanel.setSize(new Dimension(0, 0));
				panel.setSize(new Dimension(WIDTH, HEIGHT));
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		button_1.setBounds(846, 654, 115, 57);
		studentPanel.add(button_1);
		
		JLabel label_7 = new JLabel("TEL :");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_7.setBounds(44, 331, 261, 26);
		studentPanel.add(label_7);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(260, 276, 299, 37);
		studentPanel.add(textField_4);
		
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
		
		txtID = new JTextField();
		txtID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtID.setBounds(317, 76, 299, 37);
		profesorPanel.add(txtID);
		txtID.setColumns(10);
		
		txtEmri = new JTextField();
		txtEmri.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtEmri.setColumns(10);
		txtEmri.setBounds(317, 136, 299, 37);
		profesorPanel.add(txtEmri);
		
		txtMbiemri = new JTextField();
		txtMbiemri.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMbiemri.setColumns(10);
		txtMbiemri.setBounds(317, 196, 299, 37);
		profesorPanel.add(txtMbiemri);
		
		txtTel = new JTextField();
		txtTel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTel.setColumns(10);
		txtTel.setBounds(317, 376, 299, 37);
		profesorPanel.add(txtTel);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtPassword.setBounds(317, 256, 299, 37);
		profesorPanel.add(txtPassword);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String password = Hash.saltedHashString(new String(txtPassword.getPassword()),txtID.getText());
				Profesori newProfesori = new Profesori(txtID.getText(),txtEmri.getText(),txtMbiemri.getText(),txtEmail.getText(),password,txtTel.getText());
				UserRegister newUser = new UserRegister(0);
				newUser.setRegisterProfesor(newProfesori);
				if(newUser.registerProfesor()) {
					JOptionPane.showMessageDialog(null, "Jeni regjistruar me sukses! Jeni ne listen e pritjes se Administrates per pranim!");
				}else {
					JOptionPane.showMessageDialog(null, "Gabim gjate regjistrimit! Ju lutem kontrolloni te dhenat!");
				}
				
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnRegister.setBounds(317, 452, 115, 57);
		profesorPanel.add(btnRegister);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				profesorPanel.setSize(new Dimension(0, 0));
				studentPanel.setSize(new Dimension(0, 0));
				panel.setSize(new Dimension(WIDTH, HEIGHT));
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnCancel.setBounds(501, 452, 115, 57);
		profesorPanel.add(btnCancel);
		
		JLabel label = new JLabel("TEL :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label.setBounds(44, 381, 261, 26);
		profesorPanel.add(label);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtEmail.setColumns(10);
		txtEmail.setBounds(317, 316, 299, 37);
		profesorPanel.add(txtEmail);
		
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
	}
}
