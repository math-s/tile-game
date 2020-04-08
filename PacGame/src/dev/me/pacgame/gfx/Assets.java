package dev.me.pacgame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 200, height = 200;
	
	public static BufferedImage heroi;
	public static BufferedImage fantasma;
	
	//horizontal
	public static BufferedImage paredeHorizontalBaixo; 
	public static BufferedImage paredeHorizontalCima; 
	public static BufferedImage paredeHorizontalSemEspinho; 
	public static BufferedImage paredeHorizontalEspinhoDoisLados;
	//vertical
	public static BufferedImage paredeVerticalEsquerda; 
	public static BufferedImage paredeVerticalDireita; 
	public static BufferedImage paredeVerticalSemEspinho; 
	public static BufferedImage paredeVerticalEspinhoDoisLados;
	//corner
	public static BufferedImage paredeEsquinaCimaDireita; 
	public static BufferedImage paredeEsquinaCimaEsquerda;
	public static BufferedImage paredeEsquinaCimaDireitaSemEspinho; 
	public static BufferedImage paredeEsquinaCimaEsquerdaSemEspinho; 
	public static BufferedImage paredeEsquinaBaixoDireita; 
	public static BufferedImage paredeEsquinaBaixoEsquerda; 
	public static BufferedImage paredeEsquinaBaixoDireitaSemEspinho; 
	public static BufferedImage paredeEsquinaBaixoEsquerdaSemEspinho;
	
	//GROUNDS
	public static BufferedImage whiteChao;
	public static BufferedImage greenChao;
	public static BufferedImage orangeChao;
	public static BufferedImage grayChao;
	public static BufferedImage blueChao;
	public static BufferedImage gray2Chao;
	public static BufferedImage wineChao;
	public static BufferedImage blackChao;
	

	public static void init() {
		
		//Tiles
		SpriteSheet newsheettile = new SpriteSheet(ImageLoader.loadImage("res/textures/tiles.png"));
		whiteChao = newsheettile.crop(0, 0, width, height);
		greenChao = newsheettile.crop(width, 0, width, height);
		orangeChao = newsheettile.crop(width*2, 0, width, height);
		grayChao = newsheettile.crop(width*3, 0, width, height);
		blueChao = newsheettile.crop(0, height, width, height);
		gray2Chao = newsheettile.crop(width, height, width, height);
		wineChao = newsheettile.crop(width*2, height, width, height);
		blackChao = newsheettile.crop(width*3, height, width, height);
		
		//Creatures
		SpriteSheet newsheet = new SpriteSheet(ImageLoader.loadImage("res/textures/draw.png"));
		heroi = newsheet.crop(0, 0, 207, 207);
		fantasma = newsheet.crop(420, 0, 200, 200);
		
		//Walls
		SpriteSheet newsheetwall = new SpriteSheet(ImageLoader.loadImage("res/textures/draw_wall.png"));
		//horizontal
		paredeHorizontalCima = newsheetwall.crop(2, 0, width, height); 
		paredeHorizontalBaixo = newsheetwall.crop(width +2, 2, width, height); 
		paredeHorizontalSemEspinho = newsheetwall.crop(width*2 +2, 0, width, height);
		paredeHorizontalEspinhoDoisLados = newsheetwall.crop(width*3 +2, 0, width, height);
		//vertical
		paredeVerticalEsquerda = newsheetwall.crop(2, height*3 +2, width, height); 
		paredeVerticalDireita = newsheetwall.crop(2, height*5 +2, width, height); 
		paredeVerticalSemEspinho = newsheetwall.crop(0, height*6, width, height); 
		paredeVerticalEspinhoDoisLados = newsheetwall.crop(4, height*4, width, height);
		//corner 
		paredeEsquinaCimaDireita = newsheetwall.crop(width*3, height*2 +1, width, height); 
		paredeEsquinaCimaEsquerda = newsheetwall.crop(0, height*2, width, height);
		paredeEsquinaBaixoDireita = newsheetwall.crop(width+5, height*2 +5, width, height);
		paredeEsquinaBaixoEsquerda = newsheetwall.crop(width*2 , height*2, width, height);
		paredeEsquinaBaixoDireitaSemEspinho = newsheetwall.crop(0, height, width, height); 
		paredeEsquinaBaixoEsquerdaSemEspinho = newsheetwall.crop(width*3,height, width, height); 
		paredeEsquinaCimaDireitaSemEspinho = newsheetwall.crop(width*2+5, height, width, height); 
		paredeEsquinaCimaEsquerdaSemEspinho = newsheetwall.crop(width, height, width, height); 

		}
}
