package org.usfirst.frc.team2412.robot.commands;

public class CannonFireCommand extends CommandBase {

	public CannonFireCommand() {
		requires(cannonFireSubsystem);
	}

	@Override
	public void execute() {
		cannonFireSubsystem.fire();
	}

}
