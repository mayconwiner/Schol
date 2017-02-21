package Projeto31_01;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Imc extends JFrame implements ActionListener, MouseListener, MouseMotionListener
{
	//Declaracao das variaveis de referencia
	private JTextField vrCampoPeso, vrCampoAltura;
	private JLabel vrResultado;
	private JButton vrBotao;
	
	public Imc()
	{
		//Configuracao da janela
		setSize(400,300);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Instancia dos objetos visuais
		vrCampoPeso = new JTextField(5);
		vrCampoAltura = new JTextField(5);
		vrResultado = new JLabel();
		vrBotao = new JButton("Calcular");
		
		//Insercao dos componentes a janela
		add(new JLabel("Digige seu peso: "));
		add(vrCampoPeso);
		add(new JLabel("Digite sua altura"));
		add(vrCampoAltura);
		add(vrBotao);
		add(vrResultado);
		
		//Registrar ao ouvinte
		vrBotao.addActionListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
		//Mostra a janela
		setVisible(true);
	}
	
	//Metodo definido pela interface ActionListener
	public void actionPerformed(ActionEvent evento)
	{
		try
		{
			int peso = Integer.parseInt(vrCampoPeso.getText());
			float altura = Float.parseFloat(vrCampoAltura.getText());
			float resultado = peso  / (altura * altura);
			vrResultado.setText("IMC = " + resultado);
		}
		catch(Exception excecao)
		{
			JOptionPane.showMessageDialog(this, "Verifique os valores de entrada");
			vrCampoPeso.setText("");
			vrCampoAltura.setText("");
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent evento) {
		vrResultado.setText("Mouse clicado ");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		vrResultado.setText("Mouse pressionado");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		vrResultado.setText("Mouse solto");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		vrResultado.setText("Mouse em contato");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		vrResultado.setText("Mouse fora de contato");
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		vrResultado.setText("Mouse Arrastado");
		
	}

	@Override
	public void mouseMoved(MouseEvent evento) {
		vrResultado.setText("Mouse movido " + evento.getX() + " " + evento.getY());
		
	}

}






