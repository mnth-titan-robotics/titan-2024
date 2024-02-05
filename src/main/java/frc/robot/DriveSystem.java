package frc.robot;

import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj.Encoder;

public class DriveSystem {
    //constructors
    private Victor FrontLeftMotor = new Victor(RobotConstants.FRONT_LEFT_DRIVE_MOTOR_ID);
    private Victor BackLeftMotor = new Victor(RobotConstants.BACK_LEFT_DRIVE_MOTOR_ID);
    private Victor FrontRightMotor = new Victor(RobotConstants.FRONT_RIGHT_DRIVE_MOTOR_ID);
    private Victor BackRightMotor = new Victor(RobotConstants.BACK_RIGHT_DRIVE_MOTOR_ID);

    //Will use encoders later
    /*private Encoder LeftDriveEncoder;
    private Encoder RightDriveEncoder;*/

    public void update(double LeftDriveStick, double RightDriveStick){
        this.FrontLeftMotor.set(LeftDriveStick);
        this.BackLeftMotor.set(LeftDriveStick);
        this.FrontRightMotor.set(RightDriveStick);
        this.BackRightMotor.set(RightDriveStick);
    }
}