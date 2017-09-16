package fivechess;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


	public class GameFrame extends Frame{
		static Point[][] points =new Point[20][20];
		Chess[] chesses =new Chess[400];
		int count = 0 ;
	
		static{
			for(int m=0;m<points.length;m++){
			for(int i=0;i<points[m].length;i++){
				points[m][i] = new Point(50+(20*i),50+(20*m));
			}
		 }
		}
		public void paint(Graphics g){
			//画棋盘
			for(int i = 0;i<points.length;i++){
			g.drawLine( points[i][0].getX(),points[i][0].getY(), points[i][19].getX(), points[i][19].getY());
			g.drawLine( points[0][i].getX(),points[0][i].getY(), points[19][i].getX(), points[19][i].getY());
		}
			//画棋子
			for(int i =0;i<chesses.length;i++){
			if(chesses[i]!=null){
			chesses[i].draw(g);
			}
		 }
		}
		private void lauchFrame(){
		this.setSize(500,500);
		this.setLocation(200,100);
		this.setBackground(Color.gray);
		this.setTitle("Ray的五子棋");
		this.setVisible(true);
		this.setResizable(false);
		this.addMouseListener(new MouseMonitor());
		}
	
public static void main(String[] args){
  new GameFrame().lauchFrame();
}
class MouseMonitor extends MouseAdapter{
	public void mousePressed(MouseEvent e){
	System.out.println(e.getX()+"--"+e.getY());
	
	if (count%2==0){
		Chess c = new Chess(new Point(e.getX(),e.getY()),true);
		chesses [count++] = c;
	}else
	{
		Chess c = new Chess(new Point(e.getX(),e.getY()),false);
		chesses [count++] = c;
	}
	repaint();
	}
	
}
	
}


