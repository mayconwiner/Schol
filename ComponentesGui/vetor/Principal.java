package vetor;
import java.util.Scanner;

public class Principal {
	public static void main (String[]Args)
	{
		
	 Aluno AA = new Aluno();
	 Aluno AB = new Aluno();
	 VetorAluno lista = new VetorAluno();
	 
	 AA.setNome("Jose");
	 AA.setIdade(17);
	 AB.setNome("Joao");
	 AB.setIdade(22);
	 
	lista.adiciona(AB);
	lista.adiciona(AA);
//System.out.println(lista.tamanho());	 
	 
	 
		
		
	}

}
