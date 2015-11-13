package main;
import java.util.ArrayList;
import java.util.List;

import tests.AbstractTest;

public class Testeur {

	public static final int HELP = 0;
	public static final int COUNT = 1;
	public static final int DETAILED = 2;
	
	private int option;
	private List<AbstractTest> tests;
	
	/**
	 * Testeur, sans option. Dispose de plusieurs fonctions de tests pour 
	 */
	public Testeur(){
		option = -1;
		tests = new ArrayList<AbstractTest>();
	}
	
	/**
	 * 
	 * @param option
	 */
	public Testeur(int option){
		this.option = option;
		tests = new ArrayList<AbstractTest>();
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