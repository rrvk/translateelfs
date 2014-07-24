package main;

import controler.Controler;
import gui.Gui;
import gui.TestGui;
import handeler.Handeler;

public class Main {
	public static void main(String[] args) {
		TestGui tGui = new TestGui();
		tGui.setBounds(50,50,400,110);
		tGui.setResizable(false);
		tGui.setVisible(true);
		Gui gui = new Gui();
		// settings of the gui
		gui.setBounds(50,50,400,110);
		gui.setResizable(false);
		gui.setVisible(true);
		Controler con = new Controler();
		new Handeler(gui,con);
		
	}	
}
