package GUI;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class TestGetGraphics extends JFrame{
	private JLabel jlblBanner=new JLabel("Banner");
	public TestGetGraphics(){
		add(jlblBanner);
		System.out.println(jlblBanner.getGraphics());
	}

	public static void main(String[] args) {
		TestGetGraphics frame=new TestGetGraphics();
		frame.setTitle("testgetgraphics");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(200, 100);
	JOptionPane.showMessageDialog(null, "delay onj purpose\nclock ok to dismiss the dialog");
	Graphics graohics=frame.jlblBanner.getGraphics();
	graohics.drawLine(0, 0, 50, 50);

	}

}
