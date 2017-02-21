package anime;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Quadro extends JPanel implements KeyListener  {
	
	//posição x,y do canto esquerdo superior da imagem
	private int X;
	private int Y;
	//tamanho do quadro
	private int larguraMax, alturaMax;
	//tamano da imagem
	private int alturaImagem = 21;
	private int larguraImagem = 21;
	
	Image img;
	public Quadro()
	{
		X = 0;
		Y = 0;
		//img = Toolkit.getDefaultToolkit().getImage("//C:/Users/Narotkd/workspace/PrejetoPontoAnimaco/src/Ponto.jpg");
		img = Toolkit.getDefaultToolkit().getImage("Ponto.jpg");
		
		setFocusable(true);
		requestFocusInWindow();
		
	}
	
	//Desenhar a Imgem Ponto.jpg no Jpanel
	public void paintComponent (Graphics g){
		super.paintComponent(g);
		g.drawImage(img, X, Y, this);
		
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
	
		switch (arg0.getKeyCode())
		{
		case KeyEvent.VK_UP:
			if (this.Y > 0) {
				this.Y --;
				repaint();
			}
			break;
		case KeyEvent.VK_DOWN:
			if (this.Y < this.alturaMax){
			this.Y ++;
			repaint();
			}
			break;
			case KeyEvent.VK_LEFT:
				if (this.X > 0) {
					this.X --;
					repaint();
				}
				break;
			case KeyEvent.VK_RIGHT:
				if (this.X < this.larguraMax)
				{
					this.X++;
					repaint();
				}
				break;
				}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void init()
	{
		addKeyListener(this);
		JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);
		Dimension dimParentFrame = parent.getContentPane().getSize();
		alturaMax = (int) dimParentFrame.getHeight() - alturaImagem;
		larguraMax = (int) dimParentFrame.getWidth() - larguraImagem;
		
	}

}
