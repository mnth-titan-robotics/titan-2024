package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode;

public class ShooterSystem {
    private WPI_TalonSRX upperShooterMotor = new WPI_TalonSRX(RobotConstants.UPPER_SHOOTER_MOTOR_ID);
    private WPI_VictorSPX lowerShooterMotor = new WPI_VictorSPX(RobotConstants.LOWER_SHOOTER_MOTOR_ID);

    private final double speedModifier = 0.8;
    
    public void getShoot(boolean Button, boolean revButton) {
        if (Button) {
            this.upperShooterMotor.set(ControlMode.PercentOutput, speedModifier);
            this.lowerShooterMotor.set(ControlMode.PercentOutput, speedModifier);
        }else{
            if (revButton) {
                this.upperShooterMotor.set(ControlMode.PercentOutput, -speedModifier);
                this.lowerShooterMotor.set(ControlMode.PercentOutput, -speedModifier);
            }else{
                this.upperShooterMotor.set(ControlMode.PercentOutput, 0);
                this.lowerShooterMotor.set(ControlMode.PercentOutput, 0);
            }
        }
    }
    
}