package org.mikatico.personnage;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;

public class Player {
	
	private Input input;
	private Rectangle rect;
	private int x;
	private int y;
	private float moveSpeed;

	public Player(Input input){
		this.input = input;
	}
	
	public void init() throws SlickException {
		rect = new Rectangle(x, y, 14, 10);
		moveSpeed = 0.15f;
	}
	
	public void update(GameContainer gc, int delta) 
			throws SlickException {
		input = gc.getInput();
		if (input.isKeyDown(Input.KEY_Z) || input.isKeyDown(Input.KEY_UP)) {
			y -= delta * moveSpeed;
		}
		if (input.isKeyDown(Input.KEY_S) || input.isKeyDown(Input.KEY_DOWN)) {
			y += delta * moveSpeed;
		}
		if (input.isKeyDown(Input.KEY_Q) || input.isKeyDown(Input.KEY_LEFT)) {
			x -= delta * moveSpeed;
		}
		if (input.isKeyDown(Input.KEY_D) || input.isKeyDown(Input.KEY_RIGHT)) {
			x += delta * moveSpeed;
		}
		rect.setLocation(x, y);
	}
	
	public void render(GameContainer gc, Graphics g) 
			throws SlickException {
		g.draw(rect);
	}
}
