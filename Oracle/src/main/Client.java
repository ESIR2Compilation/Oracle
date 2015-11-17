package main;

import tests.*;

public class Client {
	
	public static void main(String[] args) {
		String file1="badFile.txt";
		String file2="badFile.while";
		
		AbstractTest test = new BadFormatTest(file1);
		test.estValide();
		System.out.println(test.genererRapport());
		
		test.setEntry(file2);
		test.estValide();
		System.out.println(test.genererRapport());
	}

}
