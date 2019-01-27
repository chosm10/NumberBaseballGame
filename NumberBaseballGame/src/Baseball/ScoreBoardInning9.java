package Baseball;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class ScoreBoardInning9 extends JPanel{
	public ScoreBoardInning9(){
		setBounds(0, 270, 878, 520);
		setOpaque(false);
		setLayout(null);

		JPanel InningPanel = new JPanel();
		InningPanel.setBackground(Color.WHITE);
		InningPanel.setBounds(0, 0, 60, 520);
		InningPanel.setOpaque(false);
		add(InningPanel);
		InningPanel.setLayout(null);

		JLabel Inning = new JLabel("ȸ");
		Inning.setForeground(Color.WHITE);
		Inning.setFont(new Font("����", Font.BOLD, 18));
		Inning.setBounds(0, 0, 60, 52);
		Inning.setHorizontalAlignment(SwingConstants.CENTER);
		InningPanel.add(Inning);

		JPanel InningNum = new JPanel();
		InningNum.setBounds(0, 52, 60, 468);
		InningNum.setOpaque(false);
		InningPanel.add(InningNum);
		InningNum.setLayout(null);

		JLabel Inning1 = new JLabel("1ȸ");
		Inning1.setFont(new Font("����", Font.BOLD, 18));
		Inning1.setForeground(Color.WHITE);
		Inning1.setHorizontalAlignment(SwingConstants.CENTER);
		Inning1.setBounds(0, 0, 60, 52);
		Inning1.setOpaque(false);
		InningNum.add(Inning1);

		JLabel Inning2 = new JLabel("2ȸ");
		Inning2.setFont(new Font("����", Font.BOLD, 18));
		Inning2.setForeground(Color.WHITE);
		Inning2.setHorizontalAlignment(SwingConstants.CENTER);
		Inning2.setBounds(0, 52, 60, 52);
		Inning2.setOpaque(false);
		InningNum.add(Inning2);

		JLabel Inning3 = new JLabel("3ȸ");
		Inning3.setFont(new Font("����", Font.BOLD, 18));
		Inning3.setForeground(Color.WHITE);
		Inning3.setHorizontalAlignment(SwingConstants.CENTER);
		Inning3.setBounds(0, 104, 60, 52);
		Inning3.setOpaque(false);
		InningNum.add(Inning3);

		JLabel Inning4 = new JLabel("4ȸ");
		Inning4.setForeground(Color.WHITE);
		Inning4.setFont(new Font("����", Font.BOLD, 18));
		Inning4.setHorizontalAlignment(SwingConstants.CENTER);
		Inning4.setBounds(0, 156, 60, 52);
		Inning4.setOpaque(false);
		InningNum.add(Inning4);

		JLabel Inning5 = new JLabel("5ȸ");
		Inning5.setForeground(Color.WHITE);
		Inning5.setFont(new Font("����", Font.BOLD, 18));
		Inning5.setHorizontalAlignment(SwingConstants.CENTER);
		Inning5.setBounds(0, 208, 60, 52);
		Inning5.setOpaque(false);
		InningNum.add(Inning5);

		JLabel Inning6 = new JLabel("6ȸ");
		Inning6.setFont(new Font("����", Font.BOLD, 18));
		Inning6.setForeground(Color.WHITE);
		Inning6.setHorizontalAlignment(SwingConstants.CENTER);
		Inning6.setBounds(0, 260, 60, 52);
		InningNum.add(Inning6);

		JLabel Inning7 = new JLabel("7ȸ");
		Inning7.setForeground(Color.WHITE);
		Inning7.setFont(new Font("����", Font.BOLD, 18));
		Inning7.setHorizontalAlignment(SwingConstants.CENTER);
		Inning7.setBounds(0, 312, 60, 52);
		InningNum.add(Inning7);

		JLabel Inning8 = new JLabel("8ȸ");
		Inning8.setFont(new Font("����", Font.BOLD, 18));
		Inning8.setForeground(Color.WHITE);
		Inning8.setHorizontalAlignment(SwingConstants.CENTER);
		Inning8.setBounds(0, 364, 60, 52);
		InningNum.add(Inning8);

		JLabel Inning9 = new JLabel("9ȸ");
		Inning9.setForeground(Color.WHITE);
		Inning9.setFont(new Font("����", Font.BOLD, 18));
		Inning9.setHorizontalAlignment(SwingConstants.CENTER);
		Inning9.setBounds(0, 416, 60, 52);
		InningNum.add(Inning9);
		
		JLabel background = new JLabel();
		background.setSize(878,520);
		background.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("scoreboard.jpg"))));
		add(background);
	}
}