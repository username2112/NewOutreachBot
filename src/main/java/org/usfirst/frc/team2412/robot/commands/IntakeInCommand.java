package org.usfirst.frc.team2412.robot.commands;

public class IntakeInCommand extends CommandBase {

	public IntakeInCommand() {
		requires(intakeSubsystem);
	}

	@Override
	protected void execute() {
		intakeSubsystem.intakeIn();
	}

	@Override
	public void end() {
		intakeSubsystem.intakeStop();
	}

}
