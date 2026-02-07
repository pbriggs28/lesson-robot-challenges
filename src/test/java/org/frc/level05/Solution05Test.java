package org.frc.level05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution05Test {
    
    // THIS FILE IS YOUR SCOREBOARD
    //
    // Tests are grouped by method so students see progress:
    //   Group A: applyDrainOnce
    //   Group B: canMove
    //   Group C: simulateDistance
    //
    // These tests focus on common mistakes:
    //   - forgetting to reject negatives
    //   - forgetting to clamp
    //   - draining in wrong order
    //   - moving when battery is 0
    //   - draining multiple times per tick or not at all
    //   - ignoring enabled state
    
    // ---------------------------------------
    // GROUP A: applyDrainOnce
    // ---------------------------------------
    
    @Test
    void applyDrainOnce_basicDrain() {
        double actual = Solution05.applyDrainOnce(50.0, 6.0);
        assertEquals(44.0, actual, 0.0001);
    }
    
    @Test
    void applyDrainOnce_zeroDrain_noChange() {
        double actual = Solution05.applyDrainOnce(50.0, 0.0);
        assertEquals(50.0, actual, 0.0001);
    }
    
    @Test
    void applyDrainOnce_exactlyHitsZero() {
        double actual = Solution05.applyDrainOnce(6.0, 6.0);
        assertEquals(0.0, actual, 0.0001);
    }
    
    @Test
    void applyDrainOnce_overDrains_clampsToZero() {
        double actual = Solution05.applyDrainOnce(5.0, 10.0);
        assertEquals(0.0, actual, 0.0001);
    }
    
    @Test
    void applyDrainOnce_batteryAlreadyZero_staysZero() {
        double actual = Solution05.applyDrainOnce(0.0, 5.0);
        assertEquals(0.0, actual, 0.0001);
    }
    
    @Test
    void applyDrainOnce_negativeDrain_rejected_noChange() {
        double actual = Solution05.applyDrainOnce(50.0, -1.0);
        assertEquals(50.0, actual, 0.0001);
    }
    
    @Test
    void applyDrainOnce_negativeBattery_rejected_noChange() {
        double actual = Solution05.applyDrainOnce(-10.0, 5.0);
        assertEquals(-10.0, actual, 0.0001);
    }
    
    // ---------------------------------------
    // GROUP B: canMove
    // ---------------------------------------
    
    @Test
    void canMove_enabledAndPositiveBattery_allows() {
        assertTrue(Solution05.canMove(true, 1.0));
    }
    
    @Test
    void canMove_enabledAndZeroBattery_blocks() {
        assertFalse(Solution05.canMove(true, 0.0));
    }
    
    @Test
    void canMove_disabledAndPositiveBattery_blocks() {
        assertFalse(Solution05.canMove(false, 50.0));
    }
    
    @Test
    void canMove_disabledAndZeroBattery_blocks() {
        assertFalse(Solution05.canMove(false, 0.0));
    }
    
    @Test
    void canMove_negativeBattery_rejectedBlocks() {
        assertFalse(Solution05.canMove(true, -0.0001));
    }
    
    // ---------------------------------------
    // GROUP C: simulateDistance
    // ---------------------------------------
    
    @Test
    void simulateDistance_runsAllTicks_whenBatteryNeverHitsZero() {
        // battery: 100, drain 1 for 10 ticks => still > 0 each tick
        int actual = Solution05.simulateDistance(3, 10, 100.0, 1.0);
        assertEquals(30, actual);
    }
    
    @Test
    void simulateDistance_stopsMoving_afterBatteryReachesZero() {
        // battery: 10, drain 6
        // tick1: battery 10 -> move, drain to 4
        // tick2: battery 4  -> move, drain to 0 (clamped)
        // tick3: battery 0  -> no move
        int actual = Solution05.simulateDistance(4, 10, 10.0, 6.0);
        assertEquals(8, actual);
    }
    
    @Test
    void simulateDistance_startingBatteryZero_noMovement() {
        int actual = Solution05.simulateDistance(5, 10, 0.0, 1.0);
        assertEquals(0, actual);
    }
    
    @Test
    void simulateDistance_zeroTicks_isZero() {
        int actual = Solution05.simulateDistance(5, 0, 50.0, 1.0);
        assertEquals(0, actual);
    }
    
    @Test
    void simulateDistance_zeroSpeed_isZeroEvenIfBatteryDrains() {
        int actual = Solution05.simulateDistance(0, 10, 50.0, 5.0);
        assertEquals(0, actual);
    }
    
    @Test
    void simulateDistance_negativeSpeed_rejectedIsZero() {
        int actual = Solution05.simulateDistance(-1, 10, 50.0, 1.0);
        assertEquals(0, actual);
    }
    
    @Test
    void simulateDistance_negativeTicks_rejectedIsZero() {
        int actual = Solution05.simulateDistance(5, -1, 50.0, 1.0);
        assertEquals(0, actual);
    }
    
    @Test
    void simulateDistance_negativeBattery_rejectedIsZero() {
        int actual = Solution05.simulateDistance(5, 10, -10.0, 1.0);
        assertEquals(0, actual);
    }
    
    @Test
    void simulateDistance_negativeDrain_rejectedIsZero() {
        int actual = Solution05.simulateDistance(5, 10, 50.0, -1.0);
        assertEquals(0, actual);
    }
    
    @Test
    void simulateDistance_drainZero_movesEveryTick() {
        int actual = Solution05.simulateDistance(2, 5, 1.0, 0.0);
        assertEquals(10, actual);
    }
    
    @Test
    void simulateDistance_orderMatters_mustNotMoveWhenBatteryIsZero() {
        // Common student bug: drain first then decide to move OR move even when battery is 0.
        // Starting at 0 should never allow a move.
        int actual = Solution05.simulateDistance(99, 1, 0.0, 0.0);
        assertEquals(0, actual);
    }
    
    @Test
    void simulateDistance_deterministic_sameInputsSameOutput() {
        int a = Solution05.simulateDistance(3, 10, 10.0, 1.0);
        int b = Solution05.simulateDistance(3, 10, 10.0, 1.0);
        assertEquals(a, b);
    }
}
