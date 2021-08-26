package zeldaminiclone;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Mundo {
	
	public static List<Blocos> blocos = new ArrayList<Blocos>();
	
	public Mundo() {
		for(int xx=0; xx<(Game.Largura/32); xx++) {
			blocos.add(new Blocos(xx*32,0));
		}
		for(int xx=0; xx<(Game.Largura/32); xx++) {
			blocos.add(new Blocos(xx*32,Game.Altura-32));
		}
		for(int yy=0; yy<(Game.Altura/32); yy++) {
			blocos.add(new Blocos(0,yy*32));
		}
		for(int yy=0; yy<(Game.Altura/32); yy++) {
			blocos.add(new Blocos(Game.Largura-32,yy*32));
		}
		for(int i=0;i<100;i++) {
			blocos.add(new Blocos(200+i,200));
		}
	}
	
	public static boolean estaLivre(int x, int y) {
		for(int i=0; i<blocos.size(); i++) {
			Blocos blocoAtual = blocos.get(i);
			if(blocoAtual.intersects(new Rectangle(x,y,32,32))) {
				return false;
			}
		}
		return true;
	}
	
	public void render(Graphics g) {
		for(int i=0; i<blocos.size(); i++) {
			blocos.get(i).render(g);
		}
	}
}
