package Models;

import java.util.ArrayList;

public class GerenteArmazenamento 
{
	//Vriar variavel de referecia
	private static GerenteArmazenamento vrGerent = null;
	
	//Contrudor provado do Singleton
	private GerenteArmazenamento()
	{
		//Contrutor vazio
		
	}
	
	//Metodo responsavel pelo retorno do Singleton
	static GerenteArmazenamento retornaGerente()
	{
		if (vrGerent == null)
		{
			vrGerent = new GerenteArmazenamento();
		}
		return vrGerent;
	}
	//Metodo reponsavel pelo regitro de cliente
	public static void gravaCliente(Cliente c)
	{
		
	}
	//Metodo retorna todos os cliente cadastrados
	public static ArrayList<Cliente> buscaCliente()
	{
		return null;
	}

}
