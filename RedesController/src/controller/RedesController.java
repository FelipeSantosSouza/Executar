package controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {
	public RedesController(){
		super();
	}
	public String ip(String so){
		String com="", t="";
		int l=0;
		if (so.contains("Windows")){
			com="ipconfig /all";
			
			
		}
		else if(so.contains("Linux")){
			com="ifconfig";
			t="M";
		}
		else{
			
		}
		
		try {
			Process proc=Runtime.getRuntime().exec(com);
			InputStream fluxo=proc.getInputStream();
			InputStreamReader leitor=new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha= buffer.readLine();
			boolean s=false;
			String s1="";
			com="";
			while(linha!= null)
			{
				if (linha.trim().contains("Adaptador") || linha.trim().contains("Link")){
				s=true;
				s1=linha;
				
				
			}
				if (linha.trim().contains("Endere‡o IPv4") || linha.trim().contains("inet addr:")){
					if (s==true){
					l=s1.lastIndexOf(t);
					com =com + s1.trim().substring(0, l) + "\n" + "		" + linha +"\n";
					s=false;
					
					}
				}
				
				
				linha= buffer.readLine();
			}		
			
		
		}
		 catch (IOException e) {
			
			e.printStackTrace();
		}
			
		
		return com;
		}
	public String ping (String so){
		String com="",s="";
		
		if (so.contains("Windows")){
			com="ping -n 10 www.google.com.br";
			s="M";
			
		}
		else if(so.contains("Linux")){
			com="ifconfig";
			s="/";
		}
		else{
			
		}
		
		try {
			Process proc=Runtime.getRuntime().exec(com);
			InputStream fluxo=proc.getInputStream();
			InputStreamReader leitor=new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha= buffer.readLine();
			
			
			com="";
			while(linha!= null)
			{
				if (linha.trim().contains("M¡nimo") || linha.trim().contains("M¡nimo")  ){
				
				com=linha.substring((linha.lastIndexOf(s)), linha.length());
				
				
				}
				
				
				linha= buffer.readLine();
			}		
			
		
		}
		 catch (IOException e) {
			
			e.printStackTrace();
		}
			
		
		return com;
		}
}


