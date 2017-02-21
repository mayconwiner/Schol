/*package tercAula;
//Codigo incompleto implementado pelo Prof. Silvano em sala no dia 07/02/2017
//Umca calculadora de IMC unsado JFrame e ActionListner

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class imc extends JFrame implements ActionListener 
{
	JTextField vrCampoPeso, vrCampoAltura;
	JLabel vrResultado;
	Jlabel JButton vrBotao;
	
	
	public imc()
	{
		setSize(400,300);
		setLayout(new FlowLayout());
		setTitle("IMC");
		
		//
		add(new JLbel);
		
		
		setVisible(true);
	}



public void actionPerformed(ActionEvent evento)
{
	try
	{
	int peso = Integer.parseInt(vrCampoPeso.getText());
	float altura = Float.parseFloat(vrCampoAltura.getText());
	float resultado = peso/(altura*altura);
	vrResultado.setText("IMC = " + resultado);
	
	}
	catch (Exception execao)
	{
		JOptionPane.showMessageDialog(this, message);
	}
}
}
*/