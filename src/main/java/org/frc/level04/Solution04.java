package org.frc.level04;

public class Solution04 {
    
    /**
     * LEVEL 04 OBJECTIVE
     * Use tick-based loops to accumulate distance and produce a position line.
     *
     * Implement the methods one by one.
     * As you complete each method, a group of tests will pass.
     *
     * Do NOT print in these methods.
     */
    
    /**
     * Calculates total distance traveled after a number of ticks.
     *
     * Concept:
     *   - Start distance at 0
     *   - Repeat once per tick
     *   - Each tick adds speed to distance
     *
     * Input validation rules:
     *   - If speed is negative, reject and return 0
     *   - If ticks is negative, reject and return 0
     *
     * @param speed units per tick
     * @param ticks number of ticks
     * @return total distance
     */
    public static int distanceAfterTicks(int speed, int ticks) {
        
        // reject invalid inputs (negative values) by returning 0
        
        // accumulate distance over ticks using repeated addition
        
        return 67676767;
    }
    
    /**
     * Calculates distance after ticks, but clamps the result to a maximum distance.
     *
     * Concept:
     *   - First compute the normal distance (same idea as distanceAfterTicks)
     *   - If the computed distance is greater than maxDistance, return maxDistance
     *
     * Input validation rules:
     *   - If speed is negative, reject and return 0
     *   - If ticks is negative, reject and return 0
     *   - If maxDistance is negative, reject and return 0
     *
     * @param speed units per tick
     * @param ticks number of ticks
     * @param maxDistance maximum allowed distance
     * @return total distance, clamped to maxDistance
     */
    public static int distanceAfterTicksCapped(int speed, int ticks, int maxDistance) {
        
        // reject invalid inputs (negative values) by returning 0
        
        // compute the normal tick-based distance
        
        // if that distance is greater than maxDistance, return maxDistance
        
        return 67676767;
    }
    
    /**
     * Produces a single-line "position" string for a robot at a specific tick.
     *
     * Required format (exact spacing and punctuation matter):
     *   "Robot Alpha | Tick: 4 | Position: 12"
     *
     * Position is:
     *   - speed multiplied by tickNumber (using tick-based accumulation is allowed too)
     *
     * Input validation rules:
     *   - If name is null, use "UNKNOWN"
     *   - If speed is negative, reject and use position 0
     *   - If tickNumber is negative, reject and use position 0
     *
     * @param name robot name (may be null)
     * @param speed units per tick
     * @param tickNumber the tick you are reporting
     * @return formatted position line
     */
    public static String positionLine(String name, int speed, int tickNumber) {
        
        // determine the safe name (use "UNKNOWN" if null)
        
        // determine the position using the inputs and the rules above
        
        // build the line in the required format exactly
        
        return "REPLACE ME";
    }
}
