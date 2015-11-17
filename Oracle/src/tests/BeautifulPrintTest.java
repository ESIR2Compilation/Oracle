package tests;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BeautifulPrintTest extends AbstractTest{

	public BeautifulPrintTest(String entry) {
		super(entry);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean estValide() {
		// TODO Auto-generated method stub
		return false;
	}

	public void yolo(){
		try{
			InputStream flux=new FileInputStream("test.txt"); 
			InputStreamReader lecture=new InputStreamReader(flux);
			BufferedReader buff=new BufferedReader(lecture);
			String ligne;
			while ((ligne=buff.readLine())!=null){
				System.out.println(ligne);
			}
			buff.close(); 
			}		
			catch (Exception e){
			System.out.println(e.toString());
			}
	}
}
