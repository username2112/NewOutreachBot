package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

public class DrivebaseSubsystem extends Subsystem {

	MecanumDrive drive = RobotMap.drive;

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveCommand());
	}

	public void drive(Joystick stick) {

		double foward = -stick.getY();

		double side = stick.getX();

		double turn = stick.getTwist();

		drive.driveCartesian(Math.pow(foward, 3), // Cube all values for smoother driving
				Math.pow(side, 3), // and easier fine movement
				Math.pow(turn, 3));
	}
}
