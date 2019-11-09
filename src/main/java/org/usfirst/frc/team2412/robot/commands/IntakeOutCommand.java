package org.usfirst.frc.team2412.robot.commands;

public class IntakeOutCommand extends CommandBase {

	public IntakeOutCommand() {
		requires(intakeSubsystem);
	}

	@Override
	protected void execute() {
		intakeSubsystem.intakeOut();
	}

	@Override
	public void end() {
		intakeSubsystem.intakeStop();
	}

}
