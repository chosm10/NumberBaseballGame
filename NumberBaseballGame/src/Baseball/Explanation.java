package Baseball;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
/** ���Ӽ���â �г� Ŭ����*/
public class Explanation extends JPanel {
	Main main;
	/** Explanation�г��� ũ��� ���̾ƿ� ���� �� ������Ʈ ���� �����ϴ� ������*/
	public Explanation() {
		setSize(878,944);
		setBackground(Color.DARK_GRAY);

		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(70,82,780,707);
		add(panel);
		panel.setLayout(null);
		/** â �ݱ� ��ư*/
		JButton CloseButton = new JButton("x");
		CloseButton.setFont(new Font("����", Font.BOLD, 30));
		CloseButton.setBounds(696, 0, 84, 29);
		panel.add(CloseButton);
		CloseButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//�׼� ������ ������
				if (e.getSource() == CloseButton)
				{	
					try {
						main = new Main();
					} catch (UnsupportedAudioFileException e1){
					} catch (IOException e1) {
					} catch (LineUnavailableException e1) {
					} // Main main;
					GFrame.con.add(main);
					main.setEnabled(true);
					main.setVisible(true);
					setVisible(false);
					setEnabled(false);
				}
			}});
		
		JLabel Explain = new JLabel("");
		Explain.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("������.jpg"))));
		Explain.setBounds(0,0,780,707);
		panel.add(Explain);
		
		JLabel Background = new JLabel("");
		Background.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("�߱���.jpg"))));
		Background.setBounds(0, 0, 878, 944);
		add(Background);
	}
}
