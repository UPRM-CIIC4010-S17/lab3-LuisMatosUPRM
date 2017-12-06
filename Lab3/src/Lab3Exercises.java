import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		
		//Finds the current screen size
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		
		JFrame myFrame = new JFrame("Luis A. Matos Velez");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation((int)(width/2)-100, (int)(height/2)-100); //Uses the (int) of the located values: ((height/width)/2)-100 to center it on any monitor.
		myFrame.setSize(200, 200);
		myFrame.setVisible(true);
	}
	
}