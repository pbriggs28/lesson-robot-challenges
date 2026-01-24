package org.frc.level01;

public class Main01 {
    
    static void main() {
        String robotName = "Alpha";
        int robotSpeed = 5;
        boolean robotEnabled = true;
        
        String telemetry = Solution01.getTelemetry(
                robotName,
                robotSpeed,
                robotEnabled
        );
        
        System.out.println(telemetry);
    }
}
