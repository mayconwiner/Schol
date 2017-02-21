package Janela;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MinhaJanela extends JFrame 
{
	//declara um referecia para o botão
	JButton vrOK = null;
	JPanel vrPainelNorte =null;
	
	public MinhaJanela()
	{
		//Configurações da Janela
		setTitle("Primeira Janela do Sistema");
		setSize(400,200);
		setLocation(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(255,200,255));
		
		
		//definir estrategia de Layout
		setLayout(new BorderLayout());
		
		//Instancia o objeto de botao
		vrOK = new JButton("confirmar");
		vrPainelNorte = new JPanel();
		vrPainelNorte.setLayout(new FlowLayout());
		
		vrPainelNorte.add(new JButton("1"));
		vrPainelNorte.add(new JButton("2"));
		vrPainelNorte.add(new JButton("3"));
		
		//adiciona o componente visual a janela
		
		add(vrPainelNorte, BorderLayout.NORTH);
		add(new JButton("Sul"), BorderLayout.SOUTH);
		add(new JButton("Leste"), BorderLayout.WEST);
		add(new JButton("Oeste"), BorderLayout.EAST);
		add(new JButton("Centro"), BorderLayout.CENTER);
		
		
		
		//Mostrar a Janela na tela do computador
		setVisible(true);
	}
	

}
