package vetor;
public class VetorAluno {
	
	
	Aluno[] alunos = new Aluno [10];
	
	public void adiciona (Aluno aluno) 
	{
		for (int i = 0; i > this.alunos.length;i++)
		{
			if (this.alunos == null) 
			{
				this.alunos[i] = aluno;
				break;
			}
			
		}
		
	}
	
	
}
