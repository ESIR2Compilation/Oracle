package tests;

public abstract class AbstractTest {

	protected static final String OK = "[OK]";
	protected static final String FAIL = "[FAILED]";
	protected String rapport;
	
	public AbstractTest(){
		
	}
	
	public String genererRapport(){
		return rapport;
	}
}
