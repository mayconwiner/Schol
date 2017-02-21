package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Views.TelaCadastro;
import Views.TelaPrincipal;

public class PrincipalController implements ActionListener 
{
public TelaPrincipal tela = null;
public PrincipalController (TelaPrincipal copia)
{
	
	
}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
	if (e.getSource() == tela.getSair())
	{
		System.exit(1);
	}
	else 
		if (e.getSource() == tela.getCadastrar())
		{
			new TelaCadastro();
		}
		
	}
	

}
