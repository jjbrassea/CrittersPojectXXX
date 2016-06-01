package cGame;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;

class Input{
	public final char key;
	public final boolean toggle; //If true, it will act as a toggle
	
	private boolean pressed = false;
	
	public Input(char key, boolean toggle){
		this.key = key;
		this.toggle = toggle;
	}
	
	public boolean isPressed(){
		return pressed;
	}
	protected void setPressed(boolean pressed){
		this.pressed = pressed;
	}
}

public class InputManager {
	private static InputManager singleInputManager = null;
	
	private ArrayList<Input> inputs = new ArrayList<Input>();
	
	
	public InputManager(){
		addKey('w', false);
		addKey('a', false);
		addKey('s', false);
		addKey('d', false);
	}
	
	public void addKey(char key, boolean isToggle){
		if(findKey(key) == null){
			inputs.add(new Input(key, isToggle));
		}
	}
	
	public Input findKey(char key){
		for(Input i : inputs){
			if(i.key == key){
				return i;
			}
		}
		return null;
	}
	
	public boolean isPressed(char key){
		Input i = findKey(key);
		if(i==null){return false;}
		return i.isPressed();
	}
	
	public void addListener(Component j){
		j.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
			//	System.out.println("test");
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			//	System.out.println("test");
				Input in = findKey(e.getKeyChar());
				
				if(in!=null && !in.toggle){
					in.setPressed(false);
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
			//	System.out.println("test");
				Input in = findKey(e.getKeyChar());
				
				if(in!=null && !in.toggle){
					//in.setPressed(true);
					in.setPressed((!in.toggle) ? true : !in.isPressed());
				}
			}
		});
	}
	
	/** Will return the singlton object. If none exists, it will create one.
	 * @return
	 */
	public static InputManager getSinglton(){
		if(singleInputManager == null){
			singleInputManager = new InputManager();
		}
		return singleInputManager;
	}
}
