package handeler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.Gui;
import gui.PopupGui;

public class Handeler {
	
	private Gui gui;
	
	public Handeler(Gui gui) {
		this.gui=gui;
		addHandelers();
	}

	private void addHandelers() {
		gui.getBtnTranslate().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new PopupGui(gui.customFont,gui.getTxtText().getText().toLowerCase());
			}
		});		
	}

}
