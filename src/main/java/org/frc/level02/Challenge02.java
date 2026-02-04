package org.frc.level02;

// LEVEL 02 — BATTERY DRAIN + CHARGING
//
// In this level, you will model battery percentage changing over time.
// Real robots constantly adjust internal state like battery, distance, speed, etc.
//
// You will implement four battery operations:
//   - drain by subtracting a fixed amount
//   - drain by applying a multiplier (percent remaining)
//   - charge by adding a fixed amount
//   - charge by applying a multiplier (growth factor)
//
// FILE ROLES:
//   - Challenge02:
//       * explains the assignment
//       * optional demo entry point (manual run)
//
//   - Solution02:
//       * where ALL logic for this level belongs
//
//   - Solution02Test:
//       * the scoreboard
//       * run tests to verify correctness
//
// HOW TO COMPLETE THE LEVEL:
//   - Implement the methods in Solution02
//   - Run Solution02Test until all tests pass
//   - Do NOT put logic in this file
//
// CORE RULES (DEFENSIVE CODING):
//   - battery is always clamped to the range 0..100
//   - negative inputs are rejected (return the original battery unchanged)
//   - drainBatteryMultiply multiplier must be in range 0..1
//   - chargeBatteryMultiply multiplier must be >= 1

public class Challenge02 {
    
    public static void main(String[] args) {
        
        double battery = 100.0;
        
        System.out.println("Start battery: " + battery);
        
        // optional demo: drain by fixed amount
        battery = Solution02.drainBatterySubtract(battery, 12.5);
        System.out.println("After drain subtract: " + battery);
        
        // optional demo: drain by multiplier (keep 90%)
        battery = Solution02.drainBatteryMultiply(battery, 0.9);
        System.out.println("After drain multiply: " + battery);
        
        // optional demo: charge by fixed amount
        battery = Solution02.chargeBatteryAdd(battery, 30.0);
        System.out.println("After charge add: " + battery);
        
        // optional demo: charge by multiplier (increase by 10%)
        battery = Solution02.chargeBatteryMultiply(battery, 1.1);
        System.out.println("After charge multiply: " + battery);
    }
}
