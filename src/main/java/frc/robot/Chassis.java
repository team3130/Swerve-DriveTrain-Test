package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import java.util.ArrayList;
import java.util.List;

public class Chassis extends SubsystemBase {

// Any variables/fields used in the constructor must appear before the "INSTANCE" variable
// so that they are initialized before the constructor is called.

    //Create necessary objects

    //Create and define all standard data types needed

    private WPI_TalonFX m_leftMotorFrontSpinnn;
    private WPI_TalonFX m_leftMotorRearSpinnn;
    private WPI_TalonFX m_rightMotorFrontSpinnn;
    private WPI_TalonFX m_rightMotorRearSpinnn;

    private WPI_TalonFX m_leftMotorFrontBrrrrrrrr;
    private WPI_TalonFX m_leftMotorRearBrrrrrrrr;
    private WPI_TalonFX m_rightMotorFrontBrrrrrrrr;
    private WPI_TalonFX m_rightMotorRearBrrrrrrrr;

    private SpeedControllerGroup m_leftspinnn;
    private SpeedControllerGroup m_rightspinnn;

    private SpeedControllerGroup m_leftBrrrrrrrr;
    private SpeedControllerGroup m_rightBrrrrrrrr;
    private SwerveDrive m_drive;

    //private ShuffleboardTab tab = Shuffleboard.getTab("Chassis");

    public Chassis() {
        m_leftMotorFrontSpinnn = new WPI_TalonFX(RobotMap.CAN_LEFTMOTORFRONTSpinnn);
        m_leftMotorRearSpinnn = new WPI_TalonFX(RobotMap.CAN_LEFTMOTORREARSpinnn);
        m_rightMotorFrontSpinnn = new WPI_TalonFX(RobotMap.CAN_RIGHTMOTORFRONTSpinnn);
        m_rightMotorRearSpinnn = new WPI_TalonFX(RobotMap.CAN_RIGHTMOTORREARSpinnn);

        m_leftMotorFrontSpinnn.configFactoryDefault();
        m_leftMotorRearSpinnn.configFactoryDefault();
        m_rightMotorFrontSpinnn.configFactoryDefault();
        m_rightMotorRearSpinnn.configFactoryDefault();

        m_leftMotorFrontBrrrrrrrr = new WPI_TalonFX(RobotMap.CAN_LEFTMOTORFRONTBrrrrrrrr);
        m_leftMotorRearBrrrrrrrr = new WPI_TalonFX(RobotMap.CAN_LEFTMOTORREARBrrrrrrrr);
        m_rightMotorFrontBrrrrrrrr = new WPI_TalonFX(RobotMap.CAN_RIGHTMOTORFRONTBrrrrrrrr);
        m_rightMotorRearBrrrrrrrr = new WPI_TalonFX(RobotMap.CAN_RIGHTMOTORREARBrrrrrrrr);

        m_leftMotorFrontBrrrrrrrr.configFactoryDefault();
        m_leftMotorRearBrrrrrrrr.configFactoryDefault();
        m_rightMotorFrontBrrrrrrrr.configFactoryDefault();
        m_rightMotorRearBrrrrrrrr.configFactoryDefault();

        m_leftspinnn = new SpeedControllerGroup(m_leftMotorFrontSpinnn, m_leftMotorRearSpinnn);
        m_rightspinnn = new SpeedControllerGroup(m_rightMotorFrontSpinnn, m_rightMotorRearSpinnn);

        m_leftBrrrrrrrr = new SpeedControllerGroup(m_leftMotorFrontBrrrrrrrr, m_leftMotorRearBrrrrrrrr);
        m_rightBrrrrrrrr = new SpeedControllerGroup(m_rightMotorFrontBrrrrrrrr, m_rightMotorRearBrrrrrrrr);

        m_leftMotorRearSpinnn.follow(m_leftMotorFrontSpinnn);
        m_rightMotorRearSpinnn.follow(m_rightMotorFrontSpinnn);

        m_leftMotorRearBrrrrrrrr.follow(m_leftMotorFrontBrrrrrrrr);
        m_rightMotorRearBrrrrrrrr.follow(m_rightMotorFrontBrrrrrrrr);

        m_drive = new SwerveDrive(new ArrayList<>(List.of(m_rightBrrrrrrrr, m_leftBrrrrrrrr)), new ArrayList<>(List.of(m_rightspinnn, m_leftspinnn)));
    }

    public void configRampRate(double maxRampRateSeconds) {
        m_rightMotorFrontSpinnn.configOpenloopRamp(maxRampRateSeconds);
        m_leftMotorFrontSpinnn.configOpenloopRamp(maxRampRateSeconds);

        m_rightMotorFrontBrrrrrrrr.configOpenloopRamp(maxRampRateSeconds);
        m_leftMotorFrontBrrrrrrrr.configOpenloopRamp(maxRampRateSeconds);
    }

    public Chassis drive(double moveSpeed, double turnSpeed) {
        m_drive.driven(moveSpeed, turnSpeed);
        return this;
    }

}
