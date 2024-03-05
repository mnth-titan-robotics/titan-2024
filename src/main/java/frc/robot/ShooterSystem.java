package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.DigitalInput;

public class ShooterSystem {
    private WPI_TalonSRX upperShooterMotor = new WPI_TalonSRX(RobotConstants.UPPER_SHOOTER_MOTOR_ID);
    private WPI_VictorSPX lowerShooterMotor = new WPI_VictorSPX(RobotConstants.LOWER_SHOOTER_MOTOR_ID);
    private DigitalInput intakeSwitch = RobotConstants.limitSwitch;

    private final double revSpeedModifier = -0.8;
    private final double ampSpeedModifier = 0.4;

    public void getShoot(boolean Button, boolean revButton, boolean ampShoot) {
        double speed = 0;
        if (Button) {
            speed = 1;
        } else if (!this.intakeSwitch.get() && revButton) {
            speed = revSpeedModifier;
        } else if (ampShoot) {
            speed = ampSpeedModifier;
        } else {
            speed = 0;
        }
        this.upperShooterMotor.set(ControlMode.PercentOutput, speed);
        this.lowerShooterMotor.set(ControlMode.PercentOutput, speed);
    }

}