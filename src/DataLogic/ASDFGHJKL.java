package DataLogic;

import javax.swing.JOptionPane;

public class ASDFGHJKL {

	public static void main(String[] args) {
		Lenda newLenda = new Lenda();
		newLenda.setLenda("Biologji");
		if(newLenda.insertLenda()) {
			JOptionPane.showMessageDialog(null, "Me sukses keni shtuar nje Lende te re!");
		}else {
			JOptionPane.showMessageDialog(null, "Ju lutem, kontrolloni te dhenat!");

		}
	}

}
