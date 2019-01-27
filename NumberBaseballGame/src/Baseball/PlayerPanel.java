package Baseball;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class PlayerPanel extends JPanel{
	public PlayerPanel(String name){
		if(InningLogic.whatBall==3){
			setBackground(Color.black);
			setBounds(60, 0, 379, 520);
			setLayout(new GridLayout(10,1));
			JLabel PlayerName = new JLabel(name);
			PlayerName.setForeground(Color.WHITE);
			PlayerName.setFont(new Font("����", Font.BOLD, 18));
			PlayerName.setSize(379, 52);
			PlayerName.setHorizontalAlignment(SwingConstants.CENTER);
			add(PlayerName);
		}
		else if(InningLogic.whatBall==4){
			setBackground(Color.black);
			setBounds(60, 0, 361, 546);
			setLayout(new GridLayout(13,1));
			JLabel Player1Name = new JLabel(name);
			Player1Name.setForeground(Color.WHITE);
			Player1Name.setFont(new Font("����", Font.BOLD, 15));
			Player1Name.setSize(360, 42);
			Player1Name.setHorizontalAlignment(SwingConstants.CENTER);
			add(Player1Name);
		}
	}
}