package controller;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int o=0;
		RedesController rede = new RedesController();
		o=Integer.parseInt(JOptionPane.showInputDialog(" Digite \n 1- Endereços IPv4 \n 2-Ping \n 9-sair"));
		
		switch (o){
		case 1:
			System.out.println(rede.ip(System.getProperty("os.name")));
		break;
		case 2:
			System.out.println(rede.ping(System.getProperty("os.name")));
		break;
	}

}
}