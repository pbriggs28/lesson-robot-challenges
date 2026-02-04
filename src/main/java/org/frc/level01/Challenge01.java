package org.frc.level01;

// LEVEL 01 — ROBOT TELEMETRY BASICS
//
// In this level, you will build a simple telemetry line for a robot.
// Telemetry is just "robot status info" printed in a consistent format.
//
// This level is intentionally simple.
// It teaches:
//   - variables
//   - method inputs (parameters)
//   - returning a value (instead of printing inside the method)
//   - formatting output consistently
//
// FILE ROLES:
//   - Challenge01:
//       * explains the assignment
//       * provides a manual demo entry point (optional)
//   - Solution01:
//       * where ALL logic for this level belongs
//       * you implement getTelemetry here
//   - Solution01Test:
//       * the scoreboard
//       * run tests to confirm your method works
//
// HOW TO USE Solution01Test:
//   - Do NOT edit the test file
//   - Run tests using:
//       ./gradlew test
//     or the green test arrow in IntelliJ
//   - If a test fails:
//       * read expected vs actual
//       * fix Solution01 until tests pass
//
// COMPLETION RULE:
//   - When all tests pass, Level 01 is complete.

public class Challenge01 {
    
    public static void main(String[] args) {
        
        // set up robot state using variables
        String robotName = "Alpha";
        int robotSpeed = 5;
        boolean robotEnabled = true;
        
        // build telemetry using the solution method
        String telemetry = Solution01.getTelemetry(robotName, robotSpeed, robotEnabled);
        
        // print for a human to see (manual demo)
        System.out.println(telemetry);
    }
}
