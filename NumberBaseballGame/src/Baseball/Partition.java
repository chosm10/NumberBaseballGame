package Baseball;

import java.awt.Color;

import javax.swing.JPanel;

class Partition extends JPanel{
	public Partition(){
		if(InningLogic.whatBall==3){
			setBackground(Color.WHITE);
			setLayout(null);
			setBounds(439, 0, 60, 520);
			setOpaque(false);
		}
		else if(InningLogic.whatBall==4){
			setBackground(Color.WHITE);
			setLayout(null);
			setBounds(420, 0, 98, 546);
			setOpaque(false);
		}
	}
}