package cEngine;

// CSE 142 Homework 8 (Critters)
// Authors: Stuart Reges and Marty Stepp
//
// CritterMain provides the main method for a simple simulation program.  Alter
// the number of each critter added to the simulation if you want to experiment
// with different scenarios.  You can also alter the width and height passed to
// the CritterFrame constructor.

public class CritterMain {
    public static void main(String[] args) {
        // The final number passed to CritterFrame is a scalar
        // to change the size of the display. If you want it to look
        // bigger, just change the value to 1.5, 2.0, etc.
        CritterFrame frame = new CritterFrame(60, 40, 1.0);
        // frame.add(30, Bear.class);
        // frame.add(30, Lion.class);
        // frame.add(30, Giant.class);
        // frame.add(30, Husky.class);

        //frame.add(30, FlyTrap.class);
        //frame.add(30, Food.class);

        frame.start();
    }
}
