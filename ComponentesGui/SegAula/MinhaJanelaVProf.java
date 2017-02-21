package SegAula;
//Pacotes utilizados
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class MinhaJanelaVProf extends JFrame
{
	JMenuBar barraMenu = null;
	
	JMenu arquivo = null;
	JMenu editar = null;
	JMenu cores = null;
	JMenu ajuda = null;
	
	JMenuItem abrir = null;
	JMenuItem sair = null;
	JMenuItem vermelho = null;
	JMenuItem azul = null;
	JMenuItem sobre = null;
	
	//Declara uma referencia para um botao
	JLabel rotuloEstatico = null;
	JTextField campoTexto = null;
	JButton botaoOk = null;
	String[] linguagens = {"Java", "Swift", "C++", "C#"};
	JComboBox caixaSelecao = null;
	JCheckBox termosUsuario = null;
	JRadioButton masculino = null, feminino = null;
	ButtonGroup grupo = null;
	JList lista = null;
	JTextArea texto = null;
	JScrollPane barraRolagem = null;
	JToolBar barraFerramentas = null;
	JPanel painel = null;
	
	public MinhaJanelaVProf()
	{
		//Configuracoes da janela
		setTitle("Primeira janela do sistema");
		setSize(400, 500);
		setLocation(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		//Definindo a estrategia de layout
		setLayout(new BorderLayout());
		
		//Cria rotulo estatico
		rotuloEstatico = new JLabel("Digite seu nome:");
		
		//Cria um campo para a entrada de dados
		campoTexto = new JTextField(10);
		campoTexto.setToolTipText("Insira o seu nome");
		
		//Instancia o objeto de botao
		botaoOk = 
	    new JButton(new ImageIcon(getClass().
	    		getResource("BtOK.jpg")));
		
		//Cria uma caixa de selecao e marca o 2 item
		caixaSelecao = new JComboBox(linguagens);
		caixaSelecao.setSelectedIndex(1);
		
		//Cria uma caixa de selecao
		termosUsuario = new JCheckBox("Aceito os termos");
		
		//Cria um grupo de controle
		grupo = new ButtonGroup();
		masculino = new JRadioButton("Masculino");
		feminino = new JRadioButton("Feminino");
		grupo.add(masculino);
		grupo.add(feminino);
		masculino.setSelected(true);
		
		//Cria um objeto de list
		lista = new JList(linguagens);
		
		//Cria uma area de texto
		texto = new JTextArea(10,10);
		barraRolagem = new JScrollPane(texto);
		
		barraFerramentas = new JToolBar();
		painel = new JPanel();
		painel.setLayout(new FlowLayout());
		
		barraFerramentas.add(new JButton(new ImageIcon(getClass().
	    		getResource("BtOK.jpg"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().
	    		getResource("BtOK.jpg"))));
		
		painel.add(rotuloEstatico);
		painel.add(campoTexto);
		painel.add(botaoOk);
		painel.add(caixaSelecao);
		painel.add(termosUsuario);
		painel.add(masculino);
		painel.add(feminino);
		painel.add(lista);
		painel.add(barraRolagem);
		
		add(barraFerramentas, BorderLayout.NORTH);
		add(painel, BorderLayout.CENTER);
		
		//Cria e vincula a barra de menu à janela
		barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		
		//Cria os objetos agrupamento de opcoes do Menu
		arquivo = new JMenu("Arquivo");
		editar = new JMenu("Editar");
		cores = new JMenu("cores");
		ajuda = new JMenu("Ajuda");
		
		barraMenu.add(arquivo);
		barraMenu.add(editar);
		editar.add(cores);
		barraMenu.add(ajuda);
		
		abrir = new JMenuItem("Abrir");
		abrir.setMnemonic(KeyEvent.VK_A);
		sair = new JMenuItem("Sair");
		vermelho = new JMenuItem("Vermelho");
		azul = new JMenuItem("Azul");
		sobre = new JMenuItem("Sobre...");
		
		arquivo.add(abrir);
		arquivo.addSeparator();
		arquivo.add(sair);
		
		cores.add(vermelho);
		cores.add(azul);
		
		ajuda.add(sobre);
		
		
		
		//Mostra a janela na tela do computador
		setVisible(true);
	}
}





