package org.frc.level01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution01Test {
    
    @Test
    void telemetryFormat_enabledRobot() {
        String result = Solution01.getTelemetry("Alpha", 5, true);
        
        String expected = "Robot Alpha | Speed: 5 | Enabled: true";
        
        assertEquals(
                expected,
                result,
                "Telemetry output does not match expected format"
        );
    }
    
    @Test
    void telemetryFormat_disabledRobot() {
        String result = Solution01.getTelemetry("Beta", 3, false);
        
        String expected = "Robot Beta | Speed: 3 | Enabled: false";
        
        assertEquals(expected, result);
    }
}
