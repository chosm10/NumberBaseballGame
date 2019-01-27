package Baseball;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pitcher extends JPanel
{
    private int i = 0;
    private Timer timer;
    private JLabel images = new JLabel();
    private ActionListener action = new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {                       
            i++;
            if(i == 1)
            {
                ImagePanel.pitcher.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("�������ε��2.png"))));
            }
            if(i == 2)
            {
            	ImagePanel.pitcher.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("��������2.png"))));   
            }
            if(i == 3)
            {
            	ImagePanel.ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("���α�3.png"))));  
            }
            if(i == 4)
            {
            	ImagePanel.ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("���α�2.png"))));  
            }
            if(i == 5)
            {
            	ImagePanel.ball.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("���α�1.png"))));
            	
            }
            if(i == 6){
            	ImagePanel.pitcher.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("����2.png"))));
            	ImagePanel.ball.setIcon(null);
            	timer.stop();
            }
            revalidate();
            repaint();
        }
    };

    public Pitcher()
    {        
        timer = new Timer(150, action);    
        timer.start();  
    }

    public static void main(String... args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new Pitcher();
            }
        });
    }
}