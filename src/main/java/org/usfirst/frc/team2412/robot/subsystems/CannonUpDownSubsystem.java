package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class CannonUpDownSubsystem extends Subsystem {

	WPI_TalonSRX cannonMotor = RobotMap.cannonMotor;

	public double cannonPosition = 0; // For PID if we do it

	@Override
	protected void initDefaultCommand() {

	}

	public void cannonUp() {
		cannonMotor.set(1);
	}

	public void cannonDown() {
		cannonMotor.set(-1);
	}

	public void cannonHold() {
		// PID functionality?
		cannonMotor.set(0);
	}

}
