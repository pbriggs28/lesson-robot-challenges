package org.frc.level04;

// LEVEL 04 — TICKS, LOOPS, AND ACCUMULATION
//
// In robotics, time passes in repeated updates (ticks).
// Each tick is one step of the robot control loop.
//
// This level focuses on using loops to accumulate distance over time.
//
// FILE ROLES:
//   - Challenge04:
//       * explains the assignment
//       * optional demo entry point
//
//   - Solution04:
//       * where ALL logic for this level belongs
//       * you will implement multiple methods
//
//   - Solution04Test:
//       * the scoreboard
//       * tests are grouped by method so you see progress step-by-step
//
// HOW TO COMPLETE THE LEVEL:
//   - Implement ONE method at a time in Solution04
//   - Run Solution04Test
//   - Watch a group of tests turn green as you complete each method
//
// IMPORTANT:
//   - Do NOT put logic in this file
//   - Do NOT print inside Solution04 methods (return values instead)

public class Challenge04 {
    
    public static void main(String[] args) {
        
        int speed = 3;
        int ticks = 5;
        
        int distance = Solution04.distanceAfterTicks(speed, ticks);
        System.out.println("Distance after " + ticks + " ticks: " + distance);
        
        int capped = Solution04.distanceAfterTicksCapped(10, 10, 50);
        System.out.println("Capped distance: " + capped);
        
        String line = Solution04.positionLine("Alpha", 3, 4);
        System.out.println(line);
    }
}
