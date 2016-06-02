package cGame.critters;

import java.awt.Color;

import cEngine.Critter;
import cEngine.CritterInfo;
import cGame.InputManager;
import cEngine.Critter.Action;
import cEngine.Critter.Neighbor;

public class Player extends Critter {
	
	Direction dir = Direction.NORTH;
	
	public Action getMove(CritterInfo info) {
		dir = info.getDirection();
		
		
		if(InputManager.getSinglton().isPressed('w')){
			if(dir!=Direction.NORTH){
				if(dir==Direction.EAST){
					return Action.LEFT;
				}else{
					return Action.RIGHT;
				}
			}else{
				return Action.HOP;
			}
		}
		
		if(InputManager.getSinglton().isPressed('d')){
			if(dir!=Direction.EAST){
				if(dir==Direction.SOUTH){
					return Action.LEFT;
				}else{
					return Action.RIGHT;
				}
			}else{
				return Action.HOP;
			}
		}
		
		if(InputManager.getSinglton().isPressed('s')){
			if(dir!=Direction.SOUTH){
				if(dir==Direction.WEST){
					return Action.LEFT;
				}else{
					return Action.RIGHT;
				}
			}else{
				return Action.HOP;
			}
		}
		
		if(InputManager.getSinglton().isPressed('a')){
			if(dir!=Direction.WEST){
				if(dir==Direction.NORTH){
					return Action.LEFT;
				}else{
					return Action.RIGHT;
				}
			}else{
				return Action.HOP;
			}
		}
		return Action.INFECT;
    }

    public Color getColor() {
        return Color.BLUE;
    }

    public String toString() {
        switch(dir){
        case NORTH:
        	return "^";
        case EAST:
        	return ">";
        case SOUTH:
        	return "V";
        case WEST:
        	return "<";
        default:
        	return "ER";
        }
    }
}
