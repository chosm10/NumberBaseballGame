package Baseball;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

class InningPanel3 extends JPanel{
	static int count = 0;
	InningPanel3(){
		setSize(360,45);
		setLayout(null);
		setOpaque(false);
		if(InningLogic.numofPlayer==1){
			add(NumLabel(InningLogic.player1Input.elementAt(0)));
			add(NumLabel(InningLogic.player1Input.elementAt(1)));
			add(NumLabel(InningLogic.player1Input.elementAt(2)));
			count = 0;
		}
		else if(InningLogic.numofPlayer==2){
			if(Both3.turnCount % 2 == 0){
				add(NumLabel(InningLogic.player1Input.elementAt(0)));
				add(NumLabel(InningLogic.player1Input.elementAt(1)));
				add(NumLabel(InningLogic.player1Input.elementAt(2)));
				count = 0;
			}
			else if(Both3.turnCount % 2 == 1){
				add(NumLabel(InningLogic.player2Input.elementAt(0)));
				add(NumLabel(InningLogic.player2Input.elementAt(1)));
				add(NumLabel(InningLogic.player2Input.elementAt(2)));
				count = 0;
			}
		}
		ballcount();
	}
	private void ballcount(){
		String s = null;
		if(InningLogic.numofPlayer==1){
			s = InningLogic.singleCompareNum3(InningLogic.player1Input.elementAt(0), InningLogic.player1Input.elementAt(1), InningLogic.player1Input.elementAt(2));
		}
		else if(InningLogic.numofPlayer==2){
			if(Both3.turnCount % 2 == 0)
				s = InningLogic.compareNum2(InningLogic.player1Input.elementAt(0), InningLogic.player1Input.elementAt(1), InningLogic.player1Input.elementAt(2));
			else if(Both3.turnCount % 2 == 1)
				s = InningLogic.compareNum1(InningLogic.player2Input.elementAt(0), InningLogic.player2Input.elementAt(1), InningLogic.player2Input.elementAt(2));
		}
		JLabel ball = new JLabel();
		ball.setBounds(150,0,210,45);
		add(ball);
		if(s.equals("0S0B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("0s0b.jpg"))));
		else if(s.equals("0S1B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("0s1b.jpg"))));
		else if(s.equals("0S2B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("0s2b.jpg"))));
		else if(s.equals("0S3B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("0s3b.jpg"))));
		else if(s.equals("1S0B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("1s0b.jpg"))));
		else if(s.equals("1S1B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("1s1b.jpg"))));
		else if(s.equals("1S2B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("1s2b.jpg"))));
		else if(s.equals("2S0B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("2s0b.jpg"))));
		else if(s.equals("2S1B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("2s1b.jpg"))));
		else if(s.equals("3S0B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("3s0b.jpg"))));
	}
	JLabel NumLabel(int number){
		JLabel num = new JLabel();
		String imgName = ".jpg";
		imgName = number + imgName;
		num.setBounds(45*count,0,45,45);
		num.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource(imgName))));
		count++;
		return num;
	}
}