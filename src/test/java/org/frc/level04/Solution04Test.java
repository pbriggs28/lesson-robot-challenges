package org.frc.level04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution04Test {
    
    // THIS FILE IS YOUR SCOREBOARD
    //
    // These tests are designed to catch the most common mistakes students make:
    //   - incorrect loop accumulation
    //   - missing input validation (negatives)
    //   - incorrect capping behavior
    //   - formatting errors in strings (labels/spaces/punctuation)
    //   - name handling mistakes (null, empty, whitespace)
    //   - inconsistent behavior across repeated calls
    
    // ---------------------------------------
    // GROUP A: distanceAfterTicks
    // ---------------------------------------
    
    @Test
    void distanceAfterTicks_basic() {
        assertEquals(15, Solution04.distanceAfterTicks(3, 5));
    }
    
    @Test
    void distanceAfterTicks_oneTick_isSpeed() {
        assertEquals(7, Solution04.distanceAfterTicks(7, 1));
    }
    
    @Test
    void distanceAfterTicks_zeroTicks_isZero() {
        assertEquals(0, Solution04.distanceAfterTicks(7, 0));
    }
    
    @Test
    void distanceAfterTicks_zeroSpeed_isZero() {
        assertEquals(0, Solution04.distanceAfterTicks(0, 10));
    }
    
    @Test
    void distanceAfterTicks_negativeSpeed_rejectedIsZero() {
        assertEquals(0, Solution04.distanceAfterTicks(-1, 10));
    }
    
    @Test
    void distanceAfterTicks_negativeTicks_rejectedIsZero() {
        assertEquals(0, Solution04.distanceAfterTicks(5, -2));
    }
    
    @Test
    void distanceAfterTicks_bothNegative_rejectedIsZero() {
        assertEquals(0, Solution04.distanceAfterTicks(-5, -2));
    }
    
    @Test
    void distanceAfterTicks_deterministic_sameInputsSameOutput() {
        int a = Solution04.distanceAfterTicks(4, 6);
        int b = Solution04.distanceAfterTicks(4, 6);
        assertEquals(a, b);
    }
    
    // ---------------------------------------
    // GROUP B: distanceAfterTicksCapped
    // ---------------------------------------
    
    @Test
    void distanceAfterTicksCapped_underCap_matchesNormal() {
        assertEquals(15, Solution04.distanceAfterTicksCapped(3, 5, 100));
    }
    
    @Test
    void distanceAfterTicksCapped_overCap_clamps() {
        assertEquals(50, Solution04.distanceAfterTicksCapped(10, 10, 50));
    }
    
    @Test
    void distanceAfterTicksCapped_exactlyAtCap_returnsCap() {
        assertEquals(50, Solution04.distanceAfterTicksCapped(5, 10, 50));
    }
    
    @Test
    void distanceAfterTicksCapped_capZero_alwaysZeroForValidInputs() {
        assertEquals(0, Solution04.distanceAfterTicksCapped(5, 10, 0));
    }
    
    @Test
    void distanceAfterTicksCapped_zeroTicks_ignoresCapAndIsZero() {
        assertEquals(0, Solution04.distanceAfterTicksCapped(5, 0, 50));
    }
    
    @Test
    void distanceAfterTicksCapped_zeroSpeed_ignoresCapAndIsZero() {
        assertEquals(0, Solution04.distanceAfterTicksCapped(0, 10, 50));
    }
    
    @Test
    void distanceAfterTicksCapped_negativeMax_rejectedIsZero() {
        assertEquals(0, Solution04.distanceAfterTicksCapped(5, 10, -1));
    }
    
    @Test
    void distanceAfterTicksCapped_negativeTicks_rejectedIsZero() {
        assertEquals(0, Solution04.distanceAfterTicksCapped(5, -1, 50));
    }
    
    @Test
    void distanceAfterTicksCapped_negativeSpeed_rejectedIsZero() {
        assertEquals(0, Solution04.distanceAfterTicksCapped(-5, 10, 50));
    }
    
    @Test
    void distanceAfterTicksCapped_deterministic_sameInputsSameOutput() {
        int a = Solution04.distanceAfterTicksCapped(9, 9, 40);
        int b = Solution04.distanceAfterTicksCapped(9, 9, 40);
        assertEquals(a, b);
    }
    
    // ---------------------------------------
    // GROUP C: positionLine
    // ---------------------------------------
    
    @Test
    void positionLine_basicExact() {
        assertEquals("Robot Alpha | Tick: 4 | Position: 12",
                Solution04.positionLine("Alpha", 3, 4));
    }
    
    @Test
    void positionLine_tickZero_positionZero() {
        assertEquals("Robot Alpha | Tick: 0 | Position: 0",
                Solution04.positionLine("Alpha", 3, 0));
    }
    
    @Test
    void positionLine_speedZero_positionZero() {
        assertEquals("Robot Alpha | Tick: 4 | Position: 0",
                Solution04.positionLine("Alpha", 0, 4));
    }
    
    @Test
    void positionLine_nullName_becomesUnknown() {
        assertEquals("Robot UNKNOWN | Tick: 4 | Position: 12",
                Solution04.positionLine(null, 3, 4));
    }
    
    @Test
    void positionLine_emptyName_preserved() {
        assertEquals("Robot  | Tick: 4 | Position: 12",
                Solution04.positionLine("", 3, 4));
    }
    
    @Test
    void positionLine_nameWithSpaces_preserved() {
        assertEquals("Robot Blue Alliance | Tick: 4 | Position: 12",
                Solution04.positionLine("Blue Alliance", 3, 4));
    }
    
    @Test
    void positionLine_leadingTrailingSpaces_preserved() {
        assertEquals("Robot   Alpha   | Tick: 4 | Position: 12",
                Solution04.positionLine("  Alpha  ", 3, 4));
    }
    
    @Test
    void positionLine_negativeSpeed_positionBecomesZeroButTickStillShown() {
        assertEquals("Robot Alpha | Tick: 4 | Position: 0",
                Solution04.positionLine("Alpha", -3, 4));
    }
    
    @Test
    void positionLine_negativeTick_positionBecomesZeroAndTickStillShown() {
        assertEquals("Robot Alpha | Tick: -4 | Position: 0",
                Solution04.positionLine("Alpha", 3, -4));
    }
    
    @Test
    void positionLine_negativeSpeedAndTick_positionZeroAndTickShown() {
        assertEquals("Robot Alpha | Tick: -4 | Position: 0",
                Solution04.positionLine("Alpha", -3, -4));
    }
    
    @Test
    void positionLine_exactFormatting_containsAllLabels() {
        String line = Solution04.positionLine("Alpha", 3, 4);
        assertTrue(line.startsWith("Robot "), "Must start with 'Robot '");
        assertTrue(line.contains(" | Tick: "), "Must contain ' | Tick: '");
        assertTrue(line.contains(" | Position: "), "Must contain ' | Position: '");
    }
    
    @Test
    void positionLine_noLeadingOrTrailingWhitespace() {
        String line = Solution04.positionLine("Alpha", 3, 4);
        assertEquals(line.trim(), line, "Output should not have leading/trailing whitespace");
    }
    
    @Test
    void positionLine_deterministic_sameInputsSameOutput() {
        String a = Solution04.positionLine("Alpha", 3, 4);
        String b = Solution04.positionLine("Alpha", 3, 4);
        assertEquals(a, b);
    }
}
