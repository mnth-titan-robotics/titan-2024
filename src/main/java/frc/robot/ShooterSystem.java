package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
//import java.util.concurrent.TimeUnit;
import com.ctre.phoenix.motorcontrol.ControlMode;

public class ShooterSystem {
    private WPI_TalonSRX upperShooterMotor = new WPI_TalonSRX(RobotConstants.UPPER_SHOOTER_MOTOR_ID);
    private WPI_VictorSPX lowerShooterMotor = new WPI_VictorSPX(RobotConstants.LOWER_SHOOTER_MOTOR_ID);

    private final double speedModifier = 0.8;

    /*private double motorSpeed = 0;
    private void sleepTimeMilliseconds(int Time) {
        try{
            TimeUnit.MILLISECONDS.sleep(Time);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/
    
    public void update(boolean Button) {
        if (Button) {
            this.upperShooterMotor.set(ControlMode.PercentOutput, speedModifier);
            this.lowerShooterMotor.set(ControlMode.PercentOutput, speedModifier);
            /*this.ShooterMotor.set(ControlMode.PercentOutput, motorSpeed);

            motorSpeed = speedModifier;

            sleepTimeMilliseconds(1000);

            motorSpeed = 0; */
        }else{
            this.upperShooterMotor.set(ControlMode.PercentOutput, 0);
        }
    }
    
}