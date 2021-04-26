package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

import java.util.ArrayList;

public class SwerveDrive {

    ArrayList<SpeedControllerGroup> groupsBrrrrr;
    ArrayList<TalonFX> groupsSpinnn;

    public SwerveDrive(ArrayList<SpeedControllerGroup> groupsBrrrrr, ArrayList<TalonFX> groupsSpinnn) {
        this.groupsBrrrrr = groupsBrrrrr;
        this.groupsSpinnn = groupsSpinnn;
    }

    public SwerveDrive driven(double moveSpeed, double turnSpeed) {
        for(TalonFX spedControllerSpinnn: groupsSpinnn) {
            spedControllerSpinnn.set(ControlMode.MotionMagic, turnSpeed);
        }
        for(SpeedControllerGroup spedControllerBrrrr: groupsBrrrrr){
            spedControllerBrrrr.set(moveSpeed);
        }
        return this;
    }
}