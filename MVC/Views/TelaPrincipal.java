//Pacote da classe
package Views;

//Pacotes utilizados pela classe
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Controllers.PrincipalController;

public class TelaPrincipal extends JFrame
{
	//Atributos da classe
	private JMenuBar barraMenu = null;
	private JMenu  menu = null;
	private JMenuItem relatorio = null;
	private JMenuItem cadastrar = null;
	private JMenuItem sair = null;
	
	//Getters 
	public JMenuItem getCadastrar() {
		return cadastrar;
	}
	public JMenuItem getSair() {
		return sair;
	}
	public JMenuItem getRelatorio(){
		return relatorio;
	}

	private PrincipalController controller = null;
	
	//Conrtrutor publico sem parametros
	public TelaPrincipal()
	{
		//Configura os atributos da janela
		setTitle("SisCaC");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		//Instancia os objetos visuais 
		barraMenu = new JMenuBar();
		menu = new JMenu("Arquivo");
		cadastrar = new JMenuItem("Cadastrar cliente");
		relatorio = new JMenuItem("Relatorio");
		sair = new JMenuItem("Sair");
		
		//Implementa hierarquia de menus
		setJMenuBar(barraMenu);
		barraMenu.add(menu);
		menu.add(cadastrar);
		menu.addSeparator();
		menu.add(relatorio);
		menu.addSeparator();
		menu.add(sair);
		
		//Registra a janela ao tratador de eventos
		controller = new PrincipalController(this);
		cadastrar.addActionListener(controller);
		relatorio.addActionListener(controller);
		sair.addActionListener(controller);
		
		
		//Manda mostrar a janela
		setVisible(true);
	}
}





