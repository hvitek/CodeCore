package test;

import gui.MainWindowViewBase;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PravaWindowMethodsContainer window = new PravaWindowMethodsContainer(null);
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
