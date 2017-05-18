package dbaccess;

import javax.swing.*;

public class Classtest {
	public static void main(final String[] args)
	{
			final JFrame frame = new JFrame("Ein Fenster");
			frame.add(new JLabel("Text-Label:"));
			frame.add(new JButton("Button -- Press Me!"));

			frame.setSize(400, 200);
			frame.setVisible(true);
	}
}
