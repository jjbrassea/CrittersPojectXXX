package cGame.Critters;

import java.awt.Color;

import cEngine.Critter;
import cEngine.CritterInfo;
import cEngine.Critter.Action;
import cEngine.Critter.Neighbor;

public class Fred extends Critter {
	public Action getMove(CritterInfo info) {
		return Action.INFECT;
    }

    public Color getColor() {
        return Color.YELLOW;
    }

    public String toString() {
        return "F";
    }
}
