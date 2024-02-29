package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
public class IntakeSystem {
    private WPI_TalonSRX IntakeMotor = new WPI_TalonSRX(RobotConstants.LOWER_INTAKE_MOTOR_ID);

    private final double speed_modifier = 0.5;

    public void update(boolean Button) {
        this.IntakeMotor.set(ControlMode.PercentOutput, Button ? this.speed_modifier : 0);
    }
}
