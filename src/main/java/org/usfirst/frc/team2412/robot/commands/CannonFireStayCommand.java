package org.usfirst.frc.team2412.robot.commands;

public class CannonFireStayCommand extends CommandBase {
	public CannonFireStayCommand() {
		requires(cannonFireSubsystem);
	}

	@Override
	public void execute() {
		cannonFireSubsystem.openCannon();
	}

	@Override
	public void end() {
		cannonFireSubsystem.closeCannon();
	}
}
