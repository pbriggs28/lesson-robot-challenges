package org.frc.level05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution05Test {
    
    // THIS FILE IS YOUR SCOREBOARD
    //
    // These tests verify that:
    //   - distance accumulates correctly per tick
    //   - battery drains correctly per tick
    //   - movement stops when battery reaches 0
    //   - battery never goes negative (implied by correct stopping behavior)
    
    /**
     * If battery lasts long enough, robot should run all ticks.
     */
    @Test
    void simulate_runsAllTicks_whenBatteryIsEnough() {
        
        // battery: 50
        // drain per tick: 5
        // maxTicks: 10
        // battery will reach 0 exactly after 10 drains
        int actual = Solution05.simulateDistanceUntilBatteryDead(3, 10, 50.0, 5.0);
        
        // moves every tick because battery is still > 0 at start of each tick
        int expected = 3 * 10;
        
        assertEquals(expected, actual,
                "Expected full distance over all ticks when battery is enough");
    }
    
    /**
     * Robot should stop early when battery runs out.
     */
    @Test
    void simulate_stopsEarly_whenBatteryRunsOut() {
        
        // battery: 10
        // drain per tick: 6
        //
        // tick 1: battery 10 -> move, then drain to 4
        // tick 2: battery 4  -> move, then drain to -2 (clamp to 0)
        // tick 3: battery 0  -> should stop BEFORE moving
        //
        // total moves = 2 ticks
        int actual = Solution05.simulateDistanceUntilBatteryDead(4, 10, 10.0, 6.0);
        
        int expected = 4 * 2;
        
        assertEquals(expected, actual,
                "Expected robot to stop moving once battery reaches 0");
    }
    
    /**
     * If starting battery is already 0, robot should not move at all.
     */
    @Test
    void simulate_noMovement_whenStartingBatteryIsZero() {
        
        int actual = Solution05.simulateDistanceUntilBatteryDead(5, 10, 0.0, 3.0);
        
        int expected = 0;
        
        assertEquals(expected, actual,
                "Robot should not move if starting battery is 0");
    }
    
    /**
     * If speed is 0, distance should remain 0 even if battery drains.
     */
    @Test
    void simulate_zeroSpeed_resultsInZeroDistance() {
        
        int actual = Solution05.simulateDistanceUntilBatteryDead(0, 10, 50.0, 5.0);
        
        int expected = 0;
        
        assertEquals(expected, actual,
                "Zero speed should produce zero distance");
    }
}
