package org.mikatico.map;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

/**
 * 
 * @author mikatico
 *
 */
public class Map {
	private TiledMap map;
	private int x;
	private int y;
	
	private boolean[][] blocked;
	private int tileID;
	public Map() {
	}
	
	public void init() throws SlickException {
		map = new TiledMap("res/Map/001.tmx");
		blocked = new boolean[map.getWidth()][map.getHeight()];
		for (int x = 0 ; x < map.getWidth() ; x++) {
			for (int y = 0 ; y < map.getHeight() ; y++) {
				tileID = map.getTileId(x, y, 3);
				if (tileID > 0)  {
					blocked[x][y] = true;
	            }
			}
		}
	}
	
	public void update(GameContainer gc, int delta) throws SlickException {

	}
	
	public void renderDown(GameContainer gc, Graphics g) throws SlickException {
//		map.render(0,0,0);
		map.render(0,0,x,y,100,75,1, true);
		map.render(0,0,x,y,100,75,2, false);
		map.render(0,0,x,y,100,75,3, false);
		map.render(0,0,x,y,100,75,4, false);
		map.render(0,0,x,y,100,75,5, false);
		map.render(0,0,x,y,100,75,6, false);
		map.render(0,0,x,y,100,75,7, false);
		map.render(0,0,x,y,100,75,8, false);	
	}
	public void renderUp(GameContainer gc, Graphics g) throws SlickException {
		map.render(0,0,x,y,100,75,9, false);
		map.render(0,0,x,y,100,75,10, false);
		map.render(0,0,x,y,100,75,11, false);
		map.render(0,0,x,y,100,75,12, false);
	}
}
