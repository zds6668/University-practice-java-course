package GUI;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowGridLayout extends JFrame{
public ShowGridLayout(){
	setLayout(new GridLayout(3,2,5,5));
//	setLayout(new GridLayout(2,2));
	add(new JLabel("first name"));
	add(new JTextField(8));
	add(new JLabel("MI"));
	add(new JTextField(4));
	add(new JLabel("last name"));
 add(new JTextField(8)); 
}
	public static void main(String[] args) {
		ShowGridLayout frame=new ShowGridLayout();
		frame.setTitle("name");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 150);
frame.setVisible(true);
	}

}
