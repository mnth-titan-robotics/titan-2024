package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OperatorInterface {
    private Joystick pilot_joy = new Joystick(RobotConstants.PILOT_USB_PORT);
    private Joystick copilot_joy = new Joystick(RobotConstants.COPILOT_USB_PORT);

    //Add speed modifier later
    public double LeftDriveStick() {
        return this.pilot_joy.getRawAxis(RobotConstants.LEFT_STICK);
    }
    public double RightDriveStick() {
        return this.pilot_joy.getRawAxis(RobotConstants.RIGHT_STICK);
    }
}
