package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.RobotMap;

public class DriveCommand extends CommandBase {
	public DriveCommand() {
		requires(drivebaseSubsystem);
	}

	@Override
	protected void execute() {
		drivebaseSubsystem.drive(RobotMap.oi.driver);
	}

}
