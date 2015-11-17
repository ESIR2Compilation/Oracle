package tests;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public abstract class AbstractTest {

	protected static final String OK = "[OK]";
	protected static final String FAIL = "[FAILED]";
	protected String rapport;
	protected String entry;
	
	public AbstractTest(String entry){
		this.entry = entry;
	}
	
	public String prety(String f){
		return null;
	}
	
	public abstract boolean estValide();
	
	/** Génère un fichier du même nom de classe, pour une entrée donnée. **/
	public String genererRapport(){
		
		FileWriter fw;
		try {
			fw = new FileWriter("src/results/" + entry + "_" + getClass().getName() + ".result");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(rapport);
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return rapport;
	}
	
	public void setEntry(String entry){
		this.entry = entry;
	}
}
