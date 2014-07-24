package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PopupGui extends JFrame {
	private static final long serialVersionUID = 1L;
	public Font customFont = null;
	
	public PopupGui(Font font, final String tekst){
		// set settings
		this.customFont=font;
		this.setTitle("Translation");
		this.setVisible(true);
		this.setBounds(50,50,400,110);
		// create panel and tekst	
		JPanel panel = new JPanel();
		// set gridview
		GridLayout grid = new GridLayout(0,1);
		panel.setLayout(grid);
		JLabel first = new JLabel("Original text");
		JLabel orgT = new JLabel(tekst);
		JLabel seccond = new JLabel("Elvish");
		final JLabel translate = new JLabel(tekst);
		translate.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {}
			
			@Override
			public void mousePressed(MouseEvent arg0) {}
			
			@Override
			public void mouseExited(MouseEvent arg0) {}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Image Files", "jpg"));
				fileChooser.setAcceptAllFileFilterUsed(false);
				fileChooser.setDialogTitle("Specify a file to save");
				int userSelection = fileChooser.showSaveDialog(null);
				if (userSelection == JFileChooser.APPROVE_OPTION) {
					File fileToSave = fileChooser.getSelectedFile();
					BufferedImage bufferedImage = new BufferedImage(translate.getWidth(), translate.getHeight(),
			                BufferedImage.TYPE_INT_RGB);
			        Graphics graphics = bufferedImage.getGraphics();
			        graphics.setColor(Color.LIGHT_GRAY);
			        graphics.fillRect(0, 0, translate.getWidth(), translate.getHeight());
			        graphics.setColor(Color.BLACK);
			        graphics.setFont(customFont);
			        graphics.drawString(tekst, 0, 15);
			        try {
						ImageIO.write(bufferedImage, "jpg", new File(
								fileToSave.getAbsolutePath()+".jpg"));
					} catch (IOException e) {
						e.printStackTrace();
					}
					JOptionPane.showMessageDialog(null, "Save as file: "+fileToSave.getAbsolutePath());
					System.out.println("Save as file: " + fileToSave.getAbsolutePath()+".jpg");
				}				
			}
		});
		translate.setFont(customFont);		
		panel.add(first);
		panel.add(orgT);
		panel.add(seccond);
		panel.add(translate);
		JScrollPane scrollPane = new JScrollPane( panel );
		this.add(scrollPane);        
	}
}
