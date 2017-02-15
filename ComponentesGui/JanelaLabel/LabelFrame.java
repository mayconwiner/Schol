package JanelaLabel;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelFrame extends JFrame {
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;

	public LabelFrame() {
		super("Testando JLabel");

		setLayout(new FlowLayout()); // configura o layout do frame

		label1 = new JLabel("Label com texto");
		label1.setToolTipText("Isso é uma labe l");
		add(label1);

		// Construtor JLabel com string icon e argumentos de alinhamento
		Icon bug = new ImageIcon(getClass().getResource("bug.png"));
		label2 = new JLabel("Label com texto e icone", bug, SwingConstants.LEFT);
		label2.setToolTipText("esse é o label 2 ");
		add(label2);

		label3 = new JLabel(); // construtor JLabel sem argumentos
		label3.setText("Label com  icone e texto ");
		label3.setIcon(bug);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("isso é o label 3 ");

	}

}
