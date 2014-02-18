/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tamankeet.frc3933.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.tamankeet.frc3933.RobotMap;
import org.tamankeet.frc3933.commands.returnUltrasonic;

/**
 *
 * @author PACO
 */
public class Ultrasonic extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new returnUltrasonic());
    }
    
    public double getDistance(){
        double voltage = RobotMap.ultraSensor.getAverageVoltage();
        double distance = voltage*206.47;
        System.out.println("Distancia leida: " + distance + 
                " Voltaje average: " + voltage);
        return distance;
    }
}