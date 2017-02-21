package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Views.TelaCadastro;

public class CadastroController implements
ActionListener 
{
	private TelaCadastro tela =  null;
	
	//construtor da classe CadastroController
	
	public CadastroController(TelaCadastro copia){
		tela = copia;
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == tela.getVrBotaoOk())
		{
			
		}
		else if (e.getSource() == tela.getVrBotaoCancelar());
		{
			tela.dispose();
		
		}
	}
}