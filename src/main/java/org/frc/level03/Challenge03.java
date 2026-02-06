package org.frc.level03;

// LEVEL 03 — ENABLE / DISABLE LOGIC
//
// In this level, you are modeling a core robotics concept:
// whether the robot is ENABLED or DISABLED.
//
// Robots must not move when disabled.
// Booleans are used constantly to enforce safety rules.
//
// FILE ROLES:
//   - Challenge03:
//       * explains the assignment
//       * optional demo entry point
//
//   - Solution03:
//       * where ALL logic for this level belongs
//
//   - Solution03Test:
//       * the scoreboard
//       * run tests until all pass
//
// HOW TO COMPLETE THE LEVEL:
//   - Implement the methods in Solution03
//   - Run Solution03Test until all tests pass
//   - Do NOT put logic in this file

public class Challenge03 {
    
    public static void main(String[] args) {
        
        boolean enabled = false;
        int speed = 5;
        
        System.out.println("Enabled: " + enabled);
        
        // flip enabled using Solution03
        enabled = Solution03.flipEnabled(enabled);
        
        System.out.println("Enabled: " + enabled);
        
        // check if the robot is allowed to move
        boolean allowed = Solution03.canMove(enabled);
        
        if (allowed) {
            System.out.println("Robot is allowed to move at speed " + speed);
        } else {
            System.out.println("Robot must NOT move because it is disabled");
        }
    }
}
