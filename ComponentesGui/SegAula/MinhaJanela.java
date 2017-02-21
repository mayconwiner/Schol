package SegAula;
//Pacotes utilizados
import java.awt.BorderLayout;
import java.awt.FlowLayout;

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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class MinhaJanela extends JFrame
{
	
	JMenuBar barraMenu = null;
	
	JMenu arquivo = null;
	JMenu cores = null;
	JMenu ajuda = null;
	JMenu editar = null;
	
	JMenuItem abrir = null;
	JMenuItem sair = null;
	JMenuItem vermelho = null;
	JMenuItem azul = null;
	JMenuItem sobre = null;
	
	
	
	//Declara uma referencia para um botao
	JLabel rotuloEstatico = null;
	JTextField campoTexto = null;
	JButton botaoOK = null;
	String [] linguagens = {"Java", "Swift", "C++", "C#"};
	JComboBox caixaSelecao = null;
	JCheckBox termosUsuario = null;
	JRadioButton masculino = null, feminino = null;
	ButtonGroup grupo = null;
	JList lista = null;
	JTextArea texto = null;
	JScrollPane barraRolagem = null;
	JToolBar barraFerramenta = null;
	JPanel painel = null;
	
	
	public MinhaJanela()
	{
		//Configuracoes da janela
		setTitle("Primeira janela do sistema");
		setSize(400, 300);
		setLocation(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		//Definindo a estrategia de layout
		setLayout(new BorderLayout());
		//Cria rotulo estaticon 
		rotuloEstatico = new JLabel("Digite seu nome:");
		
		//Cria um campo para entrada de dados
		campoTexto = new JTextField(10);
		campoTexto.setToolTipText("Insira seu nome");
		
		//Intancia objeto de botao
		botaoOK = new JButton(new ImageIcon(getClass().getResource("BtOK.jpg")));
		 
		//Cria umca caixa de seleção e marca o segundo item
		caixaSelecao = new JComboBox(linguagens);
		caixaSelecao.setSelectedIndex(1);
		
		//Cria uma caixa de selecao
		termosUsuario = new JCheckBox("Aceito os Termos");
		
		//Cria um grupo de controle 
		grupo = new ButtonGroup();
		masculino = new JRadioButton("Masculino");
		feminino = new JRadioButton("Feminino");
		grupo.add(masculino);
		grupo.add(feminino);
		masculino.setSelected(true);
		
		//Cria uma lista de selecao com os arquivo do 
		lista = new JList(linguagens);
		
		//Cria uma area de texto		
		texto = new JTextArea(10,10);
		barraRolagem = new JScrollPane(texto);
		
		
		barraFerramenta = new JToolBar();
		painel = new JPanel();
		painel.setLayout(new FlowLayout());
				
		barraFerramenta.add(new JButton(new ImageIcon(getClass().getResource("BtOK.jpg"))));
		
		painel.add(rotuloEstatico);
		painel.add(campoTexto);
		painel.add(botaoOK);
		painel.add(caixaSelecao);
		painel.add(termosUsuario);
		painel.add(masculino);
		painel.add(feminino);
		painel.add(lista);
		painel.add(barraRolagem);
		
		add(barraFerramenta, BorderLayout.NORTH);
		add(painel, BorderLayout.CENTER);
		// Termina add Painel de acordo com o link no grupo da turma 
		
		//Criar e vincular barra de menu a janela
		barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		
		//Criar os objetos agrupamentos de opcoes do menu
		arquivo =  new JMenu("Arquivo");
		editar = new JMenu ("Editar");
		cores = new JMenu ("Cores");
		ajuda = new JMenu ("Ajuda");
		
		barraMenu.add(arquivo);
		barraMenu.add(editar);
		editar.add(cores);
		barraMenu.add(ajuda);
		
		abrir = new JMenuItem("Abrir");
		//abrir.setMnemonic(KeyEvent.VK_A);
		sair = new JMenuItem("Sair");
		vermelho = new JMenuItem("Vermelho");
		azul = new JMenuItem ("Azul");
		sobre = new JMenuItem ("Sobre...");
		
		arquivo.add(abrir);
		arquivo.setMnemonic('A');
		arquivo.addSeparator();
		arquivo.add(sair);
		
		cores.add(vermelho);
		cores.add(azul);
		
		ajuda.add(sobre);
		
		
		
		//Mostra a janela na tela do computador
		setVisible(true);
	}
}





