// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.wpilibj.TimedRobot;

import java.util.concurrent.TimeUnit;

import edu.wpi.first.cameraserver.CameraServer;
//import edu.wpi.first.wpilibj.Joystick;
//import com.ctre.phoenix.motorcontrol.ControlMode;
//import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


public class Robot extends TimedRobot {
  private OperatorInterface _Ops = new OperatorInterface();
  private DriveSystem _DriveSyst = new DriveSystem();
  private ShooterSystem _ShootSyst = new ShooterSystem();
  private IntakeSystem _IntakeSyst = new IntakeSystem();
  private void sleepTimeMilliseconds(int Time) {
    try {
      TimeUnit.MILLISECONDS.sleep(Time);
    } catch (InterruptedException e){
      e.printStackTrace();
    }
  }
  //private Joystick pilot_joy = new Joystick(RobotConstants.PILOT_USB_PORT);
  //private WPI_TalonSRX talon_motor = new WPI_TalonSRX(2); // dev # set thru "Phoenix Tuner X"


  @Override
  public void robotInit() {
    CameraServer.startAutomaticCapture();
  }
  
  // Need to know if this will work

  
  @Override
  public void autonomousInit() {
    // *text* = save for later
    //Wait a couple of seconds, then shoot preload
    sleepTimeMilliseconds(1000);
    _ShootSyst.getShoot(true, false);
    sleepTimeMilliseconds(750);
    _IntakeSyst.update(true);
    sleepTimeMilliseconds(3000);
    _ShootSyst.getShoot(false, false);
    _IntakeSyst.update(false);

    //Move back, *collect note*
    _IntakeSyst.update(true);
    sleepTimeMilliseconds(500);
    //_IntakeSyst.update(true);
    _DriveSyst.update(0.7, 0.7);
    sleepTimeMilliseconds(1000);
    _DriveSyst.update(0,0);
    sleepTimeMilliseconds(2000);
    _IntakeSyst.update(false);
    _DriveSyst.update(0.7, 0.7);
    sleepTimeMilliseconds(1400);
    _DriveSyst.update(0,0);
    
    _ShootSyst.getShoot(true, false);
    sleepTimeMilliseconds(750);
    _IntakeSyst.update(true);
    sleepTimeMilliseconds(3000);
    _ShootSyst.getShoot(false, false);
    _IntakeSyst.update(false);

    //_IntakeSyst.update(false);
    
    //*Move forward with note*
    /*_DriveSyst.update(0.3, 0.3);
    sleepTimeMilliseconds(1000);
    _DriveSyst.update(0, 0);
    _ShootSyst.getShoot(true);
    sleepTimeMilliseconds(500);
    _ShootSyst.getShoot(false);*/

    //Backup
    /*_DriveSyst.update(-0.5, -0.5);

    sleepTimeMilliseconds(500);

    _DriveSyst.update(0,0);*/

    //Emergency Stop
    _DriveSyst.update(0,0);
    _ShootSyst.getShoot(false, false);
    _IntakeSyst.update(false);
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
    _IntakeSyst.update(_Ops.Right_Bumper());
    _ShootSyst.getShoot(_Ops.B_Button(), _Ops.Left_Bumper());
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
