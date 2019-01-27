package Baseball;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
/** 
 * */
class ImagePanel extends JPanel{
	static JLabel pitcher;
	static JLabel ball;
	public ImagePanel(){
		setSize(878,230);
		setLayout(null);
		pitcher = new JLabel();
		pitcher.setBounds(394,25,180,180);
		pitcher.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("����2.png"))));
		ball = new JLabel();
		ball.setBounds(404, 79, 71, 71);
		ball.setOpaque(false);
		add(ball);
		add(pitcher);
		JLabel background = new JLabel();
		background.setSize(878,230);
		background.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("mound.jpg"))));
		add(background);
	}
}