package org.frc.level02;

public class Solution02 {
    
    // YOU EDIT THIS FILE
    //
    // Your job is to implement the two methods below so the tests pass.
    //
    // Big idea:
    //   - Robot state changes over time
    //   - We compute a NEW value based on the OLD value
    //   - Then we return that new value
    
    /**
     * Calculates a new battery percentage by subtracting a fixed drain amount.
     *
     * The returned battery value:
     *   - must be batteryPercent minus drainAmount
     *   - must NEVER be negative
     *   - must be clamped to 0 if subtraction would go below 0
     *
     * This method should NOT print anything.
     *
     * @param batteryPercent the current battery percentage
     * @param drainAmount the fixed amount to subtract
     * @return the updated battery percentage after drain
     */
    public static double drainBatterySubtract(double batteryPercent, double drainAmount) {
        
        // STEP 1: create a variable to store the new battery value
        double newBattery = 0;
        
        // STEP 2: subtract drainAmount from batteryPercent
        // example: 100 - 12.5 = 87.5
        // newBattery = ...
        
        
        
        // STEP 3: clamp the battery so it never goes below 0
        // if (newBattery < 0) {
        //     newBattery = 0;
        // }
        
        
        
        // STEP 4: return the new battery value
        return newBattery;
    }
    
    /**
     * Calculates a new battery percentage by applying a multiplier.
     *
     * The returned battery value:
     *   - must be batteryPercent multiplied by multiplier
     *   - must NEVER be negative
     *   - must be clamped to 0 if multiplication would go below 0
     *
     * Example:
     *   batteryPercent = 80
     *   multiplier = 0.9
     *   result = 72
     *
     * This method should NOT print anything.
     *
     * @param batteryPercent the current battery percentage
     * @param multiplier the percentage multiplier (ex: 0.9 = lose 10%)
     * @return the updated battery percentage after drain
     */
    public static double drainBatteryMultiply(double batteryPercent, double multiplier) {
        
        // STEP 1: create a variable to store the new battery value
        double newBattery = 0;
        
        // STEP 2: multiply batteryPercent by multiplier
        // example: 80 * 0.9 = 72
        // newBattery = ...
        
        
        
        // STEP 3: clamp the battery so it never goes below 0
        // even if multiplier is negative or batteryPercent is 0
        // if (newBattery < 0) {
        //     newBattery = 0;
        // }
        
        
        
        // STEP 4: return the new battery value
        return newBattery;
    }
}
