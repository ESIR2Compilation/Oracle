package tests;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DoublePrintTest extends AbstractTest{
	
	public String prity(String f){
		return f;
	}
	
	public void tester() {
		File f1 =new File(prity(entry));
		File f2 =new File(prity(prity(entry)));
		FileInputStream lect1 = null;
		FileInputStream lect2 = null;
		BufferedInputStream bis1 = null;
		BufferedInputStream bis2 = null;
		byte[] buf1 = new byte[1];
		byte[] buf2 = new byte[1];
		int n1=0,n2 = 0;
		try{
			lect1 = new FileInputStream(f1);
			lect2 = new FileInputStream(f2);
			bis1 = new BufferedInputStream(lect1);
			bis2 = new BufferedInputStream(lect2);
			n1=bis1.read(buf1); n2=bis2.read(buf2);
			while( n1 != -1 && n2!= -1 ){
				if(buf1[0] != buf2[0]){
					//System.out.println("diff�rence : c1 = " +(char)buf1[0] + " et c2 =" +(char)buf2[0]);
					lect1.close();
					bis1.close();
					lect2.close();
					bis2.close();
					this.rapport =FAIL + getClass().getSimpleName()+" test de DoublePrint �chou� sur l'entr�e "+entry;
					estValide=false;
				}
				//System.out.println("pas de diff: c1 = " +(char)buf1[0] + " et c2 =" +(char)buf2[0]);
				n1=bis1.read(buf1); n2=bis2.read(buf2);
			}
			//si un des fichier est plus long que l'autre 
			if( n1 != -1 || n2 != -1) {
				lect1.close();
				bis1.close();
				lect2.close();
				bis2.close();
				this.rapport =FAIL + getClass().getSimpleName()+" test de DoublePrint �chou� sur l'entr�e "+entry;
				estValide=false;
			}
			lect1.close();
			bis1.close();
			lect2.close();
			bis2.close();
			this.rapport =OK+ getClass().getSimpleName()+" test de DoublePrint r�ussi sur l'entr�e "+entry;
			estValide=true;
		}
		catch(Exception e){
			//e.printStackTrace();
			this.rapport =FAIL + getClass().getSimpleName()+" test de DoublePrint �chou� sur l'entr�e "+entry;
			estValide=false;
		}
	}

}
