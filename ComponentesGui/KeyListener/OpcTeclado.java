package KeyListener;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class OpcTeclado extends JFrame implements KeyListener
{
	
	JLabel txt = null;
	String texto = "";
	
	public OpcTeclado()
	{

	setTitle("ZonaTeclado");
	setSize(500,300);
	setLayout(new GridLayout());
		
	
	
	
	 txt = new JLabel();
	this.addKeyListener(this);
	
	add(txt);
	
	
	
	setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		
	switch (e.getKeyCode())
	{
	
	case KeyEvent.VK_0:
		texto += "0";
		txt.setText(texto);
		break;
	case KeyEvent.VK_1:
		texto += "1";
		txt.setText(texto);
		break;
	case KeyEvent.VK_2:
		texto += "2";
		txt.setText(texto);
		break;
	case KeyEvent.VK_3:
		texto += "3";
		txt.setText(texto);
		break;
	case KeyEvent.VK_4:
		texto += "4";
		txt.setText(texto);
		break;
	case KeyEvent.VK_5:
		texto += "5";
		txt.setText(texto);
		break;
	case KeyEvent.VK_6:
		texto += "6";
		txt.setText(texto);
		break;
	case KeyEvent.VK_7:
		texto += "7";
		txt.setText(texto);
		break;
	case KeyEvent.VK_8:
		texto += "8";
		txt.setText(texto);
		break;
	case KeyEvent.VK_9:
		texto += "9";
		txt.setText(texto);
		break;
	case KeyEvent.VK_M:
		texto += "M";
		txt.setText(texto);
		break;
	case KeyEvent.VK_N:
		texto += "N";
		txt.setText(texto);
		break;
		case KeyEvent.VK_UP:
			txt.setText("Up");
			break;
		case KeyEvent.VK_BACK_SPACE:
			texto = texto.substring(0, texto.length()-1);
			txt.setText(texto);
			break;
		case KeyEvent.VK_ENTER:
			texto += "\b";
			txt.setText(texto);
			break;
		
	
	}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
