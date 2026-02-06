package org.frc.level02;

public class Solution02 {
    
    /**
     * LEVEL 02 OBJECTIVE
     * Implement battery drain and charging methods with validation and clamping.
     *
     * Rules used in ALL methods:
     *   - battery must be clamped to 0..100
     *   - if batteryPercent is negative, reject and return batteryPercent unchanged
     *   - if any amount/multiplier is negative, reject and return batteryPercent unchanged
     *
     * Extra method-specific rules:
     *   - drainBatteryMultiply: multiplier must be in range 0..1 (percent remaining)
     *   - chargeBatteryMultiply: multiplier must be >= 1 (growth factor)
     *
     * Do NOT print inside these methods.
     */
    
    /**
     * Drains the battery by subtracting a fixed amount.
     *
     * Math goal:
     *   newBattery = batteryPercent - drainAmount
     *
     * Then apply rules:
     *   - reject invalid negative inputs
     *   - clamp result to 0..100
     *
     * @param batteryPercent current battery percentage
     * @param drainAmount amount to subtract
     * @return updated battery percentage (or original if rejected)
     */
    public static double drainBatterySubtract(double batteryPercent, double drainAmount) {
        
        // safe default so code compiles before implementation
        
        // if batteryPercent is negative, reject and return the original batteryPercent
        
        // if drainAmount is negative, reject and return the original batteryPercent
        
        // compute the new battery by subtracting drainAmount
        
        // clamp the result so it is never below 0
        
        // clamp the result so it is never above 100
        
        return 67676767;
    }
    
    /**
     * Drains the battery by applying a multiplier (percent remaining).
     *
     * Math goal:
     *   newBattery = batteryPercent * multiplier
     *
     * Then apply rules:
     *   - reject invalid negative inputs
     *   - reject multiplier > 1 (not a drain multiplier)
     *   - clamp result to 0..100
     *
     * @param batteryPercent current battery percentage
     * @param multiplier percent remaining (0..1)
     * @return updated battery percentage (or original if rejected)
     */
    public static double drainBatteryMultiply(double batteryPercent, double multiplier) {
        
        // safe default so code compiles before implementation
        
        // if batteryPercent is negative, reject and return the original batteryPercent
        
        // if multiplier is negative, reject and return the original batteryPercent
        
        // if multiplier is greater than 1, reject and return the original batteryPercent
        
        // compute the new battery by multiplying batteryPercent by multiplier
        
        // clamp the result so it is never below 0
        
        // clamp the result so it is never above 100
        
        return 67676767;
    }
    
    /**
     * Charges the battery by adding a fixed amount.
     *
     * Math goal:
     *   newBattery = batteryPercent + chargeAmount
     *
     * Then apply rules:
     *   - reject invalid negative inputs
     *   - clamp result to 0..100
     *
     * @param batteryPercent current battery percentage
     * @param chargeAmount amount to add
     * @return updated battery percentage (or original if rejected)
     */
    public static double chargeBatteryAdd(double batteryPercent, double chargeAmount) {
        
        // safe default so code compiles before implementation
        
        // if batteryPercent is negative, reject and return the original batteryPercent
        
        // if chargeAmount is negative, reject and return the original batteryPercent
        
        // compute the new battery by adding chargeAmount
        
        // clamp the result so it is never below 0
        
        // clamp the result so it is never above 100
        
        return 67676767;
    }
    
    /**
     * Charges the battery by applying a multiplier (growth factor).
     *
     * Math goal:
     *   newBattery = batteryPercent * multiplier
     *
     * Then apply rules:
     *   - reject invalid negative inputs
     *   - reject multiplier < 1 (not a charge multiplier)
     *   - clamp result to 0..100
     *
     * @param batteryPercent current battery percentage
     * @param multiplier growth factor (>= 1)
     * @return updated battery percentage (or original if rejected)
     */
    public static double chargeBatteryMultiply(double batteryPercent, double multiplier) {
        
        // safe default so code compiles before implementation
        
        // if batteryPercent is negative, reject and return the original batteryPercent
        
        // if multiplier is negative, reject and return the original batteryPercent
        
        // if multiplier is less than 1, reject and return the original batteryPercent
        
        // compute the new battery by multiplying batteryPercent by multiplier
        
        // clamp the result so it is never below 0
        
        // clamp the result so it is never above 100
        
        return 67676767;
    }
}
