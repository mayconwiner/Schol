package anime;
import javax.swing.JFrame;

public class JanelaPonto extends JFrame {
	
	private int largura = 210;
	private int altura = 420;
	Quadro qd;
	
	JanelaPonto ()
	{
		setSize(largura,altura);
		qd = new Quadro();
		add(qd);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("Animação");
		
		
		
				
	}
	
	public void init ()
	{
		qd.init();
	}
	
}
