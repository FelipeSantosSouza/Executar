package view;

import controller.ProcController;

public class ProcVisao 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ProcController pCont= new ProcController();
		
		//pCont.propriedades();
		
		//String so=pCont.so();
		
		//System.out.println(so);
		
//		String caminho="c:\\windows\\notepad.exe";
//		pCont.iniciaProcesso(caminho);
		
		 String nomeProcesso = "ipconfig /all";
		 pCont.leProcesso(nomeProcesso);
	
//		pCont.mataProcesso("cmd.exe");
	}

}
