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
			if(ext.equals(this.extension ) && prety(fileName)!=null){
				//System.out.println( this.OK);
				this.rapport=this.OK+" test de format réussie : le fichier est de bonne extension et a été prety_printé(."+extension+")";
				return true;
			}
			else{
				if( prety(fileName) != null){
					this.rapport="test de format échoué: le fichier ne correspond pas au format de fichier attendu, extension attendu = ."+this.extension+" et extension réussi = ."+ext;
					return false;
				}
				else{
					this.rapport="test de format réussie : le fichier n'est pas de bonne extension et a été rejeté par le prety_printer(."+extension+")";
					return true;
				}
			}

		} 
		else{
			if( prety(fileName) != null){
				this.rapport=" test de format échoué: un fichier sans extension a été prety_printé";
				return false;
			}
			else{
				this.rapport="test de format réussie :un fichier sans extension a été rejeté ";
				return true;
			}

		}
	}
}


