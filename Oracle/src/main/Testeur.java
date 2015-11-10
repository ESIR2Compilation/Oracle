package main;
import java.util.ArrayList;
import java.util.List;

import tests.AbstractTest;



public class Testeur {

	/**
	 * @param args
	 */

	public static final int HELP = 0;
	public static final int COUNT = 1;
	public static final int DETAILED = 2;
	
	private int option;
	private List<AbstractTest> tests;
	
	// No option
	public Testeur(){
		option = -1;
		tests = new ArrayList<AbstractTest>();
	}
	
	public Testeur(int option){
		this.option = option;
		tests = new ArrayList<AbstractTest>();
	}
	
	// Application des tests
	
	public static void main(String[] args) {
		
	//	Testeur testeur = new Testeur(Testeur.COUNT);
		
	}
}