package org.frc.level02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution02Test {
    
    // THIS FILE IS YOUR SCOREBOARD
    //
    // This test suite is intentionally thorough.
    // It checks:
    //   - normal behavior
    //   - boundaries (0 and 100)
    //   - invalid inputs (negatives and invalid multipliers)
    //   - clamping behavior
    //
    // You should NOT edit this file.
    
    @Test
    void drainSubtract_basic() {
        double actual = Solution02.drainBatterySubtract(100.0, 12.5);
        assertEquals(87.5, actual, 0.0001);
    }
    
    @Test
    void drainSubtract_clampsAtZero() {
        double actual = Solution02.drainBatterySubtract(5.0, 10.0);
        assertEquals(0.0, actual, 0.0001);
    }
    
    @Test
    void drainSubtract_zeroDrain_noChange() {
        double actual = Solution02.drainBatterySubtract(42.0, 0.0);
        assertEquals(42.0, actual, 0.0001);
    }
    
    @Test
    void drainSubtract_negativeDrain_rejected_noChange() {
        double actual = Solution02.drainBatterySubtract(50.0, -1.0);
        assertEquals(50.0, actual, 0.0001);
    }
    
    @Test
    void drainSubtract_negativeBattery_rejected_noChange() {
        double actual = Solution02.drainBatterySubtract(-10.0, 5.0);
        assertEquals(-10.0, actual, 0.0001);
    }
    
    @Test
    void drainMultiply_basic() {
        double actual = Solution02.drainBatteryMultiply(80.0, 0.9);
        assertEquals(72.0, actual, 0.0001);
    }
    
    @Test
    void drainMultiply_multiplierZero_resultsInZero() {
        double actual = Solution02.drainBatteryMultiply(80.0, 0.0);
        assertEquals(0.0, actual, 0.0001);
    }
    
    @Test
    void drainMultiply_multiplierOne_noChange() {
        double actual = Solution02.drainBatteryMultiply(33.3, 1.0);
        assertEquals(33.3, actual, 0.0001);
    }
    
    @Test
    void drainMultiply_multiplierGreaterThanOne_rejected_noChange() {
        double actual = Solution02.drainBatteryMultiply(50.0, 1.1);
        assertEquals(50.0, actual, 0.0001);
    }
    
    @Test
    void drainMultiply_negativeMultiplier_rejected_noChange() {
        double actual = Solution02.drainBatteryMultiply(50.0, -0.5);
        assertEquals(50.0, actual, 0.0001);
    }
    
    @Test
    void chargeAdd_basic() {
        double actual = Solution02.chargeBatteryAdd(40.0, 10.0);
        assertEquals(50.0, actual, 0.0001);
    }
    
    @Test
    void chargeAdd_clampsAtHundred() {
        double actual = Solution02.chargeBatteryAdd(95.0, 10.0);
        assertEquals(100.0, actual, 0.0001);
    }
    
    @Test
    void chargeAdd_zeroCharge_noChange() {
        double actual = Solution02.chargeBatteryAdd(50.0, 0.0);
        assertEquals(50.0, actual, 0.0001);
    }
    
    @Test
    void chargeAdd_negativeCharge_rejected_noChange() {
        double actual = Solution02.chargeBatteryAdd(50.0, -3.0);
        assertEquals(50.0, actual, 0.0001);
    }
    
    @Test
    void chargeMultiply_basic() {
        double actual = Solution02.chargeBatteryMultiply(50.0, 1.2);
        assertEquals(60.0, actual, 0.0001);
    }
    
    @Test
    void chargeMultiply_clampsAtHundred() {
        double actual = Solution02.chargeBatteryMultiply(95.0, 1.2);
        assertEquals(100.0, actual, 0.0001);
    }
    
    @Test
    void chargeMultiply_multiplierOne_noChange() {
        double actual = Solution02.chargeBatteryMultiply(77.7, 1.0);
        assertEquals(77.7, actual, 0.0001);
    }
    
    @Test
    void chargeMultiply_multiplierLessThanOne_rejected_noChange() {
        double actual = Solution02.chargeBatteryMultiply(50.0, 0.9);
        assertEquals(50.0, actual, 0.0001);
    }
    
    @Test
    void chargeMultiply_negativeMultiplier_rejected_noChange() {
        double actual = Solution02.chargeBatteryMultiply(50.0, -1.0);
        assertEquals(50.0, actual, 0.0001);
    }
    
    @Test
    void sequence_drainThenCharge_behavesPredictably() {
        double battery = 80.0;
        
        battery = Solution02.drainBatterySubtract(battery, 10.0);
        battery = Solution02.chargeBatteryAdd(battery, 15.0);
        
        assertEquals(85.0, battery, 0.0001);
    }
}
