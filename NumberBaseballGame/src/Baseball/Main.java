package Baseball;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
/** ������ ���� ȭ�� �г�Ŭ���� Main */
public class Main extends JPanel {
	/** ȭ�� ��ȯ�� ���� ����â ��ü*/
	Explanation ex;
	/** ȭ�� ��ȯ�� ���� ��弱��â ��ü*/
	selectMode sm;
	//URL url;
	//AudioClip audioClip;
	/** Sound effect�� �ֱ� ���� ��ü*/
	Clip clip;
	/** Sound effect�� �ֱ� ���� ���� �ϴ� ���*/
	String path = Main.class.getResource("").getPath();
	/** Audio ������ �Է��ϱ� ���� ��Ʈ�� */
	AudioInputStream stream;
	/** Audio ������ ������ ��� ���� ��ü*/
	AudioFormat format;
	/** Data�� �� ������ �б� ���� ��ü*/
	DataLine.Info info;
	/** wav������ �����ϴ� ��ü*/
	File bgm = new File("MainSong.wav");
	/** Main�г��� ũ��� ���̾ƿ� ���� �� ������Ʈ ���� �����ϴ� ������*/ 
	public Main() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			// ���� ȿ��
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		setSize(878,944);
		setLayout(null);
		/** ���� ���� ��ư*/
		JButton ExButton = new JButton("���� ����");
		ExButton.setFont(new Font("�޸�����ü", Font.BOLD, 40));
		ExButton.setBackground(Color.ORANGE);
		ExButton.setBounds(264, 697, 350, 100);
		add(ExButton);
		ExButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//�׼� ������ ������
				if (e.getSource() == ExButton)
				{	
					ex = new Explanation();
					GFrame.con.add(ex);
					ex.setEnabled(true);
					ex.setVisible(true);
					setEnabled(false);
					setVisible(false);	
				}
			}});
		/**soundCheckBox*/
		/**soundCheckBox*/
		JCheckBoxMenuItem SoundchBox = new JCheckBoxMenuItem("Sound",true);
		SoundchBox.setForeground(Color.ORANGE);
		SoundchBox.setFont(new Font("���ʷҵ���", Font.BOLD, 25));
		SoundchBox.setBounds(782, 913, 96, 31);
		//audioClip = Applet.newAudioClip(url);
		//audioClip.play();
		clip.start();

		SoundchBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				if(((AbstractButton) e.getSource()).isSelected() == true)
				{
					clip.start();

				}
				else
				{
					clip.stop();

				}
			}
		});


		add(SoundchBox);

		/**���ӽ��� ��ư*/
		JButton StartButton = new JButton("���� ����");
		StartButton.setFont(new Font("�޸�����ü", Font.BOLD, 40));
		StartButton.setBackground(Color.ORANGE);
		StartButton.setBounds(264, 512, 350, 100);
		add(StartButton);
		StartButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//�׼� ������ ������
				if (e.getSource() == StartButton)
				{
					sm = new selectMode();
					GFrame.con.add(sm);
					sm.setEnabled(true);
					sm.setVisible(true);
					setEnabled(false);
					setVisible(false);
					clip.stop();
				}
			}});

		JLabel Title = new JLabel();
		Title.setForeground(Color.ORANGE);
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setFont(new Font("�޸յձ�������", Font.ITALIC, 65));
		Title.setText("������ �� ���Ͼ");
		Title.setBounds(0,63,878,549);
		Title.setOpaque(false);
		Title.setBorder(null);
		add(Title);

		JLabel Background = new JLabel("���");
		Background.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("�߱���2.jpg"))));
		Background.setBounds(0, 0, 878, 944);
		add(Background);
	}
}