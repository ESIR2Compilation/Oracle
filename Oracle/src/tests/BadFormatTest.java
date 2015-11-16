package tests;

public class BadFormatTest extends AbstractTest{

	private String extension;
	/**
	 * Constructeur 
	 * @param extension : extension du fichier 
	 */
	public BadFormatTest(String extension) {
		super();
		this.extension = extension;
	}


	public boolean estValide(String fileName) {
		int pos = fileName.lastIndexOf(".");
		if (pos > -1) {
			String ext = fileName.substring(pos+1);
			if(ext.equals(this.extension )){
				if(prety(fileName)!=null){
					this.rapport=OK+" test de format r�ussie : le fichier est de bonne extension et a �t� prety_print�(extension = ."+extension+")";
					return true;
				}
				else{
					this.rapport=FAIL+" test de format �chou� : le fichier est de bonne extension et n'a pas  �t� prety_print�(extension = ."+extension+")";
					return true;
				}

			}
			else{
				if( prety(fileName) != null){
					this.rapport=OK+" test de format �chou�: le fichier ne correspond pas au format de fichier attendu, extension attendu = ."+this.extension+" et extension r�ussi = ."+ext;
					return false;
				}
				else{
					this.rapport=OK+" test de format r�ussie : le fichier n'est pas de bonne extension et a �t� rejet� par le prety_printer(extension = ."+ext+")";
					return true;
				}
			}

		} 
		else{
			if( prety(fileName) != null){
				this.rapport=" test de format �chou�: un fichier sans extension a �t� prety_print�";
				return false;
			}
			else{
				this.rapport="test de format r�ussie :un fichier sans extension a �t� rejet� ";
				return true;
				
			}

		}
	}
}


