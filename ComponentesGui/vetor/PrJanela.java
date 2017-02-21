package vetor;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PrJanela extends JFrame implements ActionListener, MouseListener {
	
	
	//Botoes
	JButton soma = null;
	JButton divisao = null;
	JButton igual = null;
	//campo de preenchimento
	JTextField pCampo = null;
	JTextField sCampo = null;
	//Painel para os botoes
	JPanel btBotoes = null;
	JPanel espacoBranco = null;
	JPanel espacoBrancoII = null;
	JLabel resultado = null;
	JLabel mouse = null;
	
	public PrJanela() {
		//Configuracao da Janela
		setTitle("Calculadora");
		setLayout( new GridLayout(0,1));
		setSize(400,500);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Configurações de butoes 
		soma = new JButton("Soma");
		divisao = new JButton ("Divisao");
		igual = new JButton ("Igual");
		
		//Configuração de texto
		pCampo = new JTextField();
		sCampo = new JTextField();
		//Label
		resultado = new JLabel();
		mouse = new JLabel();
		
		//Painel
		btBotoes = new JPanel();
		espacoBranco = new JPanel();
		espacoBrancoII = new JPanel();
		btBotoes.setLayout(new FlowLayout());
		espacoBranco.setLayout(new GridLayout(3,0));
		
		//Area de add atributos na tela principal em GridLayout
		add(pCampo);
		add(sCampo);
		add(btBotoes);
		add(espacoBranco);
		add(espacoBrancoII);
		addMouseListener (this);
		//Area de add atributos de botoes em painel com FlowLayout
		btBotoes.add(soma);
		btBotoes.add(divisao);
		//btBotoes.add(igual);
		espacoBranco.add(resultado);
		espacoBranco.add(mouse);
		//Ouvinte de componentes visuais
		soma.addActionListener(this);
		divisao.addActionListener(this);
		igual.addActionListener(this);
		
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) 
	{
		if (evento.getSource() == soma)
		{
			//definir soma dos pCampo + sCampo
			//imprimir no JOption			
			int tudo = Integer.parseInt(pCampo.getText());
			int tudo2 = (Integer.parseInt(sCampo.getText()));
			int result = (tudo + tudo2);
			resultado.setText("Resultado = " + result);
			//JOptionPane.showMessageDialog(null, "Ressultado: "+result);
		}
		else 
			if (evento.getSource() == divisao)
			{
				int tudo = Integer.parseInt(pCampo.getText());
				int tudo2 = (Integer.parseInt(sCampo.getText()));
				int result = (tudo / tudo2);
				resultado.setText("Resultado = " + result);
				//JOptionPane.showMessageDialog(null, "Ressultado: "+result);
			}
			else
				if (evento.getSource() == igual)
				{
					
				}
	}

	@Override
	public void mouseClicked(MouseEvent eventoM) {
		// TODO Auto-generated method stub
		mouse.setText ("Mouse Clicado " + eventoM.getClickCount());
		
	}

	@Override
	public void mouseEntered(MouseEvent eventoM) {
		// TODO Auto-generated method stub
		mouse.setText("mouse entrou");
	}

	@Override
	public void mouseExited(MouseEvent eventoM) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent eventoM) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent eventoM) {
		// TODO Auto-generated method stub
		
	}
	

}
