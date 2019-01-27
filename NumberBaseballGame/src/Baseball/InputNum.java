package Baseball;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.Action;
import javax.swing.border.LineBorder;

public class InputNum extends JPanel {
	int count=0;
	private JTextField textField;
	private JTextField textField_1;
	public InputNum() {
		setSize(878,944);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 878, 944);
		add(panel);
		panel.setLayout(null);
		JLabel Player1Image = new JLabel("");
		Player1Image.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Player1�����Է���.JPG"))));
		Player1Image.setBounds(174, 172, 500, 600);
		panel.add(Player1Image);

		JLabel Background = new JLabel("");
		Background.setBounds(0, 0, 878, 944);
		panel.add(Background);
		Background.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("�߱���.jpg"))));

		JPanel ButtonPanel = new JPanel();
		ButtonPanel.setBounds(0, 0, 878, 944);
		panel.add(ButtonPanel);
		ButtonPanel.setLayout(null);

		JButton button0 = new JButton("");
		button0.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("00.jpg"))));
		button0.setBounds(225, 408, 69, 74);
		ButtonPanel.add(button0);
		button0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//�׼� ������ ������
				if (e.getSource() == button0)
				{
					if(InningLogic.player1.contains(0));
					else{	
						InningLogic.setSecret1(0);
						count++;

						if(count == InningLogic.whatBall){

							JButton okAfter = new JButton("");
							okAfter.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Ȯ�� ��.JPG"))));
							okAfter.setBounds(213, 657, 421, 68);
							ButtonPanel.add(okAfter);
							okAfter.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e)
								{
									//�׼� ������ ������
									if (e.getSource() == okAfter)
									{
										setEnabled(false);
										setVisible(false);
										InputNum_2 in = new InputNum_2();
										GFrame.con.add(in);
										in.setEnabled(true);
										in.setVisible(true);
									}
								}});
						}
					}
				}
			}});

		JButton button1 = new JButton("");
		button1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("11.JPG"))));
		button1.setBounds(306, 408, 69, 74);
		ButtonPanel.add(button1);
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//�׼� ������ ������
				if (e.getSource() == button1)
				{
					if(InningLogic.player1.contains(1));
					else{	
						InningLogic.setSecret1(1);
						count++;

						if(count == InningLogic.whatBall){

							JButton okAfter = new JButton("");
							okAfter.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Ȯ�� ��.JPG"))));
							okAfter.setBounds(213, 657, 421, 68);
							ButtonPanel.add(okAfter);
							okAfter.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e)
								{
									//�׼� ������ ������
									if (e.getSource() == okAfter)
									{
										setEnabled(false);
										setVisible(false);
										InputNum_2 in = new InputNum_2();
										GFrame.con.add(in);
										in.setEnabled(true);
										in.setVisible(true);
									}
								}});
						}
					}
				}
			}});
		JButton button2 = new JButton("");
		button2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("22.JPG"))));
		button2.setBounds(387, 408, 69, 74);
		ButtonPanel.add(button2);
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//�׼� ������ ������
				if (e.getSource() == button2)
				{
					if(InningLogic.player1.contains(2));
					else{	
						InningLogic.setSecret1(2);
						count++;

						if(count == InningLogic.whatBall){

							JButton okAfter = new JButton("");
							okAfter.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Ȯ�� ��.JPG"))));
							okAfter.setBounds(213, 657, 421, 68);
							ButtonPanel.add(okAfter);
							okAfter.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e)
								{
									if (e.getSource() == okAfter)
									{
										setEnabled(false);
										setVisible(false);
										InputNum_2 in = new InputNum_2();
										GFrame.con.add(in);
										in.setEnabled(true);
										in.setVisible(true);
									}
								}});
						}
					}
				}
			}});
		JButton button3 = new JButton("");
		button3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("33.JPG"))));
		button3.setBounds(468, 408, 69, 74);
		ButtonPanel.add(button3);
		button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//�׼� ������ ������
				if (e.getSource() == button3)
				{
					if(InningLogic.player1.contains(3));
					else{	
						InningLogic.setSecret1(3);
						count++;

						if(count == InningLogic.whatBall){

							JButton okAfter = new JButton("");
							okAfter.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Ȯ�� ��.JPG"))));
							okAfter.setBounds(213, 657, 421, 68);
							ButtonPanel.add(okAfter);
							okAfter.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e)
								{
									if (e.getSource() == okAfter)
									{
										setEnabled(false);
										setVisible(false);
										InputNum_2 in = new InputNum_2();
										GFrame.con.add(in);
										in.setEnabled(true);
										in.setVisible(true);
									}
								}});
						}
					}
				}
			}});

		JButton button4 = new JButton("");
		button4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("44.JPG"))));
		button4.setBounds(549, 408, 69, 74);
		ButtonPanel.add(button4);
		button4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//�׼� ������ ������
				if (e.getSource() == button4)
				{
					if(InningLogic.player1.contains(4));
					else{	
						InningLogic.setSecret1(4);
						count++;

						if(count == InningLogic.whatBall){

							JButton okAfter = new JButton("");
							okAfter.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Ȯ�� ��.JPG"))));
							okAfter.setBounds(213, 657, 421, 68);
							ButtonPanel.add(okAfter);
							okAfter.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e)
								{
									if (e.getSource() == okAfter)
									{
										setEnabled(false);
										setVisible(false);
										InputNum_2 in = new InputNum_2();
										GFrame.con.add(in);
										in.setEnabled(true);
										in.setVisible(true);
									}
								}});
						}
					}
				}
			}});

		JButton button5 = new JButton("");
		button5.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("55.JPG"))));
		button5.setBounds(225, 520, 69, 74);
		ButtonPanel.add(button5);
		button5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//�׼� ������ ������
				if (e.getSource() == button5)
				{
					if(InningLogic.player1.contains(5));
					else{	
						InningLogic.setSecret1(5);
						count++;

						if(count == InningLogic.whatBall){

							JButton okAfter = new JButton("");
							okAfter.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Ȯ�� ��.JPG"))));
							okAfter.setBounds(213, 657, 421, 68);
							ButtonPanel.add(okAfter);
							okAfter.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e)
								{
									if (e.getSource() == okAfter)
									{
										setEnabled(false);
										setVisible(false);
										InputNum_2 in = new InputNum_2();
										GFrame.con.add(in);
										in.setEnabled(true);
										in.setVisible(true);
									}
								}});
						}
					}
				}
			}});
		JButton button6 = new JButton("");
		button6.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("66.JPG"))));
		button6.setBounds(306, 520, 69, 74);
		ButtonPanel.add(button6);
		button6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//�׼� ������ ������
				if (e.getSource() == button6)
				{
					if(InningLogic.player1.contains(6));
					else{	
						InningLogic.setSecret1(6);
						count++;

						if(count == InningLogic.whatBall){

							JButton okAfter = new JButton("");
							okAfter.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Ȯ�� ��.JPG"))));
							okAfter.setBounds(213, 657, 421, 68);
							ButtonPanel.add(okAfter);
							okAfter.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e)
								{
									if (e.getSource() == okAfter)
									{
										setEnabled(false);
										setVisible(false);
										InputNum_2 in = new InputNum_2();
										GFrame.con.add(in);
										in.setEnabled(true);
										in.setVisible(true);
									}
								}});
						}
					}
				}
			}});
		JButton button7 = new JButton("");
		button7.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("77.JPG"))));
		button7.setBounds(387, 520, 69, 74);
		ButtonPanel.add(button7);
		button7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//�׼� ������ ������
				if (e.getSource() == button7)
				{
					if(InningLogic.player1.contains(7));
					else{	
						InningLogic.setSecret1(7);
						count++;

						if(count == InningLogic.whatBall){

							JButton okAfter = new JButton("");
							okAfter.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Ȯ�� ��.JPG"))));
							okAfter.setBounds(213, 657, 421, 68);
							ButtonPanel.add(okAfter);
							okAfter.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e)
								{
									if (e.getSource() == okAfter)
									{
										setEnabled(false);
										setVisible(false);
										InputNum_2 in = new InputNum_2();
										GFrame.con.add(in);
										in.setEnabled(true);
										in.setVisible(true);
									}
								}});
						}
					}
				}
			}});
		JButton button8 = new JButton("");
		button8.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("88.JPG"))));
		button8.setBounds(468, 520, 69, 74);
		ButtonPanel.add(button8);
		button8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//�׼� ������ ������
				if (e.getSource() == button8)
				{
					if(InningLogic.player1.contains(8));
					else{	
						InningLogic.setSecret1(8);
						count++;

						if(count == InningLogic.whatBall){

							JButton okAfter = new JButton("");
							okAfter.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Ȯ�� ��.JPG"))));
							okAfter.setBounds(213, 657, 421, 68);
							ButtonPanel.add(okAfter);
							okAfter.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e)
								{
									if (e.getSource() == okAfter)
									{
										setEnabled(false);
										setVisible(false);
										InputNum_2 in = new InputNum_2();
										GFrame.con.add(in);
										in.setEnabled(true);
										in.setVisible(true);
									}
								}});
						}
					}
				}
			}});
		JButton button9 = new JButton("");
		button9.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("99.JPG"))));
		button9.setBounds(549, 520, 69, 74);
		ButtonPanel.add(button9);
		button9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//�׼� ������ ������
				if (e.getSource() == button9)
				{
					if(InningLogic.player1.contains(9));
					else{	
						InningLogic.setSecret1(9);
						count++;

						if(count == InningLogic.whatBall){

							JButton okAfter = new JButton("");
							okAfter.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Ȯ�� ��.JPG"))));
							okAfter.setBounds(213, 657, 421, 68);
							ButtonPanel.add(okAfter);
							okAfter.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e)
								{
									if (e.getSource() == okAfter)
									{
										setEnabled(false);
										setVisible(false);
										InputNum_2 in = new InputNum_2();
										GFrame.con.add(in);
										in.setEnabled(true);
										in.setVisible(true);
									}
								}});
						}
					}
				}
			}});
	}
}

