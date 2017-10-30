package GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class TestSwing extends JFrame{
	public TestSwing(){
		JPanel p1=new JPanel(new FlowLayout(FlowLayout.LEFT,2,2));
		JButton jbtleft=new JButton("left");
		JButton jbtcerten=new JButton("centen");
		JButton jbtright=new JButton("right");
		jbtleft.setBackground(Color.white);
		jbtcerten.setForeground(Color.GREEN);
	jbtright.setToolTipText("this is the right button");
	p1.add(jbtleft);
	p1.add(jbtright);
	p1.add(jbtcerten);
	p1.setBorder(new TitledBorder("three buttons"));
	Font largeFont=new Font("timesroman",Font.BOLD,20);
	LineBorder lineBorder=new LineBorder(Color.black,2);
	JPanel p2=new JPanel(new GridLayout(1,2,5,5));
	JLabel jlblRed=new JLabel("red");
	JLabel jlblOrange=new JLabel("roange");
	jlblRed.setForeground(Color.red);
	jlblOrange.setForeground(Color.orange);
	jlblRed.setFont(largeFont);
	jlblOrange.setFont(largeFont);
	jlblRed.setBorder(lineBorder);
	jlblOrange.setBorder(lineBorder);
	p2.add(jlblRed);
	p2.add(jlblOrange);
	p2.setBorder(new TitledBorder("two Labels"));
	setLayout(new GridLayout(2,1,5,5));
add(p1);
add(p2);
	}

	public static void main(String[] args) {
		JFrame frame=new TestSwing();
		frame.setTitle("textswing");
		frame.setSize(300,150);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
