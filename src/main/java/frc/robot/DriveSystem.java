package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode;
//import edu.wpi.first.wpilibj.Encoder;

public class DriveSystem {
    private WPI_VictorSPX FrontLeftMotor = new WPI_VictorSPX(RobotConstants.FRONT_LEFT_DRIVE_MOTOR_ID);
    private WPI_VictorSPX BackLeftMotor = new WPI_VictorSPX(RobotConstants.BACK_LEFT_DRIVE_MOTOR_ID);
    private WPI_VictorSPX FrontRightMotor = new WPI_VictorSPX(RobotConstants.FRONT_RIGHT_DRIVE_MOTOR_ID);
    private WPI_VictorSPX BackRightMotor = new WPI_VictorSPX(RobotConstants.BACK_RIGHT_DRIVE_MOTOR_ID);

    //Will use encoders later
    /*private Encoder LeftDriveEncoder;
    private Encoder RightDriveEncoder;*/

    public void update(double LeftDrive, double RightDrive){
        this.FrontLeftMotor.set(ControlMode.PercentOutput, LeftDrive);
        this.BackLeftMotor.set(ControlMode.PercentOutput, LeftDrive);
        this.FrontRightMotor.set(ControlMode.PercentOutput, RightDrive);
        this.BackRightMotor.set(ControlMode.PercentOutput, RightDrive);
    }
}