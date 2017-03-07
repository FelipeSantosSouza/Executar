package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class OK implements ActionListener{

	private JTextField textfield;
	private JFrame frame;
	
	public OK(JTextField textfield, JFrame frame){
		this.frame=frame;
		this.textfield=textfield;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
			
			try {
				Runtime.getRuntime().exec(textfield.getText().toString());
				frame.dispose();
			} catch (IOException e1) {
				
				JOptionPane.showMessageDialog(null, "Diretório Inválido", null, JOptionPane.ERROR_MESSAGE);
			}
			
		
		
	}
	
	
}
