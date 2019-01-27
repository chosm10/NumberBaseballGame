package Baseball;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class TurnPanel extends JPanel{
	static JLabel Turn;
	public TurnPanel(){
		setBackground(Color.gray);
		setBounds(0, 230, 878, 40);
		setLayout(null);
		String s = null;
		if(InningLogic.whatBall == 3){
			if(InningLogic.numofPlayer == 1)
				s = "Player";
			else{
				if(Both3.turnCount % 2 == 0)
					s = "Player1";
				else if(Both3.turnCount %2 == 1)
					s = "Player2";
			}
		}
		else{
			if(InningLogic.numofPlayer == 1)
				s = "Player";
			else{
				if(Both4.turnCount % 2 == 0)
					s = "Player1";
				else if(Both4.turnCount %2 == 1)
					s = "Player2";
			}
		}
		Turn = new JLabel(s+" winds up");
		Turn.setFont(new Font("����", Font.BOLD, 30));
		Turn.setForeground(Color.white);
		Turn.setHorizontalAlignment(SwingConstants.CENTER);
		Turn.setBounds(0, 0, 878, 40);
		add(Turn);		
	}
}