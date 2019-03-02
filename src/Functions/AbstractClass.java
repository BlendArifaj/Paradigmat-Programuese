package Functions;

import java.util.ArrayList;
import java.util.List;

import DataLogic.Departamenti;
import DataLogic.Lenda;
import DataLogic.Njoftimi;
import DataLogic.Profesori;
import DataLogic.Studenti;

public abstract class AbstractClass {
	private int ID = 0;
	private String titulli = null;
	private Profesori profesori = new Profesori();
	private Studenti studenti = new Studenti();
	private Departamenti departamenti = new Departamenti();
	private String dataDorezimit = null;
	private Lenda lenda = new Lenda();
	private boolean profesorPergjigje = false;
	private boolean administratPergjigje = false; 
	private String path = null;
	
	protected void inicializoNjoftimet() {}
	public Boolean updateData() {
		return null;}
	
}
