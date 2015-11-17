package tests;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BeautifulPrintTest extends AbstractTest{

	
	@Override
	public void tester() {
		if (Math.random() > 0.5){
			rapport = OK + " " + getClass().getSimpleName();
			estValide = true;
		}
		else {
			rapport = FAIL + " " + getClass().getSimpleName();
			estValide = false;
		}
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
