package zeldaminiclone;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Inimigos extends Rectangle{
	public int curframes=0, tarframes=15;
	public static List<Tiros> tiros = new ArrayList<Tiros>();
	public int vel=1,i=0;
	public boolean direita, esquerda, cima, baixo, atirar;
	public int frames=0, playerx,playery,marcador=0, caminhox, caminhoy;
	
	public Inimigos(int x, int y) {
		super(x,y,32,32);
	}
	
	public void tick() {
		if(!Mundo.estaLivre(x+2,y)) {
			if(Mundo.estaLivre(x,y-2)) {
				if(Player.posx>this.x && Mundo.estaLivre(x+2,y)) {
					System.out.println("9");
					direita=true;
				}else if(Player.posx<this.x && Mundo.estaLivre(x-2,y)) {
					System.out.println("10");
					esquerda=true;
				}else if(Player.posy>this.y && Mundo.estaLivre(x,y+2)) {
					System.out.println("11");
					baixo=true;
				}else if(Player.posy<this.y && Mundo.estaLivre(x,y-2)) {
					System.out.println("12");
					cima=true;
				}
			}else if(Mundo.estaLivre(x,y+2)) {
				if(Player.posx>this.x && Mundo.estaLivre(x+2,y)) {
					System.out.println("9");
					direita=true;
				}else if(Player.posx<this.x && Mundo.estaLivre(x-2,y)) {
					System.out.println("10");
					esquerda=true;
				}else if(Player.posy>this.y && Mundo.estaLivre(x,y+2)) {
					System.out.println("11");
					baixo=true;
				}else if(Player.posy<this.y && Mundo.estaLivre(x,y-2)) {
					System.out.println("12");
					cima=true;
				}
			}
		}else if(!Mundo.estaLivre(x-2,y)) {
			if(Mundo.estaLivre(x,y-2)) {
				if(Player.posx>this.x && Mundo.estaLivre(x+2,y)) {
					System.out.println("9");
					direita=true;
				}else if(Player.posx<this.x && Mundo.estaLivre(x-2,y)) {
					System.out.println("10");
					esquerda=true;
				}else if(Player.posy>this.y && Mundo.estaLivre(x,y+2)) {
					System.out.println("11");
					baixo=true;
				}else if(Player.posy<this.y && Mundo.estaLivre(x,y-2)) {
					System.out.println("12");
					cima=true;
				}
			}else if(Mundo.estaLivre(x,y+2)) {
				if(Player.posx>this.x && Mundo.estaLivre(x+2,y)) {
					System.out.println("9");
					direita=true;
				}else if(Player.posx<this.x && Mundo.estaLivre(x-2,y)) {
					System.out.println("10");
					esquerda=true;
				}else if(Player.posy>this.y && Mundo.estaLivre(x,y+2)) {
					System.out.println("11");
					baixo=true;
				}else if(Player.posy<this.y && Mundo.estaLivre(x,y-2)) {
					System.out.println("12");
					cima=true;
				}
			}
		}else if(!Mundo.estaLivre(x,y-2)) {
			if(Mundo.estaLivre(x+2,y)) {
				if(Player.posx>this.x && Mundo.estaLivre(x+2,y)) {
					System.out.println("9");
					direita=true;
				}else if(Player.posx<this.x && Mundo.estaLivre(x-2,y)) {
					System.out.println("10");
					esquerda=true;
				}else if(Player.posy>this.y && Mundo.estaLivre(x,y+2)) {
					System.out.println("11");
					baixo=true;
				}else if(Player.posy<this.y && Mundo.estaLivre(x,y-2)) {
					System.out.println("12");
					cima=true;
				}
			}else if(Mundo.estaLivre(x-2,y)) {
				if(Player.posx>this.x && Mundo.estaLivre(x+2,y)) {
					System.out.println("9");
					direita=true;
				}else if(Player.posx<this.x && Mundo.estaLivre(x-2,y)) {
					System.out.println("10");
					esquerda=true;
				}else if(Player.posy>this.y && Mundo.estaLivre(x,y+2)) {
					System.out.println("11");
					baixo=true;
				}else if(Player.posy<this.y && Mundo.estaLivre(x,y-2)) {
					System.out.println("12");
					cima=true;
				}
			}
		}else if(!Mundo.estaLivre(x,y+2)) {
			if(Mundo.estaLivre(x+2,y)) {
				if(Player.posx>this.x && Mundo.estaLivre(x+2,y)) {
					System.out.println("9");
					direita=true;
				}else if(Player.posx<this.x && Mundo.estaLivre(x-2,y)) {
					System.out.println("10");
					esquerda=true;
				}else if(Player.posy>this.y && Mundo.estaLivre(x,y+2)) {
					System.out.println("11");
					baixo=true;
				}else if(Player.posy<this.y && Mundo.estaLivre(x,y-2)) {
					System.out.println("12");
					cima=true;
				}
			}else if(Mundo.estaLivre(x-2,y)) {
				if(Player.posx>this.x && Mundo.estaLivre(x+2,y)) {
					System.out.println("9");
					direita=true;
				}else if(Player.posx<this.x && Mundo.estaLivre(x-2,y)) {
					System.out.println("10");
					esquerda=true;
				}else if(Player.posy>this.y && Mundo.estaLivre(x,y+2)) {
					System.out.println("11");
					baixo=true;
				}else if(Player.posy<this.y && Mundo.estaLivre(x,y-2)) {
					System.out.println("12");
					cima=true;
				}
			}
		}else {
			if(Player.posx>this.x && Mundo.estaLivre(x+2,y)) {
				System.out.println("9");
				direita=true;
			}else if(Player.posx<this.x && Mundo.estaLivre(x-2,y)) {
				System.out.println("10");
				esquerda=true;
			}else if(Player.posy>this.y && Mundo.estaLivre(x,y+2)) {
				System.out.println("11");
				baixo=true;
			}else if(Player.posy<this.y && Mundo.estaLivre(x,y-2)) {
				System.out.println("12");
				cima=true;
			}
		}
				
		if(direita && Mundo.estaLivre(x+2,y)) {
			if(x+32>=Game.Largura) {
				x=568;
			}else {
				x+=vel;
			}
		}
		if(esquerda&& Mundo.estaLivre(x-2,y)) {
			if(x<=0) {
				x=0;
			}else {
				x-=vel;
			}
		}
		if(baixo&& Mundo.estaLivre(x,y+2)) {
			if(y+32>=Game.Altura) {
				y=568;
			}else {
				y+=vel;
			}
		}
		if(cima&& Mundo.estaLivre(x,y-2)) {
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
		frames++;
		if(frames>=30) {
			if(i>0) {
				i=0;
			}else {
				i++;
			}
			frames=0;
		}
		direita=esquerda=cima=baixo=false;
	}
	
	public void render(Graphics g) {
		//g.setColor(Color.BLUE);
		//g.fillRect(x, y, width, height);
		g.drawImage(Spritesheet.inimigo[i], x,y,32,32,null);
		if(tiros.size()>0) {
			for(int j=0;j<tiros.size();j++) {
				tiros.get(j).render(g);
			}
		}
	}
}
