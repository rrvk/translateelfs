package main;

import javax.swing.JFrame;

import gui.Gui;
import handeler.Handeler;

public class Main {
	public static void main(String[] args) {
		Gui gui = new Gui();
		// settings of the gui
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		gui.setTitle("Translate text into Elvish");
		gui.setLayout(null);
		gui.setBounds(50,50,400,110);
		gui.setResizable(false);
		gui.setVisible(true);
		// set the handeler
		new Handeler(gui);		
	}	
}
