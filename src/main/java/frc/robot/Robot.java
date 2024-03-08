// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.wpilibj.TimedRobot;

import edu.wpi.first.cameraserver.CameraServer;
//import edu.wpi.first.wpilibj.Joystick;
//import com.ctre.phoenix.motorcontrol.ControlMode;
//import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


public class Robot extends TimedRobot {
  public OperatorInterface _Ops = new OperatorInterface();
  public static DriveSystem _DriveSyst = new DriveSystem();
  public static ShooterSystem _ShootSyst = new ShooterSystem();
  public static IntakeSystem _IntakeSyst = new IntakeSystem();
  public AutoCommands _AutoComm = new AutoCommands();
  //private Joystick pilot_joy = new Joystick(RobotConstants.PILOT_USB_PORT);
  //private WPI_TalonSRX talon_motor = new WPI_TalonSRX(2); // dev # set thru "Phoenix Tuner X"


  @Override
  public void robotInit() {
    CameraServer.startAutomaticCapture();
  }
  
  // Need to know if this will work

  
  @Override
  public void autonomousInit() {
    //Waits 
    /*_AutoComm.shootPreload();

    _AutoComm.collectNote();

    _AutoComm.shootCollectNote();*/

    _AutoComm.taxi();
    
    //Emergency Stop
    _DriveSyst.update(0,0);
    _ShootSyst.getShoot(false, false, false);
    _IntakeSyst.update(false, false);
  }
  
  @Override
  public void autonomousPeriodic() {
    _DriveSyst.update(0,0);
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
    _DriveSyst.update(_Ops.LeftDriveStick(), _Ops.RightDriveStick());
    _IntakeSyst.update(_Ops.Left_Bumper(), _Ops.Y_Button());
    _ShootSyst.getShoot(_Ops.B_Button(), _Ops.A_Button(), _Ops.X_BUTTON());
    //_IntakeSyst.eject(_Ops.Y_Button());
    //_ShootSyst.getRevShoot(_Ops.Left_Bumper());

    //talon_motor.set(ControlMode.PercentOutput, this.pilot_joy.getRawAxis(RobotConstants.RIGHT_STICK));
    
    // https://github.com/whackamadoodle3000/HowToProgramming
    // ^ might be useful, I was hacking around to get CAN bus stuff working
    // I'll try to be there tuesday to explain otherwise I'll do so over slack - kyle (the mentor)
  }

  @Override
  public void testInit() {

  }

  @Override
  public void testPeriodic() {

  }
}
