package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextPanels extends JFrame{
public TextPanels(){
	JPanel p=new JPanel();
	p.setLayout(new GridLayout(4,3));
	for(int i=0;i<9;i++){
		p.add(new JButton(""+i));
	}
	p.add(new JButton(""+0));
	p.add(new JButton("start"));
	p.add(new JButton("stop"));
	JPanel p2=new JPanel(new BorderLayout());
	p2.add(new JTextField("time to be displayed here"),BorderLayout.NORTH);
	p2.add(p,BorderLayout.CENTER);
	add(p2,BorderLayout.EAST);
	add(new JButton("food to be placed here"),BorderLayout.CENTER);

	
}
	public static void main(String[] args) {
		TextPanels frame=new TextPanels();
		frame.setTitle("the front view of a microwave oven");
		frame.setLocationRelativeTo(null);
frame.setSize(400, 250);
frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
frame.setVisible(true);
	}

}
