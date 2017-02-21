package EditorTexto;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Janela extends JFrame {
	//Barra onde ficara as opçoes de menu
	JMenuBar barraMenu = null;
	//Menu que ficara na barra de menu
	JMenu arquivo = null;
	JMenu editar = null;
	JMenu formatar = null;
	JMenu exibir = null;
	JMenu ajuda = null;
	
	//Item da opção da barra de menu ARQUIVO
	JMenuItem novo = null;
	JMenuItem abrir = null;
	JMenuItem salvar = null;
	JMenuItem salvarComo = null;
	JMenuItem configurarPagina = null;
	JMenuItem imprimir = null;
	JMenuItem sair = null;
	//Item da opção da barra de menu EDITAR
	JMenuItem desfazer = null;
	JMenuItem recortar = null;
	JMenuItem copiar = null;
	JMenuItem colar = null;
	JMenuItem excluir = null;
	//Item da Opção da barra de menu FORMATAR
	JMenuItem quebraAutomatica = null;
	JMenuItem fonte = null;
	//Item da opção da barra de menu EXIBIR
	JMenuItem barraStatus = null;
	//Item da opção da barra de menu AJUDA
	JMenuItem exibirAjuda = null;
	JMenuItem sobre = null;
	//Area de TEXTO
	JTextArea texto = null;
	JScrollPane barraRolagem = null;
	JPanel painel = null;
	
	//Teste panel
	
	
	
	public Janela()
	{
		//configuraação da janela
		setTitle("Bloco de notas");
		setSize (400,300);
		setLocation(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		//Layout da Janela
		setLayout(new BorderLayout());
		//
		painel = new JPanel();
		painel.setLayout(new FlowLayout());
		//Area texto
		texto = new JTextArea(15,20);
		barraRolagem = new JScrollPane(texto);
		//adicionar os componentes a janela
		painel.add(barraRolagem);

		add(painel, BorderLayout.CENTER);
		//vincular barra de menu a janela
		barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		
		//Criar obejetoes do agrupamento do menu
		arquivo = new JMenu("Arquivo");
		editar = new JMenu("Editar");
		formatar = new JMenu("Formatar");
		exibir = new JMenu("Exibir");
		ajuda = new JMenu("Ajuda");
		
		//Adicionar o agrupamento de menu a barra de menu
		barraMenu.add(arquivo);
		barraMenu.add(editar);
		barraMenu.add(formatar);
		barraMenu.add(exibir);
		barraMenu.add(ajuda);
		
		//Item de menu ARQUIVO
		novo = new JMenuItem("Novo");
		abrir = new JMenuItem("Abrir...");
		salvar = new JMenuItem("Salvar");
		salvarComo = new JMenuItem("Salvar Como...");
		configurarPagina = new JMenuItem("Configurar Pagina");
		imprimir = new JMenuItem("Imprimir...");
		sair = new JMenuItem("Sair");
		
		//Add Item no menu ARQUIVO
		arquivo.add(novo);
		arquivo.add(abrir);
		arquivo.add(salvar);
		arquivo.add(salvarComo);
		arquivo.add(configurarPagina);
		arquivo.add(imprimir);
		arquivo.add(sair);
		
		//Item de menu EDITAR
		desfazer = new JMenuItem("Desfazer");
		recortar = new JMenuItem("Recortar");
		copiar = new JMenuItem("Copiar");
		colar = new JMenuItem("Colar");
		excluir = new JMenuItem("Excluir");
		editar.add(desfazer);
		editar.add(recortar);
		editar.add(copiar);
		editar.add(colar);
		editar.add(excluir);
		
		//Item do menu FORMATAR
		quebraAutomatica = new JMenuItem("Quebra Automatica de linha");
		fonte = new JMenuItem("Fonte...");
		formatar.add(quebraAutomatica);
		formatar.add(fonte);
		
		//Item do menu EXIBIR
		barraStatus = new JMenuItem("Barra de Status");
		exibir.add(barraStatus);
		
		//Item do menu AJUDA
		exibirAjuda = new JMenuItem("Exibir Ajuda");
		sobre = new JMenuItem("Sobre o Bloco de Nota");
		ajuda.add(exibirAjuda);
		ajuda.add(sobre);
		
		
		
		//Mostrar tela
		setVisible(true);
		
	}
	

}
