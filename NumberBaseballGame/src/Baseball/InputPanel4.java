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

class InputPanel4 extends JPanel{
	InningPanel4 ip;
	public InputPanel4(){
		setBounds(0, 816, 878, 128);
		setLayout(null);
		setOpaque(false);

		JButton back = makeBackButton("��",KeyEvent.VK_BACK_SPACE); // ���ư ���� 
		JButton enter = makeEnterButton("�Է�",KeyEvent.VK_ENTER); // �Է¹�ư ����
		back.setBounds(146*4, 0, 147, 128);
		enter.setBounds(146*4+147, 0, 147, 128);
		add(back);
		add(enter);

		JLabel background = new JLabel();
		background.setSize(878, 128);
		background.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("�Է±�ball4.jpg"))));
		add(background);
	}
	JButton makeEnterButton(String name, int ke){ // ��ư ���� �̸��� name���� �ް� ke�� ���� keyevent�� �޴´�
		JButton button = new RoundButton(name);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("����", Font.BOLD, 45));
		button.setBackground(Color.BLACK);

		return button;
	}

	JButton makeBackButton(String name, int ke){ // ��ư ���� �̸��� name���� �ް� ke�� ���� keyevent�� �޴´�
		JButton button = new RoundButton(name);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("����", Font.BOLD, 45));
		button.setBackground(Color.BLACK);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(InningLogic.numofPlayer==1){
					if(Single4.inputCount==0);
					else if(Single4.inputCount==1)
					{
						Single4.label1.setIcon(null);
						Single4.inputCount--;
						InningLogic.deleteInputSingle4(InningLogic.player1Input);
					}
					else if(Single4.inputCount==2)
					{
						Single4.label2.setIcon(null);
						Single4.inputCount--;
						InningLogic.deleteInputSingle4(InningLogic.player1Input);
					}
					else if(Single4.inputCount==3){
						Single4.label3.setIcon(null);
						Single4.inputCount--;
						InningLogic.deleteInputSingle4(InningLogic.player1Input);
					}
					else if(Single4.inputCount==4){
						Single4.label4.setIcon(null);
						Single4.inputCount--;
						InningLogic.deleteInputSingle4(InningLogic.player1Input);
					}
				}
				else if(InningLogic.numofPlayer==2){
					if(Both4.inputCount==0);
					else if(Both4.inputCount==1)
					{
						Both4.label1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("�Է�ball4.png"))));
						Both4.inputCount--;
						if(Both4.turnCount%2==0)  // ��ī��Ʈ�� ¦���̸� �÷��̾�1����
							InningLogic.deleteInputBoth4(InningLogic.player1Input);
						else if(Both4.turnCount%2==1)  // ��ī��Ʈ�� Ȧ���̸� �÷��̾�2����
							InningLogic.deleteInputBoth4(InningLogic.player2Input);
					}
					else if(Both4.inputCount==2)
					{
						Both4.label2.setIcon(null);
						Both4.inputCount--;
						if(Both4.turnCount%2==0)  // ��ī��Ʈ�� ¦���̸� �÷��̾�1����
							InningLogic.deleteInputBoth4(InningLogic.player1Input);
						else if(Both4.turnCount%2==1)  // ��ī��Ʈ�� Ȧ���̸� �÷��̾�2����
							InningLogic.deleteInputBoth4(InningLogic.player2Input);
					}
					else if(Both4.inputCount==3){
						Both4.label3.setIcon(null);
						Both4.inputCount--;
						if(Both4.turnCount%2==0)  // ��ī��Ʈ�� ¦���̸� �÷��̾�1����
							InningLogic.deleteInputBoth4(InningLogic.player1Input);
						else if(Both4.turnCount%2==1)  // ��ī��Ʈ�� Ȧ���̸� �÷��̾�2����
							InningLogic.deleteInputBoth4(InningLogic.player2Input);

					}
					else if(Both4.inputCount==4){
						Both4.label4.setIcon(null);
						Both4.inputCount--;
						if(Both4.turnCount%2==0)  // ��ī��Ʈ�� ¦���̸� �÷��̾�1����
							InningLogic.deleteInputBoth4(InningLogic.player1Input);
						else if(Both4.turnCount%2==1)  // ��ī��Ʈ�� Ȧ���̸� �÷��̾�2����
							InningLogic.deleteInputBoth4(InningLogic.player2Input);
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
