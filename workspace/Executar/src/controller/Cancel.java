package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Cancel implements ActionListener {
	private JFrame frame;
	
	public Cancel(JFrame f){
		this.frame=f;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		frame.dispose();
		
	}

}
