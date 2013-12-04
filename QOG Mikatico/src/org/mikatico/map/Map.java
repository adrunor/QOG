package org.mikatico.map;

import java.util.List;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.tiled.TiledMap;

/**
 * 
 * @author mikatico
 *
 */
public class Map {
	private Rectangle rect;
	private TiledMap map;
	private boolean[][] blocked;
	private int tileID;
	public Map() {
	}
	
	public void init() throws SlickException {
		rect = new Rectangle(800/2, 600/2, 16, 8);
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
		//map.render(0,0,0);
		map.render(0,0,1);
		map.render(0,0,2);
		map.render(0,0,3);
		map.render(0,0,4);
		map.render(0,0,5);
		map.render(0,0,6);
		map.render(0,0,7);
		map.render(0,0,8);
		g.draw(rect);
		
	}
	public void renderUp(GameContainer gc, Graphics g) throws SlickException {
		map.render(0,0,9);
		map.render(0,0,10);
		map.render(0,0,11);
		map.render(0,0,12);
	}
	
	
}
