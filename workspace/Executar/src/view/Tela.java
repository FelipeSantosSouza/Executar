package view;


import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Cancel;
import controller.FileChooser;
import controller.OK;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Tela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8533024649811972087L;
	private JPanel contentPane;
	private JTextField txtDir;
	private JButton btnCancelar;
	private JButton btnAbrir;
	private JButton btnProcurar;
	
	/**
	 
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		setTitle("Executar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 107);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAbrir = new JButton("OK");
		
			//public void actionPerformed(ActionEvent arg0) {
				
				
			//}
		;
		btnAbrir.setBounds(43, 42, 89, 23);
		contentPane.add(btnAbrir);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setBounds(241, 42, 89, 23);
		contentPane.add(btnProcurar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCancelar.setBounds(142, 42, 89, 23);
		contentPane.add(btnCancelar);
		
		txtDir = new JTextField();
		txtDir.setBounds(43, 11, 288, 20);
		contentPane.add(txtDir);
		txtDir.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Abrir:");
		lblNewLabel.setBounds(10, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		FileChooser f = new FileChooser(txtDir);
		Cancel c = new Cancel(this);
		OK ok = new OK(txtDir, this);
		btnAbrir.addActionListener(ok);
		btnCancelar.addActionListener(c);
		btnProcurar.addActionListener(f);
		
		
	}

	
}
