package Views;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Controllers.PrincipalController;

public class TelaPrincipal extends JFrame 
{
	
	//Atributos da Calsse
	private JMenuBar barraMenu = null;
	private JMenu menu= null;
	private JMenuItem cadastrar = null;
	private JMenuItem sair = null;
	private PrincipalController controler = null;
	
	//Contrudor publico sem paramentro;
	public TelaPrincipal()
	{
		//configura os atributos da janela
		setTitle("SisCaC");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		//Intancia obejtos visuais 
		barraMenu = new JMenuBar();
		menu = new JMenu("Arquivo");
		cadastrar = new JMenuItem("Cadastrar Cliente");
		sair = new JMenuItem("Sair");
		//Impelemta hierarquia de menus

		setJMenuBar(barraMenu);
		barraMenu.add(menu);
		menu.add(cadastrar);
		menu.addSeparator();
		menu.add(sair);

	
		//Registrar 
		controler = new PrincipalController(this);
		cadastrar.addActionListener(controler);
		sair.addActionListener(controler);
		
		//Mandar mostrar a janela
		setVisible(true);
		
	}

	public JMenuItem getCadastrar() {
		return cadastrar;
	}


	public JMenuItem getSair() {
		return sair;
	}

	public void setSair(JMenuItem sair) {
		this.sair = sair;
	}

}
