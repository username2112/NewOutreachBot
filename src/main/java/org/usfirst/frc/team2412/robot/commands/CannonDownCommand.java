package org.usfirst.frc.team2412.robot.commands;

public class CannonDownCommand extends CommandBase {
	public CannonDownCommand() {
		requires(cannonUpDownSubsystem);
	}

	@Override
	protected void execute() {
		cannonUpDownSubsystem.cannonDown();
	}

	@Override
	protected void end() {
		cannonUpDownSubsystem.cannonHold();
	}
}
