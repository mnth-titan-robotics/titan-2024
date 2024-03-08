package frc.robot;

import java.util.concurrent.TimeUnit;

public class AutoCommands {
    /*private DriveSystem _DriveSyst = new DriveSystem();
    private ShooterSystem _ShootSyst = new ShooterSystem();
    private IntakeSystem _IntakeSyst = new IntakeSystem();*/

    private void sleepTimeMilliseconds(int Time) {
        try {
            TimeUnit.MILLISECONDS.sleep(Time);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void shootPreload() {
        sleepTimeMilliseconds(1000);
        Robot._ShootSyst.getShoot(true, false, false);
        sleepTimeMilliseconds(750);
        Robot._IntakeSyst.update(true, false);
        sleepTimeMilliseconds(3000);
        Robot._ShootSyst.getShoot(false, false, false);
        Robot._IntakeSyst.update(false, false);   
    }

    public void collectNote() {
        Robot._IntakeSyst.update(true, false);
        sleepTimeMilliseconds(500);
        Robot._DriveSyst.update(0.7, 0.7);
        sleepTimeMilliseconds(1000);
        Robot._DriveSyst.update(0,0);
        sleepTimeMilliseconds(2000);
        Robot._IntakeSyst.update(false, false);
        Robot._DriveSyst.update(-0.7, -0.7);
        sleepTimeMilliseconds(1000);
        Robot._DriveSyst.update(-0.3, -0.3);
        sleepTimeMilliseconds(400);
        Robot._DriveSyst.update(0,0);
    }
    public void shootCollectNote() {
        Robot._ShootSyst.getShoot(true, false, false);
        sleepTimeMilliseconds(750);
        Robot._IntakeSyst.update(true, false);
        sleepTimeMilliseconds(3000);
        Robot._ShootSyst.getShoot(false, false, false);
        Robot._IntakeSyst.update(false, false);
    }
}
