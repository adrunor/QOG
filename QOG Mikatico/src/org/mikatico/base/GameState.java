package org.mikatico.base;

import org.mikatico.map.Map;
import org.mikatico.personnage.Player;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 * @author KAMI
 */
public class GameState extends BasicGameState {
	public static final int ID = 1;
	
	private Player p;
	private Map m;
	private Input input;

	@Override
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		// TODO Auto-generated method stub
		p = new Player(input);
		p.init();
		m = new Map();
		m.init();
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub
		m.render(gc, g);
		p.render(gc, g);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		// TODO Auto-generated method stub
		p.update(gc, delta);
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return ID;
	}

}
