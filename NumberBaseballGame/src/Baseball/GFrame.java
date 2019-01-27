package Baseball;
import java.awt.Container;
import java.awt.Toolkit;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

public class GFrame extends JFrame{
	private Main main;
	static Container con;
	public static void main(String[] args) {
		GFrame frame;
		frame = new GFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); 

	}
	/** �������� ũ��� �̸� ���� �� Mainȭ���� �������� ������ ������*/
	public GFrame(){
		con = getContentPane();
		try {
			main = new Main();
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("�߱���.jpg")));
		setTitle("������ �� ���Ͼ");
		setSize(900, 1000);
		con.add(main);
	}
}
