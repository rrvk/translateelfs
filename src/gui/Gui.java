package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gui extends JFrame {
	private static final long serialVersionUID = 1L;

	private JTextField txtText;
	private JButton btnTranslate;
	
	/**
	 * @return the txtText
	 */
	public JTextField getTxtText() {
		return txtText;
	}

	/**
	 * @param txtText the txtText to set
	 */
	public void setTxtText(JTextField txtText) {
		this.txtText = txtText;
	}

	/**
	 * @return the btnTranslate
	 */
	public JButton getBtnTranslate() {
		return btnTranslate;
	}

	/**
	 * @param btnTranslate the btnTranslate to set
	 */
	public void setBtnTranslate(JButton btnTranslate) {
		this.btnTranslate = btnTranslate;
	}

	public Gui(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		this.setTitle("Translate text into elfs");
		this.setLayout(null);
		// add the labels
		JLabel lblE = new JLabel("Elfs:");
		lblE.setBounds(10, 10, 50, 20);
		this.add(lblE);
		// add the textfield
		txtText = new JTextField();
		txtText.setBounds(60, 10, 300, 20);
		this.add(txtText);
		// add the button
		btnTranslate = new JButton("Translate");
		btnTranslate.setBounds(10, 50, 100, 20);
		this.add(btnTranslate);
	}
}
