package org.tamankeet.frc3933;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Jaguar;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    
    public static final int driveMotorRPort = 1;
    public static final int driveMotorLPort = 2;
    public static final int ultraSensorPort = 3;
    
    public static AnalogChannel ultraSensor = new AnalogChannel(ultraSensorPort);
    
    public static Jaguar driveMotorR = new Jaguar(driveMotorRPort);
    public static Jaguar driveMotorL = new Jaguar(driveMotorLPort);
    
}
