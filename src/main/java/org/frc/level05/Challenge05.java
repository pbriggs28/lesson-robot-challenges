package org.frc.level05;

// LEVEL 05 — ACCUMULATING STATE + STOP CONDITIONS
//
// In Level 04, you accumulated distance over time.
// In this level, you will simulate multiple pieces of robot state at once.
//
// Robot state changes every tick:
//   - distance increases as the robot moves
//   - battery decreases as motors consume power
//
// New idea in this level:
//   - STOP CONDITION
//   - the robot should stop moving when battery reaches 0
//
// FILE ROLES:
//   - Challenge05:
//       * explains the assignment
//       * provides demo values (optional to run manually)
//
//   - Solution05:
//       * contains ALL logic for this level
//
//   - Solution05Test:
//       * automatically checks your logic
//
// HOW TO COMPLETE THE LEVEL:
//   - Implement simulateDistanceUntilBatteryDead in Solution05
//   - Run tests until all tests pass
//   - Do NOT put logic in this file

public class Challenge05 {
    
    public static void main(String[] args) {
        
        int speed = 4;                 // units per tick
        int maxTicks = 10;             // maximum ticks to simulate
        double batteryPercent = 25.0;  // starting battery
        double drainPerTick = 6.0;     // battery drain each tick
        
        // run the simulation
        // int distance = ...
        
        
        
        // System.out.println("Final distance: " + distance);
    }
}
