package org.frc.level03;

public class Solution03 {
    
    // YOU EDIT THIS FILE
    //
    // In this level, you will:
    //   - invert boolean values
    //   - make decisions based on booleans
    //
    // Boolean logic is the foundation of robot safety systems.
    
    /**
     * Flips the enabled state of the robot.
     *
     * If enabled is true, this method should return false.
     * If enabled is false, this method should return true.
     *
     * This method should NOT print anything.
     *
     * @param enabled the current enabled state
     * @return the opposite of the current state
     */
    public static boolean flipEnabled(boolean enabled) {
        
        // STEP 1: create a variable to store the flipped value
        boolean flipped = false;
        
        // STEP 2: check the value of enabled
        // if enabled is true, set flipped to false
        // otherwise, set flipped to true
        //
        // if (enabled == true) {
        //     flipped = false;
        // } else {
        //     flipped = true;
        // }
        
        
        
        // STEP 3: return the flipped value
        return flipped;
    }
    
    /**
     * Determines whether the robot is allowed to move.
     *
     * The robot may only move if:
     *   - it is enabled
     *
     * This method represents a basic safety gate.
     *
     * @param enabled the robot enabled state
     * @return true if the robot is allowed to move, false otherwise
     */
    public static boolean canMove(boolean enabled) {
        
        // STEP 1: create a variable to store the result
        boolean allowed = false;
        
        // STEP 2: decide whether movement is allowed
        // allowed should be true ONLY if enabled is true
        //
        // allowed = ...
        
        
        
        // STEP 3: return the result
        return allowed;
    }
}
