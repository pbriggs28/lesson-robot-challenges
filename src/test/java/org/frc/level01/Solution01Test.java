package org.frc.level01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution01Test {
    
    // THIS FILE IS YOUR SCOREBOARD
    //
    // These tests verify:
    //   - exact formatting
    //   - spacing and punctuation
    //   - enabled true/false
    //   - speed values (including 0 and negative)
    //   - name edge cases (empty string, spaces, null)
    //
    // If a test fails:
    //   - read expected vs actual carefully
    //   - fix Solution01.getTelemetry until all tests pass
    
    @Test
    void format_enabledTrue_basicCase() {
        String actual = Solution01.getTelemetry("Alpha", 5, true);
        String expected = "Robot Alpha | Speed: 5 | Enabled: true";
        assertEquals(expected, actual);
    }
    
    @Test
    void format_enabledFalse_basicCase() {
        String actual = Solution01.getTelemetry("Beta", 3, false);
        String expected = "Robot Beta | Speed: 3 | Enabled: false";
        assertEquals(expected, actual);
    }
    
    @Test
    void format_speedZero_isAllowed() {
        String actual = Solution01.getTelemetry("ZeroBot", 0, true);
        String expected = "Robot ZeroBot | Speed: 0 | Enabled: true";
        assertEquals(expected, actual);
    }
    
    @Test
    void format_negativeSpeed_isPrintedAsGiven() {
        String actual = Solution01.getTelemetry("ReverseBot", -2, true);
        String expected = "Robot ReverseBot | Speed: -2 | Enabled: true";
        assertEquals(expected, actual);
    }
    
    @Test
    void format_largeSpeed_isPrintedCorrectly() {
        String actual = Solution01.getTelemetry("FastBot", 123456, false);
        String expected = "Robot FastBot | Speed: 123456 | Enabled: false";
        assertEquals(expected, actual);
    }
    
    @Test
    void format_emptyName_isAllowed() {
        String actual = Solution01.getTelemetry("", 7, true);
        String expected = "Robot  | Speed: 7 | Enabled: true";
        assertEquals(expected, actual);
    }
    
    @Test
    void format_nameWithSpaces_isPreserved() {
        String actual = Solution01.getTelemetry("Blue Alliance", 4, true);
        String expected = "Robot Blue Alliance | Speed: 4 | Enabled: true";
        assertEquals(expected, actual);
    }
    
    @Test
    void format_nameWithLeadingTrailingSpaces_isPreserved() {
        String actual = Solution01.getTelemetry("  Alpha  ", 5, true);
        String expected = "Robot   Alpha   | Speed: 5 | Enabled: true";
        assertEquals(expected, actual);
    }
    
    @Test
    void format_nullName_becomesUnknown() {
        String actual = Solution01.getTelemetry(null, 5, true);
        String expected = "Robot UNKNOWN | Speed: 5 | Enabled: true";
        assertEquals(expected, actual);
    }
    
    @Test
    void format_exactPipesAndLabels() {
        String actual = Solution01.getTelemetry("Alpha", 5, true);
        
        // these checks teach students to match exact format
        assertTrue(actual.contains("Robot "), "Telemetry must start with 'Robot '");
        assertTrue(actual.contains(" | Speed: "), "Telemetry must include ' | Speed: '");
        assertTrue(actual.contains(" | Enabled: "), "Telemetry must include ' | Enabled: '");
    }
    
    @Test
    void format_noTrailingSpaces() {
        String actual = Solution01.getTelemetry("Alpha", 5, true);
        assertEquals(actual.trim(), actual, "Telemetry should not have leading/trailing whitespace");
    }
    
    @Test
    void format_isDeterministic_sameInputsSameOutput() {
        String a = Solution01.getTelemetry("Alpha", 5, true);
        String b = Solution01.getTelemetry("Alpha", 5, true);
        assertEquals(a, b, "Same inputs should always produce the same output");
    }
}
