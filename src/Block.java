/**
 * Created by Mirza Radoncic on 3/22/2018.
 */

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;


public class Block extends Rectangle{
	public Image  pic;
	public int dx = 3;
	public int dy = -3;
	public Rectangle left, right;
	public boolean destroyed = false;
	public boolean powerup = false;

	Block(int a, int b, int w, int h, String s){
        x = a;
		y = b;
		width = w;
		height = h;
		left = new Rectangle(a-1, b, 1, h);
		right = new Rectangle(a+w+1, b, 1, h);
		pic = Toolkit.getDefaultToolkit().getImage(s);
	}
	
	public void draw(Graphics g, Component c){
		if(!destroyed)
			g.drawImage(pic, x, y, width, height, c);
	}
}
