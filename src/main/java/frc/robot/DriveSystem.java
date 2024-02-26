package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import com.ctre.phoenix.motorcontrol.ControlMode;
//import edu.wpi.first.wpilibj.Encoder;

public class DriveSystem {
    //constructors
    private WPI_TalonSRX FrontLeftMotor = new WPI_TalonSRX(RobotConstants.FRONT_LEFT_DRIVE_MOTOR_ID);
    private WPI_TalonSRX BackLeftMotor = new WPI_TalonSRX(RobotConstants.BACK_LEFT_DRIVE_MOTOR_ID);
    private WPI_TalonSRX FrontRightMotor = new WPI_TalonSRX(RobotConstants.FRONT_RIGHT_DRIVE_MOTOR_ID);
    private WPI_TalonSRX BackRightMotor = new WPI_TalonSRX(RobotConstants.BACK_RIGHT_DRIVE_MOTOR_ID);

    //Will use encoders later
    /*private Encoder LeftDriveEncoder;
    private Encoder RightDriveEncoder;*/

    public void update(double LeftDriveStick, double RightDriveStick){
        this.FrontLeftMotor.set(ControlMode.PercentOutput, LeftDriveStick);
        this.BackLeftMotor.set(ControlMode.PercentOutput, LeftDriveStick);
        this.FrontRightMotor.set(ControlMode.PercentOutput, RightDriveStick);
        this.BackRightMotor.set(ControlMode.PercentOutput, RightDriveStick);
    }
}