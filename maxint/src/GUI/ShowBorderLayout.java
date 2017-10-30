package GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ShowBorderLayout extends JFrame{
	public ShowBorderLayout(){
		setLayout(new BorderLayout(5,10));
		add(new JButton("east"),BorderLayout.EAST);
		add(new JButton("south"),BorderLayout.SOUTH);
		add(new JButton("west"),BorderLayout.WEST);
		add(new JButton("north"),BorderLayout.NORTH);
		add(new JButton("center"),BorderLayout.CENTER);
		
	}

	public static void main(String[] args) {
		ShowBorderLayout frame=new ShowBorderLayout();
		frame.setTitle("BorderLatyout");
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
frame.setSize(300, 200);
	frame.setVisible(true);
	}

}
