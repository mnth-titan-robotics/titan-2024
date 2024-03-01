package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;
public final class RobotConstants {

    public static final DigitalInput limitSwitch = new DigitalInput(0);
    //CAN Ports
    public static final int BACK_RIGHT_DRIVE_MOTOR_ID = 10;
    public static final int FRONT_RIGHT_DRIVE_MOTOR_ID = 11;
    public static final int BACK_LEFT_DRIVE_MOTOR_ID = 12;
    public static final int FRONT_LEFT_DRIVE_MOTOR_ID = 13;
    public static final int LOWER_SHOOTER_MOTOR_ID = 14;
    public static final int UPPER_SHOOTER_MOTOR_ID = 15;
    public static final int UPPER_INTAKE_MOTOR_ID = 16;
    public static final int LOWER_INTAKE_MOTOR_ID = 17;
    
    //Controller Mapping
    public static final int PILOT_USB_PORT = 0;
    public static final int COPILOT_USB_PORT = 1;

    public static final int A_BUTTON = 1;
    public static final int B_BUTTON = 2;
    public static final int X_BUTTON = 3;
    public static final int Y_BUTTON = 4;
    public static final int LEFT_BUMPER = 5;
    public static final int RIGHT_BUMPER = 6;

    //public static final boolean MOTOR_INVERT_L = true;
    //public static final boolean MOTOR_INVERT_R = false;

    //Need to check if these values match
    public static final int LEFT_STICK = 1;
    public static final int RIGHT_STICK = 5;

}