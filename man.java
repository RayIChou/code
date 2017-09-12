package hitdog;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class man {
	Image man = Toolkit.getDefaultToolkit().getImage("images/da.gif");
    int x=50,y=300;
	public void draw (Graphics g){
		g.drawImage(man,50,50,null);	

	}
	
}
