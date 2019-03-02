package DataLogic;

import javax.swing.JOptionPane;

public class ASDFGHJKL {

	public static void main(String[] args) {
		Punimi newPunim = new Punimi("ABSaDA","1244546", "Paradigmat Programuese","");
		Studenti std = new Studenti();
		std.getStudenti("150714110030");
		Lenda l = new Lenda();
		l.getLenden("Paradigmat Programuese");
		Departamenti d = new Departamenti();
		d.inicializoDepartamentin("Inxhinieri Kompjuterike");
		newPunim.setStudenti(std);
		newPunim.setDepartamenti(d);
		newPunim.setLenda(l);
		if(newPunim.insertNewPunim()) {
			JOptionPane.showMessageDialog(null, "Keni shtuar me sukses punimin!");
		}else {
			JOptionPane.showMessageDialog(null, "Gabim gjate shtimit te punimit - Ne server");
		}
		
	
	}

}
