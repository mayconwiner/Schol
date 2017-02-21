//pacote da classe
package Views;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaCadastro extends JFrame 
{
	private JTextField vrCampoNome = null;
	private JTextField vrCampoEndereco = null;
	private JComboBox<String> vrSelecaoIdade = null;
	private JRadioButton vrMasc = null, vrFem = null;
	private ButtonGroup agrupador = null;
	private JButton vrBotaoOK = null, vrBotaoCancelar = null;
	
	//Contrudor da classe
	public TelaCadastro()
	{
		setTitle("Cadastro de Cliente");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new GridLayout(5,2));
		
		//Intancia e adiciona os componentes no layout
		add(new JLabel("nome"));
		vrCampoNome = new JTextField(5);
		add(vrCampoNome);
		
		add(new JLabel("Endereço"));
		vrCampoEndereco = new JTextField();
		add(vrCampoEndereco);
			
		add(new JLabel("Idade"));
		vrSelecaoIdade = new JComboBox<String>();
		for (int i =0;i<130; i++)
		{
			vrSelecaoIdade.addItem(i+"");
		}
		vrMasc = new JRadioButton("Masculino");
		vrFem = new JRadioButton("Feminino");
		agrupador = new ButtonGroup();
		agrupador.add(vrMasc);
		agrupador.add(vrFem);
		add(vrMasc);
		
		vrBotaoOK = new JButton("Cadastrar");
		vrBotaoCancelar = new JButton("Cancelar");
		add(vrBotaoOK);
		add(vrBotaoCancelar);
	}	

}
