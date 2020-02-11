package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Robot extends TimedRobot {
  private DifferentialDrive m_myRobot;
  private Joystick m_leftStick;
  private Joystick m_rightStick;


  @Override
  public void robotInit() {
    m_myRobot = new DifferentialDrive(new WPI_VictorSPX(1), (new WPI_VictorSPX(2)));
    m_leftStick = new Joystick(0);
    m_rightStick = new Joystick(0);
    
    m_rightStick.setXChannel(2);
    m_rightStick.setYChannel(3); 
  }

  @Override
  public void teleopPeriodic() {
    m_myRobot.tankDrive((m_leftStick.getY()), (m_rightStick.getY()));
  }
}