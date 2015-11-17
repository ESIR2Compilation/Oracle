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
	 * @return Le résultat du test
	 */
	public boolean estValide(){
		return estValide;
	}
	/**
	 * Exécute le test et met à true ou false le résultat qui en découle.
	 */
	public abstract void tester();

	/**
	 *  Génère un fichier du même nom de classe, pour une entrée donnée.
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
