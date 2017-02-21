//Pacote da classe
package Controllers;

//Pacotes utilizados
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Views.TelaCadastro;
import Views.TelaPrincipal;

public class PrincipalController implements 
ActionListener
{
	private TelaPrincipal tela = null;
	
	//Construtor da classe controller
	public PrincipalController(TelaPrincipal copia)
	{
		tela = copia;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == tela.getSair())
		{
			System.exit(0);
		}
		else if (e.getSource() == tela.getCadastrar())
		{
			new TelaCadastro().setVisible(true);
		}
	}
}
