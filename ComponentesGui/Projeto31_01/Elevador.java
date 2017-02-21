package Projeto31_01;
//Projeto de uma classe para abstrair um objeto Elevador
public class Elevador 
{
	//Atributos da classe (informações)
	int andarAtual = 0;
	int qtdPessoas = 0;
	boolean estadoDaPorta = false;
	
	//Métodos da classe elevador (ações)
	void mostraElevador()
	{
			System.out.println(qtdPessoas);
			System.out.println(estadoDaPorta);
			System.out.println(andarAtual);
	}
	
	//Metodo que retira pesssoas do elevador
	void saiPessoasElevador(int numPessoas)
	{
		//Testa se a porta esta aberta
		if (estadoDaPorta == false)
			return;
		
		//Num de pessoas a sair é maior do que o atual
		if (numPessoas > qtdPessoas)
		{
			qtdPessoas = 0;
		}
		
		//Decrementa o numero de pessoas no elevador
		if (qtdPessoas >= numPessoas)
		{
			qtdPessoas = qtdPessoas - numPessoas;
		}
	}
	
	//Metodo que insere pessoas no elevador
	void entraPessoasElevador(int numPessoas)
	{
		//Testa se porta esta aberta
		if (estadoDaPorta == false)
			return;
		
		qtdPessoas = qtdPessoas + numPessoas;
	}
	
	//Metodo utilizado para abrir ou fechar a porta
	void alteraEstadoPorta(boolean novoEstado)
	{
		estadoDaPorta = novoEstado;
	}
	
	//Metodo utilizado para alterar o andar do elevador
	boolean moveElevadorPara(int andarDesejado)
	{
		//Verifica se porta aberta ou elevador já no andar
		if (estadoDaPorta == true || andarAtual == andarDesejado)
		{
			//Operacao mal sucedida (retorna falso)
			return false;
		}
		
		//Operacao bem sucedida (retorna true)
		andarAtual = andarDesejado;
		return true;
	}
}







