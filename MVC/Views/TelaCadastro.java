//Pacote da classe
package Views;

//Pacotes da classe
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
	//Atributos da classe
	private JTextField vrCampoNome = null;
	private JTextField vrCampoEndereco = null;
	private JComboBox<String> vrSelecaoIdade = null;
	private JRadioButton vrMasc = null, vrFem = null;
	private ButtonGroup agrupador = null;
	private JButton vrBotaoOk=null, vrBotaoCancelar = null;
	
	//Construtor da classe
	public TelaCadastro()
	{
		setTitle("Cadastro de Clientes");
		setSize(400,150);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new GridLayout(5,2));	
		
		//Instancia e adiciona os componentes
		//No layout
		add(new JLabel("Nome:"));
		vrCampoNome = new JTextField(5);
		add(vrCampoNome);
		
		add(new JLabel("Endereco"));
		vrCampoEndereco = new JTextField(5);
		add(vrCampoEndereco);
		
		add(new JLabel("Idade"));
		vrSelecaoIdade = new JComboBox<String>();
		for (int i=0; i<130; i++)
		{
			vrSelecaoIdade.addItem(i + "");
		}
		add(vrSelecaoIdade);
		
		vrMasc = new JRadioButton("Masculino");
		vrFem = new JRadioButton("Feminino");
		agrupador = new ButtonGroup();
		agrupador.add(vrMasc);
		agrupador.add(vrFem);
		vrMasc.setSelected(true);
		
		add(vrMasc);
		add(vrFem);
		
		vrBotaoOk = new JButton( "Cadastrar");
		vrBotaoCancelar = new JButton("Cancelar");
		
		add(vrBotaoOk);
		add(vrBotaoCancelar);
	}
}





