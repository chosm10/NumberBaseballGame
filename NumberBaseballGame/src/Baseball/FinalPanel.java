package Baseball;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

class FinalPanel extends JPanel {
	static JPanel buttonpanel;
	public FinalPanel() {
		
		setBounds(189, 272, 500, 400);
		setLayout(null);
		setOpaque(false);
		JPanel background = new JPanel();
		background.setBounds(0, 0, 500, 320);
		add(background);
		background.setOpaque(false);
		background.setLayout(null);
		
		JLabel imgLabel = new JLabel("");
		imgLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("ġ���.png"))));
		imgLabel.setBounds(250, 0, 250, 320);
		background.add(imgLabel);
		JLabel backLabel = new JLabel("");
		backLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("���â2.jpg"))));
		backLabel.setSize(500, 320);
		background.add(backLabel);
		buttonpanel = new JPanel();
		add(buttonpanel);
		buttonpanel.setBounds(0, 320, 500, 80);
		buttonpanel.setLayout(null);
		JLabel buttonback = new JLabel("");
		buttonback.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("���â1.JPG"))));
		buttonback.setBounds(0, 0, 500, 80);
		buttonpanel.add(buttonback);
	}
}