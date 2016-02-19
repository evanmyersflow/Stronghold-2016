
package org.usfirst.frc.team2521.robot.commands;

import org.usfirst.frc.team2521.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class FireBall extends Command {
	
	public static boolean fireBallEnded = false;
	
	public FireBall() {
		requires(Robot.flyWheels);
	}
	
	// Called just before this Command runs the first time
	protected void initialize() {
	}
	
	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.flyWheels.setPusher(true);
	}
	
	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return fireBallEnded;
	}
	
	// Called once after isFinished returns true
	protected void end() {
		SpinFlyWheels.stopSpin = true;
		Robot.flyWheels.setPusher(false);
	}
	
	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}