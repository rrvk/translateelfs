package gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestGui extends JFrame {
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

	public TestGui(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		this.setTitle("Translate text into elfs");
		this.setLayout(null);
		
		JPanel test = new JPanel();
		Graphics g = test.getGraphics();
		
		ImageIcon i = new ImageIcon("C:/Users/Robert/Dropbox/Programeer projecten/Java/elfse letters (plaatjes)/a.jpg");
		g.drawImage(i, 10, 10, null);
		System.out.println("hoi");
		
		
		this.add(test);
	}
}
