package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.IntakeSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command {

	public static IntakeSubsystem intakeSubsystem = new IntakeSubsystem();

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
