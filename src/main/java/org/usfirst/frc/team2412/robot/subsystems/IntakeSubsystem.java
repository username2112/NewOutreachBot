package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class IntakeSubsystem extends Subsystem {

	public WPI_TalonSRX intakeMotorLeader = RobotMap.intakeMotor1;

	public static final double MOTOR_SPEED = 1;

	@Override
	protected void initDefaultCommand() {

	}

	public void intakeIn() {
		intakeMotorLeader.set(-MOTOR_SPEED);
	}

	public void intakeOut() {
		intakeMotorLeader.set(MOTOR_SPEED);
	}

	public void intakeStop() {
		intakeMotorLeader.set(0);
	}

}
