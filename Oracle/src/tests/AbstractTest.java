package tests;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public abstract class AbstractTest {

	protected static final String OK   = "[OK]    " + " ";
	protected static final String FAIL = "[FAILED]" + " ";
	protected String rapport;
	protected String entry;
	protected boolean estValide;

	/**
	 * @return Le r�sultat du test
	 */
	public boolean estValide(){
		return estValide;
	}
	/**
	 * Ex�cute le test et met � true ou false le r�sultat qui en d�coule.
	 */
	public abstract void tester();

	/**
	 *  G�n�re un fichier du m�me nom de classe, pour une entr�e donn�e.
	 */
	public String genererRapport(){
		FileWriter fw;
		try {
			fw = new FileWriter("src/results/" + entry + ".result", true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("\n" + rapport);
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return rapport;
	}

	public void setEntry(String entry){
		this.entry = entry;
		rapport = "";
		estValide = false;
	}
}
