package DataLogic;

import Functions.DepartamentiFunctions;

public class Departamenti implements DepartamentiFunctions{
	private int deptID;
	private String fakulteti;
	private String fakultetiId;
	private String deparamenti;
	
	public Departamenti() {
		
	}
	
	public Departamenti(int deptID,String fakulteti, String departamenti){
		this.deptID = deptID;
		this.fakulteti = fakulteti;
		this.deparamenti = departamenti;
	}
	
	public void getPunimet() {
		
	}
	public int getDeptID() {
		return this.deptID;
	}
	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}
	public String getFakulteti() {
		return this.fakulteti;
	}
	public void setFakulteti(String fakulteti) {
		this.fakulteti = fakulteti;
	}
	public String getFakultetiId() {
		return this.fakultetiId;
	}
	public void setFakultetiId(String fakultetiId) {
		this.fakultetiId = fakultetiId;
	}
	public String getDeparamenti() {
		return this.deparamenti;
	}
	public void setDeparamenti(String deparamenti) {
		this.deparamenti = deparamenti;
	}
	public Studenti getStudentWithMaxPunimeDepartament() {
		
		Studenti student = new Studenti();
		return student;
	}
	public void getBestDepartament() {
		//Procedura e cila e merr ID e departamentit, i cili ka me se shumti punime
		//Pastaj duke u bazuar ne ID e bene inicializimin e departamentit
	}
	public void setDepartament() {
		//Tu u bazu ne ID me ba inicializimin e variablave tjera
	}
}

