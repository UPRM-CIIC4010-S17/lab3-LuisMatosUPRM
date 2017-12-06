import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			/* (non-Javadoc)
			 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
			 */
			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
                        
 
                          //Paint the background
                          g.setColor(Color.WHITE);
                          g.fillRect(x1, y1, width+1, height+1);
                          
                      
/*                        int ovalsize = 55;
*                         //Draw a border
*                         g.setColor(Color.RED);
*                         g.drawRect(x1, y1, width, height);
*                        
*                         g.setColor(Color.ORANGE);
*                         g.drawRect(x1+3, y1+3, width-6, height-6);
*                        
*                         g.setColor(Color.GREEN);
*                         g.drawLine(x1, y1, x2, y2);
*                        
*                         g.setColor(Color.DARK_GRAY);
*                         g.drawLine(x2, y1, x1, y2);
*                          
*                         g.setColor(Color.LIGHT_GRAY);
*                         g.fillOval(x1+(width/2)-(ovalsize/2), y1+(height/2)-(ovalsize/2), ovalsize, ovalsize);
*                          
*                         Polygon p = new Polygon();
*                         p.addPoint(x1 + 5, y1 + 25);
*                         p.addPoint(x1 + 20, y1 + 10);
*                         p.addPoint(x1 + 35, y1 + 25);
*                         p.addPoint(x1 + 25, y1 + 25);
*                         p.addPoint(x1 + 25, y1 + 45);
*                         p.addPoint(x1 + 15, y1 + 45);
*                         p.addPoint(x1 + 15, y1 + 25);
*                         g.setColor(Color.YELLOW);
*                         g.fillPolygon(p);
*                         
*                         Polygon p2 = new Polygon();
*                         p2.addPoint(x1 + 25, y1 + 73);
*                         p2.addPoint(x1 + 41, y1 + 73);
*                         p2.addPoint(x1 + 47, y1 + 58);
*                         p2.addPoint(x1 + 53, y1 + 73);
*                         p2.addPoint(x1 + 69, y1 + 73);
*                         p2.addPoint(x1 + 56, y1 + 83);
*                         p2.addPoint(x1 + 61, y1 + 98);
*                         p2.addPoint(x1 + 47, y1 + 88);
*                         p2.addPoint(x1 + 34, y1 + 98);
*                         p2.addPoint(x1 + 38, y1 + 83);
*                         g.setColor(Color.WHITE);
*                         g.drawPolygon(p2);
 */
                          Polygon R1 = new Polygon();
                          R1.addPoint(x1, y1);
                          R1.addPoint(x1 + width +1, y1);
                          R1.addPoint(x1 + width +1, y1 + (height/5));
                          R1.addPoint(x1, y1 + (height/5));
                          g.setColor(Color.RED);
                          g.fillPolygon(R1);  
                          
                          Polygon R2 = new Polygon();
                          R2.addPoint(x1, y1 + (height/5)*2);
                          R2.addPoint(x1 + width +1, y1 + (height/5)*2);
                          R2.addPoint(x1 + width +1, y1 + (height/5)*3);
                          R2.addPoint(x1, y1 + (height/5)*3);
                          g.setColor(Color.RED);
                          g.fillPolygon(R2);
                          
                          Polygon R3 = new Polygon();
                          R3.addPoint(x1, y1 + (height/5)*4);
                          R3.addPoint(x1 + width +1, y1 + (height/5)*4);
                          R3.addPoint(x1 + width +1, y1 + 1 +(height/5)*5);
                          R3.addPoint(x1, y1 + 1 +(height/5)*5);
                          g.setColor(Color.RED);
                          g.fillPolygon(R3);
                          
                          Polygon arrow = new Polygon();
                          arrow.addPoint(x1, y1);
                          arrow.addPoint(x1 + (width/2)+5, y1 + (height/2));
                          arrow.addPoint(x1, y1 + height);
                          g.setColor(Color.BLUE);
                          g.fillPolygon(arrow);                          
                          
                          double wc = 1.3;
                          double hc = 1.5;
                          
                          Polygon p2 = new Polygon();
                          p2.addPoint((int) (x1 + 25/wc), (int) (y1 + 73/hc));
                          p2.addPoint((int) (x1 + 41/wc), (int) (y1 + 73/hc));
                          p2.addPoint((int) (x1 + 47/wc), (int) (y1 + 58/hc));
                          p2.addPoint((int) (x1 + 53/wc), (int) (y1 + 73/hc));
                          p2.addPoint((int) (x1 + 69/wc), (int) (y1 + 73/hc));
                          p2.addPoint((int) (x1 + 56/wc), (int) (y1 + 83/hc));
                          p2.addPoint((int) (x1 + 61/wc), (int) (y1 + 98/hc));
                          p2.addPoint((int) (x1 + 47/wc), (int) (y1 + 88/hc));
                          p2.addPoint((int) (x1 + 34/wc), (int) (y1 + 98/hc));
                          p2.addPoint((int) (x1 + 38/wc), (int) (y1 + 83/hc));
                          g.setColor(Color.WHITE);
                          g.fillPolygon(p2);
                          
                          
                          
                          
                          
                          
            }
}