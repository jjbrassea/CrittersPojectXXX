package cGame.TEST;

import java.awt.Color;

import cEngine.Critter;
import cEngine.CritterInfo;
import cGame.InputManager;
import cEngine.Critter.Action;
import cEngine.Critter.Neighbor;

public class TEST extends Critter {
	
	Direction dir = Direction.NORTH;
	
	public Action getMove(CritterInfo info) {
		dir = info.getDirection();
		
		if(InputManager.getSinglton().isPressed('w')){
			return Action.HOP;
		}else if(InputManager.getSinglton().isPressed('a')){
			return Action.LEFT;
		}else if(InputManager.getSinglton().isPressed('d')){
			return Action.RIGHT;
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
