package frc.robot;

import java.util.concurrent.TimeUnit;

public class AutoCommands {
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
    public void shootPreload() {
        sleepTimeMilliseconds(1000);
        _ShootSyst.getShoot(true, false, false);
        sleepTimeMilliseconds(750);
        _IntakeSyst.update(true, false);
        sleepTimeMilliseconds(3000);
        _ShootSyst.getShoot(false, false, false);
        _IntakeSyst.update(false, false);    
    }

    public void collectNote() {
        _IntakeSyst.update(true, false);
        sleepTimeMilliseconds(500);
        _DriveSyst.update(0.7, 0.7);
        sleepTimeMilliseconds(1000);
        _DriveSyst.update(0,0);
        sleepTimeMilliseconds(2000);
        _IntakeSyst.update(false, false);
        _DriveSyst.update(-0.7, -0.7);
        sleepTimeMilliseconds(1000);
        _DriveSyst.update(-0.3, -0.3);
        sleepTimeMilliseconds(400);
        _DriveSyst.update(0,0);
    }
    public void shootCollectNote() {
        _ShootSyst.getShoot(true, false, false);
        sleepTimeMilliseconds(750);
        _IntakeSyst.update(true, false);
        sleepTimeMilliseconds(3000);
        _ShootSyst.getShoot(false, false, false);
        _IntakeSyst.update(false, false);
    }
}
