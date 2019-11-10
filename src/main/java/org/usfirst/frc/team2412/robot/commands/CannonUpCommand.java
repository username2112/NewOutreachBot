package org.usfirst.frc.team2412.robot.commands;

public class CannonUpCommand extends CommandBase {
	public CannonUpCommand() {
		requires(cannonUpDownSubsystem);
	}

	@Override
	protected void execute() {
		cannonUpDownSubsystem.cannonUp();
	}

	@Override
	protected void end() {
		cannonUpDownSubsystem.cannonHold();
	}
}
