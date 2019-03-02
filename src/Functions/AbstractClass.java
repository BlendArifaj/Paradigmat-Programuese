package Functions;

import java.util.ArrayList;
import java.util.List;

import DataLogic.Njoftimi;

public abstract class AbstractClass {
	protected String ID = null;
	protected String emri = null;
	protected String mbiemri = null;
	protected String email = null;
	protected String passHash = null;
	protected String tel = null;
	protected List<Njoftimi> njoftimet = new ArrayList<Njoftimi>();
	protected List<Njoftimi> newNjoftimet = new ArrayList<Njoftimi>();
	
	protected void inicializoNjoftimet() {}
	public Boolean updateData() {
		return null;}
}
