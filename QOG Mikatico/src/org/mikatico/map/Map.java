package org.mikatico.map;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.tiled.TiledMap;

public class Map {
	
	private Rectangle rect;
	private Rectangle[] block;
	private TiledMap map;
	private boolean[][] blocked;
	private int tileID;
	public Map() {
	}
	
	public void init() throws SlickException {
		block = new Rectangle[];
		map = new TiledMap("res/Map/001.tmx");
		blocked = new boolean[map.getWidth()][map.getHeight()];
		for (int x = 0 ; x < map.getWidth() ; x++) {
			for (int y = 0 ; y < map.getHeight() ; y++) {
				tileID = map.getTileId(x, y, 3);
				if (tileID > 0)  {
					blocked[x][y] = true;
					rect = new Rectangle(x, y, 8, 8);
					
	            }
			}
		}
	}
	
	public void update(GameContainer gc, int delta) throws SlickException {

	}
	
	public void render(GameContainer gc, Graphics g) throws SlickException {
		map.render(-400, -300, 0);

	}
}
