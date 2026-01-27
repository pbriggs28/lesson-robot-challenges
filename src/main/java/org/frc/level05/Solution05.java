package org.frc.level05;

public class Solution05 {
    
    // YOU EDIT THIS FILE
    //
    // Goal:
    //   - simulate movement tick-by-tick
    //   - distance increases by speed each tick
    //   - battery decreases by drainPerTick each tick
    //   - robot stops moving if battery hits 0
    //
    // Important:
    //   - battery cannot go below 0 (clamp)
    //   - return ONLY the final distance (tests verify behavior)
    
    /**
     * Simulates a robot driving forward over time with battery drain.
     *
     * Each tick:
     *   - if battery is greater than 0, robot moves (distance += speed)
     *   - battery decreases by drainPerTick
     *   - battery must be clamped to 0 (no negatives)
     *
     * The simulation ends when:
     *   - maxTicks have happened, OR
     *   - battery reaches 0 (robot should not move on battery=0)
     *
     * This method should NOT print anything.
     *
     * @param speed units moved per tick
     * @param maxTicks maximum number of ticks to simulate
     * @param batteryPercent starting battery percentage
     * @param drainPerTick battery drain per tick
     * @return total distance traveled before stopping
     */
    public static int simulateDistanceUntilBatteryDead(int speed, int maxTicks, double batteryPercent, double drainPerTick) {
        
        // STEP 1: create a variable to track distance
        int distance = 0;
        
        // STEP 2: create a variable to track the current battery
        double battery = batteryPercent;
        
        // STEP 3: loop over ticks (up to maxTicks)
        // for (int tick = 0; tick < maxTicks; tick++) {
        //
        //     STEP 4: if battery is 0, stop the simulation early
        //     // if (battery <= 0) { break; }
        //
        //     STEP 5: move the robot for this tick (distance += speed)
        //
        //     STEP 6: drain the battery for this tick (battery -= drainPerTick)
        //
        //     STEP 7: clamp battery so it never goes below 0
        //     // if (battery < 0) { battery = 0; }
        //
        // }
        
        
        
        // STEP 8: return final distance
        return distance;
    }
}
