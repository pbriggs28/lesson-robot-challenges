package org.frc.level02;

// LEVEL 02 — BATTERY DRAIN SIMULATION
//
// In this level, you are modeling something every real robot experiences:
// battery drain over time.
//
// So far, you have used variables to store state.
// Now you will practice UPDATING numeric state using math.
//
// FILE ROLES:
//   - Challenge02:
//       * explains the assignment
//       * demonstrates how the solution is intended to be used
//       * may be run manually for visual output
//
//   - Solution02:
//       * where ALL logic for this level belongs
//       * methods must return values (do not print)
//
//   - SolutionTest02:
//       * automatically checks whether your Solution02 methods work correctly
//       * acts like a scoreboard: pass = correct, fail = fix your logic
//
// HOW TO USE SolutionTest02:
//   - Do NOT edit the test file
//   - Run the tests using:
//       ./gradlew test
//     or by clicking the green test arrow in IntelliJ
//   - If a test fails:
//       * read the failure message
//       * compare expected vs actual values
//       * fix Solution02 until the test passes
//
// IMPORTANT RULES:
//   - battery percentage should NEVER go below 0
//   - subtraction-based drain and percentage-based drain are BOTH common
//   - do not print inside Solution02 methods
//
// Once all tests pass, the level is considered COMPLETE.

public class Challenge02 {
    
    public static void main(String[] args) {
        
        double batteryPercent = 100.0;
        
        System.out.println("Starting battery: " + batteryPercent + "%");
        
        // call the subtraction-based drain method
        // example: drain the battery by a fixed amount
        
        
        
        // call the multiplication-based drain method
        // example: drain the battery by a percentage
        
        
        
        System.out.println("Final battery: " + batteryPercent + "%");
    }
}
