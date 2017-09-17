package fivechess;

import java.awt.Color;
import java.awt.Graphics;

public class Chess {
	
    private Point point;
    private boolean black = true;
    private boolean white = false;
    public static final int SIZE = 20;
    
    public void draw(Graphics g){
    	Color c = g.getColor();
    	if(black){
    		g.setColor(Color.black);
    	}else{
    		g.setColor(Color.white);
    	}
    		
    		g.fillOval(point.getX()-SIZE/2,point.getY()-SIZE/2,  SIZE, SIZE);
            g.setColor(c);	
    }

	public Chess(Point point, boolean black) {
		double minDistance = 100;
		//遍历所有的标准点
		Point temp = null;
		for(int m = 0;m <GameFrame.points.length;m++){
			for(int i = 0;i <GameFrame.points.length;i++){
			if(getDistance(point,GameFrame.points[m][i])<=minDistance){
				minDistance =getDistance(point,GameFrame.points[m][i]);
				temp = GameFrame.points[m][i];
			}
			}
			
			}
			
		
		this.point = temp;
		this.black = black;
	}
	private double getDistance(Point p1,Point p2){
		return Math.sqrt(Math.pow((p1.getX()-p2.getX()),2))+Math.sqrt(Math.pow((p1.getY()-p2.getY()),2));
	}
    	Chess(){}
    }
