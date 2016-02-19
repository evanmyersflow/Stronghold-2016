
package org.usfirst.frc.team2521.robot.commands;

import org.usfirst.frc.team2521.robot.Robot;
import org.usfirst.frc.team2521.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class SpinFlyWheels extends Command {
	
	public static boolean stopSpin = false;
	
	public SpinFlyWheels() {
		requires(Robot.flyWheels);
	}
	
	// Called just before this Command runs the first time
	protected void initialize() {
		SmartDashboard.putBoolean("Up to speed", false);
		FileManager.currentCommand = getClass().toString();
	}
	
	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.flyWheels.out();
	}
	
	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return stopSpin;
	}
	
	// Called once after isFinished returns true
	protected void end() {
		
/*	Andrews code to setup later
 * 	Robot.flyWheels.out();
		
		if (Robot.flyWheels.getLeftSpeed() > RobotMap.FINISHED_SPIN_UP_THRESHOLD && Robot.flyWheels.getRightSpeed() > RobotMap.FINISHED_SPIN_UP_THRESHOLD) {
			SmartDashboard.putBoolean("Up to speed", true);
			System.out.println("Up to speed!");
		} else {
			SmartDashboard.putBoolean("Up to speed", false);
			System.out.println("Not up to speed!");
		}
		*/
		
		
	}
	
	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
