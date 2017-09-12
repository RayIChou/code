package hitdog;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;

public class GameFrame extends Frame{
	public static final int WIDTH =800;
	public static final int HEIGHT = 800;

	man man =new man();
	beida beida =new beida();
	mkf mkf =new mkf();
	public void paint (Graphics g){
		man.draw(g);	
   }
    void loadFrame(){
	this.setSize(800,800);
	this.setLocation(50,50);
	setBackground(Color.black);
	setTitle("¥ÚŒ“—Ω");
	setVisible(true);
	 }
public static void main(String[] args){
	new GameFrame().loadFrame();
}
}
class KeyMonitor extends KeyAdapter{
	public void keyPressed(KeyEvet e){
		
	}
}


