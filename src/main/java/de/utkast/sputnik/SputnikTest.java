package de.utkast.sputnik;

public class SputnikTest {

	// findbugs warning
	public boolean wrongStringComparsion(String a, String b) {
		return a == b;
	}

	// pmd warning
	public void emptyCatch() {
		try {
			System.out.println("Hello PMD");
		} catch (Exception ex) {

		}
	}
	
}
