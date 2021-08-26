package zeldaminiclone;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Tiros extends Rectangle{
	
	public int dir=1, vel=8;
	
	public int frames=0;
	
	public Tiros(int x, int y, int dir) {
		super(x+10,y+10,8,8);
		this.dir=dir;
	}
	
	public void tick() {
		if(dir==0||dir==1) {
			y+=vel;
		}else if(dir==2||dir==3) {
			x+=vel;
		}else if(dir==4||dir==5) {
			x-=vel;
		}else if(dir==6||dir==7) {
			y-=vel;
		}
		frames++;
		if(frames==70) {
			Player.tiros.remove(this);
		}
	}
	
	public void render(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
	}
}
