package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Set;

public class ProcController 
{
	
	public ProcController() 
	{
		// TODO Auto-generated constructor stub
		super();
		
	}
	
	public void propriedades()
	{
		Properties pr=System.getProperties();
		
		Set<Object> keys =pr.keySet();
		
		for(Object key : keys)
		{
			System.out.print(key.toString());
			System.out.print(":");
			System.out.println(pr.getProperty(key.toString()));
		
		}
	}
	
	public String so()
	{
		 String so=System.getProperty("os.name");
		 
		 return  so;
	}
	
	public void iniciaProcesso(String caminho)
	{
		
		try {
			Runtime.getRuntime().exec(caminho);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
	
	public void leProcesso(String caminho)
	{
		try {
			Process proc=Runtime.getRuntime().exec(caminho);
			InputStream fluxo=proc.getInputStream();
			InputStreamReader leitor=new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha= buffer.readLine();
			
			while(linha!= null)
			{
				System.out.println(linha);
				linha= buffer.readLine();
			}
			
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void mataProcesso(String processo)
	{
		String cmdPid = "TASKKILL /PID ";
		String cmdNome= "TASKKILL /IM ";
		int pid=0;
		StringBuffer buffer= new StringBuffer();
		
		try
		{
			pid=Integer.parseInt(processo);
			buffer.append(cmdPid);
			buffer.append(pid);
			
		}
		
		catch(NumberFormatException e)
		
		{
			buffer.append(cmdNome);
			buffer.append(processo);
		}
		
		iniciaProcesso(buffer.toString());
		
	}
	
	
	
	
}
