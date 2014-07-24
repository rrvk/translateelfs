package handeler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.Gui;
import controler.Controler;

public class Handeler {
	
	private Gui gui;
	private Controler con;
	
	public Handeler(Gui gui, Controler con) {
		this.gui=gui;
		this.con=con;
		addHandelers();
	}

	private void addHandelers() {
		gui.getBtnTranslate().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				con.translateTextToElfs(gui.getTxtText().getText());
				
			}
		});
		// TODO Auto-generated method stub
		
	}

}
