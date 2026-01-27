package org.frc.level03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution03Test {
    
    // THIS FILE IS YOUR SCOREBOARD
    //
    // If all tests pass, your boolean logic is correct.
    // If a test fails, read the failure message carefully
    // and fix Solution03.
    
    /**
     * Verifies that flipEnabled correctly inverts a boolean.
     */
    @Test
    void flipEnabled_trueBecomesFalse() {
        assertFalse(Solution03.flipEnabled(true),
                "true should flip to false");
    }
    
    @Test
    void flipEnabled_falseBecomesTrue() {
        assertTrue(Solution03.flipEnabled(false),
                "false should flip to true");
    }
    
    /**
     * Verifies that movement is only allowed when enabled.
     */
    @Test
    void canMove_enabledAllowsMovement() {
        assertTrue(Solution03.canMove(true),
                "Robot should be allowed to move when enabled");
    }
    
    @Test
    void canMove_disabledBlocksMovement() {
        assertFalse(Solution03.canMove(false),
                "Robot must not move when disabled");
    }
}
