package Baseball;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

class InningPanel4 extends JPanel{
	static int count = 0;
	InningPanel4(){
		setSize(360,42);
		setLayout(null);
		setOpaque(false);
		if(InningLogic.numofPlayer==1){
			add(NumLabel(InningLogic.player1Input.elementAt(0)));
			add(NumLabel(InningLogic.player1Input.elementAt(1)));
			add(NumLabel(InningLogic.player1Input.elementAt(2)));
			add(NumLabel(InningLogic.player1Input.elementAt(3)));
			count = 0;
		}
		else if(InningLogic.numofPlayer==2){
			if(Both4.turnCount % 2 == 0){
				add(NumLabel(InningLogic.player1Input.elementAt(0)));
				add(NumLabel(InningLogic.player1Input.elementAt(1)));
				add(NumLabel(InningLogic.player1Input.elementAt(2)));
				add(NumLabel(InningLogic.player1Input.elementAt(3)));
				count = 0;
			}
			else if(Both4.turnCount % 2 == 1){
				add(NumLabel(InningLogic.player2Input.elementAt(0)));
				add(NumLabel(InningLogic.player2Input.elementAt(1)));
				add(NumLabel(InningLogic.player2Input.elementAt(2)));
				add(NumLabel(InningLogic.player2Input.elementAt(3)));
				count = 0;
			}
		}
		ballcount();
	}
	private void ballcount(){
		String s = null;
		if(InningLogic.numofPlayer==1){
			s = InningLogic.singleCompareNum4(InningLogic.player1Input.elementAt(0), InningLogic.player1Input.elementAt(1), InningLogic.player1Input.elementAt(2),InningLogic.player1Input.elementAt(3));
		}
		else if(InningLogic.numofPlayer==2){
			if(Both4.turnCount % 2 == 0)
				s = InningLogic.compareNum2_4(InningLogic.player1Input.elementAt(0), InningLogic.player1Input.elementAt(1), InningLogic.player1Input.elementAt(2),InningLogic.player1Input.elementAt(3));
			else if(Both4.turnCount % 2 == 1)
				s = InningLogic.compareNum1_4(InningLogic.player2Input.elementAt(0), InningLogic.player2Input.elementAt(1), InningLogic.player2Input.elementAt(2),InningLogic.player2Input.elementAt(3));
		}
		JLabel ball = new JLabel();
		ball.setBounds(180,0,180,42);
		add(ball);
		if(s.equals("0S0B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("0s0bball4.jpg"))));
		else if(s.equals("0S1B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("0s1bball4.jpg"))));
		else if(s.equals("0S2B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("0s2bball4.jpg"))));
		else if(s.equals("0S3B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("0s3bball4.jpg"))));
		else if(s.equals("0S4B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("0s4bball4.jpg"))));
		else if(s.equals("1S0B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("1s0bball4.jpg"))));
		else if(s.equals("1S1B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("1s1bball4.jpg"))));
		else if(s.equals("1S2B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("1s2bball4.jpg"))));
		else if(s.equals("1S3B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("1s3bball4.jpg"))));
		else if(s.equals("2S0B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("2s0bball4.jpg"))));
		else if(s.equals("2S1B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("2s1bball4.jpg"))));
		else if(s.equals("2S2B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("2s2bball4.jpg"))));
		else if(s.equals("3S0B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("3s0bball4.jpg"))));
		else if(s.equals("4S0B"))
			ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("4s0bball4.jpg"))));
	}
	JLabel NumLabel(int number){
		JLabel num = new JLabel();
		String imgName = "ball4.jpg";
		imgName = number + imgName;
		num.setBounds(45*count,0,45,42);
		num.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource(imgName))));
		count++;
		return num;
	}
}