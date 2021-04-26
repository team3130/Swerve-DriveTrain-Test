package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;

public class RobotContainer {
    Chassis m_chassis = new Chassis();


    public static double getSkywalker() {
        double spin = 0;
        spin += m_driverGamepad.getRawAxis(RobotMap.LST_AXS_RTRIGGER);
        spin -= m_driverGamepad.getRawAxis(RobotMap.LST_AXS_LTRIGGER);
        return spin;
    }

    //Joysticks
    public static Joystick m_driverGamepad = new Joystick(0);
    public static Joystick m_weaponsGamepad = new Joystick(1);

    // private final Command m_BarrelRacing = new BarrelRacing(60, m_chassis);


    // Binding the buttons and triggers that are defined above to respective commands
    public RobotContainer() {
        configureButtonBindings();
        m_chassis.setDefaultCommand(
                new DefaultDrive(
                        m_chassis,
                        () -> m_driverGamepad.getY(GenericHID.Hand.kLeft),
                        () -> m_driverGamepad.getX(GenericHID.Hand.kRight)
                )
        );

        //TODO: complete when you have made auton commands

        /*
        // Add commands to the autonomous command chooser
        m_chooser.setDefaultOption("Simple Auto", m_simpleAuto);
        m_chooser.addOption("Complex Auto", m_complexAuto);

        // Put the chooser on the dashboard
        Shuffleboard.getTab("Autonomous").add(m_chooser);
         */

    }

    private void configureButtonBindings() {

        /*
         * Definitions for joystick buttons start
         */

        /*
         * Drivers
         */
        /*new JoystickTrigger(m_driverGamepad, RobotMap.LST_AXS_RTRIGGER).whenHeld(new IntakeIn(m_intake)); //R trigger
        new JoystickTrigger(m_driverGamepad, RobotMap.LST_AXS_LTRIGGER).whenHeld(new IntakeOut(m_intake)); // L trigger also deploys intake while active

        new JoystickButton(m_driverGamepad, RobotMap.LST_BTN_RBUMPER).whenHeld(new Shoot(m_turret, m_hoppper, m_flyWheel, m_hood)); //R bumper
        new JoystickButton(m_driverGamepad, RobotMap.LST_BTN_LBUMPER).whenHeld(new HopperOut(m_hoppper)); //L bumper
        new JoystickButton(m_driverGamepad, RobotMap.LST_BTN_RJOYSTICKPRESS).whenPressed(new ToggleTurretAim(m_turret)); //R joystick press
        new JoystickButton(m_driverGamepad, RobotMap.LST_BTN_MENU).whenPressed(new ToggleIntake(m_intake));; //Menu button
        new JoystickButton(m_driverGamepad, RobotMap.LST_BTN_LJOYSTICKPRESS).whenPressed(new ShiftToggle(m_chassis)); //L joystick press
        new JoystickButton(m_driverGamepad, RobotMap.LST_BTN_A).whenHeld(new ShootNear(m_turret, m_hoppper, m_flyWheel, m_hood)); //Button A


        *//*
         * Weapons
         *//*

        new POVButton(m_driverGamepad, RobotMap.LST_POV_N).whenHeld(new MoveHood(1, m_hood));
        new POVButton(m_driverGamepad, RobotMap.LST_POV_S).whenHeld(new MoveHood(-1, m_hood));

        new JoystickButton(m_weaponsGamepad, RobotMap.LST_BTN_MENU).whenPressed(new DeploySmallClimber(m_climber));; //Menu button
        new JoystickButton(m_weaponsGamepad, RobotMap.LST_BTN_WINDOW).whenPressed(new DeployBigClimber(m_climber));; //Windows button
        new JoystickButton(m_weaponsGamepad, RobotMap.LST_BTN_A).whenPressed(new ToggleWOF(m_wheelOfFortune, m_intake));
        new JoystickButton(m_weaponsGamepad, RobotMap.LST_BTN_X).whenHeld(new SpinWOFLeft(m_wheelOfFortune));
        new JoystickButton(m_weaponsGamepad, RobotMap.LST_BTN_B).whenHeld(new SpinWOFRight(m_wheelOfFortune));
        new JoystickButton(m_weaponsGamepad, RobotMap.LST_BTN_Y).whenPressed(new ColorAlignment(m_wheelOfFortune));*/





    }

/*    private void setDefaultCommand() {
        //TODO: fix this I have no frickin clue what is going on here
        m_chassis.setDefaultCommand(new DefaultDrive(m_chassis, () -> driverGamepad.getY(GenericHID.Hand.kLeft), () -> driverGamepad.getX(GenericHID.Hand.kRight)));
        m_climber.setDefaultCommand(new Climber(m_climber, () -> driverGamepad.));
        m_turret.setDefaultCommand(//I DONT KNOW WHATS GOIN OOOOONNNNNNNNNNNNNNNN SETTING DEFAULT COMMANDS ARE WWWWWEEEEEIIIIRRRRDDDD );
    }*/

/*    public Command getAutonomousCommand() {
        return m_chooser.getCommand();
    }

    public void reset(){
        m_chassis.reset();
    }

    public void setAutonCommand() {
        m_chooser.setAutonCommand(m_chassis);
    }*/

}

