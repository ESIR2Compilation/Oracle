package tests;

public class BadFormatTest extends AbstractTest{

	private static final String EXTENSION = "while";

	@Override
	public void tester() {
		int pos = entry.lastIndexOf(".");
		if (pos > -1) {
			String ext = entry.substring(pos+1);
			if(ext.equals(EXTENSION)) {
				if (Math.random() > 0.5) { // TODO utiliser la bonne fonction
					this.rapport=OK + " " + getClass().getSimpleName() + " : le fichier est de bonne extension et a été prety_printé(extension = ."+EXTENSION+")";
					estValide = true;
				}
				else {
					this.rapport=FAIL + " " + getClass().getSimpleName() + " : le fichier est de bonne extension et n'a pas  été pretty printé(extension = ."+EXTENSION+")";
					estValide = true;
				}

			}
			else {
				if (Math.random() > 0.5) { // TODO utiliser la bonne fonction
					this.rapport=FAIL + " " + getClass().getSimpleName() + " : le fichier ne correspond pas au format de fichier attendu, extension attendu = ."+EXTENSION+" et extension réussi = ."+ext;
					estValide = false;
				}
				else {
					this.rapport=OK + " " + getClass().getSimpleName() + " : le fichier n'est pas de bonne extension et a été rejeté par le pretty printer (extension = ."+ext+")";
					estValide = true;
				}
			}

		} 
		else {
			if (Math.random() > 0.5) { // TODO utiliser la bonne fonction
				this.rapport=FAIL + " " + getClass().getSimpleName() + " : un fichier sans extension a été pretty printé";
				estValide = false;
			}
			else {
				this.rapport=OK + " " + getClass().getSimpleName() + " : un fichier sans extension a été rejeté ";
				estValide = true;
			}
		}
	}
}


