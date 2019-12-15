


package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Constants;


public class Wrist {

    private final Spark Wrist = new Spark(Constants.wristPort);
    m_robotDrive.arcadeDrive(controller.getY(Hand.kLeft), controller.getX(Hand.kRight));
    if (controller.getTriggerAxis(Hand.kLeft) != 0) {
      Wrist.set(kWristPow);
    } else if (controller.getTriggerAxis(Hand.kRight) != 0) {
      Wrist.set(-kWristPow);
    } else {
      Wrist.set(0);
    }

}