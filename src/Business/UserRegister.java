package Business;
import DataLogic.Profesori;
import DataLogic.Studenti;
public class UserRegister {
	private Studenti registerStudent = new Studenti();
	private Profesori registerProfesor = new Profesori();
	private int register = -1; // 0 for profesor, 1 for student
	public UserRegister(int _register) {
		this.register = _register;
	}
	
	public boolean registerProfesor() {
		if(this.register==0 && this.registerProfesor.insertNewProfesor())
			return true;
		return false;
	}
	
	public boolean registerStudent() {
		if(this.register == 1 && this.registerStudent.insertNewStudent())
			return true;
		return false;
	}
	
}
