package org.frc.level01;

public class Solution01 {
    
    /**
     * Builds a single-line telemetry String for a robot.
     *
     * Required format (spacing and punctuation matter):
     *   "Robot Alpha | Speed: 5 | Enabled: true"
     *
     * Rules:
     *   - If name is null, use "UNKNOWN" instead of crashing.
     *   - Do not print inside this method.
     *   - Return the formatted String.
     *
     * @param name robot name (may be null)
     * @param speed robot speed (may be any int)
     * @param enabled robot enabled state
     * @return formatted telemetry line
     */
    public static String getTelemetry(String name, int speed, boolean enabled) {
        
        // create a variable to store the safe robot name
        String safeName = "";
        
        // if name is null, use "UNKNOWN"
        // otherwise, use the provided name
        if (name == null) {
            safeName = "UNKNOWN";
        } else {
            safeName = name;
        }
        
        // create a variable to hold the final telemetry string
        String telemetry = "";
        
        // build the telemetry string using the required format:
        // "Robot Alpha | Speed: 5 | Enabled: true"
        // use string concatenation (+) to combine pieces
        telemetry = "Robot " + safeName + " | Speed: " + speed + " | Enabled: " + enabled;
        
        // return the completed telemetry string
        return telemetry;
    }
}
