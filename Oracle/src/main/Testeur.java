package main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import tests.AbstractTest;

public class Testeur {

	public static final int HELP = 0;
	public static final int COUNT = 1;
	public static final int DETAILED = 2;
	
	private int option;
	private List<AbstractTest> tests;
	private List<String> files;
	
	/**
	 * Testeur, sans option.
	 */
	public Testeur(){
		this(-1);
	}
	
	/**
	 * Testeur avec options;
	 * Testeur.COUNT : Compte le nombre de tests échoués
	 * Testeur.DETAILED : Détaille tous les tests, réussis ou échoués
	 * Testeur.HELP  : MAN du Testeur
	 * @param option Testeur. [COUNT, DETAILED, HELP]
	 */
	public Testeur(int option){
		this.option = option;
		tests = new ArrayList<AbstractTest>();
		files = Arrays.asList(new java.io.File("./src/entries").list());
		System.out.println(files);
	}

	// Application des tests
	public void testerPrettyPrinter(){
		tests.clear();
		//TODO
	}

	
	public static void main(String[] args) {
		Testeur testeur = new Testeur(Testeur.COUNT);
		testeur.testerPrettyPrinter();
	}
}