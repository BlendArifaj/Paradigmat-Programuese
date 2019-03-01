package UILayer;

import DataLogic.Departamenti;
import DataLogic.Fakulteti;

public class Test {

	public static void main(String[] args) {
		
			Fakulteti fk = new Fakulteti();
			fk.inicializoFakultetin("Fakulteti i Inxhinieris Elektrike dhe Kompjuterike");
			for (Departamenti dept : fk.getDepartamentet()) {
				System.out.println(dept.getDeparamenti());
			}
		
	}

}
