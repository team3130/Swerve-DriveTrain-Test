package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleSupplier;

public class DefaultDrive extends CommandBase {
    private final Chassis m_chassis;

    public DefaultDrive(Chassis subsystem, DoubleSupplier  forward, DoubleSupplier rotation) {
        m_chassis = subsystem;
        m_requirements.add(m_chassis);
    }

    /**
     * The initial subroutine of a command.  Called once when the command is initially scheduled.
     */
    @Override
    public void initialize() {
        m_chassis.configRampRate(RobotMap.kDriveMaxRampRate);
    }

    /**
     * The main body of a command.  Called repeatedly while the command is scheduled.
     * (That is, it is called repeatedly until {@link #isFinished()}) returns true.)
     */
    @Override
    public void execute() {
        double x = RobotContainer.m_driverGamepad.getRawAxis(0);
        double y = -RobotContainer.m_driverGamepad.getRawAxis(1);

        m_chassis.drive(y, Math.atan2(y, x) * (180 / Math.PI));

/*        double moveSpeed = -RobotContainer.m_driverGamepad.getRawAxis(1); //joystick's y axis is inverted
        double turnSpeed = RobotContainer.m_driverGamepad.getRawAxis(0);
        m_chassis.drive(moveSpeed, RobotMap.kMaxTurnThrottle * turnSpeed);*/
    }

    /**
     * <p>
     * Returns whether this command has finished. Once a command finishes -- indicated by
     * this method returning true -- the scheduler will call its {@link #end(boolean)} method.
     * </p><p>
     * Returning false will result in the command never ending automatically. It may still be
     * cancelled manually or interrupted by another command. Hard coding this command to always
     * return true will result in the command executing once and finishing immediately. It is
     * recommended to use * {@link edu.wpi.first.wpilibj2.command.InstantCommand InstantCommand}
     * for such an operation.
     * </p>
     *
     * @return whether this command has finished.
     */
    @Override
    public boolean isFinished() {
        return false;
    }

    /**
     * The action to take when the command ends. Called when either the command
     * finishes normally -- that is it is called when {@link #isFinished()} returns
     * true -- or when  it is interrupted/canceled. This is where you may want to
     * wrap up loose ends, like shutting off a motor that was being used in the command.
     *
     * @param interrupted whether the command was interrupted/canceled
     */
    @Override
    public void end(boolean interrupted) {
        m_chassis.configRampRate(0);
    }
}
