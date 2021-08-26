package zeldaminiclone;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {
	boolean  mostrou=false;
	
	public static BufferedImage spritesheet;
	
	public static BufferedImage[] player;
	
	public static BufferedImage[] inimigo;
	
	public static BufferedImage tilewall;
	
	public Spritesheet() {
		try {
			spritesheet = ImageIO.read(getClass().getResource("/link.png"));
			player = new BufferedImage[11];
			inimigo = new BufferedImage[2];
			player[0] = Spritesheet.getSprite(1, 11, 15, 16);
			player[1] = Spritesheet.getSprite(19, 11, 13, 16);
			player[2] = Spritesheet.getSprite(35, 11, 15, 16);
			player[3] = Spritesheet.getSprite(52, 12, 14, 15);
			player[4] = Spritesheet.getSprite(35, 11, 15, 16);
			player[5] = Spritesheet.getSprite(52, 12, 14, 15);
			player[6] = Spritesheet.getSprite(71, 11, 12, 16);
			player[7] = Spritesheet.getSprite(88, 11, 12, 16);
			player[8] = Spritesheet.getSprite(107, 11, 16, 15);
			player[9] = Spritesheet.getSprite(124, 12, 15, 15);
			player[10] = Spritesheet.getSprite(141, 12, 16, 16);
			tilewall = Spritesheet.getSprite(311, 185, 16, 16);
			inimigo[0] = Spritesheet.getSprite(242, 260, 15, 16);
			inimigo[1] = Spritesheet.getSprite(261, 260, 13, 16);
		} catch (IOException e) {
			System.out.println("Não deu para carregar o sprite, "+e.getMessage());
		}
	}
	
	public static BufferedImage getSprite(int x, int y, int width, int height) {
		return spritesheet.getSubimage(x, y, width, height);
	}
}
