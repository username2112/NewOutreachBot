package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.*;

import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command {

	public static IntakeSubsystem intakeSubsystem = new IntakeSubsystem();
	public static DrivebaseSubsystem drivebaseSubsystem = new DrivebaseSubsystem();
	public static CannonUpDownSubsystem cannonUpDownSubsystem = new CannonUpDownSubsystem();
	public static CannonFireSubsystem cannonFireSubsystem = new CannonFireSubsystem();

	@Override
	protected boolean isFinished() {
		return false;
	}

}
