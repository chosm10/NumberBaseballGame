package Baseball;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

class InputPanel3 extends JPanel{
	InningPanel3 ip;
	ImagePanel imgp;
	static int numcounter = 0;
	public InputPanel3(){
		setBackground(Color.gray);
		setBounds(0, 790, 878, 154);
		setLayout(null);
		setOpaque(false);

		JButton back = makeBackButton("��",KeyEvent.VK_BACK_SPACE); // ���ư ���� 
		JButton enter = makeEnterButton("�Է�",KeyEvent.VK_ENTER); // �Է¹�ư ����
		back.setBounds(175*3, 0, 175, 154);
		enter.setBounds(175*4, 0, 175, 154);
		add(back);
		add(enter);

		JLabel background = new JLabel();
		background.setSize(878, 154);
		background.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("�Է±�.jpg"))));
		add(background);
	}
	JButton makeEnterButton(String name, int ke){ // ��ư ���� �̸��� name���� �ް� ke�� ���� keyevent�� �޴´�
		JButton button = new RoundButton(name);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("����", Font.BOLD, 50));
		button.setBackground(Color.BLACK);

		return button;
	}

	JButton makeBackButton(String name, int ke){ // ��ư ���� �̸��� name���� �ް� ke�� ���� keyevent�� �޴´�
		JButton button = new RoundButton(name);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("����", Font.BOLD, 50));
		button.setBackground(Color.BLACK);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(InningLogic.numofPlayer==1){
					if(Single3.inputCount==0);
					else if(Single3.inputCount==1)
					{
						Single3.label1.setIcon(null);
						Single3.inputCount--;
						InningLogic.deleteInputSingle3(InningLogic.player1Input);
					}
					else if(Single3.inputCount==2)
					{
						Single3.label2.setIcon(null);
						Single3.inputCount--;
						InningLogic.deleteInputSingle3(InningLogic.player1Input);
					}
					else if(Single3.inputCount==3){
						Single3.label3.setIcon(null);
						Single3.inputCount--;
						InningLogic.deleteInputSingle3(InningLogic.player1Input);
					}
				}
				else if(InningLogic.numofPlayer==2){
					if(Both3.inputCount==0);
					else if(Both3.inputCount==1)
					{
						Both3.label1.setIcon(null);
						Both3.inputCount--;
						if(Both3.turnCount%2==0)  // ��ī��Ʈ�� ¦���̸� �÷��̾�1����
							InningLogic.deleteInputBoth3(InningLogic.player1Input);
						else if(Both3.turnCount%2==1)  // ��ī��Ʈ�� Ȧ���̸� �÷��̾�2����
							InningLogic.deleteInputBoth3(InningLogic.player2Input);
					}
					else if(Both3.inputCount==2)
					{
						Both3.label2.setIcon(null);
						Both3.inputCount--;
						if(Both3.turnCount%2==0)  // ��ī��Ʈ�� ¦���̸� �÷��̾�1����
							InningLogic.deleteInputBoth3(InningLogic.player1Input);
						else if(Both3.turnCount%2==1)  // ��ī��Ʈ�� Ȧ���̸� �÷��̾�2����
							InningLogic.deleteInputBoth3(InningLogic.player2Input);
					}
					else if(Both3.inputCount==3){
						Both3.label3.setIcon(null);
						Both3.inputCount--;
						if(Both3.turnCount%2==0)  // ��ī��Ʈ�� ¦���̸� �÷��̾�1����
							InningLogic.deleteInputBoth3(InningLogic.player1Input);
						else if(Both3.turnCount%2==1)  // ��ī��Ʈ�� Ȧ���̸� �÷��̾�2����
							InningLogic.deleteInputBoth3(InningLogic.player2Input);
					}
				}
			}
		});

		InputMap im = button.getInputMap(WHEN_IN_FOCUSED_WINDOW);
		ActionMap am = button.getActionMap();

		im.put(KeyStroke.getKeyStroke(ke, 0), "click");
		am.put("click", new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				btn.doClick();
			}
		});
		return button;
	}
}