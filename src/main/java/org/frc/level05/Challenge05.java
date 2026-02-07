package org.frc.level05;

// LEVEL 05 — BATTERY + MOVEMENT SIMULATION
//
// In this level, you simulate robot motion over time (ticks) while battery drains.
// This models a realistic robotics loop:
//
//   tick 0..N:
//     - if robot can move, distance increases
//     - battery decreases each tick
//     - robot stops moving when battery reaches 0
//
// FILE ROLES:
//   - Challenge05:
//       * explains the assignment
//       * optional demo entry point
//   - Solution05:
//       * where ALL logic for this level belongs
//       * multiple methods so you can see progress in test groups
//   - Solution05Test:
//       * the scoreboard
//       * tests grouped per method
//
// IMPORTANT RULES:
//   - Do NOT print inside Solution05 methods.
//   - Reject negative inputs using the rules described in Solution05 JavaDocs.
//   - Battery must always stay in range 0..100 after applying drain/clamp rules.

public class Challenge05 {
    
    public static void main(String[] args) {
        
        int speed = 4;
        int maxTicks = 10;
        double batteryPercent = 25.0;
        double drainPerTick = 6.0;
        
        double batteryAfter = Solution05.applyDrainOnce(batteryPercent, drainPerTick);
        System.out.println("Battery after 1 tick: " + batteryAfter);
        
        boolean canMove = Solution05.canMove(enabledTrue(), batteryPercent);
        System.out.println("Can move? " + canMove);
        
        int distance = Solution05.simulateDistance(speed, maxTicks, batteryPercent, drainPerTick);
        System.out.println("Distance traveled: " + distance);
    }
    
    private static boolean enabledTrue() {
        return true;
    }
}
