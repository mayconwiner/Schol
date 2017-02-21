package Models;

import java.util.ArrayList;

public class GerenteArmazenamento 
{
	//Cria variavel de referencia
	private static GerenteArmazenamento vrGerente = null;
	
	//Construtor privado do Singleton
	private GerenteArmazenamento()
	{/*construtor vazio eheheh*/}
	
	//Metodo responsavel pelo retorno do Singleton
	public static GerenteArmazenamento retornaGerente()
	{
		if (vrGerente == null)
		{
			vrGerente  = new GerenteArmazenamento();
		}
		
		return vrGerente;
	}
	
	//Metodo responsavel pelo registro de cliente
	public static void gravaCliente(Cliente c)
	{	
	}
	
	//Metodo que retorna todos os clientes 
	//Cadastrados
	public static ArrayList<Cliente> buscaClientes()
	{
		return null;
	}
}









