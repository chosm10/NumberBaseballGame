package Baseball;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

class PausePanel extends JPanel{
	public PausePanel() {
		setBounds(214, 322, 450, 266);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
	}
}