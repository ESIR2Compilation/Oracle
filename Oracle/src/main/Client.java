package main;

import tests.AbstractTest;
import tests.BadFormatTest;

public class Client {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractTest test;
		String file1="badFile.txt";
		test= new BadFormatTest("wh");
		test.estValide("MonFichier.wh");
		System.out.println(test.genererRapport() );
		test.estValide(file1);
		System.out.println(test.genererRapport() );
	}

}
