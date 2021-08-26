package zeldaminiclone;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable, KeyListener{
	public Player player;
	public List<Inimigos> inimigos = new ArrayList<Inimigos>();
	public Mundo mundo;
	public static int Escala=4;
	public static int Largura=160*Escala, Altura=120*Escala;
	
	public Game() {
		this.addKeyListener(this);
		this.setPreferredSize(new Dimension(Largura, Altura));
		new Spritesheet();
		mundo=new Mundo();
		player=new Player(32,32);
		inimigos.add(new Inimigos(500,400));
	}
	
	public void tick() {
		player.tick();
		for(int i=0;i<inimigos.size();i++) {
			inimigos.get(i).tick();
		}
	}
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs==null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, Largura, Altura);
		player.render(g);
		for(int i=0;i<inimigos.size();i++) {
			inimigos.get(i).render(g);
		}
		mundo.render(g);
		
		bs.show();
	}
	
	public void run() {
		while(true) {
			tick();
			render();
			try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				System.out.println("Erro: "+e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		Game game = new Game();
		JFrame jframe = new JFrame();
		jframe.add(game);
		jframe.setTitle("Mini Zelda");
		jframe.pack();
		jframe.setLocationRelativeTo(null);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		
		new Thread(game).start();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			player.direita = true;
		}else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			player.esquerda = true;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			player.cima = true;
		}else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			player.baixo = true;
		}
		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			player.atirar = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			player.direita = false;
		}else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			player.esquerda = false;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			player.cima = false;
		}else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			player.baixo = false;
		}
		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			player.atirar = false;
		}
	}

}
