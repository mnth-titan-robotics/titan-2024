package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.DigitalInput;
public class IntakeSystem {
    private WPI_TalonSRX LowerIntakeMotor = new WPI_TalonSRX(RobotConstants.LOWER_INTAKE_MOTOR_ID);
    private WPI_TalonSRX UpperIntakeMotor = new WPI_TalonSRX(RobotConstants.UPPER_INTAKE_MOTOR_ID);
    private DigitalInput intakeSwitch = RobotConstants.limitSwitch;
    private final double lower_speed_modifier = 0.7;
    private final double upper_speed_modifier = 1;

    public void update(boolean Button, boolean revButton) {
        if (!this.intakeSwitch.get()) {
            System.out.println("*******NOTE NOT LOADED");
        }
        if (revButton) {
        this.LowerIntakeMotor.set(ControlMode.PercentOutput, -this.lower_speed_modifier);
        this.UpperIntakeMotor.set(ControlMode.PercentOutput, -this.upper_speed_modifier);
        }
        else if (!this.intakeSwitch.get()) {
            this.LowerIntakeMotor.set(ControlMode.PercentOutput, Button ? this.lower_speed_modifier : 0);
            this.UpperIntakeMotor.set(ControlMode.PercentOutput, Button ? this.upper_speed_modifier : 0);
        } 
        else {
            this.LowerIntakeMotor.set(ControlMode.PercentOutput,0);
            this.UpperIntakeMotor.set(ControlMode.PercentOutput, Button ? this.lower_speed_modifier : 0);
            System.out.println("NOTE LOADED");
        }
    }
    /*public void eject(boolean Button) {
        this.LowerIntakeMotor.set(ControlMode.PercentOutput, Button ? -this.speed_modifier : 0);
        this.UpperIntakeMotor.set(ControlMode.PercentOutput, Button ? -this.speed_modifier : 0);
    }*/
}
