package hitdog;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class mkf {
	Image mkf = Toolkit.getDefaultToolkit().getImage("mkf/da.gif");
    int x=50,y=300;
    double degree = Math.PI/6;
	public void draw (Graphics g){
		g.drawImage(mkf,x,y,null);	
        x = (int)(x + 10* Math .cos(degree));
        y += 10*Math.sin(degree);
	}
	
}
