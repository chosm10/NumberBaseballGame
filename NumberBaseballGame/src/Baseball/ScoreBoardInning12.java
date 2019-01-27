package Baseball;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class ScoreBoardInning12 extends JPanel{
	public ScoreBoardInning12(){
		setBounds(0, 270, 878, 546);
		setOpaque(false);
		setLayout(null);

		JPanel InningPanel = new JPanel();
		InningPanel.setBackground(Color.WHITE);
		InningPanel.setBounds(0, 0, 60, 546);
		InningPanel.setOpaque(false);
		add(InningPanel);
		InningPanel.setLayout(null);

		JLabel Inning = new JLabel("ȸ");
		Inning.setForeground(Color.WHITE);
		Inning.setFont(new Font("����", Font.BOLD, 15));
		Inning.setBounds(0, 0, 60, 42);
		Inning.setHorizontalAlignment(SwingConstants.CENTER);
		InningPanel.add(Inning);

		JPanel InningNum = new JPanel();
		InningNum.setBounds(0, 42, 60, 504);
		InningNum.setOpaque(false);
		InningPanel.add(InningNum);
		InningNum.setLayout(new GridLayout(12,1));

		JLabel Inning1 = Inning("1ȸ");
		InningNum.add(Inning1);
		JLabel Inning2 = Inning("2ȸ");
		InningNum.add(Inning2);
		JLabel Inning3 = Inning("3ȸ");
		InningNum.add(Inning3);
		JLabel Inning4 = Inning("4ȸ");
		InningNum.add(Inning4);
		JLabel Inning5 = Inning("5ȸ");
		InningNum.add(Inning5);
		JLabel Inning6 = Inning("6ȸ");
		InningNum.add(Inning6);
		JLabel Inning7 = Inning("7ȸ");
		InningNum.add(Inning7);
		JLabel Inning8 = Inning("8ȸ");
		InningNum.add(Inning8);
		JLabel Inning9 = Inning("9ȸ");
		InningNum.add(Inning9);
		JLabel Inning10 = Inning("10ȸ");
		InningNum.add(Inning10);
		JLabel Inning11 = Inning("11ȸ");
		InningNum.add(Inning11);
		JLabel Inning12 = Inning("12ȸ");
		InningNum.add(Inning12);
		
		JLabel background = new JLabel();
		background.setSize(878,546);
		background.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("scoreboardinning12.jpg"))));
		add(background);
	}
	JLabel Inning(String inning){
		JLabel inninglabel = new JLabel(inning);
		inninglabel.setFont(new Font("����", Font.BOLD, 15));
		inninglabel.setForeground(Color.WHITE);
		inninglabel.setHorizontalAlignment(SwingConstants.CENTER);
		inninglabel.setSize(60, 42);
		return inninglabel;
	}
}