package Baseball;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.swing.border.*;
/** ���Ӹ�� 1�� 4�� ��� ȭ���� �г�Ŭ���� Single4
 * PausePanel, Main, InputNum, InningPanel3, Partition�� ����
 * Sound ȿ���� ���� ���� URL, AudioClip�� ����
 * */
public class Single4 extends JPanel {
	PausePanel pf;
	Main main;
	InputNum ipt;
	InningPanel4 ip;
	static int turnCount=0;
	static FinalPanel fp;
	static PlayerPanel p1;
	static JLabel label1;
	static JLabel label2;
	static JLabel label3;
	static JLabel label4;
	static int inputCount=0;
	URL url;
	URL url2;
	URL url3;
	AudioClip audioClip;
	AudioClip audioClip2;
	AudioClip audioClip3;
	/** Single4 �г��� ũ��� ���̾ƿ� ���� �� ������Ʈ ���� �����ϴ� ������()
	 * �г� ũ�� 878*944�� ����, ���̾ƿ� ����, playerpanel, 
	 *pausepanel, finalpanel, inputpanel, inningpanel ���� �����Ѵ�. 
	 */
	public Single4() {
		setSize(878,944);
		setLayout(null);
		p1 = new PlayerPanel("Player");
		pf = new PausePanel();
		fp = new FinalPanel();
		add(pf);
		pf.setVisible(false);
		pf.setEnabled(false);
		add(fp);
		fp.setVisible(false);
		fp.setEnabled(false);
		try {
			main = new Main();
			main.clip.stop();

		} catch (UnsupportedAudioFileException e) {
		} catch (IOException e) {
		} catch (LineUnavailableException e) {
		}
		try {
			url = new URL("file:Playball.wav");   // ���� ȿ��
			url2 = new URL("file:Playball2.wav");
			url3 = new URL("file:pitchingsound.wav");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		JButton homebutton = new JButton("Ȩ����");
		homebutton.setBounds(50, 20, 110, 40);
		homebutton.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Ȩ����.png"))));
		fp.buttonpanel.add(homebutton);
		fp.buttonpanel.setComponentZOrder(homebutton, 0);
		homebutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				InningLogic.player1.clear();
				InningLogic.player2.clear();
				try {
					main = new Main();
				} catch (UnsupportedAudioFileException e1) {
				} catch (IOException e1) {
				} catch (LineUnavailableException e1) {
				}
				GFrame.con.add(main);
				main.setVisible(true);
				main.setEnabled(true);
				pf.setVisible(false);
				pf.setEnabled(false);
				setVisible(false);
				setEnabled(false);
				audioClip.stop();
				audioClip2.stop();
				audioClip3.stop();
			}
		});

		JButton rebutton = new JButton("�ٽ��ϱ�");
		rebutton.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("�ٽ��ϱ�.png"))));
		rebutton.setBounds(200, 20, 110, 40);
		fp.buttonpanel.add(rebutton);
		
		fp.buttonpanel.setComponentZOrder(rebutton, 0);
		rebutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				InningLogic.randomVector.clear();
				Single4 sing4 = new Single4();
				InningLogic.setRandomVector();
				GFrame.con.add(sing4);
				sing4.setVisible(true);
				sing4.setEnabled(true);
				pf.setVisible(false);
				pf.setEnabled(false);
				setVisible(false);
				setEnabled(false);
				audioClip.stop();
				audioClip2.stop();
				audioClip3.stop();
			}
		});

		JButton endbutton = new JButton("��������");
		endbutton.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("��������.png"))));
		endbutton.setBounds(350, 20, 110, 40);
		fp.buttonpanel.add(endbutton);
		fp.buttonpanel.setComponentZOrder(endbutton, 0);
		endbutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(161, 51, 101, 91);
		pf.add(panel_2);
		panel_2.setLayout(null);

		JButton button2 = new JButton("�ٽ��ϱ�");
		button2.setFont(new Font("�޸յձ�������", Font.PLAIN, 15));
		button2.setBackground(Color.ORANGE);
		button2.setBounds(0, 0, 101, 91);
		panel_2.add(button2);
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				InningLogic.randomVector.clear();
				InningLogic.setRandomVector();
				Single4 sing4 = new Single4();
				GFrame.con.add(sing4);
				sing4.setVisible(true);
				sing4.setEnabled(true);
				pf.setVisible(false);
				pf.setEnabled(false);
				setVisible(false);
				setEnabled(false);
			}
		});

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(86, 10, 254, 31);
		pf.add(panel_4);
		panel_4.setLayout(null);

		JLabel pause = new JLabel("��������");
		pause.setForeground(Color.black);
		pause.setFont(new Font("�޸յձ�������", Font.PLAIN, 20));
		pause.setBounds(0,0, 250, 30);
		pause.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(pause);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(31, 51, 101, 91);
		pf.add(panel_1);
		panel_1.setLayout(null);

		JButton button1 = new JButton("Ȩ����");        //Ȩ���� ��ư
		button1.setFont(new Font("�޸յձ�������", Font.PLAIN, 15));
		button1.setBackground(Color.ORANGE);
		button1.setBounds(0, 0, 101, 91);
		panel_1.add(button1);
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				InningLogic.randomVector.clear();
				InningLogic.setRandomVector();
				try {
					main = new Main();
				} catch (UnsupportedAudioFileException e1) {
				} catch (IOException e1) {
				} catch (LineUnavailableException e1) {
				}
				GFrame.con.add(main);
				main.setVisible(true);
				main.setEnabled(true);
				pf.setVisible(false);
				pf.setEnabled(false);
				setVisible(false);
				setEnabled(false);
			}
		});

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(293, 51, 101, 91);
		pf.add(panel_5);
		panel_5.setLayout(null);

		JButton button3 = new JButton("���ư���");    //���ư��� ��ư
		button3.setFont(new Font("�޸յձ�������", Font.PLAIN, 15));
		button3.setBackground(Color.ORANGE);
		button3.setBounds(0, 0, 101, 91);
		panel_5.add(button3);
		button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				pf.setVisible(false);
				pf.setEnabled(false);
			}
		});

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(86, 182, 254, 31);
		pf.add(panel_3);
		panel_3.setLayout(null);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Sound Check Box");
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBackground(Color.ORANGE);
		chckbxNewCheckBox.setFont(new Font("�޸յձ�������", Font.PLAIN, 20));
		chckbxNewCheckBox.setBounds(0, 0, 254, 31);
		panel_3.add(chckbxNewCheckBox);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("�Ͻ��������.jpg"))));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setSize(450, 266);
		pf.add(lblNewLabel);


		JButton numberbutton0 = Numberbutton("Number0",KeyEvent.VK_0);
		numberbutton0.setBounds(753, 0, 125, 29);
		add(numberbutton0);

		JButton numberbutton1 = Numberbutton("Number1",KeyEvent.VK_1);
		numberbutton1.setBounds(753, 0, 125, 29);
		add(numberbutton1);

		JButton numberbutton2 = Numberbutton("Number2",KeyEvent.VK_2);
		numberbutton2.setBounds(753, 0, 125, 29);
		add(numberbutton2);

		JButton numberbutton3 = Numberbutton("Number3",KeyEvent.VK_3);
		numberbutton3.setBounds(753, 0, 125, 29);
		add(numberbutton3);

		JButton numberbutton4 = Numberbutton("Number4",KeyEvent.VK_4);
		numberbutton4.setBounds(753, 0, 125, 29);
		add(numberbutton4);

		JButton numberbutton5 = Numberbutton("Number5",KeyEvent.VK_5);
		numberbutton5.setBounds(753, 0, 125, 29);
		add(numberbutton5);

		JButton numberbutton6 = Numberbutton("Number6",KeyEvent.VK_6);
		numberbutton6.setBounds(753, 0, 125, 29);
		add(numberbutton6);

		JButton numberbutton7 = Numberbutton("Number7",KeyEvent.VK_7);
		numberbutton7.setBounds(753, 0, 125, 29);
		add(numberbutton7);

		JButton numberbutton8 = Numberbutton("Number8",KeyEvent.VK_8);
		numberbutton8.setBounds(753, 0, 125, 29);
		add(numberbutton8);

		JButton numberbutton9 = Numberbutton("Number9",KeyEvent.VK_9);
		numberbutton8.setBounds(753, 0, 125, 29);
		add(numberbutton9);

		JPanel PlayPanel = new JPanel();
		PlayPanel.setBounds(0, 0, 878, 944);
		add(PlayPanel);
		PlayPanel.setLayout(null);
		
		JButton pausebutton = pausebutton("Pause", KeyEvent.VK_ESCAPE);
		pausebutton.setBounds(753, 0, 125, 29);
		add(pausebutton);
		
		JButton enter = makeEnterButton("enter", KeyEvent.VK_ENTER);
		enter.setBounds(753, 0, 125, 20);
		add(enter);
		
		label1 = new JLabel("");
		label1.setBounds(0, 816, 146, 128);
		PlayPanel.add(label1);
		label1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("�Է�ball4.png"))));

		label2 = new JLabel("");
		label2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("�Է�ball4.png"))));
		label2.setBounds(146, 816, 146, 128);
		PlayPanel.add(label2);

		label3 = new JLabel("");
		label3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("�Է�ball4.png"))));
		label3.setBounds(146*2, 816, 146, 128);
		PlayPanel.add(label3);
		
		label4 = new JLabel("");
		label4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("�Է�ball4.png"))));
		label4.setBounds(146*3, 816, 146, 128);
		PlayPanel.add(label4);

		InputPanel4 inputpanel = new InputPanel4();
		PlayPanel.add(inputpanel);

		TurnPanel turnpanel = new TurnPanel();
		PlayPanel.add(turnpanel);

		
		ScoreBoardInning12 scoreboard = new ScoreBoardInning12();
		PlayPanel.add(scoreboard);
		scoreboard.add(p1);
		scoreboard.setComponentZOrder(p1, 0);
				
		ImagePanel img = new ImagePanel();
		PlayPanel.add(img);
		
		JLabel Background = new JLabel("New label");
		Background.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("�߱���2.jpg"))));
		Background.setBounds(0, 0, 878, 944);
		PlayPanel.add(Background);
	}
	/**�Ͻ����� ����� �����ϱ� ���� ���� ��ư
	 * @return JButton
	 * @param String name ��ư �̸�
	 * @param int ke keyevent�� ������ key 
	 * keyevent�� ������ key�� ���� �� �Ͻ����� �г��� �˾��ȴ�. �гο��� Ű�� �����ϴ� ���̹Ƿ� �� �������� ��帶�� ��������ִ�.
	 * */
	JButton pausebutton(String name, int ke){ // ��ư ���� �̸��� name���� �ް� ke�� ���� keyevent�� �޴´�
		JButton button = new JButton(name);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("����", Font.BOLD, 50));
		button.setBackground(Color.BLACK);
		button.setOpaque(false);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pf.setVisible(true);
				pf.setEnabled(true); 
				pf.setFocusable(true);
				audioClip.stop();
				audioClip2.stop();
				audioClip3.stop();
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
	/**���� ��ư�� �����ϱ� ���� ���� ��ư
	 * @param String name
	 * @param int ke
	 * @return JButton
	 * audioClip�� ���ؼ� �Ҹ��� ���� �Ѵ�.
	 * ���� ��ư�� ���� ������ �Ҹ��� ����, ���ڰ� �Էµȴ�.
	 */
	JButton makeEnterButton(String name, int ke){ // ��ư ���� �̸��� name���� �ް� ke�� ���� keyevent�� �޴´�
		JButton button = new RoundButton(name);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("����", Font.BOLD, 45));
		button.setBackground(Color.BLACK);
		audioClip = Applet.newAudioClip(url);
		audioClip2 = Applet.newAudioClip(url2);
		audioClip3 = Applet.newAudioClip(url3);
		audioClip.play();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if(Single4.inputCount==0);
					if(Single4.inputCount==1);
					if(Single4.inputCount==2);
					if(Single4.inputCount==3);
					else if(Single4.inputCount==4){
						Single4.inputCount=0;
						InningLogic.compare1=InningLogic.singleCompareNum4(InningLogic.player1Input.elementAt(0), InningLogic.player1Input.elementAt(1), InningLogic.player1Input.elementAt(2),InningLogic.player1Input.elementAt(3));
						Single4.label1.setIcon(null);
						Single4.label2.setIcon(null);
						Single4.label3.setIcon(null);
						Single4.label4.setIcon(null);
						audioClip.stop();
						audioClip3.play();
						audioClip.play();
						Pitcher ss = new Pitcher();
						add(ss);
						ip = new InningPanel4();
						Single4.p1.add(ip);
						InningLogic.deleteAllInput(InningLogic.player1Input);
						if(turnCount==11){//�־��� �̴� �ȿ� ������ ������ ���� ��� �й�â
							fp.requestFocus();
							fp.setVisible(true);
							fp.setEnabled(true);
							JLabel talkLabel = new JLabel("");
							talkLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("�й�.png"))));
							talkLabel.setBounds(209, 272, 240, 170);
							add(talkLabel);
							setComponentZOrder(talkLabel,0);
						}
						if(InningLogic.compare1.equals("4S0B")){
							
							
							fp.requestFocus();
							fp.setVisible(true);
							fp.setEnabled(true);
							JLabel talkLabel = new JLabel("");
							talkLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("�¸�.png"))));
							talkLabel.setBounds(209, 272, 240, 170);
							add(talkLabel);
							setComponentZOrder(talkLabel,0);
							
						
						}
						turnCount++;
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
	/**���ڸ� ������ �� InputPanel�� ���ڰ� �Էµǵ��� �ϴ� ��ư
	 * @param String name
	 * @param int input
	 * @return JButton
	 */
	JButton Numberbutton(String name,int input){ // ��ư ���� �̸��� name���� �ް� ke�� ���� keyevent�� �޴´�
		String s = name + input;
		String imgName = "num"+(input-48)+"ball4.png";
		JButton button = new JButton(s);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("����", Font.BOLD, 50));
		button.setBackground(Color.BLACK);
		button.setOpaque(false);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inputCount==0){
					label1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource(imgName))));
					inputCount++;
					InningLogic.InputPlayer1(input-48);
				}
				else if(inputCount==1){
					label2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource(imgName))));
					inputCount++;
					InningLogic.InputPlayer1(input-48);
				}
				else if(inputCount==2){
					label3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource(imgName))));
					inputCount++;
					InningLogic.InputPlayer1(input-48);
				}
				else if(inputCount==3){
					label4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource(imgName))));
					inputCount++;
					InningLogic.InputPlayer1(input-48);
				}
			}
		});

		InputMap im = button.getInputMap(WHEN_IN_FOCUSED_WINDOW);
		ActionMap am = button.getActionMap();

		im.put(KeyStroke.getKeyStroke(input, 0), "click");
		am.put("click", new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				btn.doClick();
			}
		});
		return button;
	}
}
