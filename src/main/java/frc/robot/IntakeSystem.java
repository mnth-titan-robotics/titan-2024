package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.DigitalInput;
public class IntakeSystem {
    private WPI_TalonSRX LowerIntakeMotor = new WPI_TalonSRX(RobotConstants.LOWER_INTAKE_MOTOR_ID);
    private WPI_TalonSRX UpperIntakeMotor = new WPI_TalonSRX(RobotConstants.UPPER_INTAKE_MOTOR_ID);
    private DigitalInput intakeSwitch = new DigitalInput(0);
    private final double speed_modifier = 0.5;

    public void update(boolean Button) {

        if (!this.intakeSwitch.get()) {
            this.LowerIntakeMotor.set(ControlMode.PercentOutput, Button ? this.speed_modifier : 0);
            this.UpperIntakeMotor.set(ControlMode.PercentOutput, Button ? this.speed_modifier : 0);
        } else {
            this.LowerIntakeMotor.set(ControlMode.PercentOutput,0);
            this.UpperIntakeMotor.set(ControlMode.PercentOutput, 0);
        }
    }
}
