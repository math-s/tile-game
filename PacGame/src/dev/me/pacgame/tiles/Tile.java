package dev.me.pacgame.tiles;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import dev.me.pacgame.gfx.Assets;

public class Tile {
	
	//STATIC
	
	public static Tile[] tiles = new Tile[256];
	
	// PAREDES
	//horizontal
	public static Tile paredeHorizontEspinhoDoisLadosBaixo = new Parede(50); 
	public static Tile paredeHorizontalCima = new Parede(51); 
	public static Tile paredeHorizontalSemEspinho = new Parede(52); 
	public static Tile paredeHorizontEspinhoDoisLados = new Parede(53);
	//vertical
	public static Tile paredeVerticalEsquerda = new Parede(54); 
	public static Tile paredeVerticalDireita = new Parede(55); 
	public static Tile paredeVerticalSemEspinho = new Parede(56); 
	public static Tile paredeVerticalEspinhoDoisLados = new Parede(57);
	//corner
	public static Tile paredeEsquinaCimaDireita = new Parede(58); 
	public static Tile paredeEsquinaCimaEsquerda = new Parede(59);
	public static Tile paredeEsquinaCimaDireitaSemEspinho = new Parede(60); 
	public static Tile paredeEsquinaCimaEsquerdaSemEspinho = new Parede(61); 
	public static Tile paredeEsquinaBaixoDireita = new Parede(62); 
	public static Tile paredeEsquinaBaixoEsquerda = new Parede(63); 
	public static Tile paredeEsquinaBaixoDireitaSemEspinho = new Parede(64); 
	public static Tile paredeEsquinaBaixoEsquerdaSemEspinho = new Parede(65);
	
	//GROUNDS
	public static Tile whiteChao = new Ground(10);
	public static Tile greenChao = new Ground(11);
	public static Tile orangeChao = new Ground(12);
	public static Tile grayChao = new Ground(13);
	public static Tile blueChao = new Ground(14);
	public static Tile gray2Chao = new Ground(15);
	public static Tile wineChao = new Ground(16);
	public static Tile blackChao = new Ground(17);
	
	
	//CLASS
	
	protected final int id;
	protected BufferedImage texture;
	public static final int TILEWIDTH = 50, TILEHEIGHT = 50;
	
	public BufferedImage getTexture() {
		return texture;
	}

	public void setTexture(BufferedImage texture) {
		this.texture = texture;
	}

	public Tile(BufferedImage texture, int id) {
		this.texture = texture;

		if(id == 50) {
			this.texture = Assets.paredeHorizontalBaixo;

		}
			
		if(id == 51) {
			this.texture = Assets.paredeHorizontalCima;

		}
			
		if(id == 52) {
			this.texture = Assets.paredeHorizontalSemEspinho;

		}
			
		if(id == 53) {
			this.texture = Assets.paredeHorizontalEspinhoDoisLados;

		}
			
		if(id == 54)
			this.texture = Assets.paredeVerticalEsquerda;
		if(id == 55)
			this.texture = Assets.paredeVerticalDireita;
		if(id == 56)
			this.texture = Assets.paredeVerticalSemEspinho;
		if(id == 57)
			this.texture = Assets.paredeVerticalEspinhoDoisLados;
		if(id == 58)
			this.texture = Assets.paredeEsquinaCimaDireita;
		if(id == 59)
			this.texture = Assets.paredeEsquinaCimaEsquerda;
		if(id == 60)
			this.texture = Assets.paredeEsquinaCimaDireitaSemEspinho;
		if(id == 61)
			this.texture = Assets.paredeEsquinaCimaEsquerdaSemEspinho;
		if(id == 62)
			this.texture = Assets.paredeEsquinaBaixoDireita;
		if(id == 63)
			this.texture = Assets.paredeEsquinaBaixoEsquerda;
		if(id == 64)
			this.texture = Assets.paredeEsquinaBaixoDireitaSemEspinho;
		if(id == 65)
			this.texture = Assets.paredeEsquinaBaixoEsquerdaSemEspinho;
		if(id == 10)
			this.texture = Assets.whiteChao;
		if(id == 11)
			this.texture = Assets.greenChao;
		if(id == 12)
			this.texture = Assets.orangeChao;
		if(id == 13)
			this.texture = Assets.grayChao;
		
		this.id = id;
		tiles[id] = this;
	}
	
	public void update() {
		
	}
	
	public void render(Graphics g, int x, int y) {
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
		
	}
	
	public boolean iswall() {
		return false;
	}
	
	public int getId() {
		return id;
	}
	
	public Tile getTile() {
		return this;
	}
}
