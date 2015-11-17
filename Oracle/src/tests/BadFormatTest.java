package tests;

public class BadFormatTest extends AbstractTest{

	private static final String EXTENSION = ".while";
	
	public BadFormatTest(String entry) {
		super(entry);
	}


	public boolean estValide() {
		int pos = entry.lastIndexOf(".");
		if (pos > -1) {
			String ext = entry.substring(pos+1);
			if(ext.equals(EXTENSION)){
				if(prety(entry)!=null){
					this.rapport=OK + " " + getClass().getName() + " : le fichier est de bonne extension et a été prety_printé(extension = ."+EXTENSION+")";
					return true;
				}
				else{
					this.rapport=FAIL + " " + getClass().getName() + " : le fichier est de bonne extension et n'a pas  été prety_printé(extension = ."+EXTENSION+")";
					return true;
				}

			}
			else{
				if( prety(entry) != null){
					this.rapport=OK + " " + getClass().getName() + " : le fichier ne correspond pas au format de fichier attendu, extension attendu = ."+EXTENSION+" et extension réussi = ."+ext;
					return false;
				}
				else{
					this.rapport=OK + " " + getClass().getName() + " : le fichier n'est pas de bonne extension et a été rejeté par le prety_printer(extension = ."+ext+")";
					return true;
				}
			}

		} 
		else{
			if( prety(entry) != null){
				this.rapport=FAIL + " " + getClass().getName() + " : un fichier sans extension a été prety_printé";
				return false;
			}
			else{
				this.rapport=OK + " " + getClass().getName() + " : un fichier sans extension a été rejeté ";
				return true;
				
			}

		}
	}
}


