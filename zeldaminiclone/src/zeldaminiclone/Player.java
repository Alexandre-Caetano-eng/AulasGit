package zeldaminiclone;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Player extends Rectangle {
	
	public int curframes=0, tarframes=15;
	public static List<Tiros> tiros = new ArrayList<Tiros>();
	public int vel=4,i=0;
	public boolean direita, esquerda, cima, baixo, atirar;
	public static int posx, posy;
	public Player(int x, int y) {
		super(x,y,32,32);
		posx=x;
		posy=y;
	}
	
	public void tick() {
		if(direita && Mundo.estaLivre(x+3,y)) {
			if(i!=2&&i!=3) {
				i=2;
			}
			curframes++;
			if(curframes>tarframes) {
				if(i%2==0) {
					i++;
				}else {
					i--;
				}
				curframes=0;
			}
			if(x+32>=Game.Largura) {
				x=568;
			}else {
				x+=vel;
			}
		}else if(esquerda && Mundo.estaLivre(x-3,y)) {
			if(i!=4&&i!=5) {
				i=4;
			}
			curframes++;
			if(curframes>tarframes) {
				if(i%2==0) {
					i++;
				}else {
					i--;
				}
				curframes=0;
			}
			if(x<=0) {
				x=0;
			}else {
				x-=vel;
			}
		}
		if(baixo && Mundo.estaLivre(x,y+3)) {
			if(i!=0&&i!=1) {
				i=0;
			}
			curframes++;
			if(curframes>tarframes) {
				if(i%2==0) {
					i++;
				}else {
					i--;
				}
				curframes=0;
			}
			if(y+32>=Game.Altura) {
				y=568;
			}else {
				y+=vel;
			}
		}else if(cima && Mundo.estaLivre(x,y-3)) {
			if(i!=6&&i!=7) {
				i=6;
			}
			curframes++;
			if(curframes>tarframes) {
				if(i%2==0) {
					i++;
				}else {
					i--;
				}
				curframes=0;
			}
			if(y<=0) {
				y=0;
			}else {
				y-=vel;
			}
		}
		if(atirar) {
			curframes++;
			if(curframes>tarframes) {
				tiros.add(new Tiros(x,y,i));
				curframes=0;
			}
		}
		for(int j=0;j<tiros.size();j++) {
			tiros.get(j).tick();
		}
		posx=x;
		posy=y;
	}
	
	public void render(Graphics g) {
		//g.setColor(Color.BLUE);
		//g.fillRect(x, y, width, height);
		g.drawImage(Spritesheet.player[i], x,y,32,32,null);
		if(tiros.size()>0) {
			for(int j=0;j<tiros.size();j++) {
				tiros.get(j).render(g);
			}
		}
	}
}
