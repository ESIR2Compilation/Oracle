package main;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import tests.AbstractTest;
import tests.BadFormatTest;
import tests.BeautifulPrintTest;
import tests.DoublePrintTest;
import tests.SameCodeTest;

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
		files = Arrays.asList(new java.io.File("Oracle/src/entries").list());
	}

	// Application des tests
	public void testerPrettyPrinter(){
		tests.clear();
		tests.add(new BadFormatTest());
		tests.add(new SameCodeTest());
		tests.add(new BeautifulPrintTest());
		tests.add(new DoublePrintTest());

		for(String file : files){
			int count = 0;
			//On réinitialise le rapport généré auparavant
			reinitialiserRapport(file, "Pretty Printing");

			System.out.println("========== " + file + " ==========");
			for(AbstractTest test : tests){
				test.setEntry(file);
				//Appliquer les tests concernés
				test.tester();
				String rapport = test.genererRapport();

				if (option == DETAILED)
					System.out.println(rapport);
				else if (! test.estValide()){
					System.out.println(rapport);

					if (option == COUNT)
						count++;
				}
			}

			if (option == COUNT)
				System.out.println(count + "/" + tests.size() + " des tests ont échoués sur " + file + "\n");
			else
				System.out.println();
		}
	}

	public void reinitialiserRapport(String entry, String label){
		FileWriter fw;
		try {
			fw = new FileWriter("Oracle/src/results/" + entry + ".result");
			BufferedWriter bw = new BufferedWriter(fw);
			SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
			Date today = new Date(System.currentTimeMillis());
			bw.write(formatter.format(today) + " - " + label);
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Testeur testeur = new Testeur(Testeur.DETAILED);
		testeur.testerPrettyPrinter();
	}
}