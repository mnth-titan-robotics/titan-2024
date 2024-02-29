package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OperatorInterface {
    private Joystick pilot_joy = new Joystick(RobotConstants.PILOT_USB_PORT);
    // private Joystick copilot_joy = new Joystick(RobotConstants.COPILOT_USB_PORT);

    private final double speed_modifier = 0.5;
    public double LeftDriveStick() {
        return this.pilot_joy.getRawAxis(RobotConstants.LEFT_STICK) * this.speed_modifier;
    }
    public double RightDriveStick() {
        return this.pilot_joy.getRawAxis(RobotConstants.RIGHT_STICK) * this.speed_modifier;
    }
    public boolean A_Button() {
        return this.pilot_joy.getRawButton(RobotConstants.A_BUTTON);
    }
}
