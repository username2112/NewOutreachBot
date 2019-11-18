package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.Constants;
import org.usfirst.frc.team2412.robot.commands.CannonAxisCommand;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

public class CannonUpDownSubsystem extends Subsystem {

	WPI_TalonSRX cannonMotor = RobotMap.cannonMotor;

	public double cannonPosition = 0; // For PID if we do it

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new CannonAxisCommand());
	}

	public void cannonUp() {
		cannonMotor.set(Constants.CANNON_MAX_SPEED);
	}

	public void cannonDown() {
		cannonMotor.set(-Constants.CANNON_MAX_SPEED);
	}

	public void cannonHold() {
		// PID functionality?
		cannonMotor.set(0);
	}

	public void cannonAxis(Joystick stick) {
		cannonMotor.set(stick.getY());
	}

}
