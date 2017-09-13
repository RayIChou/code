package hitdog;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class beida {
	Image beida = Toolkit.getDefaultToolkit().getImage("images/qd.gif");
    int x=6000,y=100;
	boolean top ;
    public void draw (Graphics g){
		g.drawImage(beida,x,y,null);	
		if (top){
			y-=10;
		}else{
			y +=10;
		}
		if (y<0){
			top = false;
		}
		if(y>GameFrame.HEIGHT){
			top = true;
		}

	}
	
}
