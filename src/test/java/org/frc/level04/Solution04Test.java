package org.frc.level04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution04Test {
    
    // THIS FILE IS YOUR SCOREBOARD
    //
    // These tests verify that you are correctly using a loop
    // to accumulate distance over time.
    
    /**
     * Verifies basic distance accumulation.
     */
    @Test
    void calculateDistance_basicCase() {
        
        int actual = Solution04.calculateDistance(3, 5);
        
        int expected = 15;
        
        assertEquals(expected, actual,
                "Expected distance to be 15 (3 units over 5 ticks)");
    }
    
    /**
     * Verifies that zero ticks results in zero distance.
     */
    @Test
    void calculateDistance_zeroTicks() {
        
        int actual = Solution04.calculateDistance(5, 0);
        
        int expected = 0;
        
        assertEquals(expected, actual,
                "Zero ticks should result in zero distance");
    }
    
    /**
     * Verifies that zero speed results in zero distance.
     */
    @Test
    void calculateDistance_zeroSpeed() {
        
        int actual = Solution04.calculateDistance(0, 10);
        
        int expected = 0;
        
        assertEquals(expected, actual,
                "Zero speed should result in zero distance");
    }
}
