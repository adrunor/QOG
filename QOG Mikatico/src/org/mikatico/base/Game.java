package org.mikatico.base;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 * @author KAMI
 */
public class Game extends StateBasedGame {
	
	private Menu menu;
	private GameState gamestate;

	public Game(String title){
		super(title);
	}
	
	/**
	 * @param args
	 * @throws SlickException 
	 */
	public static void main(String[] args) throws SlickException {
		// TODO Auto-generated method stub
	           AppGameContainer container = new AppGameContainer(new Game("Quest Of The Grail"));  
	           container.setDisplayMode(800, 600, false);  
	           container.setTargetFrameRate(100);
	           container.setIcon("res/icon/IconQOG_16x16px.png");
	           container.setShowFPS(true);
	           container.setVSync(false);  
	           container.start();  
	}
	
	public void initStatesList(GameContainer container) throws SlickException {  
        // TODO Auto-generated method stub  
		menu = new Menu();
		addState(menu);
		gamestate = new GameState();
		addState(gamestate);
    } 

}
