package IMC;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IMC extends JFrame 
{
	
	JPanel painel = null;
	JLabel peso = null;
	JTextField campoTx = null;
	public  IMC(){
		//Configuracoes da janela
				setTitle("Primeira janela do sistema");
				setSize(400, 300);
				setLocation(500, 300);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setResizable(false);
				
				//Definindo a estrategia de layout
				setLayout(new BorderLayout());

				peso = new JLabel("Digite seu peso:");
				
				//Cria um campo para a entrada de dados
				campoTx = new JTextField(10);
				campoTx.setToolTipText("Insira o seu nome");
				
				painel = new JPanel();
				painel.setLayout(new FlowLayout());
				
				painel.add(peso);
				//Mostra a janela na tela do computador
				setVisible(true);
	}
}