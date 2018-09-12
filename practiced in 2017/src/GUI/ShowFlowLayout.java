package GUI;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class ShowFlowLayout extends JFrame{
	public ShowFlowLayout(){
		setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		add(new JLabel("first name"));
		add(new JTextField(8));
		add(new JLabel("sex"));
		add(new JTextField(4));
		add(new JLabel("last name"));
		add(new JTextField(8));
		
	}
	public static void main(String[] args) {
		ShowFlowLayout frame=new ShowFlowLayout();
		frame.setTitle("SHOW");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 400);
		frame.setVisible(true);

	}

}
