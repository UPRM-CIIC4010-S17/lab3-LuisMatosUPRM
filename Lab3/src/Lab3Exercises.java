import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		
		//Finds the current screen size
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		int ww = 210;
		int hh = 150;
		
		JFrame myFrame = new JFrame("Luis A. Matos Velez");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation((int)(width/2)-(ww/2), (int)(height/2)-(hh/2)); //Uses the (int) of the located values: ((height/width)/2)-100 to center it on any monitor.
		myFrame.setSize(ww, hh);
		
        MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
		
		myFrame.setVisible(true);
	}
}