package Functions;
import java.util.List;
import DataLogic.Punimi;

public interface StudentiFunctions {
	public List<Punimi> getPunimet();
	public boolean addPunimi(Punimi newPunim);
	public Boolean insertNewStudent();
	public void getStudenti(String stdId);
}
