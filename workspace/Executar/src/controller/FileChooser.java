package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooser implements ActionListener {
	private JTextField text;
	
	public FileChooser(JTextField t){
		this.text=t;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos Executáveis (.exe)", "exe");
		String dirBase = System.getProperty("user.home")+"/Desktop";
		File dir = new File(dirBase);
		
		
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(dir);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.setAcceptAllFileFilterUsed(false);
		chooser.addChoosableFileFilter(filtro);
		String caminho="";
		
		int retorno = chooser.showOpenDialog(null);
		
		if (retorno == chooser.APPROVE_OPTION){
			caminho=chooser.getSelectedFile().getAbsolutePath();
			text.setText(caminho);
			
		}
		
	}

}
