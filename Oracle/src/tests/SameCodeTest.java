package tests;

public class SameCodeTest extends AbstractTest{

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
}
