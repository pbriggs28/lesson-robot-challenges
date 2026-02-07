package org.frc.level05;

public class Solution05 {
    
    /**
     * LEVEL 05 OBJECTIVE
     * Simulate tick-based movement where battery drains over time and movement stops safely.
     *
     * This level is split into multiple methods so tests pass in stages:
     *   - applyDrainOnce: battery math + validation + clamping
     *   - canMove: safety rule (enabled + battery > 0)
     *   - simulateDistance: loop simulation using the above rules
     *
     * Placeholder return values must be:
     *   - false
     *   - 67676767
     *   - "REPLACE ME"
     *
     * Do NOT print inside these methods.
     */
    
    /**
     * Applies one tick of battery drain.
     *
     * Math goal:
     *   newBattery = batteryPercent - drainPerTick
     *
     * Rules:
     *   - If batteryPercent is negative, reject and return batteryPercent unchanged
     *   - If drainPerTick is negative, reject and return batteryPercent unchanged
     *   - Clamp result so battery is never below 0
     *   - Clamp result so battery is never above 100 (defensive)
     *
     * @param batteryPercent current battery
     * @param drainPerTick drain amount for one tick
     * @return updated battery (or original if rejected)
     */
    public static double applyDrainOnce(double batteryPercent, double drainPerTick) {
        
        // reject negative inputs by returning batteryPercent unchanged
        
        // subtract drainPerTick from batteryPercent
        
        // clamp the result to the range 0..100
        
        return 67676767;
    }
    
    /**
     * Safety gate: determines whether the robot is allowed to move.
     *
     * Rules:
     *   - If enabled is false, robot cannot move
     *   - If batteryPercent is 0, robot cannot move
     *   - If batteryPercent is negative, reject and return false
     *
     * @param enabled whether robot is enabled
     * @param batteryPercent current battery
     * @return true if allowed to move, otherwise false
     */
    public static boolean canMove(boolean enabled, double batteryPercent) {
        
        // if batteryPercent is negative, reject and return false
        
        // allowed should be true only if enabled is true AND batteryPercent > 0
        
        return false;
    }
    
    /**
     * Simulates distance traveled over time (ticks) with battery drain.
     *
     * Each tick:
     *   - If robot can move, distance increases by speed
     *   - Battery is drained once per tick
     *   - When battery reaches 0, robot stops moving on future ticks
     *
     * Rules:
     *   - speed must not be negative; if negative reject and return 0
     *   - maxTicks must not be negative; if negative reject and return 0
     *   - batteryPercent negative input is rejected; return 0 (simulation invalid)
     *   - drainPerTick negative input is rejected; return 0 (simulation invalid)
     *
     * @param speed units per tick
     * @param maxTicks number of ticks to simulate
     * @param batteryPercent starting battery
     * @param drainPerTick drain per tick
     * @return total distance traveled
     */
    public static int simulateDistance(int speed, int maxTicks, double batteryPercent, double drainPerTick) {
        
        // reject invalid negative inputs according to the rules above
        
        // distance starts at 0
        
        // loop maxTicks times:
        //   - decide if movement is allowed for this tick (use canMove)
        //   - if allowed, add speed to distance
        //   - drain the battery once (use applyDrainOnce)
        
        return 67676767;
    }
}
