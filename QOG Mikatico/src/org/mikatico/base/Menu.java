package org.mikatico.base;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 * @author KAMI
 */
public class Menu extends BasicGameState {
	public static final int ID = 2;
	
	private static final int X = 262;
	private static final int Y1 = 377;
	private static final int Y2 = 448;
	
	private Image menu;
	private Image cursor;
	
	private int pos;// 0 = jouer 1 = quitter
	private int y;
	
	@Override
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		// TODO Auto-generated method stub
		menu = new Image("res/MainMenu/mm.png");
		cursor = new Image("res/MainMenu/Cursor.png");
		pos = 0;
		y = Y1;
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub
		menu.draw(0,0);
		cursor.draw(X,y);
		
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		// TODO Auto-generated method stub		
		Input input = gc.getInput();
		if ((input.isKeyDown(Input.KEY_DOWN) || input.isKeyDown(Input.KEY_S)) && pos == 0) {
			y = Y2;
			pos = 1;
		}		
		if ((input.isKeyDown(Input.KEY_UP) || input.isKeyDown(Input.KEY_Z)) && pos == 1) {
			y = Y1;
			pos = 0;
		}		
		if (input.isKeyDown(Input.KEY_ENTER)) {
			if (pos == 0) {
				sbg.enterState(GameState.ID);
			}
			if (pos == 1) {
				gc.exit();
			}
		}
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return ID;
	}

}
