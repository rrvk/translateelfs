package gui;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Gui extends JFrame {
	private static final long serialVersionUID = 1L;

	private JTextField txtText;
	private JButton btnTranslate;
	
	public Font customFont = null;
	
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
		// make the elfs font
		try {
            //create the font to use. Specify the size!
            customFont = Font.createFont(Font.TRUETYPE_FONT, new File("Font/TengwarSindarin.ttf")).deriveFont(20f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //register the font
            ge.registerFont(customFont);
        } catch (IOException e) {
        	if (e.getMessage().equals("Can't read Font\\TengwarSindarin.ttf")){
        		JOptionPane.showMessageDialog(null, "The font is not found");
        		System.exit(0);
        	}
            e.printStackTrace();
        }
        catch(FontFormatException e)
        {
            e.printStackTrace();
        }
		// set the settings
		

		// add the labels
		JLabel lblE = new JLabel("Elvish:");
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
