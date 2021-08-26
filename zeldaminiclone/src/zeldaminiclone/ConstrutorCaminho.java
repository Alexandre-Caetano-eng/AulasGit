package zeldaminiclone;

public class ConstrutorCaminho {
	
	public int[][] caminho(int xo, int yo, int xf, int yf) {
		int[][] path= new int[100][2];
		//1- cima, 2- baixo, 3-direita, 4-esquerda
		boolean[][] mapa = new boolean[Game.Largura][Game.Altura];
		int[] tam= new int[100];
		int cont=0, marc=0, disx, disy;
		for(int i=0; i<Game.Largura;i++) {
			for(int j=0; j<Game.Altura; j++) {
				mapa[i][j]=Mundo.estaLivre(i, j);
			}
		}
		for(int k=0; k<100; k++) {
			if(xo<xf) {
				disx=xf-xo;
			}else {
				disx=xo-xf;
			}
			if(yo<yf) {
				disy=yf-yo;
			}else {
				disy=yo-yf;
			}
			if(disx<disy) {
				for(int i=0;i<disx;i++) {
					if(xo>xf) {
						
					}
				}
			}else {
				
			}
		}
		path[0][0]=cont;
		return path;
	}

}
