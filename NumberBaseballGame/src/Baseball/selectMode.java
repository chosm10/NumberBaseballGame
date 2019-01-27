package Baseball;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.Action;

public class selectMode extends JPanel {
	InputNum ipt;
	Single3 sing3;
	Single4 sing4;
	public selectMode() {
		setSize(878,944);
		setLayout(null);

		JPanel slide = new JPanel();
		slide.setBounds(0, 0, 878, 944);
		add(slide);
		slide.setLayout(null);

		JLabel Message = new JLabel();
		Message.setHorizontalAlignment(SwingConstants.CENTER);
		Message.setFont(new Font("����", Font.BOLD, 22));
		Message.setText("ǥ ���� ��带 ������ ������ ���۵˴ϴ�.");
		Message.setBounds(204, 643, 448, 80);
		slide.add(Message);
		Message.setForeground(Color.WHITE);
		Message.setBackground(Color.WHITE);

		JLabel SelectLabel = new JLabel("");
		SelectLabel.setBounds(201, 186, 448, 56);
		slide.add(SelectLabel);
		SelectLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("��弱����.jpg"))));

		JLabel Image = new JLabel("");
		Image.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("����ǥ1.jpg"))));
		Image.setBounds(174, 172, 500, 600);
		slide.add(Image);

		JPanel ModeButton = new JPanel();
		ModeButton.setBounds(0, 0, 878, 944);
		slide.add(ModeButton);
		ModeButton.setLayout(null);

		JButton Single4Mode = new JButton();
		Single4Mode.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("��ư2.JPG"))));
		Single4Mode.setBackground(Color.DARK_GRAY);
		Single4Mode.setBounds(470, 339, 179, 144);
		ModeButton.add(Single4Mode);
		Single4Mode.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//�׼� ������ ������
				if (e.getSource() == Single4Mode)
				{
					InningLogic.numofPlayer = 1;
					InningLogic.setWhatBall(4);
					InningLogic.setInning();
					InningLogic.setRandomVector();
					sing4 = new Single4();
					Container con = getRootPane().getContentPane();
					con.add(sing4);
					setEnabled(false);
					setVisible(false);
					sing4.setEnabled(true);
					sing4.setVisible(true);
				}
			}});

		JButton Single3Mode = new JButton();

		Single3Mode.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("��ư1.JPG"))));
		Single3Mode.setBackground(Color.DARK_GRAY);
		Single3Mode.setBounds(290, 339, 179, 144);
		ModeButton.add(Single3Mode);
		Single3Mode.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//�׼� ������ ������
				if (e.getSource() == Single3Mode)
				{
					InningLogic.numofPlayer = 1;
					InningLogic.setWhatBall(3);
					InningLogic.setInning();
					InningLogic.setRandomVector();
					sing3 = new Single3();
					Container con = getRootPane().getContentPane();
					con.add(sing3);
					setEnabled(false);
					setVisible(false);
					sing3.setEnabled(true);
					sing3.setVisible(true);
				}
			}});

		JButton Both4Mode = new JButton();
		Both4Mode.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("��ư4.JPG"))));
		Both4Mode.setBackground(Color.DARK_GRAY);
		Both4Mode.setBounds(470, 484, 179, 150);
		ModeButton.add(Both4Mode);
		Both4Mode.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//�׼� ������ ������
				if (e.getSource() == Both4Mode)
				{
					InningLogic.numofPlayer = 2;
					InningLogic.setWhatBall(4);
					InningLogic.setInning();
					InputNum in = new InputNum();
					Container con = getRootPane().getContentPane();
					con.add(in);
					setEnabled(false);
					setVisible(false);
					in.setEnabled(true);
					in.setVisible(true);
				}
			}});

		JButton Both3Mode = new JButton();
		Both3Mode.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("��ư3.JPG"))));
		Both3Mode.setBackground(Color.DARK_GRAY);
		Both3Mode.setBounds(290, 484, 179, 150);
		ModeButton.add(Both3Mode);
		Both3Mode.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//�׼� ������ ������
				if (e.getSource() == Both3Mode)
				{
					InningLogic.numofPlayer = 2;
					InningLogic.setWhatBall(3);
					InningLogic.setInning();
					InputNum in = new InputNum();
					Container con = getRootPane().getContentPane();
					con.add(in);
					setEnabled(false);
					setVisible(false);
					in.setEnabled(true);
					in.setVisible(true);
				}
			}});

		JLabel Background = new JLabel("");
		Background.setBounds(0, 0, 874, 944);
		ModeButton.add(Background);
		Background.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("�߱���.jpg"))));
	}
}