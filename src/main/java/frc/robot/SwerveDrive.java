package frc.robot;

import edu.wpi.first.wpilibj.SpeedControllerGroup;

import java.util.ArrayList;

public class SwerveDrive {

    ArrayList<SpeedControllerGroup> groupsBrrrrr;
    ArrayList<SpeedControllerGroup> groupsSpinnn;

    public SwerveDrive(ArrayList<SpeedControllerGroup> groupsBrrrrr, ArrayList<SpeedControllerGroup> groupsSpinnn) {
        this.groupsBrrrrr = groupsBrrrrr;
        this.groupsSpinnn = groupsSpinnn;
    }

    public SwerveDrive driven(double moveSpeed, double turnSpeed) {
        for(SpeedControllerGroup spedControllerBrrrr: groupsBrrrrr){
            spedControllerBrrrr.set(moveSpeed);
        }

        for(SpeedControllerGroup spedControllerSpinnn: groupsSpinnn) {
            spedControllerSpinnn.set(turnSpeed);
        }
        return this;
    }
}