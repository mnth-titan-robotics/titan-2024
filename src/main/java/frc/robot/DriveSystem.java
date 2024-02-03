package frc.robot;

import frc.robot.RobotConstants;
import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj.Encoder;

public class DriveSystem {
    private Victor FrontLeftMotor = new Victor(RobotConstants.FRONT_LEFT_DRIVE_MOTOR_ID);
    private Victor BackLeftMotor;
    private Victor FrontRightMotor;
    private Victor BackRightMotor;

    private Encoder LeftDriveEncoder;
    private Encoder RightDriveEncoder;


}